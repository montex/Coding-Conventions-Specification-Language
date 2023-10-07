/**
 */
package ccsl.elements.statements.controlFlow;

import ccsl.elements.expressions.Expression;

import ccsl.elements.statements.ControlFlowStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Control Flow Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.controlFlow.ConditionalControlFlowStatement#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getConditionalControlFlowStatement()
 * @model
 * @generated
 */
public interface ConditionalControlFlowStatement extends ControlFlowStatement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getConditionalControlFlowStatement_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.controlFlow.ConditionalControlFlowStatement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

} // ConditionalControlFlowStatement
