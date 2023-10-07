/**
 */
package ccsl.functions.booleanFunctions.filters;

import ccsl.context.Context;

import ccsl.elements.namedElements.method.Method;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Method Closure Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.SuperMethodClosureFilter#getContext <em>Context</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.SuperMethodClosureFilter#getSuperMethod <em>Super Method</em>}</li>
 * </ul>
 *
 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getSuperMethodClosureFilter()
 * @model
 * @generated
 */
public interface SuperMethodClosureFilter extends AtomicFilter {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Context)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getSuperMethodClosureFilter_Context()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.SuperMethodClosureFilter#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Super Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Method</em>' reference.
	 * @see #setSuperMethod(Method)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getSuperMethodClosureFilter_SuperMethod()
	 * @model required="true"
	 * @generated
	 */
	Method getSuperMethod();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.SuperMethodClosureFilter#getSuperMethod <em>Super Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Method</em>' reference.
	 * @see #getSuperMethod()
	 * @generated
	 */
	void setSuperMethod(Method value);

} // SuperMethodClosureFilter
