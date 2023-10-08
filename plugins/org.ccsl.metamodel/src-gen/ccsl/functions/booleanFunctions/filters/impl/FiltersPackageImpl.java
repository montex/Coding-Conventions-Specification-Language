/**
 */
package ccsl.functions.booleanFunctions.filters.impl;

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

import ccsl.functions.FunctionsPackage;

import ccsl.functions.booleanFunctions.BooleanFunctionsPackage;

import ccsl.functions.booleanFunctions.filters.AtomicFilter;
import ccsl.functions.booleanFunctions.filters.BlockLastStatementFilter;
import ccsl.functions.booleanFunctions.filters.ChildClosureComplexTypeFilter;
import ccsl.functions.booleanFunctions.filters.CompositeFilter;
import ccsl.functions.booleanFunctions.filters.CountFilter;
import ccsl.functions.booleanFunctions.filters.EquationFilter;
import ccsl.functions.booleanFunctions.filters.EquationOperator;
import ccsl.functions.booleanFunctions.filters.Filter;
import ccsl.functions.booleanFunctions.filters.FiltersFactory;
import ccsl.functions.booleanFunctions.filters.FiltersPackage;
import ccsl.functions.booleanFunctions.filters.FromClosureFilter;
import ccsl.functions.booleanFunctions.filters.HasSameReferenceFilter;
import ccsl.functions.booleanFunctions.filters.HasSuperClassFilter;
import ccsl.functions.booleanFunctions.filters.ImplicitContentsFilter;
import ccsl.functions.booleanFunctions.filters.ImplicityContainerFilter;
import ccsl.functions.booleanFunctions.filters.ImplicityOperandFilter;
import ccsl.functions.booleanFunctions.filters.IsEmptyBlockFilter;
import ccsl.functions.booleanFunctions.filters.IsKindOfFilter;
import ccsl.functions.booleanFunctions.filters.IsStringFilter;
import ccsl.functions.booleanFunctions.filters.IsTypeOfFilter;
import ccsl.functions.booleanFunctions.filters.PropertyFilter;
import ccsl.functions.booleanFunctions.filters.RegexMatch;
import ccsl.functions.booleanFunctions.filters.SameNameFilter;
import ccsl.functions.booleanFunctions.filters.SuperMethodClosureFilter;
import ccsl.functions.booleanFunctions.filters.TemplateFilter;

import ccsl.functions.booleanFunctions.impl.BooleanFunctionsPackageImpl;

import ccsl.functions.impl.FunctionsPackageImpl;

import ccsl.functions.numberFunctions.NumberFunctionsPackage;

import ccsl.functions.numberFunctions.impl.NumberFunctionsPackageImpl;

import ccsl.impl.ccslPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class FiltersPackageImpl extends EPackageImpl implements FiltersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sameNameFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regexMatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicityOperandFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicityContainerFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isKindOfFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superMethodClosureFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isTypeOfFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childClosureComplexTypeFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isStringFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equationFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromClosureFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasSuperClassFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockLastStatementFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasSameReferenceFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isEmptyBlockFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicitContentsFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum equationOperatorEEnum = null;

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
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FiltersPackageImpl() {
		super(eNS_URI, FiltersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FiltersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FiltersPackage init() {
		if (isInited)
			return (FiltersPackage) EPackage.Registry.INSTANCE.getEPackage(FiltersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFiltersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FiltersPackageImpl theFiltersPackage = registeredFiltersPackage instanceof FiltersPackageImpl
				? (FiltersPackageImpl) registeredFiltersPackage
				: new FiltersPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NumberFunctionsPackage.eNS_URI);
		NumberFunctionsPackageImpl theNumberFunctionsPackage = (NumberFunctionsPackageImpl) (registeredPackage instanceof NumberFunctionsPackageImpl
				? registeredPackage
				: NumberFunctionsPackage.eINSTANCE);

		// Create package meta-data objects
		theFiltersPackage.createPackageContents();
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
		theFunctionsPackage.createPackageContents();
		theBooleanFunctionsPackage.createPackageContents();
		theNumberFunctionsPackage.createPackageContents();

		// Initialize created meta-data
		theFiltersPackage.initializePackageContents();
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
		theFunctionsPackage.initializePackageContents();
		theBooleanFunctionsPackage.initializePackageContents();
		theNumberFunctionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFiltersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FiltersPackage.eNS_URI, theFiltersPackage);
		return theFiltersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_Negated() {
		return (EAttribute) filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicFilter() {
		return atomicFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicFilter_Targets() {
		return (EReference) atomicFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeFilter() {
		return compositeFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeFilter_Filters() {
		return (EReference) compositeFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeFilter_Operator() {
		return (EAttribute) compositeFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyFilter() {
		return propertyFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateFilter() {
		return templateFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateFilter_TargetTemplate() {
		return (EReference) templateFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateFilter_Context() {
		return (EReference) templateFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSameNameFilter() {
		return sameNameFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSameNameFilter_Elements() {
		return (EReference) sameNameFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSameNameFilter_IgnoreCase() {
		return (EAttribute) sameNameFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountFilter() {
		return countFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountFilter_Min() {
		return (EAttribute) countFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountFilter_Max() {
		return (EAttribute) countFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountFilter_Context() {
		return (EReference) countFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountFilter_Container() {
		return (EReference) countFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountFilter_Field() {
		return (EReference) countFilterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegexMatch() {
		return regexMatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegexMatch_Regex() {
		return (EAttribute) regexMatchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicityOperandFilter() {
		return implicityOperandFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicityOperandFilter_ImplicityOperand() {
		return (EReference) implicityOperandFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicityOperandFilter_Expression() {
		return (EReference) implicityOperandFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicityContainerFilter() {
		return implicityContainerFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicityContainerFilter_ImplicityContainer() {
		return (EReference) implicityContainerFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicityContainerFilter_ImplicityField() {
		return (EReference) implicityContainerFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicityContainerFilter_Context() {
		return (EReference) implicityContainerFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsKindOfFilter() {
		return isKindOfFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsKindOfFilter_Context() {
		return (EReference) isKindOfFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsKindOfFilter_Type() {
		return (EReference) isKindOfFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperMethodClosureFilter() {
		return superMethodClosureFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperMethodClosureFilter_Context() {
		return (EReference) superMethodClosureFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperMethodClosureFilter_SuperMethod() {
		return (EReference) superMethodClosureFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsTypeOfFilter() {
		return isTypeOfFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsTypeOfFilter_Context() {
		return (EReference) isTypeOfFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsTypeOfFilter_Type() {
		return (EReference) isTypeOfFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChildClosureComplexTypeFilter() {
		return childClosureComplexTypeFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildClosureComplexTypeFilter_SuperComplexType() {
		return (EReference) childClosureComplexTypeFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildClosureComplexTypeFilter_ChildComplexType() {
		return (EReference) childClosureComplexTypeFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildClosureComplexTypeFilter_Context() {
		return (EReference) childClosureComplexTypeFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsStringFilter() {
		return isStringFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquationFilter() {
		return equationFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquationFilter_LeftHandSide() {
		return (EReference) equationFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquationFilter_RightHandSide() {
		return (EReference) equationFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEquationFilter_Operator() {
		return (EAttribute) equationFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFromClosureFilter() {
		return fromClosureFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFromClosureFilter_From() {
		return (EReference) fromClosureFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFromClosureFilter_Context() {
		return (EReference) fromClosureFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasSuperClassFilter() {
		return hasSuperClassFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasSuperClassFilter_SuperClass() {
		return (EReference) hasSuperClassFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasSuperClassFilter_SubClass() {
		return (EReference) hasSuperClassFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHasSuperClassFilter_IncludesTarget() {
		return (EAttribute) hasSuperClassFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasSuperClassFilter_Context() {
		return (EReference) hasSuperClassFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockLastStatementFilter() {
		return blockLastStatementFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockLastStatementFilter_LastStatement() {
		return (EReference) blockLastStatementFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockLastStatementFilter_Context() {
		return (EReference) blockLastStatementFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasSameReferenceFilter() {
		return hasSameReferenceFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsEmptyBlockFilter() {
		return isEmptyBlockFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIsEmptyBlockFilter_AllowEmptyStatement() {
		return (EAttribute) isEmptyBlockFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIsEmptyBlockFilter_AllowComments() {
		return (EAttribute) isEmptyBlockFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicitContentsFilter() {
		return implicitContentsFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicitContentsFilter_Context() {
		return (EReference) implicitContentsFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicitContentsFilter_ImplicitField() {
		return (EReference) implicitContentsFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicitContentsFilter_ImplicitContainer() {
		return (EReference) implicitContentsFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEquationOperator() {
		return equationOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltersFactory getFiltersFactory() {
		return (FiltersFactory) getEFactoryInstance();
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
		filterEClass = createEClass(FILTER);
		createEAttribute(filterEClass, FILTER__NEGATED);

		atomicFilterEClass = createEClass(ATOMIC_FILTER);
		createEReference(atomicFilterEClass, ATOMIC_FILTER__TARGETS);

		compositeFilterEClass = createEClass(COMPOSITE_FILTER);
		createEReference(compositeFilterEClass, COMPOSITE_FILTER__FILTERS);
		createEAttribute(compositeFilterEClass, COMPOSITE_FILTER__OPERATOR);

		propertyFilterEClass = createEClass(PROPERTY_FILTER);

		templateFilterEClass = createEClass(TEMPLATE_FILTER);
		createEReference(templateFilterEClass, TEMPLATE_FILTER__TARGET_TEMPLATE);
		createEReference(templateFilterEClass, TEMPLATE_FILTER__CONTEXT);

		sameNameFilterEClass = createEClass(SAME_NAME_FILTER);
		createEReference(sameNameFilterEClass, SAME_NAME_FILTER__ELEMENTS);
		createEAttribute(sameNameFilterEClass, SAME_NAME_FILTER__IGNORE_CASE);

		countFilterEClass = createEClass(COUNT_FILTER);
		createEAttribute(countFilterEClass, COUNT_FILTER__MIN);
		createEAttribute(countFilterEClass, COUNT_FILTER__MAX);
		createEReference(countFilterEClass, COUNT_FILTER__CONTEXT);
		createEReference(countFilterEClass, COUNT_FILTER__CONTAINER);
		createEReference(countFilterEClass, COUNT_FILTER__FIELD);

		regexMatchEClass = createEClass(REGEX_MATCH);
		createEAttribute(regexMatchEClass, REGEX_MATCH__REGEX);

		implicityOperandFilterEClass = createEClass(IMPLICITY_OPERAND_FILTER);
		createEReference(implicityOperandFilterEClass, IMPLICITY_OPERAND_FILTER__IMPLICITY_OPERAND);
		createEReference(implicityOperandFilterEClass, IMPLICITY_OPERAND_FILTER__EXPRESSION);

		implicityContainerFilterEClass = createEClass(IMPLICITY_CONTAINER_FILTER);
		createEReference(implicityContainerFilterEClass, IMPLICITY_CONTAINER_FILTER__IMPLICITY_CONTAINER);
		createEReference(implicityContainerFilterEClass, IMPLICITY_CONTAINER_FILTER__IMPLICITY_FIELD);
		createEReference(implicityContainerFilterEClass, IMPLICITY_CONTAINER_FILTER__CONTEXT);

		isKindOfFilterEClass = createEClass(IS_KIND_OF_FILTER);
		createEReference(isKindOfFilterEClass, IS_KIND_OF_FILTER__CONTEXT);
		createEReference(isKindOfFilterEClass, IS_KIND_OF_FILTER__TYPE);

		superMethodClosureFilterEClass = createEClass(SUPER_METHOD_CLOSURE_FILTER);
		createEReference(superMethodClosureFilterEClass, SUPER_METHOD_CLOSURE_FILTER__CONTEXT);
		createEReference(superMethodClosureFilterEClass, SUPER_METHOD_CLOSURE_FILTER__SUPER_METHOD);

		isTypeOfFilterEClass = createEClass(IS_TYPE_OF_FILTER);
		createEReference(isTypeOfFilterEClass, IS_TYPE_OF_FILTER__CONTEXT);
		createEReference(isTypeOfFilterEClass, IS_TYPE_OF_FILTER__TYPE);

		childClosureComplexTypeFilterEClass = createEClass(CHILD_CLOSURE_COMPLEX_TYPE_FILTER);
		createEReference(childClosureComplexTypeFilterEClass, CHILD_CLOSURE_COMPLEX_TYPE_FILTER__SUPER_COMPLEX_TYPE);
		createEReference(childClosureComplexTypeFilterEClass, CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CHILD_COMPLEX_TYPE);
		createEReference(childClosureComplexTypeFilterEClass, CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CONTEXT);

		isStringFilterEClass = createEClass(IS_STRING_FILTER);

		equationFilterEClass = createEClass(EQUATION_FILTER);
		createEReference(equationFilterEClass, EQUATION_FILTER__LEFT_HAND_SIDE);
		createEReference(equationFilterEClass, EQUATION_FILTER__RIGHT_HAND_SIDE);
		createEAttribute(equationFilterEClass, EQUATION_FILTER__OPERATOR);

		fromClosureFilterEClass = createEClass(FROM_CLOSURE_FILTER);
		createEReference(fromClosureFilterEClass, FROM_CLOSURE_FILTER__FROM);
		createEReference(fromClosureFilterEClass, FROM_CLOSURE_FILTER__CONTEXT);

		hasSuperClassFilterEClass = createEClass(HAS_SUPER_CLASS_FILTER);
		createEReference(hasSuperClassFilterEClass, HAS_SUPER_CLASS_FILTER__SUPER_CLASS);
		createEReference(hasSuperClassFilterEClass, HAS_SUPER_CLASS_FILTER__SUB_CLASS);
		createEAttribute(hasSuperClassFilterEClass, HAS_SUPER_CLASS_FILTER__INCLUDES_TARGET);
		createEReference(hasSuperClassFilterEClass, HAS_SUPER_CLASS_FILTER__CONTEXT);

		blockLastStatementFilterEClass = createEClass(BLOCK_LAST_STATEMENT_FILTER);
		createEReference(blockLastStatementFilterEClass, BLOCK_LAST_STATEMENT_FILTER__LAST_STATEMENT);
		createEReference(blockLastStatementFilterEClass, BLOCK_LAST_STATEMENT_FILTER__CONTEXT);

		hasSameReferenceFilterEClass = createEClass(HAS_SAME_REFERENCE_FILTER);

		isEmptyBlockFilterEClass = createEClass(IS_EMPTY_BLOCK_FILTER);
		createEAttribute(isEmptyBlockFilterEClass, IS_EMPTY_BLOCK_FILTER__ALLOW_EMPTY_STATEMENT);
		createEAttribute(isEmptyBlockFilterEClass, IS_EMPTY_BLOCK_FILTER__ALLOW_COMMENTS);

		implicitContentsFilterEClass = createEClass(IMPLICIT_CONTENTS_FILTER);
		createEReference(implicitContentsFilterEClass, IMPLICIT_CONTENTS_FILTER__CONTEXT);
		createEReference(implicitContentsFilterEClass, IMPLICIT_CONTENTS_FILTER__IMPLICIT_FIELD);
		createEReference(implicitContentsFilterEClass, IMPLICIT_CONTENTS_FILTER__IMPLICIT_CONTAINER);

		// Create enums
		equationOperatorEEnum = createEEnum(EQUATION_OPERATOR);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);
		ElementsPackage theElementsPackage = (ElementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ElementsPackage.eNS_URI);
		ccslPackage theccslPackage = (ccslPackage) EPackage.Registry.INSTANCE.getEPackage(ccslPackage.eNS_URI);
		ContextPackage theContextPackage = (ContextPackage) EPackage.Registry.INSTANCE
				.getEPackage(ContextPackage.eNS_URI);
		NamedElementsPackage theNamedElementsPackage = (NamedElementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(NamedElementsPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpressionsPackage.eNS_URI);
		DatatypePackage theDatatypePackage = (DatatypePackage) EPackage.Registry.INSTANCE
				.getEPackage(DatatypePackage.eNS_URI);
		MethodPackage theMethodPackage = (MethodPackage) EPackage.Registry.INSTANCE.getEPackage(MethodPackage.eNS_URI);
		ComplexTypePackage theComplexTypePackage = (ComplexTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(ComplexTypePackage.eNS_URI);
		NumberFunctionsPackage theNumberFunctionsPackage = (NumberFunctionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(NumberFunctionsPackage.eNS_URI);
		StatementsPackage theStatementsPackage = (StatementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(StatementsPackage.eNS_URI);

		// Add supertypes to classes
		filterEClass.getESuperTypes().add(theBooleanFunctionsPackage.getCcslBooleanFunction());
		atomicFilterEClass.getESuperTypes().add(this.getFilter());
		compositeFilterEClass.getESuperTypes().add(this.getFilter());
		propertyFilterEClass.getESuperTypes().add(this.getAtomicFilter());
		templateFilterEClass.getESuperTypes().add(this.getAtomicFilter());
		sameNameFilterEClass.getESuperTypes().add(this.getAtomicFilter());
		countFilterEClass.getESuperTypes().add(this.getAtomicFilter());
		regexMatchEClass.getESuperTypes().add(this.getAtomicFilter());
		implicityOperandFilterEClass.getESuperTypes().add(this.getTemplateFilter());
		implicityContainerFilterEClass.getESuperTypes().add(this.getAtomicFilter());
		isKindOfFilterEClass.getESuperTypes().add(this.getAtomicFilter());
		superMethodClosureFilterEClass.getESuperTypes().add(this.getAtomicFilter());
		isTypeOfFilterEClass.getESuperTypes().add(this.getAtomicFilter());
		childClosureComplexTypeFilterEClass.getESuperTypes().add(this.getAtomicFilter());
		isStringFilterEClass.getESuperTypes().add(this.getAtomicFilter());
		fromClosureFilterEClass.getESuperTypes().add(this.getAtomicFilter());
		hasSuperClassFilterEClass.getESuperTypes().add(this.getAtomicFilter());
		blockLastStatementFilterEClass.getESuperTypes().add(this.getAtomicFilter());
		hasSameReferenceFilterEClass.getESuperTypes().add(this.getAtomicFilter());
		isEmptyBlockFilterEClass.getESuperTypes().add(this.getAtomicFilter());
		implicitContentsFilterEClass.getESuperTypes().add(this.getAtomicFilter());

		// Initialize classes and features; add operations and parameters
		initEClass(filterEClass, Filter.class, "Filter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilter_Negated(), theXMLTypePackage.getBoolean(), "negated", null, 0, 1, Filter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicFilterEClass, AtomicFilter.class, "AtomicFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicFilter_Targets(), theElementsPackage.getElement(), null, "targets", null, 1, -1,
				AtomicFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeFilterEClass, CompositeFilter.class, "CompositeFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeFilter_Filters(), this.getFilter(), null, "filters", null, 1, -1,
				CompositeFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeFilter_Operator(), theccslPackage.getLogicOperator(), "operator", null, 0, 1,
				CompositeFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(propertyFilterEClass, PropertyFilter.class, "PropertyFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateFilterEClass, TemplateFilter.class, "TemplateFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateFilter_TargetTemplate(), theElementsPackage.getElement(), null, "targetTemplate",
				null, 1, 1, TemplateFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateFilter_Context(), theContextPackage.getContext(), null, "context", null, 1, 1,
				TemplateFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sameNameFilterEClass, SameNameFilter.class, "SameNameFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSameNameFilter_Elements(), theNamedElementsPackage.getNamedElement(), null, "elements", null,
				0, -1, SameNameFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSameNameFilter_IgnoreCase(), theXMLTypePackage.getBoolean(), "ignoreCase", "true", 0, 1,
				SameNameFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(countFilterEClass, CountFilter.class, "CountFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCountFilter_Min(), theXMLTypePackage.getInt(), "min", null, 0, 1, CountFilter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountFilter_Max(), theXMLTypePackage.getInt(), "max", null, 0, 1, CountFilter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountFilter_Context(), theContextPackage.getContext(), null, "context", null, 1, -1,
				CountFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountFilter_Container(), theElementsPackage.getElement(), null, "container", null, 0, 1,
				CountFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountFilter_Field(), theElementsPackage.getElement(), null, "field", null, 1, 1,
				CountFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regexMatchEClass, RegexMatch.class, "RegexMatch", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegexMatch_Regex(), ecorePackage.getEString(), "regex", null, 0, 1, RegexMatch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implicityOperandFilterEClass, ImplicityOperandFilter.class, "ImplicityOperandFilter", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplicityOperandFilter_ImplicityOperand(), theElementsPackage.getElement(), null,
				"implicityOperand", null, 1, 1, ImplicityOperandFilter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplicityOperandFilter_Expression(), theExpressionsPackage.getExpression(), null,
				"expression", null, 1, 1, ImplicityOperandFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implicityContainerFilterEClass, ImplicityContainerFilter.class, "ImplicityContainerFilter",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplicityContainerFilter_ImplicityContainer(), theElementsPackage.getElement(), null,
				"implicityContainer", null, 1, 1, ImplicityContainerFilter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplicityContainerFilter_ImplicityField(), theElementsPackage.getElement(), null,
				"implicityField", null, 1, 1, ImplicityContainerFilter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplicityContainerFilter_Context(), theContextPackage.getContext(), null, "context", null, 1,
				1, ImplicityContainerFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isKindOfFilterEClass, IsKindOfFilter.class, "IsKindOfFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIsKindOfFilter_Context(), theContextPackage.getContext(), null, "context", null, 1, 1,
				IsKindOfFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIsKindOfFilter_Type(), theDatatypePackage.getDataType(), null, "type", null, 1, 1,
				IsKindOfFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superMethodClosureFilterEClass, SuperMethodClosureFilter.class, "SuperMethodClosureFilter",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuperMethodClosureFilter_Context(), theContextPackage.getContext(), null, "context", null, 1,
				1, SuperMethodClosureFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuperMethodClosureFilter_SuperMethod(), theMethodPackage.getMethod(), null, "superMethod",
				null, 1, 1, SuperMethodClosureFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isTypeOfFilterEClass, IsTypeOfFilter.class, "IsTypeOfFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIsTypeOfFilter_Context(), theContextPackage.getContext(), null, "context", null, 1, 1,
				IsTypeOfFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIsTypeOfFilter_Type(), theDatatypePackage.getDataType(), null, "type", null, 1, 1,
				IsTypeOfFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childClosureComplexTypeFilterEClass, ChildClosureComplexTypeFilter.class,
				"ChildClosureComplexTypeFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildClosureComplexTypeFilter_SuperComplexType(), theComplexTypePackage.getComplexType(),
				null, "superComplexType", null, 1, 1, ChildClosureComplexTypeFilter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChildClosureComplexTypeFilter_ChildComplexType(), theComplexTypePackage.getComplexType(),
				null, "childComplexType", null, 1, 1, ChildClosureComplexTypeFilter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChildClosureComplexTypeFilter_Context(), theContextPackage.getContext(), null, "context",
				null, 1, 1, ChildClosureComplexTypeFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isStringFilterEClass, IsStringFilter.class, "IsStringFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(equationFilterEClass, EquationFilter.class, "EquationFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquationFilter_LeftHandSide(), theNumberFunctionsPackage.getCcslNumberFunction(), null,
				"leftHandSide", null, 1, -1, EquationFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquationFilter_RightHandSide(), theNumberFunctionsPackage.getCcslNumberFunction(), null,
				"rightHandSide", null, 1, -1, EquationFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquationFilter_Operator(), this.getEquationOperator(), "operator", null, 0, 1,
				EquationFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(fromClosureFilterEClass, FromClosureFilter.class, "FromClosureFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFromClosureFilter_From(), theStatementsPackage.getStatement(), null, "from", null, 1, 1,
				FromClosureFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFromClosureFilter_Context(), theContextPackage.getContext(), null, "context", null, 0, 1,
				FromClosureFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasSuperClassFilterEClass, HasSuperClassFilter.class, "HasSuperClassFilter", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHasSuperClassFilter_SuperClass(), theComplexTypePackage.getJClass(), null, "superClass", null,
				0, 1, HasSuperClassFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHasSuperClassFilter_SubClass(), theComplexTypePackage.getJClass(), null, "subClass", null, 0,
				1, HasSuperClassFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHasSuperClassFilter_IncludesTarget(), theXMLTypePackage.getBoolean(), "includesTarget",
				"true", 0, 1, HasSuperClassFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHasSuperClassFilter_Context(), theContextPackage.getContext(), null, "context", null, 0, 1,
				HasSuperClassFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockLastStatementFilterEClass, BlockLastStatementFilter.class, "BlockLastStatementFilter",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockLastStatementFilter_LastStatement(), theStatementsPackage.getStatement(), null,
				"lastStatement", null, 0, 1, BlockLastStatementFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockLastStatementFilter_Context(), theContextPackage.getContext(), null, "context", null, 0,
				1, BlockLastStatementFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasSameReferenceFilterEClass, HasSameReferenceFilter.class, "HasSameReferenceFilter", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isEmptyBlockFilterEClass, IsEmptyBlockFilter.class, "IsEmptyBlockFilter", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIsEmptyBlockFilter_AllowEmptyStatement(), theXMLTypePackage.getBoolean(),
				"allowEmptyStatement", "false", 0, 1, IsEmptyBlockFilter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIsEmptyBlockFilter_AllowComments(), theXMLTypePackage.getBoolean(), "allowComments", "false",
				0, 1, IsEmptyBlockFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implicitContentsFilterEClass, ImplicitContentsFilter.class, "ImplicitContentsFilter", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplicitContentsFilter_Context(), theContextPackage.getContext(), null, "context", null, 0, 1,
				ImplicitContentsFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplicitContentsFilter_ImplicitField(), theElementsPackage.getElement(), null,
				"implicitField", null, 0, 1, ImplicitContentsFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplicitContentsFilter_ImplicitContainer(), theElementsPackage.getElement(), null,
				"implicitContainer", null, 0, 1, ImplicitContentsFilter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(equationOperatorEEnum, EquationOperator.class, "EquationOperator");
		addEEnumLiteral(equationOperatorEEnum, EquationOperator.PLUS_LITERAL);
	}

} //FiltersPackageImpl
