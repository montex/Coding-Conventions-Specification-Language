/**
 */
package ccsl.elements.expressions.accesses.impl;

import ccsl.ccslPackage;

import ccsl.context.ContextPackage;

import ccsl.context.impl.ContextPackageImpl;

import ccsl.elements.ElementsPackage;

import ccsl.elements.datatype.DatatypePackage;

import ccsl.elements.datatype.impl.DatatypePackageImpl;

import ccsl.elements.expressions.ExpressionsPackage;

import ccsl.elements.expressions.accesses.Access;
import ccsl.elements.expressions.accesses.AccessesFactory;
import ccsl.elements.expressions.accesses.AccessesPackage;
import ccsl.elements.expressions.accesses.DataTypeAccess;
import ccsl.elements.expressions.accesses.VariableAccess;

import ccsl.elements.expressions.annotation.AnnotationPackage;

import ccsl.elements.expressions.annotation.impl.AnnotationPackageImpl;

import ccsl.elements.expressions.arrays.ArraysPackage;

import ccsl.elements.expressions.arrays.impl.ArraysPackageImpl;

import ccsl.elements.expressions.assignment.AssignmentPackage;

import ccsl.elements.expressions.assignment.impl.AssignmentPackageImpl;

import ccsl.elements.expressions.impl.ExpressionsPackageImpl;

import ccsl.elements.expressions.invocations.InvocationsPackage;

import ccsl.elements.expressions.invocations.impl.InvocationsPackageImpl;

import ccsl.elements.expressions.literals.LiteralsPackage;

import ccsl.elements.expressions.literals.impl.LiteralsPackageImpl;

import ccsl.elements.impl.ElementsPackageImpl;

import ccsl.elements.namedElements.NamedElementsPackage;

import ccsl.elements.namedElements.complexType.ComplexTypePackage;

import ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl;

import ccsl.elements.namedElements.impl.NamedElementsPackageImpl;

import ccsl.elements.namedElements.method.MethodPackage;

import ccsl.elements.namedElements.method.impl.MethodPackageImpl;

import ccsl.elements.namedElements.variable.VariablePackage;

import ccsl.elements.namedElements.variable.impl.VariablePackageImpl;

import ccsl.elements.statements.StatementsPackage;

import ccsl.elements.statements.controlFlow.ControlFlowPackage;

import ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl;

import ccsl.elements.statements.impl.StatementsPackageImpl;

import ccsl.elements.statements.import_.ImportPackage;

import ccsl.elements.statements.import_.impl.ImportPackageImpl;

import ccsl.elements.statements.tryCatch.TryCatchPackage;

import ccsl.elements.statements.tryCatch.impl.TryCatchPackageImpl;

import ccsl.functions.FunctionsPackage;

import ccsl.functions.booleanFunctions.BooleanFunctionsPackage;

import ccsl.functions.booleanFunctions.filters.FiltersPackage;

import ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl;

import ccsl.functions.booleanFunctions.impl.BooleanFunctionsPackageImpl;

import ccsl.functions.impl.FunctionsPackageImpl;

import ccsl.functions.numberFunctions.NumberFunctionsPackage;

import ccsl.functions.numberFunctions.impl.NumberFunctionsPackageImpl;

import ccsl.impl.ccslPackageImpl;

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
public class AccessesPackageImpl extends EPackageImpl implements AccessesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessEClass = null;

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
	 * @see ccsl.elements.expressions.accesses.AccessesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AccessesPackageImpl() {
		super(eNS_URI, AccessesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AccessesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AccessesPackage init() {
		if (isInited)
			return (AccessesPackage) EPackage.Registry.INSTANCE.getEPackage(AccessesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAccessesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AccessesPackageImpl theAccessesPackage = registeredAccessesPackage instanceof AccessesPackageImpl
				? (AccessesPackageImpl) registeredAccessesPackage
				: new AccessesPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ccslPackage.eNS_URI);
		ccslPackageImpl theccslPackage = (ccslPackageImpl) (registeredPackage instanceof ccslPackageImpl
				? registeredPackage
				: ccslPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ElementsPackage.eNS_URI);
		ElementsPackageImpl theElementsPackage = (ElementsPackageImpl) (registeredPackage instanceof ElementsPackageImpl
				? registeredPackage
				: ElementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NamedElementsPackage.eNS_URI);
		NamedElementsPackageImpl theNamedElementsPackage = (NamedElementsPackageImpl) (registeredPackage instanceof NamedElementsPackageImpl
				? registeredPackage
				: NamedElementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI);
		VariablePackageImpl theVariablePackage = (VariablePackageImpl) (registeredPackage instanceof VariablePackageImpl
				? registeredPackage
				: VariablePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ComplexTypePackage.eNS_URI);
		ComplexTypePackageImpl theComplexTypePackage = (ComplexTypePackageImpl) (registeredPackage instanceof ComplexTypePackageImpl
				? registeredPackage
				: ComplexTypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MethodPackage.eNS_URI);
		MethodPackageImpl theMethodPackage = (MethodPackageImpl) (registeredPackage instanceof MethodPackageImpl
				? registeredPackage
				: MethodPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl) (registeredPackage instanceof StatementsPackageImpl
				? registeredPackage
				: StatementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ControlFlowPackage.eNS_URI);
		ControlFlowPackageImpl theControlFlowPackage = (ControlFlowPackageImpl) (registeredPackage instanceof ControlFlowPackageImpl
				? registeredPackage
				: ControlFlowPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TryCatchPackage.eNS_URI);
		TryCatchPackageImpl theTryCatchPackage = (TryCatchPackageImpl) (registeredPackage instanceof TryCatchPackageImpl
				? registeredPackage
				: TryCatchPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ImportPackage.eNS_URI);
		ImportPackageImpl theImportPackage = (ImportPackageImpl) (registeredPackage instanceof ImportPackageImpl
				? registeredPackage
				: ImportPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI);
		DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl) (registeredPackage instanceof DatatypePackageImpl
				? registeredPackage
				: DatatypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl) (registeredPackage instanceof ExpressionsPackageImpl
				? registeredPackage
				: ExpressionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InvocationsPackage.eNS_URI);
		InvocationsPackageImpl theInvocationsPackage = (InvocationsPackageImpl) (registeredPackage instanceof InvocationsPackageImpl
				? registeredPackage
				: InvocationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI);
		ArraysPackageImpl theArraysPackage = (ArraysPackageImpl) (registeredPackage instanceof ArraysPackageImpl
				? registeredPackage
				: ArraysPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AssignmentPackage.eNS_URI);
		AssignmentPackageImpl theAssignmentPackage = (AssignmentPackageImpl) (registeredPackage instanceof AssignmentPackageImpl
				? registeredPackage
				: AssignmentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI);
		LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl) (registeredPackage instanceof LiteralsPackageImpl
				? registeredPackage
				: LiteralsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnnotationPackage.eNS_URI);
		AnnotationPackageImpl theAnnotationPackage = (AnnotationPackageImpl) (registeredPackage instanceof AnnotationPackageImpl
				? registeredPackage
				: AnnotationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		ContextPackageImpl theContextPackage = (ContextPackageImpl) (registeredPackage instanceof ContextPackageImpl
				? registeredPackage
				: ContextPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl) (registeredPackage instanceof FunctionsPackageImpl
				? registeredPackage
				: FunctionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BooleanFunctionsPackage.eNS_URI);
		BooleanFunctionsPackageImpl theBooleanFunctionsPackage = (BooleanFunctionsPackageImpl) (registeredPackage instanceof BooleanFunctionsPackageImpl
				? registeredPackage
				: BooleanFunctionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FiltersPackage.eNS_URI);
		FiltersPackageImpl theFiltersPackage = (FiltersPackageImpl) (registeredPackage instanceof FiltersPackageImpl
				? registeredPackage
				: FiltersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NumberFunctionsPackage.eNS_URI);
		NumberFunctionsPackageImpl theNumberFunctionsPackage = (NumberFunctionsPackageImpl) (registeredPackage instanceof NumberFunctionsPackageImpl
				? registeredPackage
				: NumberFunctionsPackage.eINSTANCE);

		// Create package meta-data objects
		theAccessesPackage.createPackageContents();
		theccslPackage.createPackageContents();
		theElementsPackage.createPackageContents();
		theNamedElementsPackage.createPackageContents();
		theVariablePackage.createPackageContents();
		theComplexTypePackage.createPackageContents();
		theMethodPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theControlFlowPackage.createPackageContents();
		theTryCatchPackage.createPackageContents();
		theImportPackage.createPackageContents();
		theDatatypePackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theInvocationsPackage.createPackageContents();
		theArraysPackage.createPackageContents();
		theAssignmentPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theAnnotationPackage.createPackageContents();
		theContextPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theBooleanFunctionsPackage.createPackageContents();
		theFiltersPackage.createPackageContents();
		theNumberFunctionsPackage.createPackageContents();

		// Initialize created meta-data
		theAccessesPackage.initializePackageContents();
		theccslPackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
		theNamedElementsPackage.initializePackageContents();
		theVariablePackage.initializePackageContents();
		theComplexTypePackage.initializePackageContents();
		theMethodPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theControlFlowPackage.initializePackageContents();
		theTryCatchPackage.initializePackageContents();
		theImportPackage.initializePackageContents();
		theDatatypePackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theInvocationsPackage.initializePackageContents();
		theArraysPackage.initializePackageContents();
		theAssignmentPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theAnnotationPackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theBooleanFunctionsPackage.initializePackageContents();
		theFiltersPackage.initializePackageContents();
		theNumberFunctionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAccessesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AccessesPackage.eNS_URI, theAccessesPackage);
		return theAccessesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAccess() {
		return variableAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAccess_Variable() {
		return (EReference) variableAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeAccess() {
		return dataTypeAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeAccess_Datatype() {
		return (EReference) dataTypeAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccess() {
		return accessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccess_From() {
		return (EReference) accessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessesFactory getAccessesFactory() {
		return (AccessesFactory) getEFactoryInstance();
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
		variableAccessEClass = createEClass(VARIABLE_ACCESS);
		createEReference(variableAccessEClass, VARIABLE_ACCESS__VARIABLE);

		dataTypeAccessEClass = createEClass(DATA_TYPE_ACCESS);
		createEReference(dataTypeAccessEClass, DATA_TYPE_ACCESS__DATATYPE);

		accessEClass = createEClass(ACCESS);
		createEReference(accessEClass, ACCESS__FROM);
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
		VariablePackage theVariablePackage = (VariablePackage) EPackage.Registry.INSTANCE
				.getEPackage(VariablePackage.eNS_URI);
		DatatypePackage theDatatypePackage = (DatatypePackage) EPackage.Registry.INSTANCE
				.getEPackage(DatatypePackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpressionsPackage.eNS_URI);

		// Add supertypes to classes
		variableAccessEClass.getESuperTypes().add(this.getAccess());
		dataTypeAccessEClass.getESuperTypes().add(this.getAccess());
		accessEClass.getESuperTypes().add(theExpressionsPackage.getExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(variableAccessEClass, VariableAccess.class, "VariableAccess", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableAccess_Variable(), theVariablePackage.getVariable(), null, "variable", null, 0, 1,
				VariableAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeAccessEClass, DataTypeAccess.class, "DataTypeAccess", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeAccess_Datatype(), theDatatypePackage.getDataType(), null, "datatype", null, 0, 1,
				DataTypeAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessEClass, Access.class, "Access", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccess_From(), theExpressionsPackage.getExpression(), null, "from", null, 0, 1, Access.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //AccessesPackageImpl
