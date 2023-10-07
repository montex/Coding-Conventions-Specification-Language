/**
 */
package ccsl.elements.statements.controlFlow;

import ccsl.elements.namedElements.variable.ParameterVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.controlFlow.ForEachStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link ccsl.elements.statements.controlFlow.ForEachStatement#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getForEachStatement()
 * @model
 * @generated
 */
public interface ForEachStatement extends LoopStatement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(LoopStatement)
	 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getForEachStatement_Expression()
	 * @model containment="true"
	 * @generated
	 */
	LoopStatement getExpression();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.controlFlow.ForEachStatement#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(LoopStatement value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(ParameterVariable)
	 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getForEachStatement_Variable()
	 * @model
	 * @generated
	 */
	ParameterVariable getVariable();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.controlFlow.ForEachStatement#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(ParameterVariable value);

} // ForEachStatement
