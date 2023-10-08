/**
 */
package ccsl.context;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.context.Context#getContextElements <em>Context Elements</em>}</li>
 *   <li>{@link ccsl.context.Context#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @see ccsl.context.ContextPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Context Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Elements</em>' containment reference list.
	 * @see ccsl.context.ContextPackage#getContext_ContextElements()
	 * @model type="ccsl.elements.Element" containment="true"
	 * @generated
	 */
	EList getContextElements();

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.functions.booleanFunctions.filters.Filter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see ccsl.context.ContextPackage#getContext_Filters()
	 * @model type="ccsl.functions.booleanFunctions.filters.Filter" containment="true"
	 * @generated
	 */
	EList getFilters();

} // Context
