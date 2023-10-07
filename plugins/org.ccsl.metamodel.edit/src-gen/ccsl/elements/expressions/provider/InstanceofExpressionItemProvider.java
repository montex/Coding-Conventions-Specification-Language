/**
 */
package ccsl.elements.expressions.provider;

import ccsl.elements.expressions.ExpressionsFactory;
import ccsl.elements.expressions.ExpressionsPackage;
import ccsl.elements.expressions.InstanceofExpression;

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

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.elements.expressions.InstanceofExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceofExpressionItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceofExpressionItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InstanceofExpression_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InstanceofExpression_type_feature",
								"_UI_InstanceofExpression_type"),
						ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__TYPE, true, false, true, null, null, null));
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
			childrenFeatures.add(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION);
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
	 * This returns InstanceofExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InstanceofExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((InstanceofExpression) object).getUniqueName();
		return label == null || label.length() == 0 ? getString("_UI_InstanceofExpression_type")
				: getString("_UI_InstanceofExpression_type") + " " + label;
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

		switch (notification.getFeatureID(InstanceofExpression.class)) {
		case ExpressionsPackage.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION:
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
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						ExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						ExpressionsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						ExpressionsFactory.eINSTANCE.createTernaryExpression()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						ExpressionsFactory.eINSTANCE.createInstanceofExpression()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						ExpressionsFactory.eINSTANCE.createOperandExpression()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						ExpressionsFactory.eINSTANCE.createStringConcatenation()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						ExpressionsFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						ExpressionsFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						ComplexTypeFactory.eINSTANCE.createAnonymousClass()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						InvocationsFactory.eINSTANCE.createInvocation()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						InvocationsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						InvocationsFactory.eINSTANCE.createConstructorInvocation()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						InvocationsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						AccessesFactory.eINSTANCE.createAccess()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						AccessesFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						AccessesFactory.eINSTANCE.createDataTypeAccess()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						ArraysFactory.eINSTANCE.createArrayCreation()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						ArraysFactory.eINSTANCE.createArrayIndexesAccess()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						ArraysFactory.eINSTANCE.createArrayInitializer()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						AssignmentFactory.eINSTANCE.createSimpleAssignment()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						AssignmentFactory.eINSTANCE.createAssignment()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						AssignmentFactory.eINSTANCE.createUnaryAssignment()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						LiteralsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						LiteralsFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors
				.add(createChildParameter(ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION,
						AnnotationFactory.eINSTANCE.createAnnotation()));
	}

}
