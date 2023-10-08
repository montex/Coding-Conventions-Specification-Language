/**
 */
package ccsl.elements.statements;

import ccsl.elements.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.AssertStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link ccsl.elements.statements.AssertStatement#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.statements.StatementsPackage#getAssertStatement()
 * @model
 * @generated
 */
public interface AssertStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see ccsl.elements.statements.StatementsPackage#getAssertStatement_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.AssertStatement#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(Expression)
	 * @see ccsl.elements.statements.StatementsPackage#getAssertStatement_Message()
	 * @model containment="true"
	 * @generated
	 */
	Expression getMessage();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.AssertStatement#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Expression value);

} // AssertStatement
