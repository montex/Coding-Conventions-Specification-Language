/**
 */
package ccsl.functions.booleanFunctions.filters;

import ccsl.context.Context;

import ccsl.elements.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implicit Contents Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.ImplicitContentsFilter#getContext <em>Context</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.ImplicitContentsFilter#getImplicitField <em>Implicit Field</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.ImplicitContentsFilter#getImplicitContainer <em>Implicit Container</em>}</li>
 * </ul>
 *
 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getImplicitContentsFilter()
 * @model
 * @generated
 */
public interface ImplicitContentsFilter extends AtomicFilter {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Context)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getImplicitContentsFilter_Context()
	 * @model containment="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.ImplicitContentsFilter#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Implicit Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Field</em>' reference.
	 * @see #setImplicitField(Element)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getImplicitContentsFilter_ImplicitField()
	 * @model
	 * @generated
	 */
	Element getImplicitField();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.ImplicitContentsFilter#getImplicitField <em>Implicit Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Field</em>' reference.
	 * @see #getImplicitField()
	 * @generated
	 */
	void setImplicitField(Element value);

	/**
	 * Returns the value of the '<em><b>Implicit Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Container</em>' reference.
	 * @see #setImplicitContainer(Element)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getImplicitContentsFilter_ImplicitContainer()
	 * @model
	 * @generated
	 */
	Element getImplicitContainer();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.ImplicitContentsFilter#getImplicitContainer <em>Implicit Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Container</em>' reference.
	 * @see #getImplicitContainer()
	 * @generated
	 */
	void setImplicitContainer(Element value);

} // ImplicitContentsFilter
