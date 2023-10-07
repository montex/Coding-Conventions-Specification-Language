/**
 */
package ccsl.elements.expressions.accesses;

import ccsl.elements.namedElements.variable.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.accesses.VariableAccess#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.expressions.accesses.AccessesPackage#getVariableAccess()
 * @model
 * @generated
 */
public interface VariableAccess extends Access {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see ccsl.elements.expressions.accesses.AccessesPackage#getVariableAccess_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.accesses.VariableAccess#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // VariableAccess
