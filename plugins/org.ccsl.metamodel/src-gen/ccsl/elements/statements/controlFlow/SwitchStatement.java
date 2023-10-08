/**
 */
package ccsl.elements.statements.controlFlow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.controlFlow.SwitchStatement#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getSwitchStatement()
 * @model
 * @generated
 */
public interface SwitchStatement extends ConditionalControlFlowStatement {
	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.statements.controlFlow.SwitchCaseBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getSwitchStatement_Cases()
	 * @model type="ccsl.elements.statements.controlFlow.SwitchCaseBlock" containment="true"
	 * @generated
	 */
	EList getCases();

} // SwitchStatement
