/**
 */
package ccsl.elements.namedElements.variable.provider;

import ccsl.elements.ElementsPackage;

import ccsl.elements.expressions.ExpressionsFactory;

import ccsl.elements.expressions.accesses.AccessesFactory;

import ccsl.elements.expressions.annotation.AnnotationFactory;

import ccsl.elements.expressions.arrays.ArraysFactory;

import ccsl.elements.expressions.assignment.AssignmentFactory;

import ccsl.elements.expressions.invocations.InvocationsFactory;

import ccsl.elements.expressions.literals.LiteralsFactory;

import ccsl.elements.namedElements.complexType.ComplexTypeFactory;

import ccsl.elements.namedElements.variable.InitializableVariable;
import ccsl.elements.namedElements.variable.VariablePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.elements.namedElements.variable.InitializableVariable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InitializableVariableItemProvider extends VariableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializableVariableItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE);
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
	 * This returns InitializableVariable.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InitializableVariable"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((InitializableVariable) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_InitializableVariable_type")
				: getString("_UI_InitializableVariable_type") + " " + label;
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

		switch (notification.getFeatureID(InitializableVariable.class)) {
		case VariablePackage.INITIALIZABLE_VARIABLE__INITIAL_VALUE:
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

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				ComplexTypeFactory.eINSTANCE.createAnonymousClass()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				ExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				ExpressionsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				ExpressionsFactory.eINSTANCE.createTernaryExpression()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				ExpressionsFactory.eINSTANCE.createInstanceofExpression()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				ExpressionsFactory.eINSTANCE.createOperandExpression()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				ExpressionsFactory.eINSTANCE.createStringConcatenation()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				ExpressionsFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				ExpressionsFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				InvocationsFactory.eINSTANCE.createInvocation()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				InvocationsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				InvocationsFactory.eINSTANCE.createConstructorInvocation()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				InvocationsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				AccessesFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				AccessesFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				AccessesFactory.eINSTANCE.createDataTypeAccess()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				ArraysFactory.eINSTANCE.createArrayCreation()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				ArraysFactory.eINSTANCE.createArrayIndexesAccess()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				ArraysFactory.eINSTANCE.createArrayInitializer()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				AssignmentFactory.eINSTANCE.createSimpleAssignment()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				AssignmentFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				AssignmentFactory.eINSTANCE.createUnaryAssignment()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				LiteralsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				LiteralsFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE,
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
				|| childFeature == VariablePackage.Literals.INITIALIZABLE_VARIABLE__INITIAL_VALUE;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
