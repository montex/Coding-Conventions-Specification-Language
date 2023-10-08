/**
 */
package ccsl.elements.statements.provider;

import ccsl.elements.statements.StatementsFactory;
import ccsl.elements.statements.StatementsPackage;
import ccsl.elements.statements.SynchronizedBlock;

import ccsl.elements.statements.controlFlow.ControlFlowFactory;

import ccsl.elements.statements.import_.ImportFactory;

import ccsl.elements.statements.tryCatch.TryCatchFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.elements.statements.SynchronizedBlock} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SynchronizedBlockItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizedBlockItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS);
			childrenFeatures.add(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SynchronizedBlock.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SynchronizedBlock"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((SynchronizedBlock) object).getUniqueName();
		return label == null || label.length() == 0 ? getString("_UI_SynchronizedBlock_type")
				: getString("_UI_SynchronizedBlock_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SynchronizedBlock.class)) {
		case StatementsPackage.SYNCHRONIZED_BLOCK__BODY_STATEMENTS:
		case StatementsPackage.SYNCHRONIZED_BLOCK__KEY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				StatementsFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				StatementsFactory.eINSTANCE.createControlFlowStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				StatementsFactory.eINSTANCE.createInstanceCreation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				StatementsFactory.eINSTANCE.createSynchronizedBlock()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				StatementsFactory.eINSTANCE.createThrowStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				StatementsFactory.eINSTANCE.createEmptyStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				StatementsFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				StatementsFactory.eINSTANCE.createBreakStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				StatementsFactory.eINSTANCE.createContinueStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				StatementsFactory.eINSTANCE.createAssertStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				StatementsFactory.eINSTANCE.createExpressionStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				StatementsFactory.eINSTANCE.createLabelStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				ControlFlowFactory.eINSTANCE.createConditionalControlFlowStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				ControlFlowFactory.eINSTANCE.createSwitchStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				ControlFlowFactory.eINSTANCE.createSwitchCaseBlock()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				ControlFlowFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				ControlFlowFactory.eINSTANCE.createLoopStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				ControlFlowFactory.eINSTANCE.createWhileStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				ControlFlowFactory.eINSTANCE.createDoStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				ControlFlowFactory.eINSTANCE.createForStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				ControlFlowFactory.eINSTANCE.createForEachStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				TryCatchFactory.eINSTANCE.createTryStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				TryCatchFactory.eINSTANCE.createCatchClause()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS,
				ImportFactory.eINSTANCE.createImportStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				StatementsFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				StatementsFactory.eINSTANCE.createControlFlowStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				StatementsFactory.eINSTANCE.createInstanceCreation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				StatementsFactory.eINSTANCE.createSynchronizedBlock()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				StatementsFactory.eINSTANCE.createThrowStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				StatementsFactory.eINSTANCE.createEmptyStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				StatementsFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				StatementsFactory.eINSTANCE.createBreakStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				StatementsFactory.eINSTANCE.createContinueStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				StatementsFactory.eINSTANCE.createAssertStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				StatementsFactory.eINSTANCE.createExpressionStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				StatementsFactory.eINSTANCE.createLabelStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				ControlFlowFactory.eINSTANCE.createConditionalControlFlowStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				ControlFlowFactory.eINSTANCE.createSwitchStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				ControlFlowFactory.eINSTANCE.createSwitchCaseBlock()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				ControlFlowFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				ControlFlowFactory.eINSTANCE.createLoopStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				ControlFlowFactory.eINSTANCE.createWhileStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				ControlFlowFactory.eINSTANCE.createDoStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				ControlFlowFactory.eINSTANCE.createForStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				ControlFlowFactory.eINSTANCE.createForEachStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				TryCatchFactory.eINSTANCE.createTryStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				TryCatchFactory.eINSTANCE.createCatchClause()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY,
				ImportFactory.eINSTANCE.createImportStatement()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == StatementsPackage.Literals.SYNCHRONIZED_BLOCK__BODY_STATEMENTS
				|| childFeature == StatementsPackage.Literals.SYNCHRONIZED_BLOCK__KEY;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
