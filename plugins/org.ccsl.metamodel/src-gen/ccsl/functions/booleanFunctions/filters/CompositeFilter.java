/**
 */
package ccsl.functions.booleanFunctions.filters;

import ccsl.LogicOperator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.CompositeFilter#getFilters <em>Filters</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.CompositeFilter#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getCompositeFilter()
 * @model
 * @generated
 */
public interface CompositeFilter extends Filter {
	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.functions.booleanFunctions.filters.Filter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getCompositeFilter_Filters()
	 * @model type="ccsl.functions.booleanFunctions.filters.Filter" containment="true" required="true"
	 * @generated
	 */
	EList getFilters();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ccsl.LogicOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see ccsl.LogicOperator
	 * @see #setOperator(LogicOperator)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getCompositeFilter_Operator()
	 * @model
	 * @generated
	 */
	LogicOperator getOperator();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.CompositeFilter#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see ccsl.LogicOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicOperator value);

} // CompositeFilter
