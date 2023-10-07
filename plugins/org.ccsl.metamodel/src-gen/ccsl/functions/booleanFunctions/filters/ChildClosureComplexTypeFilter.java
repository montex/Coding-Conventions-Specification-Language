/**
 */
package ccsl.functions.booleanFunctions.filters;

import ccsl.context.Context;

import ccsl.elements.namedElements.complexType.ComplexType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Closure Complex Type Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.ChildClosureComplexTypeFilter#getSuperComplexType <em>Super Complex Type</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.ChildClosureComplexTypeFilter#getChildComplexType <em>Child Complex Type</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.ChildClosureComplexTypeFilter#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getChildClosureComplexTypeFilter()
 * @model
 * @generated
 */
public interface ChildClosureComplexTypeFilter extends AtomicFilter {
	/**
	 * Returns the value of the '<em><b>Super Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Complex Type</em>' reference.
	 * @see #setSuperComplexType(ComplexType)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getChildClosureComplexTypeFilter_SuperComplexType()
	 * @model required="true"
	 * @generated
	 */
	ComplexType getSuperComplexType();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.ChildClosureComplexTypeFilter#getSuperComplexType <em>Super Complex Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Complex Type</em>' reference.
	 * @see #getSuperComplexType()
	 * @generated
	 */
	void setSuperComplexType(ComplexType value);

	/**
	 * Returns the value of the '<em><b>Child Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Complex Type</em>' reference.
	 * @see #setChildComplexType(ComplexType)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getChildClosureComplexTypeFilter_ChildComplexType()
	 * @model required="true"
	 * @generated
	 */
	ComplexType getChildComplexType();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.ChildClosureComplexTypeFilter#getChildComplexType <em>Child Complex Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Complex Type</em>' reference.
	 * @see #getChildComplexType()
	 * @generated
	 */
	void setChildComplexType(ComplexType value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Context)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getChildClosureComplexTypeFilter_Context()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.ChildClosureComplexTypeFilter#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

} // ChildClosureComplexTypeFilter
