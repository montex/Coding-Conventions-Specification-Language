/**
 */
package ccsl.functions.booleanFunctions.filters.impl;

import ccsl.functions.booleanFunctions.filters.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FiltersFactoryImpl extends EFactoryImpl implements FiltersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FiltersFactory init() {
		try {
			FiltersFactory theFiltersFactory = (FiltersFactory) EPackage.Registry.INSTANCE
					.getEFactory(FiltersPackage.eNS_URI);
			if (theFiltersFactory != null) {
				return theFiltersFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FiltersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FiltersPackage.ATOMIC_FILTER:
			return createAtomicFilter();
		case FiltersPackage.COMPOSITE_FILTER:
			return createCompositeFilter();
		case FiltersPackage.PROPERTY_FILTER:
			return createPropertyFilter();
		case FiltersPackage.TEMPLATE_FILTER:
			return createTemplateFilter();
		case FiltersPackage.SAME_NAME_FILTER:
			return createSameNameFilter();
		case FiltersPackage.COUNT_FILTER:
			return createCountFilter();
		case FiltersPackage.REGEX_MATCH:
			return createRegexMatch();
		case FiltersPackage.IMPLICITY_OPERAND_FILTER:
			return createImplicityOperandFilter();
		case FiltersPackage.IMPLICITY_CONTAINER_FILTER:
			return createImplicityContainerFilter();
		case FiltersPackage.IS_KIND_OF_FILTER:
			return createIsKindOfFilter();
		case FiltersPackage.SUPER_METHOD_CLOSURE_FILTER:
			return createSuperMethodClosureFilter();
		case FiltersPackage.IS_TYPE_OF_FILTER:
			return createIsTypeOfFilter();
		case FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER:
			return createChildClosureComplexTypeFilter();
		case FiltersPackage.IS_STRING_FILTER:
			return createIsStringFilter();
		case FiltersPackage.EQUATION_FILTER:
			return createEquationFilter();
		case FiltersPackage.FROM_CLOSURE_FILTER:
			return createFromClosureFilter();
		case FiltersPackage.HAS_SUPER_CLASS_FILTER:
			return createHasSuperClassFilter();
		case FiltersPackage.BLOCK_LAST_STATEMENT_FILTER:
			return createBlockLastStatementFilter();
		case FiltersPackage.HAS_SAME_REFERENCE_FILTER:
			return createHasSameReferenceFilter();
		case FiltersPackage.IS_EMPTY_BLOCK_FILTER:
			return createIsEmptyBlockFilter();
		case FiltersPackage.IMPLICIT_CONTENTS_FILTER:
			return createImplicitContentsFilter();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case FiltersPackage.EQUATION_OPERATOR:
			return createEquationOperatorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case FiltersPackage.EQUATION_OPERATOR:
			return convertEquationOperatorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicFilter createAtomicFilter() {
		AtomicFilterImpl atomicFilter = new AtomicFilterImpl();
		return atomicFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeFilter createCompositeFilter() {
		CompositeFilterImpl compositeFilter = new CompositeFilterImpl();
		return compositeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyFilter createPropertyFilter() {
		PropertyFilterImpl propertyFilter = new PropertyFilterImpl();
		return propertyFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateFilter createTemplateFilter() {
		TemplateFilterImpl templateFilter = new TemplateFilterImpl();
		return templateFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SameNameFilter createSameNameFilter() {
		SameNameFilterImpl sameNameFilter = new SameNameFilterImpl();
		return sameNameFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountFilter createCountFilter() {
		CountFilterImpl countFilter = new CountFilterImpl();
		return countFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegexMatch createRegexMatch() {
		RegexMatchImpl regexMatch = new RegexMatchImpl();
		return regexMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicityOperandFilter createImplicityOperandFilter() {
		ImplicityOperandFilterImpl implicityOperandFilter = new ImplicityOperandFilterImpl();
		return implicityOperandFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicityContainerFilter createImplicityContainerFilter() {
		ImplicityContainerFilterImpl implicityContainerFilter = new ImplicityContainerFilterImpl();
		return implicityContainerFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsKindOfFilter createIsKindOfFilter() {
		IsKindOfFilterImpl isKindOfFilter = new IsKindOfFilterImpl();
		return isKindOfFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperMethodClosureFilter createSuperMethodClosureFilter() {
		SuperMethodClosureFilterImpl superMethodClosureFilter = new SuperMethodClosureFilterImpl();
		return superMethodClosureFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsTypeOfFilter createIsTypeOfFilter() {
		IsTypeOfFilterImpl isTypeOfFilter = new IsTypeOfFilterImpl();
		return isTypeOfFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildClosureComplexTypeFilter createChildClosureComplexTypeFilter() {
		ChildClosureComplexTypeFilterImpl childClosureComplexTypeFilter = new ChildClosureComplexTypeFilterImpl();
		return childClosureComplexTypeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsStringFilter createIsStringFilter() {
		IsStringFilterImpl isStringFilter = new IsStringFilterImpl();
		return isStringFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquationFilter createEquationFilter() {
		EquationFilterImpl equationFilter = new EquationFilterImpl();
		return equationFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromClosureFilter createFromClosureFilter() {
		FromClosureFilterImpl fromClosureFilter = new FromClosureFilterImpl();
		return fromClosureFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasSuperClassFilter createHasSuperClassFilter() {
		HasSuperClassFilterImpl hasSuperClassFilter = new HasSuperClassFilterImpl();
		return hasSuperClassFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockLastStatementFilter createBlockLastStatementFilter() {
		BlockLastStatementFilterImpl blockLastStatementFilter = new BlockLastStatementFilterImpl();
		return blockLastStatementFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasSameReferenceFilter createHasSameReferenceFilter() {
		HasSameReferenceFilterImpl hasSameReferenceFilter = new HasSameReferenceFilterImpl();
		return hasSameReferenceFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsEmptyBlockFilter createIsEmptyBlockFilter() {
		IsEmptyBlockFilterImpl isEmptyBlockFilter = new IsEmptyBlockFilterImpl();
		return isEmptyBlockFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitContentsFilter createImplicitContentsFilter() {
		ImplicitContentsFilterImpl implicitContentsFilter = new ImplicitContentsFilterImpl();
		return implicitContentsFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquationOperator createEquationOperatorFromString(EDataType eDataType, String initialValue) {
		EquationOperator result = EquationOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEquationOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltersPackage getFiltersPackage() {
		return (FiltersPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static FiltersPackage getPackage() {
		return FiltersPackage.eINSTANCE;
	}

} //FiltersFactoryImpl
