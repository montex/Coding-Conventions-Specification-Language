/**
 */
package org.ccsl.metamodel.faultTypeDescription.strategy.impl;

import ccsl.ccslPackage;

import org.ccsl.metamodel.faultTypeDescription.FaultypesPackage;

import org.ccsl.metamodel.faultTypeDescription.action.ActionPackage;

import org.ccsl.metamodel.faultTypeDescription.action.impl.ActionPackageImpl;

import org.ccsl.metamodel.faultTypeDescription.impl.FaultypesPackageImpl;

import org.ccsl.metamodel.faultTypeDescription.strategy.AllStrategy;
import org.ccsl.metamodel.faultTypeDescription.strategy.StrategyFactory;
import org.ccsl.metamodel.faultTypeDescription.strategy.StrategyPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StrategyPackageImpl extends EPackageImpl implements StrategyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allStrategyEClass = null;

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
	 * @see org.ccsl.metamodel.faultTypeDescription.strategy.StrategyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StrategyPackageImpl() {
		super(eNS_URI, StrategyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StrategyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StrategyPackage init() {
		if (isInited)
			return (StrategyPackage) EPackage.Registry.INSTANCE.getEPackage(StrategyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStrategyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StrategyPackageImpl theStrategyPackage = registeredStrategyPackage instanceof StrategyPackageImpl
				? (StrategyPackageImpl) registeredStrategyPackage
				: new StrategyPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ccslPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FaultypesPackage.eNS_URI);
		FaultypesPackageImpl theFaultypesPackage = (FaultypesPackageImpl) (registeredPackage instanceof FaultypesPackageImpl
				? registeredPackage
				: FaultypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);
		ActionPackageImpl theActionPackage = (ActionPackageImpl) (registeredPackage instanceof ActionPackageImpl
				? registeredPackage
				: ActionPackage.eINSTANCE);

		// Create package meta-data objects
		theStrategyPackage.createPackageContents();
		theFaultypesPackage.createPackageContents();
		theActionPackage.createPackageContents();

		// Initialize created meta-data
		theStrategyPackage.initializePackageContents();
		theFaultypesPackage.initializePackageContents();
		theActionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStrategyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StrategyPackage.eNS_URI, theStrategyPackage);
		return theStrategyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllStrategy() {
		return allStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyFactory getStrategyFactory() {
		return (StrategyFactory) getEFactoryInstance();
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
		allStrategyEClass = createEClass(ALL_STRATEGY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(allStrategyEClass, AllStrategy.class, "AllStrategy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //StrategyPackageImpl
