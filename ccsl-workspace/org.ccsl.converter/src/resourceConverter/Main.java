package resourceConverter;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import ccsl.ccslPackage;

public class Main {
    public static void main(String[] args) {
    	ResourceSet resourceSet = new ResourceSetImpl();

        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ccsl", new XMIResourceFactoryImpl());

        resourceSet.getPackageRegistry().put(ccslPackage.eNS_URI, ccslPackage.eINSTANCE);

        String inputFilePath = "C:/skole/MasterThesis/Workspace/org.ccsl.metamodel.examples/sample-instances/anonymousClass.ccsl";
        File inputFile = new File(inputFilePath);

        if (!inputFile.exists() || !inputFile.canRead()) {
            System.err.println("The file does not exist or is not readable: " + inputFile.getAbsolutePath());
            return;
        }

        URI inputURI = URI.createFileURI(inputFile.getAbsolutePath());
        Resource resource = resourceSet.getResource(inputURI, true);

        System.out.println("Resource content:");
        TreeIterator<EObject> iterator = resource.getAllContents();
        while (iterator.hasNext()) {
            EObject obj = iterator.next();
            System.out.println(obj);
        }

        try {
            resource.load(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}