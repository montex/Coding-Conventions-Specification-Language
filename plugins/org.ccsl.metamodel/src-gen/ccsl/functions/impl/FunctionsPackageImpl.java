/**
 */
package ccsl.functions.impl;

import ccsl.ccslPackage;

import ccsl.context.ContextPackage;

import ccsl.context.impl.ContextPackageImpl;

import ccsl.elements.ElementsPackage;

import ccsl.elements.datatype.DatatypePackage;

import ccsl.elements.datatype.impl.DatatypePackageImpl;

import ccsl.elements.expressions.ExpressionsPackage;

import ccsl.elements.expressions.accesses.AccessesPackage;

import ccsl.elements.expressions.accesses.impl.AccessesPackageImpl;

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

import ccsl.functions.CcslFunction;
import ccsl.functions.FunctionsFactory;
import ccsl.functions.FunctionsPackage;

import ccsl.functions.booleanFunctions.BooleanFunctionsPackage;

import ccsl.functions.booleanFunctions.filters.FiltersPackage;

import ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl;

import ccsl.functions.booleanFunctions.impl.BooleanFunctionsPackageImpl;

import ccsl.functions.numberFunctions.NumberFunctionsPackage;

import ccsl.functions.numberFunctions.impl.NumberFunctionsPackageImpl;

import ccsl.impl.ccslPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionsPackageImpl extends EPackageImpl implements FunctionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ccslFunctionEClass = null;

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
	 * @see ccsl.functions.FunctionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FunctionsPackageImpl() {
		super(eNS_URI, FunctionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FunctionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FunctionsPackage init() {
		if (isInited)
			return (FunctionsPackage) EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFunctionsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FunctionsPackageImpl theFunctionsPackage = registeredFunctionsPackage instanceof FunctionsPackageImpl
				? (FunctionsPackageImpl) registeredFunctionsPackage
				: new FunctionsPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AccessesPackage.eNS_URI);
		AccessesPackageImpl theAccessesPackage = (AccessesPackageImpl) (registeredPackage instanceof AccessesPackageImpl
				? registeredPackage
				: AccessesPackage.eINSTANCE);
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
		theFunctionsPackage.createPackageContents();
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
		theAccessesPackage.createPackageContents();
		theArraysPackage.createPackageContents();
		theAssignmentPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theAnnotationPackage.createPackageContents();
		theContextPackage.createPackageContents();
		theBooleanFunctionsPackage.createPackageContents();
		theFiltersPackage.createPackageContents();
		theNumberFunctionsPackage.createPackageContents();

		// Initialize created meta-data
		theFunctionsPackage.initializePackageContents();
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
		theAccessesPackage.initializePackageContents();
		theArraysPackage.initializePackageContents();
		theAssignmentPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theAnnotationPackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theBooleanFunctionsPackage.initializePackageContents();
		theFiltersPackage.initializePackageContents();
		theNumberFunctionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFunctionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FunctionsPackage.eNS_URI, theFunctionsPackage);
		return theFunctionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCcslFunction() {
		return ccslFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsFactory getFunctionsFactory() {
		return (FunctionsFactory) getEFactoryInstance();
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
		ccslFunctionEClass = createEClass(CCSL_FUNCTION);
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
		BooleanFunctionsPackage theBooleanFunctionsPackage = (BooleanFunctionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(BooleanFunctionsPackage.eNS_URI);
		NumberFunctionsPackage theNumberFunctionsPackage = (NumberFunctionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(NumberFunctionsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theBooleanFunctionsPackage);
		getESubpackages().add(theNumberFunctionsPackage);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(ccslFunctionEClass, CcslFunction.class, "CcslFunction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //FunctionsPackageImpl
