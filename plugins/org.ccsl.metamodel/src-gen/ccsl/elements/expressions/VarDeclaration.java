/**
 */
package ccsl.elements.expressions;

import ccsl.elements.namedElements.variable.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.VarDeclaration#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.expressions.ExpressionsPackage#getVarDeclaration()
 * @model
 * @generated
 */
public interface VarDeclaration extends Expression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #isSetVariable()
	 * @see #unsetVariable()
	 * @see #setVariable(Variable)
	 * @see ccsl.elements.expressions.ExpressionsPackage#getVarDeclaration_Variable()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.VarDeclaration#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #isSetVariable()
	 * @see #unsetVariable()
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.expressions.VarDeclaration#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVariable()
	 * @see #getVariable()
	 * @see #setVariable(Variable)
	 * @generated
	 */
	void unsetVariable();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.expressions.VarDeclaration#getVariable <em>Variable</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Variable</em>' containment reference is set.
	 * @see #unsetVariable()
	 * @see #getVariable()
	 * @see #setVariable(Variable)
	 * @generated
	 */
	boolean isSetVariable();

} // VarDeclaration
