/**
 */
package ccsl.functions.booleanFunctions.filters;

import ccsl.context.Context;

import ccsl.elements.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.TemplateFilter#getTargetTemplate <em>Target Template</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.TemplateFilter#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getTemplateFilter()
 * @model
 * @generated
 */
public interface TemplateFilter extends AtomicFilter {
	/**
	 * Returns the value of the '<em><b>Target Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Template</em>' reference.
	 * @see #setTargetTemplate(Element)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getTemplateFilter_TargetTemplate()
	 * @model required="true"
	 * @generated
	 */
	Element getTargetTemplate();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.TemplateFilter#getTargetTemplate <em>Target Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Template</em>' reference.
	 * @see #getTargetTemplate()
	 * @generated
	 */
	void setTargetTemplate(Element value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Context)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getTemplateFilter_Context()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.TemplateFilter#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

} // TemplateFilter
