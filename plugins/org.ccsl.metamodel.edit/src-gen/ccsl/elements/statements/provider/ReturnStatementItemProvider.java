/**
 */
package ccsl.elements.statements.provider;

import ccsl.elements.expressions.ExpressionsFactory;

import ccsl.elements.expressions.accesses.AccessesFactory;

import ccsl.elements.expressions.annotation.AnnotationFactory;

import ccsl.elements.expressions.arrays.ArraysFactory;

import ccsl.elements.expressions.assignment.AssignmentFactory;

import ccsl.elements.expressions.invocations.InvocationsFactory;

import ccsl.elements.expressions.literals.LiteralsFactory;

import ccsl.elements.namedElements.complexType.ComplexTypeFactory;

import ccsl.elements.statements.ReturnStatement;
import ccsl.elements.statements.StatementsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.elements.statements.ReturnStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReturnStatementItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnStatementItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION);
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
	 * This returns ReturnStatement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ReturnStatement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ReturnStatement) object).getUniqueName();
		return label == null || label.length() == 0 ? getString("_UI_ReturnStatement_type")
				: getString("_UI_ReturnStatement_type") + " " + label;
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

		switch (notification.getFeatureID(ReturnStatement.class)) {
		case StatementsPackage.RETURN_STATEMENT__EXPRESSION:
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

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				ComplexTypeFactory.eINSTANCE.createAnonymousClass()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				ExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				ExpressionsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				ExpressionsFactory.eINSTANCE.createTernaryExpression()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				ExpressionsFactory.eINSTANCE.createInstanceofExpression()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				ExpressionsFactory.eINSTANCE.createOperandExpression()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				ExpressionsFactory.eINSTANCE.createStringConcatenation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				ExpressionsFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				ExpressionsFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				InvocationsFactory.eINSTANCE.createInvocation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				InvocationsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				InvocationsFactory.eINSTANCE.createConstructorInvocation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				InvocationsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				AccessesFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				AccessesFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				AccessesFactory.eINSTANCE.createDataTypeAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				ArraysFactory.eINSTANCE.createArrayCreation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				ArraysFactory.eINSTANCE.createArrayIndexesAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				ArraysFactory.eINSTANCE.createArrayInitializer()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				AssignmentFactory.eINSTANCE.createSimpleAssignment()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				AssignmentFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				AssignmentFactory.eINSTANCE.createUnaryAssignment()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				LiteralsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				LiteralsFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.RETURN_STATEMENT__EXPRESSION,
				AnnotationFactory.eINSTANCE.createAnnotation()));
	}

}
