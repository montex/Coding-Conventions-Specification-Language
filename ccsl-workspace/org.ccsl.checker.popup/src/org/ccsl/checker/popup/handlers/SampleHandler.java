package org.ccsl.checker.popup.handlers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.ccsl.checker.popup.modisco.ModiscoJavaModelDiscover;
import org.ccsl.checker.popup.windows.SelectionWindow;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;



public class SampleHandler extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		Object[] selectedItems = selection.toArray();

		Set<java.io.File> ruleFiles = new HashSet<>();
		List<IJavaProject> selectedJavaProjects = new ArrayList<>();

		for (Object selectedItem : selectedItems) {
			if (selectedItem instanceof IFile) {
				IFile selectedFile = (IFile) selectedItem;
				String fileExtension = selectedFile.getFileExtension();
				if (fileExtension != null && (fileExtension.equals("ccsl") || fileExtension.equals("ccslt"))) {
					java.io.File ruleFile = selectedFile.getLocation().toFile();
					ruleFiles.add(ruleFile);
				}
			} else if (selectedItem instanceof IJavaProject) {
				selectedJavaProjects.add((IJavaProject) selectedItem);
			}
		}
		
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject[] projects = workspaceRoot.getProjects();
		List<IJavaProject> allJavaProjects = new ArrayList<>();
		
		for (int i = 0; i < projects.length; i++) {
			IProject project = projects[i];
			IJavaProject javaProject = JavaCore.create(project);
			if(ModiscoJavaModelDiscover.getInstance().isApplicable(javaProject)) {
				allJavaProjects.add(javaProject);
			}
		}
		
		SelectionWindow selectionWindow = new SelectionWindow(allJavaProjects, selectedJavaProjects, ruleFiles);
		selectionWindow.show();
		return null;
	}
}