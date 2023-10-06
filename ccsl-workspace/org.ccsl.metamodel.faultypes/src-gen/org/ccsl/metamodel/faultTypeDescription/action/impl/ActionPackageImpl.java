/**
 */
package org.ccsl.metamodel.faultTypeDescription.action.impl;

import ccsl.ccslPackage;

import ccsl.elements.expressions.ExpressionsPackage;

import org.ccsl.metamodel.faultTypeDescription.FaultypesPackage;

import org.ccsl.metamodel.faultTypeDescription.action.ActionFactory;
import org.ccsl.metamodel.faultTypeDescription.action.ActionPackage;
import org.ccsl.metamodel.faultTypeDescription.action.ArithmeticOperatorMap;
import org.ccsl.metamodel.faultTypeDescription.action.ChangeLiteralValueAction;
import org.ccsl.metamodel.faultTypeDescription.action.DeleteAction;
import org.ccsl.metamodel.faultTypeDescription.action.DeleteInfixOperatorAction;
import org.ccsl.metamodel.faultTypeDescription.action.DeleteRandomStatementAction;
import org.ccsl.metamodel.faultTypeDescription.action.MoveScopeUpAction;
import org.ccsl.metamodel.faultTypeDescription.action.ReplaceArithmeticOperatorAction;
import org.ccsl.metamodel.faultTypeDescription.action.ReplaceVariableAccessAction;

import org.ccsl.metamodel.faultTypeDescription.impl.FaultypesPackageImpl;

import org.ccsl.metamodel.faultTypeDescription.strategy.StrategyPackage;

import org.ccsl.metamodel.faultTypeDescription.strategy.impl.StrategyPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionPackageImpl extends EPackageImpl implements ActionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveScopeUpActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteInfixOperatorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeLiteralValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteRandomStatementActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replaceVariableAccessActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replaceArithmeticOperatorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticOperatorMapEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ccsl.metamodel.faultTypeDescription.action.ActionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActionPackageImpl() {
		super(eNS_URI, ActionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ActionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActionPackage init() {
		if (isInited)
			return (ActionPackage) EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredActionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ActionPackageImpl theActionPackage = registeredActionPackage instanceof ActionPackageImpl
				? (ActionPackageImpl) registeredActionPackage
				: new ActionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ccslPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FaultypesPackage.eNS_URI);
		FaultypesPackageImpl theFaultypesPackage = (FaultypesPackageImpl) (registeredPackage instanceof FaultypesPackageImpl
				? registeredPackage
				: FaultypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StrategyPackage.eNS_URI);
		StrategyPackageImpl theStrategyPackage = (StrategyPackageImpl) (registeredPackage instanceof StrategyPackageImpl
				? registeredPackage
				: StrategyPackage.eINSTANCE);

		// Create package meta-data objects
		theActionPackage.createPackageContents();
		theFaultypesPackage.createPackageContents();
		theStrategyPackage.createPackageContents();

		// Initialize created meta-data
		theActionPackage.initializePackageContents();
		theFaultypesPackage.initializePackageContents();
		theStrategyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActionPackage.eNS_URI, theActionPackage);
		return theActionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteAction() {
		return deleteActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveScopeUpAction() {
		return moveScopeUpActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteInfixOperatorAction() {
		return deleteInfixOperatorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeLiteralValueAction() {
		return changeLiteralValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteRandomStatementAction() {
		return deleteRandomStatementActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplaceVariableAccessAction() {
		return replaceVariableAccessActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplaceArithmeticOperatorAction() {
		return replaceArithmeticOperatorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplaceArithmeticOperatorAction_ReplaceMap() {
		return (EReference) replaceArithmeticOperatorActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmeticOperatorMap() {
		return arithmeticOperatorMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArithmeticOperatorMap_OldArithmeticOperator() {
		return (EAttribute) arithmeticOperatorMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArithmeticOperatorMap_NewArithmeticOperator() {
		return (EAttribute) arithmeticOperatorMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionFactory getActionFactory() {
		return (ActionFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		deleteActionEClass = createEClass(DELETE_ACTION);

		moveScopeUpActionEClass = createEClass(MOVE_SCOPE_UP_ACTION);

		deleteInfixOperatorActionEClass = createEClass(DELETE_INFIX_OPERATOR_ACTION);

		changeLiteralValueActionEClass = createEClass(CHANGE_LITERAL_VALUE_ACTION);

		deleteRandomStatementActionEClass = createEClass(DELETE_RANDOM_STATEMENT_ACTION);

		replaceVariableAccessActionEClass = createEClass(REPLACE_VARIABLE_ACCESS_ACTION);

		replaceArithmeticOperatorActionEClass = createEClass(REPLACE_ARITHMETIC_OPERATOR_ACTION);
		createEReference(replaceArithmeticOperatorActionEClass, REPLACE_ARITHMETIC_OPERATOR_ACTION__REPLACE_MAP);

		arithmeticOperatorMapEClass = createEClass(ARITHMETIC_OPERATOR_MAP);
		createEAttribute(arithmeticOperatorMapEClass, ARITHMETIC_OPERATOR_MAP__OLD_ARITHMETIC_OPERATOR);
		createEAttribute(arithmeticOperatorMapEClass, ARITHMETIC_OPERATOR_MAP__NEW_ARITHMETIC_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpressionsPackage.eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(deleteActionEClass, DeleteAction.class, "DeleteAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(moveScopeUpActionEClass, MoveScopeUpAction.class, "MoveScopeUpAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(deleteInfixOperatorActionEClass, DeleteInfixOperatorAction.class, "DeleteInfixOperatorAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeLiteralValueActionEClass, ChangeLiteralValueAction.class, "ChangeLiteralValueAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deleteRandomStatementActionEClass, DeleteRandomStatementAction.class, "DeleteRandomStatementAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(replaceVariableAccessActionEClass, ReplaceVariableAccessAction.class, "ReplaceVariableAccessAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(replaceArithmeticOperatorActionEClass, ReplaceArithmeticOperatorAction.class,
				"ReplaceArithmeticOperatorAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReplaceArithmeticOperatorAction_ReplaceMap(), this.getArithmeticOperatorMap(), null,
				"replaceMap", null, 1, -1, ReplaceArithmeticOperatorAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arithmeticOperatorMapEClass, ArithmeticOperatorMap.class, "ArithmeticOperatorMap", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArithmeticOperatorMap_OldArithmeticOperator(), theExpressionsPackage.getArithmeticOperator(),
				"oldArithmeticOperator", null, 0, 1, ArithmeticOperatorMap.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArithmeticOperatorMap_NewArithmeticOperator(), theExpressionsPackage.getArithmeticOperator(),
				"newArithmeticOperator", null, 0, 1, ArithmeticOperatorMap.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ActionPackageImpl
