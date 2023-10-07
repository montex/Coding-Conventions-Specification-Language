/**
 */
package ccsl.elements.statements.controlFlow.provider;

import ccsl.elements.statements.StatementsFactory;

import ccsl.elements.statements.controlFlow.ControlFlowFactory;
import ccsl.elements.statements.controlFlow.ControlFlowPackage;
import ccsl.elements.statements.controlFlow.IfStatement;

import ccsl.elements.statements.import_.ImportFactory;

import ccsl.elements.statements.tryCatch.TryCatchFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.elements.statements.controlFlow.IfStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfStatementItemProvider extends ConditionalControlFlowStatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatementItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT);
			childrenFeatures.add(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT);
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
	 * This returns IfStatement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfStatement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((IfStatement) object).getUniqueName();
		return label == null || label.length() == 0 ? getString("_UI_IfStatement_type")
				: getString("_UI_IfStatement_type") + " " + label;
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

		switch (notification.getFeatureID(IfStatement.class)) {
		case ControlFlowPackage.IF_STATEMENT__THEN_STATEMENT:
		case ControlFlowPackage.IF_STATEMENT__ELSE_STATEMENT:
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

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				ControlFlowFactory.eINSTANCE.createConditionalControlFlowStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				ControlFlowFactory.eINSTANCE.createSwitchStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				ControlFlowFactory.eINSTANCE.createSwitchCaseBlock()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				ControlFlowFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				ControlFlowFactory.eINSTANCE.createLoopStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				ControlFlowFactory.eINSTANCE.createWhileStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				ControlFlowFactory.eINSTANCE.createDoStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				ControlFlowFactory.eINSTANCE.createForStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				ControlFlowFactory.eINSTANCE.createForEachStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				StatementsFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				StatementsFactory.eINSTANCE.createControlFlowStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				StatementsFactory.eINSTANCE.createInstanceCreation()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				StatementsFactory.eINSTANCE.createSynchronizedBlock()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				StatementsFactory.eINSTANCE.createThrowStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				StatementsFactory.eINSTANCE.createEmptyStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				StatementsFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				StatementsFactory.eINSTANCE.createBreakStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				StatementsFactory.eINSTANCE.createContinueStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				StatementsFactory.eINSTANCE.createAssertStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				StatementsFactory.eINSTANCE.createExpressionStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				StatementsFactory.eINSTANCE.createLabelStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				TryCatchFactory.eINSTANCE.createTryStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				TryCatchFactory.eINSTANCE.createCatchClause()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT,
				ImportFactory.eINSTANCE.createImportStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				ControlFlowFactory.eINSTANCE.createConditionalControlFlowStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				ControlFlowFactory.eINSTANCE.createSwitchStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				ControlFlowFactory.eINSTANCE.createSwitchCaseBlock()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				ControlFlowFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				ControlFlowFactory.eINSTANCE.createLoopStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				ControlFlowFactory.eINSTANCE.createWhileStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				ControlFlowFactory.eINSTANCE.createDoStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				ControlFlowFactory.eINSTANCE.createForStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				ControlFlowFactory.eINSTANCE.createForEachStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				StatementsFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				StatementsFactory.eINSTANCE.createControlFlowStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				StatementsFactory.eINSTANCE.createInstanceCreation()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				StatementsFactory.eINSTANCE.createSynchronizedBlock()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				StatementsFactory.eINSTANCE.createThrowStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				StatementsFactory.eINSTANCE.createEmptyStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				StatementsFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				StatementsFactory.eINSTANCE.createBreakStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				StatementsFactory.eINSTANCE.createContinueStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				StatementsFactory.eINSTANCE.createAssertStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				StatementsFactory.eINSTANCE.createExpressionStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				StatementsFactory.eINSTANCE.createLabelStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				TryCatchFactory.eINSTANCE.createTryStatement()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
				TryCatchFactory.eINSTANCE.createCatchClause()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT,
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

		boolean qualify = childFeature == ControlFlowPackage.Literals.IF_STATEMENT__THEN_STATEMENT
				|| childFeature == ControlFlowPackage.Literals.IF_STATEMENT__ELSE_STATEMENT;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
