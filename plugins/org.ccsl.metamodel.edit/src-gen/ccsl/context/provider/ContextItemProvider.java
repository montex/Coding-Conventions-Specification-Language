/**
 */
package ccsl.context.provider;

import ccsl.context.Context;
import ccsl.context.ContextPackage;

import ccsl.elements.ElementsFactory;

import ccsl.elements.datatype.DatatypeFactory;

import ccsl.elements.expressions.ExpressionsFactory;

import ccsl.elements.expressions.accesses.AccessesFactory;

import ccsl.elements.expressions.annotation.AnnotationFactory;

import ccsl.elements.expressions.arrays.ArraysFactory;

import ccsl.elements.expressions.assignment.AssignmentFactory;

import ccsl.elements.expressions.invocations.InvocationsFactory;

import ccsl.elements.expressions.literals.LiteralsFactory;

import ccsl.elements.namedElements.NamedElementsFactory;

import ccsl.elements.namedElements.complexType.ComplexTypeFactory;

import ccsl.elements.namedElements.method.MethodFactory;

import ccsl.elements.namedElements.variable.VariableFactory;

import ccsl.elements.statements.StatementsFactory;

import ccsl.elements.statements.controlFlow.ControlFlowFactory;

import ccsl.elements.statements.import_.ImportFactory;

import ccsl.elements.statements.tryCatch.TryCatchFactory;

import ccsl.functions.booleanFunctions.filters.FiltersFactory;

import ccsl.provider.CcslEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.context.Context} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS);
			childrenFeatures.add(ContextPackage.Literals.CONTEXT__FILTERS);
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
	 * This returns Context.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Context"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_Context_type");
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

		switch (notification.getFeatureID(Context.class)) {
		case ContextPackage.CONTEXT__CONTEXT_ELEMENTS:
		case ContextPackage.CONTEXT__FILTERS:
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

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ElementsFactory.eINSTANCE.createElement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				NamedElementsFactory.eINSTANCE.createNamedElement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				NamedElementsFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				VariableFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				VariableFactory.eINSTANCE.createParameterVariable()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				VariableFactory.eINSTANCE.createInitializableVariable()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				VariableFactory.eINSTANCE.createLocalVariable()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				VariableFactory.eINSTANCE.createFieldVariable()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ComplexTypeFactory.eINSTANCE.createTypeDeclaration()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ComplexTypeFactory.eINSTANCE.createComplexTypeDeclaration()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ComplexTypeFactory.eINSTANCE.createJInterface()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ComplexTypeFactory.eINSTANCE.createComplexType()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ComplexTypeFactory.eINSTANCE.createAnonymousClass()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ComplexTypeFactory.eINSTANCE.createConstructComplexTypeDeclaration()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ComplexTypeFactory.eINSTANCE.createJClass()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ComplexTypeFactory.eINSTANCE.createAnnotationType()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ComplexTypeFactory.eINSTANCE.createAnnotationField()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ComplexTypeFactory.eINSTANCE.createJEnum()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ComplexTypeFactory.eINSTANCE.createEnumConstant()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				MethodFactory.eINSTANCE.createSimpleMethod()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				MethodFactory.eINSTANCE.createConstructor()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				MethodFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				StatementsFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				StatementsFactory.eINSTANCE.createControlFlowStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				StatementsFactory.eINSTANCE.createInstanceCreation()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				StatementsFactory.eINSTANCE.createSynchronizedBlock()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				StatementsFactory.eINSTANCE.createThrowStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				StatementsFactory.eINSTANCE.createEmptyStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				StatementsFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				StatementsFactory.eINSTANCE.createBreakStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				StatementsFactory.eINSTANCE.createContinueStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				StatementsFactory.eINSTANCE.createAssertStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				StatementsFactory.eINSTANCE.createExpressionStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				StatementsFactory.eINSTANCE.createLabelStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ControlFlowFactory.eINSTANCE.createConditionalControlFlowStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ControlFlowFactory.eINSTANCE.createSwitchStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ControlFlowFactory.eINSTANCE.createSwitchCaseBlock()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ControlFlowFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ControlFlowFactory.eINSTANCE.createLoopStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ControlFlowFactory.eINSTANCE.createWhileStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ControlFlowFactory.eINSTANCE.createDoStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ControlFlowFactory.eINSTANCE.createForStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ControlFlowFactory.eINSTANCE.createForEachStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				TryCatchFactory.eINSTANCE.createTryStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				TryCatchFactory.eINSTANCE.createCatchClause()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ImportFactory.eINSTANCE.createImportableElement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ImportFactory.eINSTANCE.createImportStatement()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				DatatypeFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				DatatypeFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				DatatypeFactory.eINSTANCE.createBooleanPrimitiveType()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				DatatypeFactory.eINSTANCE.createShortPrimitiveType()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				DatatypeFactory.eINSTANCE.createObjectType()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				DatatypeFactory.eINSTANCE.createParameterizedType()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				DatatypeFactory.eINSTANCE.createIntPrimitiveType()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				DatatypeFactory.eINSTANCE.createArrayType()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				DatatypeFactory.eINSTANCE.createVoidType()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				DatatypeFactory.eINSTANCE.createTypeParameter()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				DatatypeFactory.eINSTANCE.createWildCardType()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				DatatypeFactory.eINSTANCE.createBytePrimitiveType()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				DatatypeFactory.eINSTANCE.createCharPrimitiveType()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				DatatypeFactory.eINSTANCE.createDoublePrimitiveType()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				DatatypeFactory.eINSTANCE.createFloatPrimitiveType()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				DatatypeFactory.eINSTANCE.createLongPrimitiveType()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ExpressionsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ExpressionsFactory.eINSTANCE.createTernaryExpression()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ExpressionsFactory.eINSTANCE.createInstanceofExpression()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ExpressionsFactory.eINSTANCE.createOperandExpression()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ExpressionsFactory.eINSTANCE.createStringConcatenation()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ExpressionsFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ExpressionsFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				InvocationsFactory.eINSTANCE.createInvocation()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				InvocationsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				InvocationsFactory.eINSTANCE.createConstructorInvocation()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				InvocationsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				AccessesFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				AccessesFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				AccessesFactory.eINSTANCE.createDataTypeAccess()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ArraysFactory.eINSTANCE.createArrayCreation()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ArraysFactory.eINSTANCE.createArrayIndexesAccess()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				ArraysFactory.eINSTANCE.createArrayInitializer()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				AssignmentFactory.eINSTANCE.createSimpleAssignment()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				AssignmentFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				AssignmentFactory.eINSTANCE.createUnaryAssignment()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				LiteralsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				LiteralsFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				AnnotationFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__CONTEXT_ELEMENTS,
				AnnotationFactory.eINSTANCE.createAnnotationFieldValue()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createAtomicFilter()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createCompositeFilter()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createPropertyFilter()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createTemplateFilter()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createSameNameFilter()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createCountFilter()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createRegexMatch()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createImplicityOperandFilter()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createImplicityContainerFilter()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createIsKindOfFilter()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createSuperMethodClosureFilter()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createIsTypeOfFilter()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createChildClosureComplexTypeFilter()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createIsStringFilter()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createFromClosureFilter()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createHasSuperClassFilter()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createBlockLastStatementFilter()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createHasSameReferenceFilter()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createIsEmptyBlockFilter()));

		newChildDescriptors.add(createChildParameter(ContextPackage.Literals.CONTEXT__FILTERS,
				FiltersFactory.eINSTANCE.createImplicitContentsFilter()));
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
