/**
 */
package ccsl.functions.booleanFunctions.filters;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equation Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.EquationFilter#getLeftHandSide <em>Left Hand Side</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.EquationFilter#getRightHandSide <em>Right Hand Side</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.EquationFilter#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getEquationFilter()
 * @model
 * @generated
 */
public interface EquationFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Left Hand Side</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.functions.numberFunctions.CcslNumberFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Hand Side</em>' containment reference list.
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getEquationFilter_LeftHandSide()
	 * @model type="ccsl.functions.numberFunctions.CcslNumberFunction" containment="true" required="true"
	 * @generated
	 */
	EList getLeftHandSide();

	/**
	 * Returns the value of the '<em><b>Right Hand Side</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.functions.numberFunctions.CcslNumberFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Hand Side</em>' containment reference list.
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getEquationFilter_RightHandSide()
	 * @model type="ccsl.functions.numberFunctions.CcslNumberFunction" containment="true" required="true"
	 * @generated
	 */
	EList getRightHandSide();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ccsl.functions.booleanFunctions.filters.EquationOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see ccsl.functions.booleanFunctions.filters.EquationOperator
	 * @see #setOperator(EquationOperator)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getEquationFilter_Operator()
	 * @model
	 * @generated
	 */
	EquationOperator getOperator();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.EquationFilter#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see ccsl.functions.booleanFunctions.filters.EquationOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(EquationOperator value);

} // EquationFilter
