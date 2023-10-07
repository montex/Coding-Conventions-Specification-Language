/**
 */
package ccsl.elements.statements.controlFlow;

import ccsl.elements.expressions.Expression;

import ccsl.elements.statements.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Case Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.controlFlow.SwitchCaseBlock#isDefault <em>Default</em>}</li>
 *   <li>{@link ccsl.elements.statements.controlFlow.SwitchCaseBlock#getCaseExpression <em>Case Expression</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getSwitchCaseBlock()
 * @model
 * @generated
 */
public interface SwitchCaseBlock extends Block {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(boolean)
	 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getSwitchCaseBlock_Default()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isDefault();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.controlFlow.SwitchCaseBlock#isDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #isDefault()
	 * @generated
	 */
	void setDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Case Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Expression</em>' containment reference.
	 * @see #setCaseExpression(Expression)
	 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getSwitchCaseBlock_CaseExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCaseExpression();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.controlFlow.SwitchCaseBlock#getCaseExpression <em>Case Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Expression</em>' containment reference.
	 * @see #getCaseExpression()
	 * @generated
	 */
	void setCaseExpression(Expression value);

} // SwitchCaseBlock
