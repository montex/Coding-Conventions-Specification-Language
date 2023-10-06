/**
 */
package org.ccsl.metamodel.faultTypeDescription.impl;

import ccsl.ccslPackage;

import ccsl.elements.ElementsPackage;

import org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription;
import org.ccsl.metamodel.faultTypeDescription.FaultypesFactory;
import org.ccsl.metamodel.faultTypeDescription.FaultypesPackage;
import org.ccsl.metamodel.faultTypeDescription.InjectionAction;
import org.ccsl.metamodel.faultTypeDescription.InjectionStrategy;

import org.ccsl.metamodel.faultTypeDescription.action.ActionPackage;

import org.ccsl.metamodel.faultTypeDescription.action.impl.ActionPackageImpl;

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
public class FaultypesPackageImpl extends EPackageImpl implements FaultypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass injectionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass injectionStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultTypeDescriptionEClass = null;

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
	 * @see org.ccsl.metamodel.faultTypeDescription.FaultypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FaultypesPackageImpl() {
		super(eNS_URI, FaultypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FaultypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FaultypesPackage init() {
		if (isInited)
			return (FaultypesPackage) EPackage.Registry.INSTANCE.getEPackage(FaultypesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFaultypesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FaultypesPackageImpl theFaultypesPackage = registeredFaultypesPackage instanceof FaultypesPackageImpl
				? (FaultypesPackageImpl) registeredFaultypesPackage
				: new FaultypesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ccslPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);
		ActionPackageImpl theActionPackage = (ActionPackageImpl) (registeredPackage instanceof ActionPackageImpl
				? registeredPackage
				: ActionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StrategyPackage.eNS_URI);
		StrategyPackageImpl theStrategyPackage = (StrategyPackageImpl) (registeredPackage instanceof StrategyPackageImpl
				? registeredPackage
				: StrategyPackage.eINSTANCE);

		// Create package meta-data objects
		theFaultypesPackage.createPackageContents();
		theActionPackage.createPackageContents();
		theStrategyPackage.createPackageContents();

		// Initialize created meta-data
		theFaultypesPackage.initializePackageContents();
		theActionPackage.initializePackageContents();
		theStrategyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFaultypesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FaultypesPackage.eNS_URI, theFaultypesPackage);
		return theFaultypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInjectionAction() {
		return injectionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInjectionAction_Target() {
		return (EReference) injectionActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInjectionStrategy() {
		return injectionStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaultTypeDescription() {
		return faultTypeDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaultTypeDescription_Name() {
		return (EAttribute) faultTypeDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultTypeDescription_Rule() {
		return (EReference) faultTypeDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultTypeDescription_Actions() {
		return (EReference) faultTypeDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultTypeDescription_Strategies() {
		return (EReference) faultTypeDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultypesFactory getFaultypesFactory() {
		return (FaultypesFactory) getEFactoryInstance();
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
		injectionActionEClass = createEClass(INJECTION_ACTION);
		createEReference(injectionActionEClass, INJECTION_ACTION__TARGET);

		injectionStrategyEClass = createEClass(INJECTION_STRATEGY);

		faultTypeDescriptionEClass = createEClass(FAULT_TYPE_DESCRIPTION);
		createEAttribute(faultTypeDescriptionEClass, FAULT_TYPE_DESCRIPTION__NAME);
		createEReference(faultTypeDescriptionEClass, FAULT_TYPE_DESCRIPTION__RULE);
		createEReference(faultTypeDescriptionEClass, FAULT_TYPE_DESCRIPTION__ACTIONS);
		createEReference(faultTypeDescriptionEClass, FAULT_TYPE_DESCRIPTION__STRATEGIES);
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
		ActionPackage theActionPackage = (ActionPackage) EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);
		StrategyPackage theStrategyPackage = (StrategyPackage) EPackage.Registry.INSTANCE
				.getEPackage(StrategyPackage.eNS_URI);
		ElementsPackage theElementsPackage = (ElementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ElementsPackage.eNS_URI);
		ccslPackage theccslPackage = (ccslPackage) EPackage.Registry.INSTANCE.getEPackage(ccslPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theActionPackage);
		getESubpackages().add(theStrategyPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		faultTypeDescriptionEClass.getESuperTypes().add(theccslPackage.getRoot());

		// Initialize classes, features, and operations; add parameters
		initEClass(injectionActionEClass, InjectionAction.class, "InjectionAction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInjectionAction_Target(), theElementsPackage.getElement(), null, "target", null, 0, 1,
				InjectionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(injectionStrategyEClass, InjectionStrategy.class, "InjectionStrategy", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(faultTypeDescriptionEClass, FaultTypeDescription.class, "FaultTypeDescription", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFaultTypeDescription_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				FaultTypeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaultTypeDescription_Rule(), theccslPackage.getAtomicRule(), null, "rule", null, 1, 1,
				FaultTypeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaultTypeDescription_Actions(), this.getInjectionAction(), null, "actions", null, 1, -1,
				FaultTypeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaultTypeDescription_Strategies(), this.getInjectionStrategy(), null, "strategies", null, 1,
				-1, FaultTypeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FaultypesPackageImpl
