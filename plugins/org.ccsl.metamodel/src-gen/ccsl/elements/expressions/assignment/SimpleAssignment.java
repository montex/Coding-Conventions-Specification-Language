/**
 */
package ccsl.elements.expressions.assignment;

import ccsl.elements.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.assignment.SimpleAssignment#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.expressions.assignment.AssignmentPackage#getSimpleAssignment()
 * @model
 * @generated
 */
public interface SimpleAssignment extends Expression {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(Expression)
	 * @see ccsl.elements.expressions.assignment.AssignmentPackage#getSimpleAssignment_Operand()
	 * @model containment="true"
	 * @generated
	 */
	Expression getOperand();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.assignment.SimpleAssignment#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(Expression value);

} // SimpleAssignment
