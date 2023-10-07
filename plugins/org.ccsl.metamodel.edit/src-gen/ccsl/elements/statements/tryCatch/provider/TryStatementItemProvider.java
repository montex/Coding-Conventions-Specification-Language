/**
 */
package ccsl.elements.statements.tryCatch.provider;

import ccsl.elements.expressions.ExpressionsFactory;

import ccsl.elements.expressions.accesses.AccessesFactory;

import ccsl.elements.expressions.annotation.AnnotationFactory;

import ccsl.elements.expressions.arrays.ArraysFactory;

import ccsl.elements.expressions.assignment.AssignmentFactory;

import ccsl.elements.expressions.invocations.InvocationsFactory;

import ccsl.elements.expressions.literals.LiteralsFactory;

import ccsl.elements.namedElements.complexType.ComplexTypeFactory;

import ccsl.elements.statements.StatementsFactory;

import ccsl.elements.statements.controlFlow.ControlFlowFactory;

import ccsl.elements.statements.provider.StatementItemProvider;

import ccsl.elements.statements.tryCatch.TryCatchFactory;
import ccsl.elements.statements.tryCatch.TryCatchPackage;
import ccsl.elements.statements.tryCatch.TryStatement;

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
 * This is the item provider adapter for a {@link ccsl.elements.statements.tryCatch.TryStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TryStatementItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TryStatementItemProvider(AdapterFactory adapterFactory) {
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

			addCatchClausesKindPropertyDescriptor(object);
			addResourcesKindPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Catch Clauses Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCatchClausesKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TryStatement_catchClausesKind_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TryStatement_catchClausesKind_feature",
								"_UI_TryStatement_type"),
						TryCatchPackage.Literals.TRY_STATEMENT__CATCH_CLAUSES_KIND, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Resources Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourcesKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TryStatement_resourcesKind_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TryStatement_resourcesKind_feature",
								"_UI_TryStatement_type"),
						TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES_KIND, true, false, false,
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
			childrenFeatures.add(TryCatchPackage.Literals.TRY_STATEMENT__CATCH_CLAUSES);
			childrenFeatures.add(TryCatchPackage.Literals.TRY_STATEMENT__FINALLY_BLOCK);
			childrenFeatures.add(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES);
			childrenFeatures.add(TryCatchPackage.Literals.TRY_STATEMENT__TRY_BLOCK);
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
	 * This returns TryStatement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TryStatement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((TryStatement) object).getUniqueName();
		return label == null || label.length() == 0 ? getString("_UI_TryStatement_type")
				: getString("_UI_TryStatement_type") + " " + label;
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

		switch (notification.getFeatureID(TryStatement.class)) {
		case TryCatchPackage.TRY_STATEMENT__CATCH_CLAUSES_KIND:
		case TryCatchPackage.TRY_STATEMENT__RESOURCES_KIND:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TryCatchPackage.TRY_STATEMENT__CATCH_CLAUSES:
		case TryCatchPackage.TRY_STATEMENT__FINALLY_BLOCK:
		case TryCatchPackage.TRY_STATEMENT__RESOURCES:
		case TryCatchPackage.TRY_STATEMENT__TRY_BLOCK:
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

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__CATCH_CLAUSES,
				TryCatchFactory.eINSTANCE.createCatchClause()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__FINALLY_BLOCK,
				StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__FINALLY_BLOCK,
				ControlFlowFactory.eINSTANCE.createSwitchCaseBlock()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				ComplexTypeFactory.eINSTANCE.createAnonymousClass()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				ExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				ExpressionsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				ExpressionsFactory.eINSTANCE.createTernaryExpression()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				ExpressionsFactory.eINSTANCE.createInstanceofExpression()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				ExpressionsFactory.eINSTANCE.createOperandExpression()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				ExpressionsFactory.eINSTANCE.createStringConcatenation()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				ExpressionsFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				ExpressionsFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				InvocationsFactory.eINSTANCE.createInvocation()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				InvocationsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				InvocationsFactory.eINSTANCE.createConstructorInvocation()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				InvocationsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				AccessesFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				AccessesFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				AccessesFactory.eINSTANCE.createDataTypeAccess()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				ArraysFactory.eINSTANCE.createArrayCreation()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				ArraysFactory.eINSTANCE.createArrayIndexesAccess()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				ArraysFactory.eINSTANCE.createArrayInitializer()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				AssignmentFactory.eINSTANCE.createSimpleAssignment()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				AssignmentFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				AssignmentFactory.eINSTANCE.createUnaryAssignment()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				LiteralsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				LiteralsFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__RESOURCES,
				AnnotationFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__TRY_BLOCK,
				StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(TryCatchPackage.Literals.TRY_STATEMENT__TRY_BLOCK,
				ControlFlowFactory.eINSTANCE.createSwitchCaseBlock()));
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

		boolean qualify = childFeature == TryCatchPackage.Literals.TRY_STATEMENT__FINALLY_BLOCK
				|| childFeature == TryCatchPackage.Literals.TRY_STATEMENT__TRY_BLOCK;

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
