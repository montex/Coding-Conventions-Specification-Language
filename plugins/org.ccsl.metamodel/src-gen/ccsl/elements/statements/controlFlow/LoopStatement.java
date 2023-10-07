/**
 */
package ccsl.elements.statements.controlFlow;

import ccsl.elements.statements.ControlFlowStatement;
import ccsl.elements.statements.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.controlFlow.LoopStatement#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getLoopStatement()
 * @model
 * @generated
 */
public interface LoopStatement extends ControlFlowStatement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #isSetBody()
	 * @see #unsetBody()
	 * @see #setBody(Statement)
	 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getLoopStatement_Body()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	Statement getBody();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.controlFlow.LoopStatement#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #isSetBody()
	 * @see #unsetBody()
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Statement value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.statements.controlFlow.LoopStatement#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBody()
	 * @see #getBody()
	 * @see #setBody(Statement)
	 * @generated
	 */
	void unsetBody();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.statements.controlFlow.LoopStatement#getBody <em>Body</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Body</em>' containment reference is set.
	 * @see #unsetBody()
	 * @see #getBody()
	 * @see #setBody(Statement)
	 * @generated
	 */
	boolean isSetBody();

} // LoopStatement
