/**
 */
package ccsl.elements.namedElements.variable.impl;

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

import ccsl.elements.namedElements.variable.FieldVariable;
import ccsl.elements.namedElements.variable.InitializableVariable;
import ccsl.elements.namedElements.variable.LocalVariable;
import ccsl.elements.namedElements.variable.ParameterVariable;
import ccsl.elements.namedElements.variable.Variable;
import ccsl.elements.namedElements.variable.VariableFactory;
import ccsl.elements.namedElements.variable.VariablePackage;

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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariablePackageImpl extends EPackageImpl implements VariablePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializableVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldVariableEClass = null;

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
	 * @see ccsl.elements.namedElements.variable.VariablePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VariablePackageImpl() {
		super(eNS_URI, VariableFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VariablePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VariablePackage init() {
		if (isInited)
			return (VariablePackage) EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVariablePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VariablePackageImpl theVariablePackage = registeredVariablePackage instanceof VariablePackageImpl
				? (VariablePackageImpl) registeredVariablePackage
				: new VariablePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

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
		theVariablePackage.createPackageContents();
		theccslPackage.createPackageContents();
		theElementsPackage.createPackageContents();
		theNamedElementsPackage.createPackageContents();
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
		theFunctionsPackage.createPackageContents();
		theBooleanFunctionsPackage.createPackageContents();
		theFiltersPackage.createPackageContents();
		theNumberFunctionsPackage.createPackageContents();

		// Initialize created meta-data
		theVariablePackage.initializePackageContents();
		theccslPackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
		theNamedElementsPackage.initializePackageContents();
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
		theFunctionsPackage.initializePackageContents();
		theBooleanFunctionsPackage.initializePackageContents();
		theFiltersPackage.initializePackageContents();
		theNumberFunctionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVariablePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VariablePackage.eNS_URI, theVariablePackage);
		return theVariablePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Type() {
		return (EReference) variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Final() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterVariable() {
		return parameterVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalVariable() {
		return localVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitializableVariable() {
		return initializableVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitializableVariable_InitialValue() {
		return (EReference) initializableVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldVariable() {
		return fieldVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldVariable_Static() {
		return (EAttribute) fieldVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldVariable_Volatile() {
		return (EAttribute) fieldVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableFactory getVariableFactory() {
		return (VariableFactory) getEFactoryInstance();
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
		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__TYPE);
		createEAttribute(variableEClass, VARIABLE__FINAL);

		parameterVariableEClass = createEClass(PARAMETER_VARIABLE);

		localVariableEClass = createEClass(LOCAL_VARIABLE);

		initializableVariableEClass = createEClass(INITIALIZABLE_VARIABLE);
		createEReference(initializableVariableEClass, INITIALIZABLE_VARIABLE__INITIAL_VALUE);

		fieldVariableEClass = createEClass(FIELD_VARIABLE);
		createEAttribute(fieldVariableEClass, FIELD_VARIABLE__STATIC);
		createEAttribute(fieldVariableEClass, FIELD_VARIABLE__VOLATILE);
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
		NamedElementsPackage theNamedElementsPackage = (NamedElementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(NamedElementsPackage.eNS_URI);
		DatatypePackage theDatatypePackage = (DatatypePackage) EPackage.Registry.INSTANCE
				.getEPackage(DatatypePackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpressionsPackage.eNS_URI);
		ElementsPackage theElementsPackage = (ElementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ElementsPackage.eNS_URI);

		// Add supertypes to classes
		variableEClass.getESuperTypes().add(theNamedElementsPackage.getNamedElement());
		parameterVariableEClass.getESuperTypes().add(this.getVariable());
		localVariableEClass.getESuperTypes().add(this.getInitializableVariable());
		initializableVariableEClass.getESuperTypes().add(this.getVariable());
		fieldVariableEClass.getESuperTypes().add(this.getInitializableVariable());
		fieldVariableEClass.getESuperTypes().add(theElementsPackage.getControlledAccessElement());

		// Initialize classes and features; add operations and parameters
		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Type(), theDatatypePackage.getDataType(), null, "type", null, 0, 1, Variable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Final(), theXMLTypePackage.getBooleanObject(), "final", null, 0, 1, Variable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterVariableEClass, ParameterVariable.class, "ParameterVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(localVariableEClass, LocalVariable.class, "LocalVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(initializableVariableEClass, InitializableVariable.class, "InitializableVariable", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitializableVariable_InitialValue(), theExpressionsPackage.getExpression(), null,
				"initialValue", null, 0, 1, InitializableVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldVariableEClass, FieldVariable.class, "FieldVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldVariable_Static(), theXMLTypePackage.getBooleanObject(), "static", null, 0, 1,
				FieldVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldVariable_Volatile(), theXMLTypePackage.getBooleanObject(), "volatile", null, 0, 1,
				FieldVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
	}

} //VariablePackageImpl
