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

import ccsl.elements.statements.controlFlow.ControlFlowPackage;
import ccsl.elements.statements.controlFlow.ForStatement;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.elements.statements.controlFlow.ForStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ForStatementItemProvider extends LoopStatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForStatementItemProvider(AdapterFactory adapterFactory) {
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

			addInitializersKindPropertyDescriptor(object);
			addUpdatersKindPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Initializers Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitializersKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ForStatement_initializersKind_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ForStatement_initializersKind_feature",
								"_UI_ForStatement_type"),
						ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS_KIND, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Updaters Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdatersKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ForStatement_updatersKind_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ForStatement_updatersKind_feature",
								"_UI_ForStatement_type"),
						ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS_KIND, true, false, false,
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
			childrenFeatures.add(ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION);
			childrenFeatures.add(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS);
			childrenFeatures.add(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS);
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
	 * This returns ForStatement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ForStatement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ForStatement) object).getUniqueName();
		return label == null || label.length() == 0 ? getString("_UI_ForStatement_type")
				: getString("_UI_ForStatement_type") + " " + label;
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

		switch (notification.getFeatureID(ForStatement.class)) {
		case ControlFlowPackage.FOR_STATEMENT__INITIALIZERS_KIND:
		case ControlFlowPackage.FOR_STATEMENT__UPDATERS_KIND:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ControlFlowPackage.FOR_STATEMENT__CONDITION:
		case ControlFlowPackage.FOR_STATEMENT__INITIALIZERS:
		case ControlFlowPackage.FOR_STATEMENT__UPDATERS:
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

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				ComplexTypeFactory.eINSTANCE.createAnonymousClass()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				ExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				ExpressionsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				ExpressionsFactory.eINSTANCE.createTernaryExpression()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				ExpressionsFactory.eINSTANCE.createInstanceofExpression()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				ExpressionsFactory.eINSTANCE.createOperandExpression()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				ExpressionsFactory.eINSTANCE.createStringConcatenation()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				ExpressionsFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				ExpressionsFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				InvocationsFactory.eINSTANCE.createInvocation()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				InvocationsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				InvocationsFactory.eINSTANCE.createConstructorInvocation()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				InvocationsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				AccessesFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				AccessesFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				AccessesFactory.eINSTANCE.createDataTypeAccess()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				ArraysFactory.eINSTANCE.createArrayCreation()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				ArraysFactory.eINSTANCE.createArrayIndexesAccess()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				ArraysFactory.eINSTANCE.createArrayInitializer()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				AssignmentFactory.eINSTANCE.createSimpleAssignment()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				AssignmentFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				AssignmentFactory.eINSTANCE.createUnaryAssignment()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				LiteralsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				LiteralsFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS,
				AnnotationFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				ComplexTypeFactory.eINSTANCE.createAnonymousClass()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				ExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				ExpressionsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				ExpressionsFactory.eINSTANCE.createTernaryExpression()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				ExpressionsFactory.eINSTANCE.createInstanceofExpression()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				ExpressionsFactory.eINSTANCE.createOperandExpression()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				ExpressionsFactory.eINSTANCE.createStringConcatenation()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				ExpressionsFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				ExpressionsFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				InvocationsFactory.eINSTANCE.createInvocation()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				InvocationsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				InvocationsFactory.eINSTANCE.createConstructorInvocation()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				InvocationsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				AccessesFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				AccessesFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				AccessesFactory.eINSTANCE.createDataTypeAccess()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				ArraysFactory.eINSTANCE.createArrayCreation()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				ArraysFactory.eINSTANCE.createArrayIndexesAccess()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				ArraysFactory.eINSTANCE.createArrayInitializer()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				AssignmentFactory.eINSTANCE.createSimpleAssignment()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				AssignmentFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				AssignmentFactory.eINSTANCE.createUnaryAssignment()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				LiteralsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				LiteralsFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS,
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

		boolean qualify = childFeature == ControlFlowPackage.Literals.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION
				|| childFeature == ControlFlowPackage.Literals.FOR_STATEMENT__INITIALIZERS
				|| childFeature == ControlFlowPackage.Literals.FOR_STATEMENT__UPDATERS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
