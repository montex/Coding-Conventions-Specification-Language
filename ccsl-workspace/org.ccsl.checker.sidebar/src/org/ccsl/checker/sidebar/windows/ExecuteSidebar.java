package org.ccsl.checker.sidebar.windows;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;


import org.ccsl.checker.sidebar.ccslChecker.CcslCheckerRunner;
import org.ccsl.checker.sidebar.ccslChecker.Violation;
import org.ccsl.checker.sidebar.modisco.ModiscoJavaModel;
import org.ccsl.checker.sidebar.modisco.ModiscoJavaModelDiscover;
import org.ccsl.checker.sidebar.rule.Rule;
import org.ccsl.checker.sidebar.rule.RuleFactory;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.ocl.pivot.utilities.ParserException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;


public class ExecuteSidebar {
	
	private Thread thread;
    private ExecuteSidebarListener listener;
    
	
	public ExecuteSidebar() {
		initialize();
	}
	
	private void initialize() {
		
	}
	
    public interface ExecuteSidebarListener {
        void onViolationFound(String ruleName, Violation violation);
    }
	
	public void start(Set<IJavaProject> javaProjects, Set<File> specificationFiles) {
		thread = new Thread(createRunnableTask(javaProjects, specificationFiles));
		thread.start();
	}
	
    public void setListener(ExecuteSidebarListener listener) {
        this.listener = listener;
    }
	
    private void createViolationMarker(String ruleName , Violation violation) {
        String filePath = violation.getFilePath();
        int lineNumber = violation.getLine();

        IWorkspace workspace = ResourcesPlugin.getWorkspace();  
        IPath location = Path.fromOSString(filePath);
        IFile ifile = workspace.getRoot().getFileForLocation(location);

        if (ifile.exists()) {
            try {
                IMarker marker = ifile.createMarker(IMarker.PROBLEM);
                marker.setAttribute(IMarker.MESSAGE, ruleName + " Violation");
                marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
                marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
            } catch (CoreException e) {
                System.out.println("Error when creating marker: " + e.getMessage());
            }
        }
    }
	
	private Runnable createRunnableTask(final Set<IJavaProject> javaProjects, final Set<File> specificationFiles) {
		return new Runnable() {
			@Override
			public void run() {
				// Discover java projects
				Set<ModiscoJavaModel> discoverProjects = new HashSet<>();
				for (IJavaProject javaProject : javaProjects) {
					if (Thread.interrupted())
						break;
					System.out.print("Discovering java model of project: " + javaProject.getElementName());
					try {
						ModiscoJavaModel javaModel = ModiscoJavaModelDiscover.getInstance()
								.discoverProject(javaProject);
						discoverProjects.add(javaModel);
						System.out.print("Extraction of java model from project " + javaProject.getElementName()
								+ " was successfully completed");
					} catch (DiscoveryException ex) {
						System.out.print("An error occurred while trying to extract Java Model from project "
								+ javaProject.getElementName() + ": " + ex.getMessage());
					}
					

				}
				// Get Rule (ocl query, rule name) from files
				Set<Rule> rules = new HashSet<>();
				for (File f : specificationFiles) {
					if (Thread.interrupted())
						break;
					System.out.print("Opening file: " + f.getName());
					try {
						Rule r = RuleFactory.createRuleFromFile(f);
						rules.add(r);
						System.out.print("Extraction of OCL query from file " + f.getName() + " was successfully completed");
					} catch (IOException ex) {
						System.out.print("An error occurred while trying to extract OCL query from file " + f.getName()
								+ ": " + ex.getMessage());
					}
				}
				// Executing rules in java models
				Map<String, Set<Violation>> ruleViolations = new HashMap<>();
				for (ModiscoJavaModel javaModel : discoverProjects) {
					if (Thread.interrupted())
						break;
					for (Rule r : rules) {
						if (Thread.interrupted())
							break;
						System.out.print("Executing rule " + r.getRuleName() + " in project ");
						try {
							List<Violation> violations = CcslCheckerRunner.runRule(r, javaModel);
							if (!ruleViolations.containsKey(r.getRuleName())) {
								ruleViolations.put(r.getRuleName(), new HashSet<>());
							}
							ruleViolations.get(r.getRuleName()).addAll(violations);
							if(listener != null){
								for(Violation violation : violations){
									listener.onViolationFound(r.getRuleName(), violation);
									createViolationMarker(r.getRuleName(), violation);
								}
							}
							System.out.print(violations.size() + " violations found of rule " + r.getRuleName() + " in project " + javaModel.getJavaModel().getName());
						} catch (ParserException e) {
							System.out.print("The OCL from rule " + r.getRuleName() + " has syntax errors");
						} catch (Exception e) {
							System.out.print("An error occured while executing rule " + r.getRuleName() + " on project "
									+ javaModel.getJavaModel().getName()+": " + e.getMessage());
						}
					}
				}
				JOptionPane.showMessageDialog(null, "Execution finished!");
			}
		};
	}

}
