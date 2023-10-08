/**
 */
package ccsl.elements.expressions.invocations.provider;

import ccsl.elements.expressions.ExpressionsFactory;

import ccsl.elements.expressions.accesses.AccessesFactory;

import ccsl.elements.expressions.annotation.AnnotationFactory;

import ccsl.elements.expressions.arrays.ArraysFactory;

import ccsl.elements.expressions.assignment.AssignmentFactory;

import ccsl.elements.expressions.invocations.Invocation;
import ccsl.elements.expressions.invocations.InvocationsFactory;
import ccsl.elements.expressions.invocations.InvocationsPackage;

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

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.elements.expressions.invocations.Invocation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InvocationItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationItemProvider(AdapterFactory adapterFactory) {
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

			addArgsKindPropertyDescriptor(object);
			addMethodPropertyDescriptor(object);
			addTypeArgsPropertyDescriptor(object);
			addTypeArgsKindPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Args Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArgsKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Invocation_argsKind_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Invocation_argsKind_feature",
								"_UI_Invocation_type"),
						InvocationsPackage.Literals.INVOCATION__ARGS_KIND, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Invocation_method_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Invocation_method_feature",
								"_UI_Invocation_type"),
						InvocationsPackage.Literals.INVOCATION__METHOD, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Type Args feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeArgsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Invocation_typeArgs_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Invocation_typeArgs_feature",
								"_UI_Invocation_type"),
						InvocationsPackage.Literals.INVOCATION__TYPE_ARGS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Type Args Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeArgsKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Invocation_typeArgsKind_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Invocation_typeArgsKind_feature",
								"_UI_Invocation_type"),
						InvocationsPackage.Literals.INVOCATION__TYPE_ARGS_KIND, true, false, false,
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
			childrenFeatures.add(InvocationsPackage.Literals.INVOCATION__ARGS);
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
	 * This returns Invocation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Invocation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Invocation) object).getUniqueName();
		return label == null || label.length() == 0 ? getString("_UI_Invocation_type")
				: getString("_UI_Invocation_type") + " " + label;
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

		switch (notification.getFeatureID(Invocation.class)) {
		case InvocationsPackage.INVOCATION__ARGS_KIND:
		case InvocationsPackage.INVOCATION__TYPE_ARGS_KIND:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case InvocationsPackage.INVOCATION__ARGS:
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

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				InvocationsFactory.eINSTANCE.createInvocation()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				InvocationsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				InvocationsFactory.eINSTANCE.createConstructorInvocation()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				InvocationsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				ComplexTypeFactory.eINSTANCE.createAnonymousClass()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				ExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				ExpressionsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				ExpressionsFactory.eINSTANCE.createTernaryExpression()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				ExpressionsFactory.eINSTANCE.createInstanceofExpression()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				ExpressionsFactory.eINSTANCE.createOperandExpression()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				ExpressionsFactory.eINSTANCE.createStringConcatenation()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				ExpressionsFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				ExpressionsFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				AccessesFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				AccessesFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				AccessesFactory.eINSTANCE.createDataTypeAccess()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				ArraysFactory.eINSTANCE.createArrayCreation()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				ArraysFactory.eINSTANCE.createArrayIndexesAccess()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				ArraysFactory.eINSTANCE.createArrayInitializer()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				AssignmentFactory.eINSTANCE.createSimpleAssignment()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				AssignmentFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				AssignmentFactory.eINSTANCE.createUnaryAssignment()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				LiteralsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				LiteralsFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(InvocationsPackage.Literals.INVOCATION__ARGS,
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
