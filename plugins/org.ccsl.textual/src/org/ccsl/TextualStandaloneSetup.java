/*
 * generated by Xtext 2.22.0
 */
package org.ccsl;


import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;

import com.google.inject.Injector;

public class TextualStandaloneSetup extends TextualStandaloneSetupGenerated {

    public static void doSetup() {
        new TextualStandaloneSetup().createInjectorAndDoEMFRegistration();
    }

    @Override
    public Injector createInjectorAndDoEMFRegistration() {
        Injector injector = super.createInjectorAndDoEMFRegistration();

        // Register the resource factory for the .ccsl extension
        IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
        IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ccsl", resourceFactory);
        IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("ccsl", serviceProvider);

        return injector;
    }
}
