/**
 */
package ccsl.functions.booleanFunctions.filters;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage
 * @generated
 */
public interface FiltersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FiltersFactory eINSTANCE = ccsl.functions.booleanFunctions.filters.impl.FiltersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Atomic Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Filter</em>'.
	 * @generated
	 */
	AtomicFilter createAtomicFilter();

	/**
	 * Returns a new object of class '<em>Composite Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Filter</em>'.
	 * @generated
	 */
	CompositeFilter createCompositeFilter();

	/**
	 * Returns a new object of class '<em>Property Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Filter</em>'.
	 * @generated
	 */
	PropertyFilter createPropertyFilter();

	/**
	 * Returns a new object of class '<em>Template Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Filter</em>'.
	 * @generated
	 */
	TemplateFilter createTemplateFilter();

	/**
	 * Returns a new object of class '<em>Same Name Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Same Name Filter</em>'.
	 * @generated
	 */
	SameNameFilter createSameNameFilter();

	/**
	 * Returns a new object of class '<em>Count Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count Filter</em>'.
	 * @generated
	 */
	CountFilter createCountFilter();

	/**
	 * Returns a new object of class '<em>Regex Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regex Match</em>'.
	 * @generated
	 */
	RegexMatch createRegexMatch();

	/**
	 * Returns a new object of class '<em>Implicity Operand Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implicity Operand Filter</em>'.
	 * @generated
	 */
	ImplicityOperandFilter createImplicityOperandFilter();

	/**
	 * Returns a new object of class '<em>Implicity Container Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implicity Container Filter</em>'.
	 * @generated
	 */
	ImplicityContainerFilter createImplicityContainerFilter();

	/**
	 * Returns a new object of class '<em>Is Kind Of Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Kind Of Filter</em>'.
	 * @generated
	 */
	IsKindOfFilter createIsKindOfFilter();

	/**
	 * Returns a new object of class '<em>Super Method Closure Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super Method Closure Filter</em>'.
	 * @generated
	 */
	SuperMethodClosureFilter createSuperMethodClosureFilter();

	/**
	 * Returns a new object of class '<em>Is Type Of Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Type Of Filter</em>'.
	 * @generated
	 */
	IsTypeOfFilter createIsTypeOfFilter();

	/**
	 * Returns a new object of class '<em>Child Closure Complex Type Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child Closure Complex Type Filter</em>'.
	 * @generated
	 */
	ChildClosureComplexTypeFilter createChildClosureComplexTypeFilter();

	/**
	 * Returns a new object of class '<em>Is String Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is String Filter</em>'.
	 * @generated
	 */
	IsStringFilter createIsStringFilter();

	/**
	 * Returns a new object of class '<em>Equation Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equation Filter</em>'.
	 * @generated
	 */
	EquationFilter createEquationFilter();

	/**
	 * Returns a new object of class '<em>From Closure Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>From Closure Filter</em>'.
	 * @generated
	 */
	FromClosureFilter createFromClosureFilter();

	/**
	 * Returns a new object of class '<em>Has Super Class Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Super Class Filter</em>'.
	 * @generated
	 */
	HasSuperClassFilter createHasSuperClassFilter();

	/**
	 * Returns a new object of class '<em>Block Last Statement Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Last Statement Filter</em>'.
	 * @generated
	 */
	BlockLastStatementFilter createBlockLastStatementFilter();

	/**
	 * Returns a new object of class '<em>Has Same Reference Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Same Reference Filter</em>'.
	 * @generated
	 */
	HasSameReferenceFilter createHasSameReferenceFilter();

	/**
	 * Returns a new object of class '<em>Is Empty Block Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Empty Block Filter</em>'.
	 * @generated
	 */
	IsEmptyBlockFilter createIsEmptyBlockFilter();

	/**
	 * Returns a new object of class '<em>Implicit Contents Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implicit Contents Filter</em>'.
	 * @generated
	 */
	ImplicitContentsFilter createImplicitContentsFilter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FiltersPackage getFiltersPackage();

} //FiltersFactory
