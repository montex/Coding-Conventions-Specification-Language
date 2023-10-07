/**
 */
package ccsl.functions.booleanFunctions.filters;

import ccsl.functions.booleanFunctions.BooleanFunctionsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ccsl.functions.booleanFunctions.filters.FiltersFactory
 * @model kind="package"
 * @generated
 */
public interface FiltersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "filters";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/filters";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "filters";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FiltersPackage eINSTANCE = ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.FilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 0;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__NEGATED = BooleanFunctionsPackage.CCSL_BOOLEAN_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = BooleanFunctionsPackage.CCSL_BOOLEAN_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.AtomicFilterImpl <em>Atomic Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.AtomicFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getAtomicFilter()
	 * @generated
	 */
	int ATOMIC_FILTER = 1;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FILTER__NEGATED = FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FILTER__TARGETS = FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.CompositeFilterImpl <em>Composite Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.CompositeFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getCompositeFilter()
	 * @generated
	 */
	int COMPOSITE_FILTER = 2;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FILTER__NEGATED = FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FILTER__FILTERS = FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FILTER__OPERATOR = FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.PropertyFilterImpl <em>Property Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.PropertyFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getPropertyFilter()
	 * @generated
	 */
	int PROPERTY_FILTER = 3;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILTER__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILTER__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The number of structural features of the '<em>Property Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.TemplateFilterImpl <em>Template Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.TemplateFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getTemplateFilter()
	 * @generated
	 */
	int TEMPLATE_FILTER = 4;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FILTER__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FILTER__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Target Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FILTER__TARGET_TEMPLATE = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FILTER__CONTEXT = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Template Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.SameNameFilterImpl <em>Same Name Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.SameNameFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getSameNameFilter()
	 * @generated
	 */
	int SAME_NAME_FILTER = 5;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_NAME_FILTER__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_NAME_FILTER__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_NAME_FILTER__ELEMENTS = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignore Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_NAME_FILTER__IGNORE_CASE = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Same Name Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_NAME_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.CountFilterImpl <em>Count Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.CountFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getCountFilter()
	 * @generated
	 */
	int COUNT_FILTER = 6;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER__MIN = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER__MAX = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER__CONTEXT = ATOMIC_FILTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER__CONTAINER = ATOMIC_FILTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER__FIELD = ATOMIC_FILTER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Count Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.RegexMatchImpl <em>Regex Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.RegexMatchImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getRegexMatch()
	 * @generated
	 */
	int REGEX_MATCH = 7;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_MATCH__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_MATCH__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_MATCH__REGEX = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regex Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_MATCH_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.ImplicityOperandFilterImpl <em>Implicity Operand Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.ImplicityOperandFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getImplicityOperandFilter()
	 * @generated
	 */
	int IMPLICITY_OPERAND_FILTER = 8;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICITY_OPERAND_FILTER__NEGATED = TEMPLATE_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICITY_OPERAND_FILTER__TARGETS = TEMPLATE_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Target Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICITY_OPERAND_FILTER__TARGET_TEMPLATE = TEMPLATE_FILTER__TARGET_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICITY_OPERAND_FILTER__CONTEXT = TEMPLATE_FILTER__CONTEXT;

	/**
	 * The feature id for the '<em><b>Implicity Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICITY_OPERAND_FILTER__IMPLICITY_OPERAND = TEMPLATE_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICITY_OPERAND_FILTER__EXPRESSION = TEMPLATE_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implicity Operand Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICITY_OPERAND_FILTER_FEATURE_COUNT = TEMPLATE_FILTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.ImplicityContainerFilterImpl <em>Implicity Container Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.ImplicityContainerFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getImplicityContainerFilter()
	 * @generated
	 */
	int IMPLICITY_CONTAINER_FILTER = 9;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICITY_CONTAINER_FILTER__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICITY_CONTAINER_FILTER__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Implicity Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICITY_CONTAINER_FILTER__IMPLICITY_CONTAINER = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implicity Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICITY_CONTAINER_FILTER__IMPLICITY_FIELD = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICITY_CONTAINER_FILTER__CONTEXT = ATOMIC_FILTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Implicity Container Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICITY_CONTAINER_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.IsKindOfFilterImpl <em>Is Kind Of Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.IsKindOfFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getIsKindOfFilter()
	 * @generated
	 */
	int IS_KIND_OF_FILTER = 10;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_KIND_OF_FILTER__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_KIND_OF_FILTER__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_KIND_OF_FILTER__CONTEXT = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_KIND_OF_FILTER__TYPE = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Is Kind Of Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_KIND_OF_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.SuperMethodClosureFilterImpl <em>Super Method Closure Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.SuperMethodClosureFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getSuperMethodClosureFilter()
	 * @generated
	 */
	int SUPER_METHOD_CLOSURE_FILTER = 11;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_CLOSURE_FILTER__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_CLOSURE_FILTER__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_CLOSURE_FILTER__CONTEXT = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_CLOSURE_FILTER__SUPER_METHOD = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Super Method Closure Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_CLOSURE_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.IsTypeOfFilterImpl <em>Is Type Of Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.IsTypeOfFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getIsTypeOfFilter()
	 * @generated
	 */
	int IS_TYPE_OF_FILTER = 12;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TYPE_OF_FILTER__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TYPE_OF_FILTER__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TYPE_OF_FILTER__CONTEXT = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TYPE_OF_FILTER__TYPE = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Is Type Of Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TYPE_OF_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.ChildClosureComplexTypeFilterImpl <em>Child Closure Complex Type Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.ChildClosureComplexTypeFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getChildClosureComplexTypeFilter()
	 * @generated
	 */
	int CHILD_CLOSURE_COMPLEX_TYPE_FILTER = 13;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CLOSURE_COMPLEX_TYPE_FILTER__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CLOSURE_COMPLEX_TYPE_FILTER__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Super Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CLOSURE_COMPLEX_TYPE_FILTER__SUPER_COMPLEX_TYPE = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CHILD_COMPLEX_TYPE = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CONTEXT = ATOMIC_FILTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Child Closure Complex Type Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CLOSURE_COMPLEX_TYPE_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.IsStringFilterImpl <em>Is String Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.IsStringFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getIsStringFilter()
	 * @generated
	 */
	int IS_STRING_FILTER = 14;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_STRING_FILTER__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_STRING_FILTER__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The number of structural features of the '<em>Is String Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_STRING_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.EquationFilterImpl <em>Equation Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.EquationFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getEquationFilter()
	 * @generated
	 */
	int EQUATION_FILTER = 15;

	/**
	 * The feature id for the '<em><b>Left Hand Side</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_FILTER__LEFT_HAND_SIDE = 0;

	/**
	 * The feature id for the '<em><b>Right Hand Side</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_FILTER__RIGHT_HAND_SIDE = 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_FILTER__OPERATOR = 2;

	/**
	 * The number of structural features of the '<em>Equation Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_FILTER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.FromClosureFilterImpl <em>From Closure Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.FromClosureFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getFromClosureFilter()
	 * @generated
	 */
	int FROM_CLOSURE_FILTER = 16;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLOSURE_FILTER__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLOSURE_FILTER__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLOSURE_FILTER__FROM = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLOSURE_FILTER__CONTEXT = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>From Closure Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLOSURE_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.HasSuperClassFilterImpl <em>Has Super Class Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.HasSuperClassFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getHasSuperClassFilter()
	 * @generated
	 */
	int HAS_SUPER_CLASS_FILTER = 17;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SUPER_CLASS_FILTER__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SUPER_CLASS_FILTER__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SUPER_CLASS_FILTER__SUPER_CLASS = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SUPER_CLASS_FILTER__SUB_CLASS = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Includes Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SUPER_CLASS_FILTER__INCLUDES_TARGET = ATOMIC_FILTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SUPER_CLASS_FILTER__CONTEXT = ATOMIC_FILTER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Has Super Class Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SUPER_CLASS_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.BlockLastStatementFilterImpl <em>Block Last Statement Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.BlockLastStatementFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getBlockLastStatementFilter()
	 * @generated
	 */
	int BLOCK_LAST_STATEMENT_FILTER = 18;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_LAST_STATEMENT_FILTER__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_LAST_STATEMENT_FILTER__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Last Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_LAST_STATEMENT_FILTER__LAST_STATEMENT = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_LAST_STATEMENT_FILTER__CONTEXT = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Block Last Statement Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_LAST_STATEMENT_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.HasSameReferenceFilterImpl <em>Has Same Reference Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.HasSameReferenceFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getHasSameReferenceFilter()
	 * @generated
	 */
	int HAS_SAME_REFERENCE_FILTER = 19;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SAME_REFERENCE_FILTER__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SAME_REFERENCE_FILTER__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The number of structural features of the '<em>Has Same Reference Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SAME_REFERENCE_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.IsEmptyBlockFilterImpl <em>Is Empty Block Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.IsEmptyBlockFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getIsEmptyBlockFilter()
	 * @generated
	 */
	int IS_EMPTY_BLOCK_FILTER = 20;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EMPTY_BLOCK_FILTER__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EMPTY_BLOCK_FILTER__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Allow Empty Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EMPTY_BLOCK_FILTER__ALLOW_EMPTY_STATEMENT = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allow Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EMPTY_BLOCK_FILTER__ALLOW_COMMENTS = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Is Empty Block Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EMPTY_BLOCK_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.impl.ImplicitContentsFilterImpl <em>Implicit Contents Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.impl.ImplicitContentsFilterImpl
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getImplicitContentsFilter()
	 * @generated
	 */
	int IMPLICIT_CONTENTS_FILTER = 21;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CONTENTS_FILTER__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CONTENTS_FILTER__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CONTENTS_FILTER__CONTEXT = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implicit Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CONTENTS_FILTER__IMPLICIT_FIELD = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implicit Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CONTENTS_FILTER__IMPLICIT_CONTAINER = ATOMIC_FILTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Implicit Contents Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_CONTENTS_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.filters.EquationOperator <em>Equation Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.filters.EquationOperator
	 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getEquationOperator()
	 * @generated
	 */
	int EQUATION_OPERATOR = 22;

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.functions.booleanFunctions.filters.Filter#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.Filter#isNegated()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Negated();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.AtomicFilter <em>Atomic Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.AtomicFilter
	 * @generated
	 */
	EClass getAtomicFilter();

	/**
	 * Returns the meta object for the reference list '{@link ccsl.functions.booleanFunctions.filters.AtomicFilter#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.AtomicFilter#getTargets()
	 * @see #getAtomicFilter()
	 * @generated
	 */
	EReference getAtomicFilter_Targets();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.CompositeFilter <em>Composite Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.CompositeFilter
	 * @generated
	 */
	EClass getCompositeFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.functions.booleanFunctions.filters.CompositeFilter#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.CompositeFilter#getFilters()
	 * @see #getCompositeFilter()
	 * @generated
	 */
	EReference getCompositeFilter_Filters();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.functions.booleanFunctions.filters.CompositeFilter#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.CompositeFilter#getOperator()
	 * @see #getCompositeFilter()
	 * @generated
	 */
	EAttribute getCompositeFilter_Operator();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.PropertyFilter <em>Property Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.PropertyFilter
	 * @generated
	 */
	EClass getPropertyFilter();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.TemplateFilter <em>Template Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.TemplateFilter
	 * @generated
	 */
	EClass getTemplateFilter();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.booleanFunctions.filters.TemplateFilter#getTargetTemplate <em>Target Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Template</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.TemplateFilter#getTargetTemplate()
	 * @see #getTemplateFilter()
	 * @generated
	 */
	EReference getTemplateFilter_TargetTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.functions.booleanFunctions.filters.TemplateFilter#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.TemplateFilter#getContext()
	 * @see #getTemplateFilter()
	 * @generated
	 */
	EReference getTemplateFilter_Context();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.SameNameFilter <em>Same Name Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Same Name Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.SameNameFilter
	 * @generated
	 */
	EClass getSameNameFilter();

	/**
	 * Returns the meta object for the reference list '{@link ccsl.functions.booleanFunctions.filters.SameNameFilter#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.SameNameFilter#getElements()
	 * @see #getSameNameFilter()
	 * @generated
	 */
	EReference getSameNameFilter_Elements();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.functions.booleanFunctions.filters.SameNameFilter#isIgnoreCase <em>Ignore Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Case</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.SameNameFilter#isIgnoreCase()
	 * @see #getSameNameFilter()
	 * @generated
	 */
	EAttribute getSameNameFilter_IgnoreCase();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.CountFilter <em>Count Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.CountFilter
	 * @generated
	 */
	EClass getCountFilter();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.functions.booleanFunctions.filters.CountFilter#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.CountFilter#getMin()
	 * @see #getCountFilter()
	 * @generated
	 */
	EAttribute getCountFilter_Min();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.functions.booleanFunctions.filters.CountFilter#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.CountFilter#getMax()
	 * @see #getCountFilter()
	 * @generated
	 */
	EAttribute getCountFilter_Max();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.functions.booleanFunctions.filters.CountFilter#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.CountFilter#getContext()
	 * @see #getCountFilter()
	 * @generated
	 */
	EReference getCountFilter_Context();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.booleanFunctions.filters.CountFilter#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.CountFilter#getContainer()
	 * @see #getCountFilter()
	 * @generated
	 */
	EReference getCountFilter_Container();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.booleanFunctions.filters.CountFilter#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.CountFilter#getField()
	 * @see #getCountFilter()
	 * @generated
	 */
	EReference getCountFilter_Field();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.RegexMatch <em>Regex Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regex Match</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.RegexMatch
	 * @generated
	 */
	EClass getRegexMatch();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.functions.booleanFunctions.filters.RegexMatch#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.RegexMatch#getRegex()
	 * @see #getRegexMatch()
	 * @generated
	 */
	EAttribute getRegexMatch_Regex();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.ImplicityOperandFilter <em>Implicity Operand Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicity Operand Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.ImplicityOperandFilter
	 * @generated
	 */
	EClass getImplicityOperandFilter();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.booleanFunctions.filters.ImplicityOperandFilter#getImplicityOperand <em>Implicity Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implicity Operand</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.ImplicityOperandFilter#getImplicityOperand()
	 * @see #getImplicityOperandFilter()
	 * @generated
	 */
	EReference getImplicityOperandFilter_ImplicityOperand();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.booleanFunctions.filters.ImplicityOperandFilter#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.ImplicityOperandFilter#getExpression()
	 * @see #getImplicityOperandFilter()
	 * @generated
	 */
	EReference getImplicityOperandFilter_Expression();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.ImplicityContainerFilter <em>Implicity Container Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicity Container Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.ImplicityContainerFilter
	 * @generated
	 */
	EClass getImplicityContainerFilter();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.booleanFunctions.filters.ImplicityContainerFilter#getImplicityContainer <em>Implicity Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implicity Container</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.ImplicityContainerFilter#getImplicityContainer()
	 * @see #getImplicityContainerFilter()
	 * @generated
	 */
	EReference getImplicityContainerFilter_ImplicityContainer();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.booleanFunctions.filters.ImplicityContainerFilter#getImplicityField <em>Implicity Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implicity Field</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.ImplicityContainerFilter#getImplicityField()
	 * @see #getImplicityContainerFilter()
	 * @generated
	 */
	EReference getImplicityContainerFilter_ImplicityField();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.functions.booleanFunctions.filters.ImplicityContainerFilter#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.ImplicityContainerFilter#getContext()
	 * @see #getImplicityContainerFilter()
	 * @generated
	 */
	EReference getImplicityContainerFilter_Context();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.IsKindOfFilter <em>Is Kind Of Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Kind Of Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.IsKindOfFilter
	 * @generated
	 */
	EClass getIsKindOfFilter();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.functions.booleanFunctions.filters.IsKindOfFilter#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.IsKindOfFilter#getContext()
	 * @see #getIsKindOfFilter()
	 * @generated
	 */
	EReference getIsKindOfFilter_Context();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.booleanFunctions.filters.IsKindOfFilter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.IsKindOfFilter#getType()
	 * @see #getIsKindOfFilter()
	 * @generated
	 */
	EReference getIsKindOfFilter_Type();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.SuperMethodClosureFilter <em>Super Method Closure Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Method Closure Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.SuperMethodClosureFilter
	 * @generated
	 */
	EClass getSuperMethodClosureFilter();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.functions.booleanFunctions.filters.SuperMethodClosureFilter#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.SuperMethodClosureFilter#getContext()
	 * @see #getSuperMethodClosureFilter()
	 * @generated
	 */
	EReference getSuperMethodClosureFilter_Context();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.booleanFunctions.filters.SuperMethodClosureFilter#getSuperMethod <em>Super Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Method</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.SuperMethodClosureFilter#getSuperMethod()
	 * @see #getSuperMethodClosureFilter()
	 * @generated
	 */
	EReference getSuperMethodClosureFilter_SuperMethod();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.IsTypeOfFilter <em>Is Type Of Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Type Of Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.IsTypeOfFilter
	 * @generated
	 */
	EClass getIsTypeOfFilter();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.functions.booleanFunctions.filters.IsTypeOfFilter#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.IsTypeOfFilter#getContext()
	 * @see #getIsTypeOfFilter()
	 * @generated
	 */
	EReference getIsTypeOfFilter_Context();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.booleanFunctions.filters.IsTypeOfFilter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.IsTypeOfFilter#getType()
	 * @see #getIsTypeOfFilter()
	 * @generated
	 */
	EReference getIsTypeOfFilter_Type();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.ChildClosureComplexTypeFilter <em>Child Closure Complex Type Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Closure Complex Type Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.ChildClosureComplexTypeFilter
	 * @generated
	 */
	EClass getChildClosureComplexTypeFilter();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.booleanFunctions.filters.ChildClosureComplexTypeFilter#getSuperComplexType <em>Super Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Complex Type</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.ChildClosureComplexTypeFilter#getSuperComplexType()
	 * @see #getChildClosureComplexTypeFilter()
	 * @generated
	 */
	EReference getChildClosureComplexTypeFilter_SuperComplexType();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.booleanFunctions.filters.ChildClosureComplexTypeFilter#getChildComplexType <em>Child Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child Complex Type</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.ChildClosureComplexTypeFilter#getChildComplexType()
	 * @see #getChildClosureComplexTypeFilter()
	 * @generated
	 */
	EReference getChildClosureComplexTypeFilter_ChildComplexType();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.functions.booleanFunctions.filters.ChildClosureComplexTypeFilter#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.ChildClosureComplexTypeFilter#getContext()
	 * @see #getChildClosureComplexTypeFilter()
	 * @generated
	 */
	EReference getChildClosureComplexTypeFilter_Context();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.IsStringFilter <em>Is String Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is String Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.IsStringFilter
	 * @generated
	 */
	EClass getIsStringFilter();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.EquationFilter <em>Equation Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equation Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.EquationFilter
	 * @generated
	 */
	EClass getEquationFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.functions.booleanFunctions.filters.EquationFilter#getLeftHandSide <em>Left Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left Hand Side</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.EquationFilter#getLeftHandSide()
	 * @see #getEquationFilter()
	 * @generated
	 */
	EReference getEquationFilter_LeftHandSide();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.functions.booleanFunctions.filters.EquationFilter#getRightHandSide <em>Right Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right Hand Side</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.EquationFilter#getRightHandSide()
	 * @see #getEquationFilter()
	 * @generated
	 */
	EReference getEquationFilter_RightHandSide();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.functions.booleanFunctions.filters.EquationFilter#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.EquationFilter#getOperator()
	 * @see #getEquationFilter()
	 * @generated
	 */
	EAttribute getEquationFilter_Operator();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.FromClosureFilter <em>From Closure Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Closure Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.FromClosureFilter
	 * @generated
	 */
	EClass getFromClosureFilter();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.booleanFunctions.filters.FromClosureFilter#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.FromClosureFilter#getFrom()
	 * @see #getFromClosureFilter()
	 * @generated
	 */
	EReference getFromClosureFilter_From();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.functions.booleanFunctions.filters.FromClosureFilter#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.FromClosureFilter#getContext()
	 * @see #getFromClosureFilter()
	 * @generated
	 */
	EReference getFromClosureFilter_Context();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.HasSuperClassFilter <em>Has Super Class Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Super Class Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.HasSuperClassFilter
	 * @generated
	 */
	EClass getHasSuperClassFilter();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.booleanFunctions.filters.HasSuperClassFilter#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Class</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.HasSuperClassFilter#getSuperClass()
	 * @see #getHasSuperClassFilter()
	 * @generated
	 */
	EReference getHasSuperClassFilter_SuperClass();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.booleanFunctions.filters.HasSuperClassFilter#getSubClass <em>Sub Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Class</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.HasSuperClassFilter#getSubClass()
	 * @see #getHasSuperClassFilter()
	 * @generated
	 */
	EReference getHasSuperClassFilter_SubClass();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.functions.booleanFunctions.filters.HasSuperClassFilter#isIncludesTarget <em>Includes Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Includes Target</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.HasSuperClassFilter#isIncludesTarget()
	 * @see #getHasSuperClassFilter()
	 * @generated
	 */
	EAttribute getHasSuperClassFilter_IncludesTarget();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.functions.booleanFunctions.filters.HasSuperClassFilter#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.HasSuperClassFilter#getContext()
	 * @see #getHasSuperClassFilter()
	 * @generated
	 */
	EReference getHasSuperClassFilter_Context();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.BlockLastStatementFilter <em>Block Last Statement Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Last Statement Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.BlockLastStatementFilter
	 * @generated
	 */
	EClass getBlockLastStatementFilter();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.booleanFunctions.filters.BlockLastStatementFilter#getLastStatement <em>Last Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Statement</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.BlockLastStatementFilter#getLastStatement()
	 * @see #getBlockLastStatementFilter()
	 * @generated
	 */
	EReference getBlockLastStatementFilter_LastStatement();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.functions.booleanFunctions.filters.BlockLastStatementFilter#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.BlockLastStatementFilter#getContext()
	 * @see #getBlockLastStatementFilter()
	 * @generated
	 */
	EReference getBlockLastStatementFilter_Context();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.HasSameReferenceFilter <em>Has Same Reference Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Same Reference Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.HasSameReferenceFilter
	 * @generated
	 */
	EClass getHasSameReferenceFilter();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.IsEmptyBlockFilter <em>Is Empty Block Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Empty Block Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.IsEmptyBlockFilter
	 * @generated
	 */
	EClass getIsEmptyBlockFilter();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.functions.booleanFunctions.filters.IsEmptyBlockFilter#isAllowEmptyStatement <em>Allow Empty Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Empty Statement</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.IsEmptyBlockFilter#isAllowEmptyStatement()
	 * @see #getIsEmptyBlockFilter()
	 * @generated
	 */
	EAttribute getIsEmptyBlockFilter_AllowEmptyStatement();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.functions.booleanFunctions.filters.IsEmptyBlockFilter#isAllowComments <em>Allow Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Comments</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.IsEmptyBlockFilter#isAllowComments()
	 * @see #getIsEmptyBlockFilter()
	 * @generated
	 */
	EAttribute getIsEmptyBlockFilter_AllowComments();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.filters.ImplicitContentsFilter <em>Implicit Contents Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicit Contents Filter</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.ImplicitContentsFilter
	 * @generated
	 */
	EClass getImplicitContentsFilter();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.functions.booleanFunctions.filters.ImplicitContentsFilter#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.ImplicitContentsFilter#getContext()
	 * @see #getImplicitContentsFilter()
	 * @generated
	 */
	EReference getImplicitContentsFilter_Context();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.booleanFunctions.filters.ImplicitContentsFilter#getImplicitField <em>Implicit Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implicit Field</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.ImplicitContentsFilter#getImplicitField()
	 * @see #getImplicitContentsFilter()
	 * @generated
	 */
	EReference getImplicitContentsFilter_ImplicitField();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.booleanFunctions.filters.ImplicitContentsFilter#getImplicitContainer <em>Implicit Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implicit Container</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.ImplicitContentsFilter#getImplicitContainer()
	 * @see #getImplicitContentsFilter()
	 * @generated
	 */
	EReference getImplicitContentsFilter_ImplicitContainer();

	/**
	 * Returns the meta object for enum '{@link ccsl.functions.booleanFunctions.filters.EquationOperator <em>Equation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Equation Operator</em>'.
	 * @see ccsl.functions.booleanFunctions.filters.EquationOperator
	 * @generated
	 */
	EEnum getEquationOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FiltersFactory getFiltersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.FilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Negated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__NEGATED = eINSTANCE.getFilter_Negated();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.AtomicFilterImpl <em>Atomic Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.AtomicFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getAtomicFilter()
		 * @generated
		 */
		EClass ATOMIC_FILTER = eINSTANCE.getAtomicFilter();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_FILTER__TARGETS = eINSTANCE.getAtomicFilter_Targets();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.CompositeFilterImpl <em>Composite Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.CompositeFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getCompositeFilter()
		 * @generated
		 */
		EClass COMPOSITE_FILTER = eINSTANCE.getCompositeFilter();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_FILTER__FILTERS = eINSTANCE.getCompositeFilter_Filters();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_FILTER__OPERATOR = eINSTANCE.getCompositeFilter_Operator();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.PropertyFilterImpl <em>Property Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.PropertyFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getPropertyFilter()
		 * @generated
		 */
		EClass PROPERTY_FILTER = eINSTANCE.getPropertyFilter();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.TemplateFilterImpl <em>Template Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.TemplateFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getTemplateFilter()
		 * @generated
		 */
		EClass TEMPLATE_FILTER = eINSTANCE.getTemplateFilter();

		/**
		 * The meta object literal for the '<em><b>Target Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_FILTER__TARGET_TEMPLATE = eINSTANCE.getTemplateFilter_TargetTemplate();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_FILTER__CONTEXT = eINSTANCE.getTemplateFilter_Context();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.SameNameFilterImpl <em>Same Name Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.SameNameFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getSameNameFilter()
		 * @generated
		 */
		EClass SAME_NAME_FILTER = eINSTANCE.getSameNameFilter();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAME_NAME_FILTER__ELEMENTS = eINSTANCE.getSameNameFilter_Elements();

		/**
		 * The meta object literal for the '<em><b>Ignore Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAME_NAME_FILTER__IGNORE_CASE = eINSTANCE.getSameNameFilter_IgnoreCase();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.CountFilterImpl <em>Count Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.CountFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getCountFilter()
		 * @generated
		 */
		EClass COUNT_FILTER = eINSTANCE.getCountFilter();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNT_FILTER__MIN = eINSTANCE.getCountFilter_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNT_FILTER__MAX = eINSTANCE.getCountFilter_Max();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_FILTER__CONTEXT = eINSTANCE.getCountFilter_Context();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_FILTER__CONTAINER = eINSTANCE.getCountFilter_Container();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_FILTER__FIELD = eINSTANCE.getCountFilter_Field();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.RegexMatchImpl <em>Regex Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.RegexMatchImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getRegexMatch()
		 * @generated
		 */
		EClass REGEX_MATCH = eINSTANCE.getRegexMatch();

		/**
		 * The meta object literal for the '<em><b>Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGEX_MATCH__REGEX = eINSTANCE.getRegexMatch_Regex();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.ImplicityOperandFilterImpl <em>Implicity Operand Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.ImplicityOperandFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getImplicityOperandFilter()
		 * @generated
		 */
		EClass IMPLICITY_OPERAND_FILTER = eINSTANCE.getImplicityOperandFilter();

		/**
		 * The meta object literal for the '<em><b>Implicity Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICITY_OPERAND_FILTER__IMPLICITY_OPERAND = eINSTANCE.getImplicityOperandFilter_ImplicityOperand();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICITY_OPERAND_FILTER__EXPRESSION = eINSTANCE.getImplicityOperandFilter_Expression();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.ImplicityContainerFilterImpl <em>Implicity Container Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.ImplicityContainerFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getImplicityContainerFilter()
		 * @generated
		 */
		EClass IMPLICITY_CONTAINER_FILTER = eINSTANCE.getImplicityContainerFilter();

		/**
		 * The meta object literal for the '<em><b>Implicity Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICITY_CONTAINER_FILTER__IMPLICITY_CONTAINER = eINSTANCE
				.getImplicityContainerFilter_ImplicityContainer();

		/**
		 * The meta object literal for the '<em><b>Implicity Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICITY_CONTAINER_FILTER__IMPLICITY_FIELD = eINSTANCE.getImplicityContainerFilter_ImplicityField();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICITY_CONTAINER_FILTER__CONTEXT = eINSTANCE.getImplicityContainerFilter_Context();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.IsKindOfFilterImpl <em>Is Kind Of Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.IsKindOfFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getIsKindOfFilter()
		 * @generated
		 */
		EClass IS_KIND_OF_FILTER = eINSTANCE.getIsKindOfFilter();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_KIND_OF_FILTER__CONTEXT = eINSTANCE.getIsKindOfFilter_Context();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_KIND_OF_FILTER__TYPE = eINSTANCE.getIsKindOfFilter_Type();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.SuperMethodClosureFilterImpl <em>Super Method Closure Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.SuperMethodClosureFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getSuperMethodClosureFilter()
		 * @generated
		 */
		EClass SUPER_METHOD_CLOSURE_FILTER = eINSTANCE.getSuperMethodClosureFilter();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_METHOD_CLOSURE_FILTER__CONTEXT = eINSTANCE.getSuperMethodClosureFilter_Context();

		/**
		 * The meta object literal for the '<em><b>Super Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_METHOD_CLOSURE_FILTER__SUPER_METHOD = eINSTANCE.getSuperMethodClosureFilter_SuperMethod();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.IsTypeOfFilterImpl <em>Is Type Of Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.IsTypeOfFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getIsTypeOfFilter()
		 * @generated
		 */
		EClass IS_TYPE_OF_FILTER = eINSTANCE.getIsTypeOfFilter();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_TYPE_OF_FILTER__CONTEXT = eINSTANCE.getIsTypeOfFilter_Context();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_TYPE_OF_FILTER__TYPE = eINSTANCE.getIsTypeOfFilter_Type();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.ChildClosureComplexTypeFilterImpl <em>Child Closure Complex Type Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.ChildClosureComplexTypeFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getChildClosureComplexTypeFilter()
		 * @generated
		 */
		EClass CHILD_CLOSURE_COMPLEX_TYPE_FILTER = eINSTANCE.getChildClosureComplexTypeFilter();

		/**
		 * The meta object literal for the '<em><b>Super Complex Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_CLOSURE_COMPLEX_TYPE_FILTER__SUPER_COMPLEX_TYPE = eINSTANCE
				.getChildClosureComplexTypeFilter_SuperComplexType();

		/**
		 * The meta object literal for the '<em><b>Child Complex Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CHILD_COMPLEX_TYPE = eINSTANCE
				.getChildClosureComplexTypeFilter_ChildComplexType();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CONTEXT = eINSTANCE.getChildClosureComplexTypeFilter_Context();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.IsStringFilterImpl <em>Is String Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.IsStringFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getIsStringFilter()
		 * @generated
		 */
		EClass IS_STRING_FILTER = eINSTANCE.getIsStringFilter();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.EquationFilterImpl <em>Equation Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.EquationFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getEquationFilter()
		 * @generated
		 */
		EClass EQUATION_FILTER = eINSTANCE.getEquationFilter();

		/**
		 * The meta object literal for the '<em><b>Left Hand Side</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION_FILTER__LEFT_HAND_SIDE = eINSTANCE.getEquationFilter_LeftHandSide();

		/**
		 * The meta object literal for the '<em><b>Right Hand Side</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION_FILTER__RIGHT_HAND_SIDE = eINSTANCE.getEquationFilter_RightHandSide();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUATION_FILTER__OPERATOR = eINSTANCE.getEquationFilter_Operator();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.FromClosureFilterImpl <em>From Closure Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.FromClosureFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getFromClosureFilter()
		 * @generated
		 */
		EClass FROM_CLOSURE_FILTER = eINSTANCE.getFromClosureFilter();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_CLOSURE_FILTER__FROM = eINSTANCE.getFromClosureFilter_From();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_CLOSURE_FILTER__CONTEXT = eINSTANCE.getFromClosureFilter_Context();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.HasSuperClassFilterImpl <em>Has Super Class Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.HasSuperClassFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getHasSuperClassFilter()
		 * @generated
		 */
		EClass HAS_SUPER_CLASS_FILTER = eINSTANCE.getHasSuperClassFilter();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_SUPER_CLASS_FILTER__SUPER_CLASS = eINSTANCE.getHasSuperClassFilter_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Sub Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_SUPER_CLASS_FILTER__SUB_CLASS = eINSTANCE.getHasSuperClassFilter_SubClass();

		/**
		 * The meta object literal for the '<em><b>Includes Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_SUPER_CLASS_FILTER__INCLUDES_TARGET = eINSTANCE.getHasSuperClassFilter_IncludesTarget();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_SUPER_CLASS_FILTER__CONTEXT = eINSTANCE.getHasSuperClassFilter_Context();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.BlockLastStatementFilterImpl <em>Block Last Statement Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.BlockLastStatementFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getBlockLastStatementFilter()
		 * @generated
		 */
		EClass BLOCK_LAST_STATEMENT_FILTER = eINSTANCE.getBlockLastStatementFilter();

		/**
		 * The meta object literal for the '<em><b>Last Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_LAST_STATEMENT_FILTER__LAST_STATEMENT = eINSTANCE.getBlockLastStatementFilter_LastStatement();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_LAST_STATEMENT_FILTER__CONTEXT = eINSTANCE.getBlockLastStatementFilter_Context();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.HasSameReferenceFilterImpl <em>Has Same Reference Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.HasSameReferenceFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getHasSameReferenceFilter()
		 * @generated
		 */
		EClass HAS_SAME_REFERENCE_FILTER = eINSTANCE.getHasSameReferenceFilter();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.IsEmptyBlockFilterImpl <em>Is Empty Block Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.IsEmptyBlockFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getIsEmptyBlockFilter()
		 * @generated
		 */
		EClass IS_EMPTY_BLOCK_FILTER = eINSTANCE.getIsEmptyBlockFilter();

		/**
		 * The meta object literal for the '<em><b>Allow Empty Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_EMPTY_BLOCK_FILTER__ALLOW_EMPTY_STATEMENT = eINSTANCE.getIsEmptyBlockFilter_AllowEmptyStatement();

		/**
		 * The meta object literal for the '<em><b>Allow Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_EMPTY_BLOCK_FILTER__ALLOW_COMMENTS = eINSTANCE.getIsEmptyBlockFilter_AllowComments();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.impl.ImplicitContentsFilterImpl <em>Implicit Contents Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.impl.ImplicitContentsFilterImpl
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getImplicitContentsFilter()
		 * @generated
		 */
		EClass IMPLICIT_CONTENTS_FILTER = eINSTANCE.getImplicitContentsFilter();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICIT_CONTENTS_FILTER__CONTEXT = eINSTANCE.getImplicitContentsFilter_Context();

		/**
		 * The meta object literal for the '<em><b>Implicit Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICIT_CONTENTS_FILTER__IMPLICIT_FIELD = eINSTANCE.getImplicitContentsFilter_ImplicitField();

		/**
		 * The meta object literal for the '<em><b>Implicit Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICIT_CONTENTS_FILTER__IMPLICIT_CONTAINER = eINSTANCE
				.getImplicitContentsFilter_ImplicitContainer();

		/**
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.filters.EquationOperator <em>Equation Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.filters.EquationOperator
		 * @see ccsl.functions.booleanFunctions.filters.impl.FiltersPackageImpl#getEquationOperator()
		 * @generated
		 */
		EEnum EQUATION_OPERATOR = eINSTANCE.getEquationOperator();

	}

} //FiltersPackage
