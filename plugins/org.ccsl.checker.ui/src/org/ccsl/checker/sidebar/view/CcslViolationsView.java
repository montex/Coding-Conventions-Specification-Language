package org.ccsl.checker.sidebar.view;



import org.ccsl.checker.sidebar.ccslChecker.Violation;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.part.ViewPart;

public class CcslViolationsView extends ViewPart {
	private TreeViewer viewer;
	private Tree tree;

	@Override
	public void createPartControl(org.eclipse.swt.widgets.Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		tree = viewer.getTree();
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		
		TreeColumn ruleColumn = new TreeColumn(tree, SWT.LEFT);
		ruleColumn.setText("Rule Name");
		ruleColumn.setWidth(150);

		TreeColumn violationColumn = new TreeColumn(tree, SWT.LEFT);
		violationColumn.setText("Violation Message");
		violationColumn.setWidth(500);

		IResourceChangeListener listener = new IResourceChangeListener() {
			public void resourceChanged(IResourceChangeEvent event) {
				viewer.refresh();
			}
		};
		ResourcesPlugin.getWorkspace().addResourceChangeListener(listener, IResourceChangeEvent.POST_CHANGE);
	}

	public void addViolation(String ruleName, Violation violation) {
		// create a new item with the details of the violation
		TreeItem item = new TreeItem(tree, SWT.NONE);
		item.setText(new String[] { ruleName, violation.getMessage() });
	}

	public void setFocus() {
		viewer.getControl().setFocus();
	}
}

