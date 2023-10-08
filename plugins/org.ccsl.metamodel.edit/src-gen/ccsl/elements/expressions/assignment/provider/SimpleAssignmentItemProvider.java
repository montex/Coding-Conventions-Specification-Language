/**
 */
package ccsl.elements.expressions.assignment.provider;

import ccsl.elements.expressions.ExpressionsFactory;

import ccsl.elements.expressions.accesses.AccessesFactory;

import ccsl.elements.expressions.annotation.AnnotationFactory;

import ccsl.elements.expressions.arrays.ArraysFactory;

import ccsl.elements.expressions.assignment.AssignmentFactory;
import ccsl.elements.expressions.assignment.AssignmentPackage;
import ccsl.elements.expressions.assignment.SimpleAssignment;

import ccsl.elements.expressions.invocations.InvocationsFactory;

import ccsl.elements.expressions.literals.LiteralsFactory;

import ccsl.elements.expressions.provider.ExpressionItemProvider;

import ccsl.elements.namedElements.complexType.ComplexTypeFactory;

import ccsl.provider.CcslEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.elements.expressions.assignment.SimpleAssignment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleAssignmentItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAssignmentItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND);
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
	 * This returns SimpleAssignment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimpleAssignment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((SimpleAssignment) object).getUniqueName();
		return label == null || label.length() == 0 ? getString("_UI_SimpleAssignment_type")
				: getString("_UI_SimpleAssignment_type") + " " + label;
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

		switch (notification.getFeatureID(SimpleAssignment.class)) {
		case AssignmentPackage.SIMPLE_ASSIGNMENT__OPERAND:
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

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				AssignmentFactory.eINSTANCE.createSimpleAssignment()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				AssignmentFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				AssignmentFactory.eINSTANCE.createUnaryAssignment()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				ComplexTypeFactory.eINSTANCE.createAnonymousClass()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				ExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				ExpressionsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				ExpressionsFactory.eINSTANCE.createTernaryExpression()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				ExpressionsFactory.eINSTANCE.createInstanceofExpression()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				ExpressionsFactory.eINSTANCE.createOperandExpression()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				ExpressionsFactory.eINSTANCE.createStringConcatenation()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				ExpressionsFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				ExpressionsFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				InvocationsFactory.eINSTANCE.createInvocation()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				InvocationsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				InvocationsFactory.eINSTANCE.createConstructorInvocation()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				InvocationsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				AccessesFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				AccessesFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				AccessesFactory.eINSTANCE.createDataTypeAccess()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				ArraysFactory.eINSTANCE.createArrayCreation()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				ArraysFactory.eINSTANCE.createArrayIndexesAccess()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				ArraysFactory.eINSTANCE.createArrayInitializer()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				LiteralsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				LiteralsFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(AssignmentPackage.Literals.SIMPLE_ASSIGNMENT__OPERAND,
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
