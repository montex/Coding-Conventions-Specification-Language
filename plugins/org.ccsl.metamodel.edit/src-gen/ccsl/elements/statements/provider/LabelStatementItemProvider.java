/**
 */
package ccsl.elements.statements.provider;

import ccsl.elements.statements.LabelStatement;
import ccsl.elements.statements.StatementsFactory;
import ccsl.elements.statements.StatementsPackage;

import ccsl.elements.statements.controlFlow.ControlFlowFactory;

import ccsl.elements.statements.import_.ImportFactory;

import ccsl.elements.statements.tryCatch.TryCatchFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.elements.statements.LabelStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LabelStatementItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelStatementItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_LabelStatement_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_LabelStatement_name_feature",
								"_UI_LabelStatement_type"),
						StatementsPackage.Literals.LABEL_STATEMENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(StatementsPackage.Literals.LABEL_STATEMENT__BODY);
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
	 * This returns LabelStatement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LabelStatement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((LabelStatement) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_LabelStatement_type")
				: getString("_UI_LabelStatement_type") + " " + label;
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

		switch (notification.getFeatureID(LabelStatement.class)) {
		case StatementsPackage.LABEL_STATEMENT__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case StatementsPackage.LABEL_STATEMENT__BODY:
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

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				StatementsFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				StatementsFactory.eINSTANCE.createControlFlowStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				StatementsFactory.eINSTANCE.createInstanceCreation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				StatementsFactory.eINSTANCE.createSynchronizedBlock()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				StatementsFactory.eINSTANCE.createThrowStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				StatementsFactory.eINSTANCE.createEmptyStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				StatementsFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				StatementsFactory.eINSTANCE.createBreakStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				StatementsFactory.eINSTANCE.createContinueStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				StatementsFactory.eINSTANCE.createAssertStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				StatementsFactory.eINSTANCE.createExpressionStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				StatementsFactory.eINSTANCE.createLabelStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				ControlFlowFactory.eINSTANCE.createConditionalControlFlowStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				ControlFlowFactory.eINSTANCE.createSwitchStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				ControlFlowFactory.eINSTANCE.createSwitchCaseBlock()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				ControlFlowFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				ControlFlowFactory.eINSTANCE.createLoopStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				ControlFlowFactory.eINSTANCE.createWhileStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				ControlFlowFactory.eINSTANCE.createDoStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				ControlFlowFactory.eINSTANCE.createForStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				ControlFlowFactory.eINSTANCE.createForEachStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				TryCatchFactory.eINSTANCE.createTryStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				TryCatchFactory.eINSTANCE.createCatchClause()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.LABEL_STATEMENT__BODY,
				ImportFactory.eINSTANCE.createImportStatement()));
	}

}
