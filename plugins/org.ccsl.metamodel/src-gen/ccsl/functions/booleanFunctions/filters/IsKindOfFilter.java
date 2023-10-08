/**
 */
package ccsl.functions.booleanFunctions.filters;

import ccsl.context.Context;

import ccsl.elements.datatype.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Kind Of Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.IsKindOfFilter#getContext <em>Context</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.IsKindOfFilter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getIsKindOfFilter()
 * @model
 * @generated
 */
public interface IsKindOfFilter extends AtomicFilter {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Context)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getIsKindOfFilter_Context()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.IsKindOfFilter#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getIsKindOfFilter_Type()
	 * @model required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.IsKindOfFilter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // IsKindOfFilter
