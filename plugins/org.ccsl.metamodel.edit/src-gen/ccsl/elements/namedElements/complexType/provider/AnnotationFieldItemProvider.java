/**
 */
package ccsl.elements.namedElements.complexType.provider;

import ccsl.elements.ElementsPackage;

import ccsl.elements.expressions.ExpressionsFactory;

import ccsl.elements.expressions.accesses.AccessesFactory;

import ccsl.elements.expressions.annotation.AnnotationFactory;

import ccsl.elements.expressions.arrays.ArraysFactory;

import ccsl.elements.expressions.assignment.AssignmentFactory;

import ccsl.elements.expressions.invocations.InvocationsFactory;

import ccsl.elements.expressions.literals.LiteralsFactory;

import ccsl.elements.namedElements.complexType.AnnotationField;
import ccsl.elements.namedElements.complexType.ComplexTypeFactory;
import ccsl.elements.namedElements.complexType.ComplexTypePackage;

import ccsl.elements.namedElements.provider.NamedElementItemProvider;

import ccsl.provider.CcslEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.elements.namedElements.complexType.AnnotationField} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationFieldItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationFieldItemProvider(AdapterFactory adapterFactory) {
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
						getResourceLocator(), getString("_UI_AnnotationField_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AnnotationField_type_feature",
								"_UI_AnnotationField_type"),
						ComplexTypePackage.Literals.ANNOTATION_FIELD__TYPE, true, false, true, null, null, null));
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
			childrenFeatures.add(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT);
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
	 * This returns AnnotationField.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AnnotationField"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((AnnotationField) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_AnnotationField_type")
				: getString("_UI_AnnotationField_type") + " " + label;
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

		switch (notification.getFeatureID(AnnotationField.class)) {
		case ComplexTypePackage.ANNOTATION_FIELD__DEFAULT:
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

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				ComplexTypeFactory.eINSTANCE.createAnonymousClass()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				ExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				ExpressionsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				ExpressionsFactory.eINSTANCE.createTernaryExpression()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				ExpressionsFactory.eINSTANCE.createInstanceofExpression()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				ExpressionsFactory.eINSTANCE.createOperandExpression()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				ExpressionsFactory.eINSTANCE.createStringConcatenation()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				ExpressionsFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				ExpressionsFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				InvocationsFactory.eINSTANCE.createInvocation()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				InvocationsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				InvocationsFactory.eINSTANCE.createConstructorInvocation()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				InvocationsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				AccessesFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				AccessesFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				AccessesFactory.eINSTANCE.createDataTypeAccess()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				ArraysFactory.eINSTANCE.createArrayCreation()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				ArraysFactory.eINSTANCE.createArrayIndexesAccess()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				ArraysFactory.eINSTANCE.createArrayInitializer()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				AssignmentFactory.eINSTANCE.createSimpleAssignment()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				AssignmentFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				AssignmentFactory.eINSTANCE.createUnaryAssignment()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				LiteralsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				LiteralsFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT,
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

		boolean qualify = childFeature == ElementsPackage.Literals.ANNOTABLE__ANNOTATIONS
				|| childFeature == ComplexTypePackage.Literals.ANNOTATION_FIELD__DEFAULT;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
