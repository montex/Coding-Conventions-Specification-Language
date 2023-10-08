/**
 */
package ccsl.elements.statements.controlFlow.provider;

import ccsl.elements.expressions.ExpressionsFactory;

import ccsl.elements.expressions.accesses.AccessesFactory;

import ccsl.elements.expressions.annotation.AnnotationFactory;

import ccsl.elements.expressions.arrays.ArraysFactory;

import ccsl.elements.expressions.assignment.AssignmentFactory;

import ccsl.elements.expressions.invocations.InvocationsFactory;

import ccsl.elements.expressions.literals.LiteralsFactory;

import ccsl.elements.namedElements.complexType.ComplexTypeFactory;

import ccsl.elements.statements.controlFlow.ConditionalControlFlowStatement;
import ccsl.elements.statements.controlFlow.ControlFlowPackage;

import ccsl.elements.statements.provider.ControlFlowStatementItemProvider;

import ccsl.provider.CcslEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.elements.statements.controlFlow.ConditionalControlFlowStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionalControlFlowStatementItemProvider extends ControlFlowStatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalControlFlowStatementItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION);
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
	 * This returns ConditionalControlFlowStatement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConditionalControlFlowStatement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ConditionalControlFlowStatement) object).getUniqueName();
		return label == null || label.length() == 0 ? getString("_UI_ConditionalControlFlowStatement_type")
				: getString("_UI_ConditionalControlFlowStatement_type") + " " + label;
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

		switch (notification.getFeatureID(ConditionalControlFlowStatement.class)) {
		case ControlFlowPackage.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION:
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

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						ComplexTypeFactory.eINSTANCE.createAnonymousClass()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						ExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						ExpressionsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						ExpressionsFactory.eINSTANCE.createTernaryExpression()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						ExpressionsFactory.eINSTANCE.createInstanceofExpression()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						ExpressionsFactory.eINSTANCE.createOperandExpression()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						ExpressionsFactory.eINSTANCE.createStringConcatenation()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						ExpressionsFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						ExpressionsFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						InvocationsFactory.eINSTANCE.createInvocation()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						InvocationsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						InvocationsFactory.eINSTANCE.createConstructorInvocation()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						InvocationsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						AccessesFactory.eINSTANCE.createAccess()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						AccessesFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						AccessesFactory.eINSTANCE.createDataTypeAccess()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						ArraysFactory.eINSTANCE.createArrayCreation()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						ArraysFactory.eINSTANCE.createArrayIndexesAccess()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						ArraysFactory.eINSTANCE.createArrayInitializer()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						AssignmentFactory.eINSTANCE.createSimpleAssignment()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						AssignmentFactory.eINSTANCE.createAssignment()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						AssignmentFactory.eINSTANCE.createUnaryAssignment()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						LiteralsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						LiteralsFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors
				.add(createChildParameter(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION,
						AnnotationFactory.eINSTANCE.createAnnotation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return CcslEditPlugin.INSTANCE;
	}

}
