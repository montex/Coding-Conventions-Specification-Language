/**
 */
package ccsl.functions.booleanFunctions.filters;

import ccsl.context.Context;

import ccsl.elements.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implicity Container Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.ImplicityContainerFilter#getImplicityContainer <em>Implicity Container</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.ImplicityContainerFilter#getImplicityField <em>Implicity Field</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.ImplicityContainerFilter#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getImplicityContainerFilter()
 * @model
 * @generated
 */
public interface ImplicityContainerFilter extends AtomicFilter {
	/**
	 * Returns the value of the '<em><b>Implicity Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicity Container</em>' reference.
	 * @see #setImplicityContainer(Element)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getImplicityContainerFilter_ImplicityContainer()
	 * @model required="true"
	 * @generated
	 */
	Element getImplicityContainer();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.ImplicityContainerFilter#getImplicityContainer <em>Implicity Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicity Container</em>' reference.
	 * @see #getImplicityContainer()
	 * @generated
	 */
	void setImplicityContainer(Element value);

	/**
	 * Returns the value of the '<em><b>Implicity Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicity Field</em>' reference.
	 * @see #setImplicityField(Element)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getImplicityContainerFilter_ImplicityField()
	 * @model required="true"
	 * @generated
	 */
	Element getImplicityField();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.ImplicityContainerFilter#getImplicityField <em>Implicity Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicity Field</em>' reference.
	 * @see #getImplicityField()
	 * @generated
	 */
	void setImplicityField(Element value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Context)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getImplicityContainerFilter_Context()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.ImplicityContainerFilter#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

} // ImplicityContainerFilter
