/**
 */
package ccsl.elements.statements.controlFlow;

import ccsl.elements.statements.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.controlFlow.IfStatement#getThenStatement <em>Then Statement</em>}</li>
 *   <li>{@link ccsl.elements.statements.controlFlow.IfStatement#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends ConditionalControlFlowStatement {
	/**
	 * Returns the value of the '<em><b>Then Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Statement</em>' containment reference.
	 * @see #isSetThenStatement()
	 * @see #unsetThenStatement()
	 * @see #setThenStatement(Statement)
	 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getIfStatement_ThenStatement()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	Statement getThenStatement();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.controlFlow.IfStatement#getThenStatement <em>Then Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Statement</em>' containment reference.
	 * @see #isSetThenStatement()
	 * @see #unsetThenStatement()
	 * @see #getThenStatement()
	 * @generated
	 */
	void setThenStatement(Statement value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.statements.controlFlow.IfStatement#getThenStatement <em>Then Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThenStatement()
	 * @see #getThenStatement()
	 * @see #setThenStatement(Statement)
	 * @generated
	 */
	void unsetThenStatement();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.statements.controlFlow.IfStatement#getThenStatement <em>Then Statement</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Then Statement</em>' containment reference is set.
	 * @see #unsetThenStatement()
	 * @see #getThenStatement()
	 * @see #setThenStatement(Statement)
	 * @generated
	 */
	boolean isSetThenStatement();

	/**
	 * Returns the value of the '<em><b>Else Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Statement</em>' containment reference.
	 * @see #isSetElseStatement()
	 * @see #unsetElseStatement()
	 * @see #setElseStatement(Statement)
	 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getIfStatement_ElseStatement()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	Statement getElseStatement();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.controlFlow.IfStatement#getElseStatement <em>Else Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Statement</em>' containment reference.
	 * @see #isSetElseStatement()
	 * @see #unsetElseStatement()
	 * @see #getElseStatement()
	 * @generated
	 */
	void setElseStatement(Statement value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.statements.controlFlow.IfStatement#getElseStatement <em>Else Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElseStatement()
	 * @see #getElseStatement()
	 * @see #setElseStatement(Statement)
	 * @generated
	 */
	void unsetElseStatement();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.statements.controlFlow.IfStatement#getElseStatement <em>Else Statement</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Else Statement</em>' containment reference is set.
	 * @see #unsetElseStatement()
	 * @see #getElseStatement()
	 * @see #setElseStatement(Statement)
	 * @generated
	 */
	boolean isSetElseStatement();

} // IfStatement
