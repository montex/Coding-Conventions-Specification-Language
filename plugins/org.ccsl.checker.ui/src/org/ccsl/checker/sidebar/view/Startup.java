package org.ccsl.checker.sidebar.view;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class Startup implements IStartup {
    @Override
    public void earlyStartup() {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
                String viewId = "com.myplugin.views.ErrowView";
                try {
                    page.showView(viewId);
                } catch (PartInitException e) {
                    // Handle exception
                }
            }
        });
    }
}
