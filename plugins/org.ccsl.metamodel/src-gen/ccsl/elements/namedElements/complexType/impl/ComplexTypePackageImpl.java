/**
 */
package ccsl.elements.namedElements.complexType.impl;

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

import ccsl.elements.namedElements.complexType.AnnotationField;
import ccsl.elements.namedElements.complexType.AnnotationType;
import ccsl.elements.namedElements.complexType.AnonymousClass;
import ccsl.elements.namedElements.complexType.ComplexType;
import ccsl.elements.namedElements.complexType.ComplexTypeDeclaration;
import ccsl.elements.namedElements.complexType.ComplexTypeFactory;
import ccsl.elements.namedElements.complexType.ComplexTypePackage;
import ccsl.elements.namedElements.complexType.ConstructComplexTypeDeclaration;
import ccsl.elements.namedElements.complexType.EnumConstant;
import ccsl.elements.namedElements.complexType.JClass;
import ccsl.elements.namedElements.complexType.JEnum;
import ccsl.elements.namedElements.complexType.JInterface;
import ccsl.elements.namedElements.complexType.TypeDeclaration;

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
public class ComplexTypePackageImpl extends EPackageImpl implements ComplexTypePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructComplexTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumConstantEClass = null;

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
	 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComplexTypePackageImpl() {
		super(eNS_URI, ComplexTypeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComplexTypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComplexTypePackage init() {
		if (isInited)
			return (ComplexTypePackage) EPackage.Registry.INSTANCE.getEPackage(ComplexTypePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredComplexTypePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ComplexTypePackageImpl theComplexTypePackage = registeredComplexTypePackage instanceof ComplexTypePackageImpl
				? (ComplexTypePackageImpl) registeredComplexTypePackage
				: new ComplexTypePackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI);
		VariablePackageImpl theVariablePackage = (VariablePackageImpl) (registeredPackage instanceof VariablePackageImpl
				? registeredPackage
				: VariablePackage.eINSTANCE);
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
		theComplexTypePackage.createPackageContents();
		theccslPackage.createPackageContents();
		theElementsPackage.createPackageContents();
		theNamedElementsPackage.createPackageContents();
		theVariablePackage.createPackageContents();
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
		theComplexTypePackage.initializePackageContents();
		theccslPackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
		theNamedElementsPackage.initializePackageContents();
		theVariablePackage.initializePackageContents();
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
		theComplexTypePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComplexTypePackage.eNS_URI, theComplexTypePackage);
		return theComplexTypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJInterface() {
		return jInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnonymousClass() {
		return anonymousClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnonymousClass_Type() {
		return (EReference) anonymousClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJClass() {
		return jClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_SuperClass() {
		return (EReference) jClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDeclaration() {
		return typeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDeclaration_Static() {
		return (EAttribute) typeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDeclaration_Imports() {
		return (EReference) typeDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDeclaration_NestedTypes() {
		return (EReference) typeDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDeclaration_Inheritance() {
		return (EAttribute) typeDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexType() {
		return complexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexType_Fields() {
		return (EReference) complexTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexType_Methods() {
		return (EReference) complexTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexType_FieldsKind() {
		return (EAttribute) complexTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexType_MethodsKind() {
		return (EAttribute) complexTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationType() {
		return annotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationType_Fields() {
		return (EReference) annotationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationField() {
		return annotationFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationField_Default() {
		return (EReference) annotationFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationField_Type() {
		return (EReference) annotationFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJEnum() {
		return jEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJEnum_EnumConstants() {
		return (EReference) jEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexTypeDeclaration() {
		return complexTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexTypeDeclaration_SuperInterfaces() {
		return (EReference) complexTypeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructComplexTypeDeclaration() {
		return constructComplexTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructComplexTypeDeclaration_Constructors() {
		return (EReference) constructComplexTypeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumConstant() {
		return enumConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumConstant_Arguments() {
		return (EReference) enumConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumConstant_ArgumentsKind() {
		return (EAttribute) enumConstantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexTypeFactory getComplexTypeFactory() {
		return (ComplexTypeFactory) getEFactoryInstance();
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
		jInterfaceEClass = createEClass(JINTERFACE);

		anonymousClassEClass = createEClass(ANONYMOUS_CLASS);
		createEReference(anonymousClassEClass, ANONYMOUS_CLASS__TYPE);

		jClassEClass = createEClass(JCLASS);
		createEReference(jClassEClass, JCLASS__SUPER_CLASS);

		typeDeclarationEClass = createEClass(TYPE_DECLARATION);
		createEAttribute(typeDeclarationEClass, TYPE_DECLARATION__STATIC);
		createEReference(typeDeclarationEClass, TYPE_DECLARATION__IMPORTS);
		createEReference(typeDeclarationEClass, TYPE_DECLARATION__NESTED_TYPES);
		createEAttribute(typeDeclarationEClass, TYPE_DECLARATION__INHERITANCE);

		complexTypeEClass = createEClass(COMPLEX_TYPE);
		createEReference(complexTypeEClass, COMPLEX_TYPE__FIELDS);
		createEReference(complexTypeEClass, COMPLEX_TYPE__METHODS);
		createEAttribute(complexTypeEClass, COMPLEX_TYPE__FIELDS_KIND);
		createEAttribute(complexTypeEClass, COMPLEX_TYPE__METHODS_KIND);

		annotationTypeEClass = createEClass(ANNOTATION_TYPE);
		createEReference(annotationTypeEClass, ANNOTATION_TYPE__FIELDS);

		annotationFieldEClass = createEClass(ANNOTATION_FIELD);
		createEReference(annotationFieldEClass, ANNOTATION_FIELD__DEFAULT);
		createEReference(annotationFieldEClass, ANNOTATION_FIELD__TYPE);

		jEnumEClass = createEClass(JENUM);
		createEReference(jEnumEClass, JENUM__ENUM_CONSTANTS);

		complexTypeDeclarationEClass = createEClass(COMPLEX_TYPE_DECLARATION);
		createEReference(complexTypeDeclarationEClass, COMPLEX_TYPE_DECLARATION__SUPER_INTERFACES);

		constructComplexTypeDeclarationEClass = createEClass(CONSTRUCT_COMPLEX_TYPE_DECLARATION);
		createEReference(constructComplexTypeDeclarationEClass, CONSTRUCT_COMPLEX_TYPE_DECLARATION__CONSTRUCTORS);

		enumConstantEClass = createEClass(ENUM_CONSTANT);
		createEReference(enumConstantEClass, ENUM_CONSTANT__ARGUMENTS);
		createEAttribute(enumConstantEClass, ENUM_CONSTANT__ARGUMENTS_KIND);
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
		DatatypePackage theDatatypePackage = (DatatypePackage) EPackage.Registry.INSTANCE
				.getEPackage(DatatypePackage.eNS_URI);
		NamedElementsPackage theNamedElementsPackage = (NamedElementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(NamedElementsPackage.eNS_URI);
		ImportPackage theImportPackage = (ImportPackage) EPackage.Registry.INSTANCE.getEPackage(ImportPackage.eNS_URI);
		ElementsPackage theElementsPackage = (ElementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ElementsPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);
		VariablePackage theVariablePackage = (VariablePackage) EPackage.Registry.INSTANCE
				.getEPackage(VariablePackage.eNS_URI);
		MethodPackage theMethodPackage = (MethodPackage) EPackage.Registry.INSTANCE.getEPackage(MethodPackage.eNS_URI);
		ccslPackage theccslPackage = (ccslPackage) EPackage.Registry.INSTANCE.getEPackage(ccslPackage.eNS_URI);

		// Add supertypes to classes
		jInterfaceEClass.getESuperTypes().add(this.getComplexTypeDeclaration());
		anonymousClassEClass.getESuperTypes().add(this.getComplexType());
		anonymousClassEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		jClassEClass.getESuperTypes().add(this.getConstructComplexTypeDeclaration());
		typeDeclarationEClass.getESuperTypes().add(theNamedElementsPackage.getNamedElement());
		typeDeclarationEClass.getESuperTypes().add(theDatatypePackage.getObjectType());
		typeDeclarationEClass.getESuperTypes().add(theImportPackage.getImportableElement());
		typeDeclarationEClass.getESuperTypes().add(theElementsPackage.getControlledAccessElement());
		complexTypeEClass.getESuperTypes().add(theElementsPackage.getElement());
		annotationTypeEClass.getESuperTypes().add(this.getTypeDeclaration());
		annotationFieldEClass.getESuperTypes().add(theNamedElementsPackage.getNamedElement());
		jEnumEClass.getESuperTypes().add(this.getConstructComplexTypeDeclaration());
		complexTypeDeclarationEClass.getESuperTypes().add(this.getTypeDeclaration());
		complexTypeDeclarationEClass.getESuperTypes().add(this.getComplexType());
		constructComplexTypeDeclarationEClass.getESuperTypes().add(this.getComplexTypeDeclaration());
		enumConstantEClass.getESuperTypes().add(theNamedElementsPackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(jInterfaceEClass, JInterface.class, "JInterface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(anonymousClassEClass, AnonymousClass.class, "AnonymousClass", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnonymousClass_Type(), theDatatypePackage.getObjectType(), null, "type", null, 0, 1,
				AnonymousClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jClassEClass, JClass.class, "JClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJClass_SuperClass(), this.getJClass(), null, "superClass", null, 0, 1, JClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(typeDeclarationEClass, TypeDeclaration.class, "TypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDeclaration_Static(), theXMLTypePackage.getBooleanObject(), "static", null, 0, 1,
				TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTypeDeclaration_Imports(), theImportPackage.getImportStatement(), null, "imports", null, 0,
				-1, TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeDeclaration_NestedTypes(), this.getTypeDeclaration(), null, "nestedTypes", null, 0, -1,
				TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDeclaration_Inheritance(), theElementsPackage.getInheritance(), "inheritance", "ANY", 0,
				1, TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(complexTypeEClass, ComplexType.class, "ComplexType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexType_Fields(), theVariablePackage.getFieldVariable(), null, "fields", null, 0, -1,
				ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexType_Methods(), theMethodPackage.getMethod(), null, "methods", null, 0, -1,
				ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexType_FieldsKind(), theccslPackage.getCollectionKind(), "fieldsKind", "ANY", 0, 1,
				ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexType_MethodsKind(), theccslPackage.getCollectionKind(), "methodsKind", "ANY", 0, 1,
				ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(annotationTypeEClass, AnnotationType.class, "AnnotationType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationType_Fields(), this.getAnnotationField(), null, "fields", null, 0, -1,
				AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationFieldEClass, AnnotationField.class, "AnnotationField", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationField_Default(), theExpressionsPackage.getExpression(), null, "default", null, 0, 1,
				AnnotationField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationField_Type(), theDatatypePackage.getDataType(), null, "type", null, 0, 1,
				AnnotationField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jEnumEClass, JEnum.class, "JEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJEnum_EnumConstants(), this.getEnumConstant(), null, "enumConstants", null, 0, -1,
				JEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexTypeDeclarationEClass, ComplexTypeDeclaration.class, "ComplexTypeDeclaration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexTypeDeclaration_SuperInterfaces(), this.getJInterface(), null, "superInterfaces", null,
				0, -1, ComplexTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructComplexTypeDeclarationEClass, ConstructComplexTypeDeclaration.class,
				"ConstructComplexTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstructComplexTypeDeclaration_Constructors(), theMethodPackage.getConstructor(), null,
				"constructors", null, 0, -1, ConstructComplexTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumConstantEClass, EnumConstant.class, "EnumConstant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumConstant_Arguments(), theExpressionsPackage.getExpression(), null, "arguments", null, 0,
				-1, EnumConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumConstant_ArgumentsKind(), theccslPackage.getCollectionKind(), "argumentsKind", "ANY", 0,
				1, EnumConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
	}

} //ComplexTypePackageImpl
