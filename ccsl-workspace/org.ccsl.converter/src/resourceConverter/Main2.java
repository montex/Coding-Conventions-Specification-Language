package resourceConverter;

import java.io.IOException;
import java.util.Iterator;


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

        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ccsl", new XMIResourceFactoryImpl());

        ResourceSet resourceSet = new ResourceSetImpl();
        /*URI inputURI = URI.createFileURI("C:/skole/MasterThesis/Workspace/org.ccsl.metamodel.examples/PMD/PMD-ErrorProne/CompareObjectsWithEquals.ccsl");*/
        URI inputURI = URI.createFileURI("C:/skole/MasterThesis/Workspace/org.ccsl.metamodel.examples/sample-instances/anonymousClass.ccsl");
        /*URI inputURI = URI.createFileURI("C:/skole/MasterThesis/Workspace/org.ccsl.metamodel.examples/PMD/PMD-ErrorProne/NonCaseLabelInSwitchStatement.ccsl");*/
        /*URI inputURI = URI.createFileURI("C:/skole/MasterThesis/Workspace/org.ccsl.metamodel.examples/PMD/PMD-ErrorProne/MissingSerialVersionUID.ccsl");*/
        /*URI inputURI = URI.createFileURI("C:/skole/MasterThesis/Workspace/org.ccsl.metamodel.examples/PMD/PMD-ErrorProne/EmptyFinallyBlock.ccsl");*/
        /*URI inputURI = URI.createFileURI("C:/skole/MasterThesis/Workspace/org.ccsl.metamodel.examples/PMD/PMD-ErrorProne/AvoidDecimalLiteralsInBigDecimalConstructor.ccsl");*/
        /*URI inputURI = URI.createFileURI("C:/skole/MasterThesis/Workspace/org.ccsl.metamodel.examples/PMD/PMD-ErrorProne/UnnecessaryBooleanAssertion.ccsl");*/
        /*URI inputURI = URI.createFileURI("C:/skole/MasterThesis/Workspace/org.ccsl.metamodel.examples/PMD/PMD-Performance/TooFewBranchesForASwitchStatement.ccsl");*/
        Resource xmiResource = resourceSet.getResource(inputURI, true);
        
        EObject topObject = xmiResource.getContents().get(0);
        
        changeUniqueName(topObject);

        try {
            xmiResource.save(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        nameToString(topObject);

        Injector injector = new TextualStandaloneSetup().createInjectorAndDoEMFRegistration();
        XtextResourceSet xtextResourceSet = injector.getInstance(XtextResourceSet.class);
        

        URI outputURI = URI.createFileURI("C:/skole/MasterThesis/Workspace/org.ccsl.converter/testRes/converted.ccslt");
        XtextResource xtextResource = (XtextResource) xtextResourceSet.createResource(outputURI);
        
        

        xtextResource.getContents().add(topObject);

        try {
            xtextResource.save(null);
        } catch (IOException e) {
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
        }
     }
}