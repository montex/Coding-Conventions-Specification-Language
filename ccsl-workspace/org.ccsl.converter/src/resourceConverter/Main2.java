package resourceConverter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.io.File;
import java.nio.file.Paths;

import ccsl.ccslPackage;
import org.ccsl.TextualStandaloneSetup;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class Main2 {
private static int uniquenameCounter = 1;
	
	public static void main(String[] args) {
		ccslPackage.eINSTANCE.eClass();

        if (args.length < 1) {
            System.out.println("Please provide the directory path as argument.");
            return;
        }

        String directoryPath = args[0];
        
        try {
            Files.walk(Paths.get(directoryPath))
                .filter(Files::isRegularFile)
                .map(Path::toString)
                .filter(path -> path.endsWith(".ccsl"))
                .forEach(Main2::convertFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	private static void convertFile(String filePath) {
		try {
			System.out.println("Processing file: " + filePath);
		    URI inputURI = URI.createFileURI(filePath);
		    System.out.println("Input URI: " + inputURI);
		    ResourceSet xmiResourceSet = new ResourceSetImpl();
		    xmiResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ccsl", new XMIResourceFactoryImpl());
		    Resource xmiResource = xmiResourceSet.getResource(inputURI, true);
	
		    if (!xmiResource.getErrors().isEmpty()) {
		        System.out.println("Resource loading errors: " + xmiResource.getErrors());
		        return;
		    }
		        
		    EObject topObject;
		    try {
		        topObject = xmiResource.getContents().get(0);
		    } catch (IndexOutOfBoundsException e) {
		        System.out.println("An error occurred while processing file: " + filePath);
		        e.printStackTrace();
		        return;
		    }
		        
		    changeUniqueName(topObject);
	
		    /*try {
		        xmiResource.save(null);
		    } catch (IOException e) {
		        e.printStackTrace();
		    }*/
		        
		    nameToString(topObject);
	
		    Injector injector = new TextualStandaloneSetup().createInjectorAndDoEMFRegistration();
		    XtextResourceSet xtextResourceSet = injector.getInstance(XtextResourceSet.class);
		        
		    File file = new File(filePath);
		    
		    
		    String fileName = file.getName();
		    String fileNameWithoutExtension = fileName.substring(0, fileName.lastIndexOf("."));
		    
		    
		    String parentDir = file.getParent();
	
		    
		    String outputFilePath = parentDir.replace("org.ccsl.metamodel.examples", "org.ccsl.converter/testRes") 
		                        + "/" + fileNameWithoutExtension + ".ccslt";
	
		    URI outputURI = URI.createFileURI(outputFilePath);
		    System.out.println("Output URI: " + outputURI);
		    XtextResource xtextResource = (XtextResource) xtextResourceSet.createResource(outputURI);
	
		    xtextResource.getContents().add(topObject);
	
		    try {
		    	System.out.println("File saved: " + outputURI);
		        xtextResource.save(null);
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		} catch (Exception e) {
	        System.err.println("An error occurred while processing file: " + filePath);
	        e.printStackTrace();
	    }
	}
        public static void changeUniqueName(EObject eObject) {
            for (Iterator<EObject> it = eObject.eAllContents(); it.hasNext();) {
                EObject childEObject = it.next();
                
                if (childEObject.eClass().getEStructuralFeature("uniqueName") != null) {
                    String uniquename = (String) childEObject.eGet(childEObject.eClass().getEStructuralFeature("uniqueName"));

                    if (uniquename == null || uniquename.isEmpty()) {
                        childEObject.eSet(childEObject.eClass().getEStructuralFeature("uniqueName"), generateUniquename());
                    }
                }
            }
        }
        
        public static String generateUniquename() {
        	return "UN" + uniquenameCounter++;
        }
        
        public static void nameToString(EObject eObject) {
        	for (Iterator<EObject> it = eObject.eAllContents(); it.hasNext();) {
                EObject childEObject = it.next();
                
                if (childEObject.eClass().getEStructuralFeature("name") != null) {
                	String name = (String) childEObject.eGet(childEObject.eClass().getEStructuralFeature("name"));

                	if (name != null && !name.isEmpty()) {
                		childEObject.eSet(childEObject.eClass().getEStructuralFeature("name"), "\"" + name + "\"");
                }
            }
                if (childEObject.eClass().getEStructuralFeature("regex") != null) {
                	String regex = (String) childEObject.eGet(childEObject.eClass().getEStructuralFeature("regex"));

                	if (regex != null && !regex.isEmpty()) {
                		childEObject.eSet(childEObject.eClass().getEStructuralFeature("regex"), "\"" + regex + "\"");
                }
        }
     }
}
}