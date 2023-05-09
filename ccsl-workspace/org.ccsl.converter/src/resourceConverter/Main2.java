package resourceConverter;

import java.io.IOException;

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
    public static void main(String[] args) {
    	ccslPackage.eINSTANCE.eClass();

        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ccsl", new XMIResourceFactoryImpl());

        ResourceSet resourceSet = new ResourceSetImpl();
        /*URI inputURI = URI.createFileURI("C:/skole/MasterThesis/Workspace/org.ccsl.metamodel.examples/PMD/PMD-ErrorProne/CompareObjectsWithEquals.ccsl");*/
        /*URI inputURI = URI.createFileURI("C:/skole/MasterThesis/Workspace/org.ccsl.metamodel.examples/sample-instances/anonymousClass.ccsl");*/
        /*URI inputURI = URI.createFileURI("C:/skole/MasterThesis/Workspace/org.ccsl.metamodel.examples/PMD/PMD-ErrorProne/NonCaseLabelInSwitchStatement.ccsl");*/
        /*URI inputURI = URI.createFileURI("C:/skole/MasterThesis/Workspace/org.ccsl.metamodel.examples/PMD/PMD-ErrorProne/MissingSerialVersionUID.ccsl");*/
        /*URI inputURI = URI.createFileURI("C:/skole/MasterThesis/Workspace/org.ccsl.metamodel.examples/PMD/PMD-ErrorProne/EmptyFinallyBlock.ccsl");*/
        URI inputURI = URI.createFileURI("C:/skole/MasterThesis/Workspace/org.ccsl.metamodel.examples/PMD/PMD-ErrorProne/AvoidDecimalLiteralsInBigDecimalConstructor.ccsl");
        Resource xmiResource = resourceSet.getResource(inputURI, true);

        EObject topObject = xmiResource.getContents().get(0);

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
}