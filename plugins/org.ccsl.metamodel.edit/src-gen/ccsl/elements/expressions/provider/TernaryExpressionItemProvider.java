/**
 */
package ccsl.elements.expressions.provider;

import ccsl.elements.expressions.ExpressionsFactory;
import ccsl.elements.expressions.ExpressionsPackage;
import ccsl.elements.expressions.TernaryExpression;

import ccsl.elements.expressions.accesses.AccessesFactory;

import ccsl.elements.expressions.annotation.AnnotationFactory;

import ccsl.elements.expressions.arrays.ArraysFactory;

import ccsl.elements.expressions.assignment.AssignmentFactory;

import ccsl.elements.expressions.invocations.InvocationsFactory;

import ccsl.elements.expressions.literals.LiteralsFactory;

import ccsl.elements.namedElements.complexType.ComplexTypeFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.elements.expressions.TernaryExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TernaryExpressionItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TernaryExpressionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION);
			childrenFeatures.add(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION);
			childrenFeatures.add(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION);
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
	 * This returns TernaryExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TernaryExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((TernaryExpression) object).getUniqueName();
		return label == null || label.length() == 0 ? getString("_UI_TernaryExpression_type")
				: getString("_UI_TernaryExpression_type") + " " + label;
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

		switch (notification.getFeatureID(TernaryExpression.class)) {
		case ExpressionsPackage.TERNARY_EXPRESSION__CONDITION:
		case ExpressionsPackage.TERNARY_EXPRESSION__ELSE_EXPRESSION:
		case ExpressionsPackage.TERNARY_EXPRESSION__THEN_EXPRESSION:
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

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				ExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				ExpressionsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				ExpressionsFactory.eINSTANCE.createTernaryExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				ExpressionsFactory.eINSTANCE.createInstanceofExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				ExpressionsFactory.eINSTANCE.createOperandExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				ExpressionsFactory.eINSTANCE.createStringConcatenation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				ExpressionsFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				ExpressionsFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				ComplexTypeFactory.eINSTANCE.createAnonymousClass()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				InvocationsFactory.eINSTANCE.createInvocation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				InvocationsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				InvocationsFactory.eINSTANCE.createConstructorInvocation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				InvocationsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				AccessesFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				AccessesFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				AccessesFactory.eINSTANCE.createDataTypeAccess()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				ArraysFactory.eINSTANCE.createArrayCreation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				ArraysFactory.eINSTANCE.createArrayIndexesAccess()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				ArraysFactory.eINSTANCE.createArrayInitializer()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				AssignmentFactory.eINSTANCE.createSimpleAssignment()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				AssignmentFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				AssignmentFactory.eINSTANCE.createUnaryAssignment()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				LiteralsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				LiteralsFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION,
				AnnotationFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createTernaryExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createInstanceofExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createOperandExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createStringConcatenation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				ComplexTypeFactory.eINSTANCE.createAnonymousClass()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				InvocationsFactory.eINSTANCE.createInvocation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				InvocationsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				InvocationsFactory.eINSTANCE.createConstructorInvocation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				InvocationsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				AccessesFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				AccessesFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				AccessesFactory.eINSTANCE.createDataTypeAccess()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				ArraysFactory.eINSTANCE.createArrayCreation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				ArraysFactory.eINSTANCE.createArrayIndexesAccess()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				ArraysFactory.eINSTANCE.createArrayInitializer()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				AssignmentFactory.eINSTANCE.createSimpleAssignment()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				AssignmentFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				AssignmentFactory.eINSTANCE.createUnaryAssignment()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				LiteralsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				LiteralsFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION,
				AnnotationFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createTernaryExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createInstanceofExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createOperandExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createStringConcatenation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				ExpressionsFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				ComplexTypeFactory.eINSTANCE.createAnonymousClass()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				InvocationsFactory.eINSTANCE.createInvocation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				InvocationsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				InvocationsFactory.eINSTANCE.createConstructorInvocation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				InvocationsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				AccessesFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				AccessesFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				AccessesFactory.eINSTANCE.createDataTypeAccess()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				ArraysFactory.eINSTANCE.createArrayCreation()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				ArraysFactory.eINSTANCE.createArrayIndexesAccess()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				ArraysFactory.eINSTANCE.createArrayInitializer()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				AssignmentFactory.eINSTANCE.createSimpleAssignment()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				AssignmentFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				AssignmentFactory.eINSTANCE.createUnaryAssignment()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				LiteralsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				LiteralsFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION,
				AnnotationFactory.eINSTANCE.createAnnotation()));
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

		boolean qualify = childFeature == ExpressionsPackage.Literals.TERNARY_EXPRESSION__CONDITION
				|| childFeature == ExpressionsPackage.Literals.TERNARY_EXPRESSION__ELSE_EXPRESSION
				|| childFeature == ExpressionsPackage.Literals.TERNARY_EXPRESSION__THEN_EXPRESSION;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
