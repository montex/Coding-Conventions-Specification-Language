/**
 */
package ccsl.elements.expressions.assignment;

import ccsl.elements.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.assignment.Assignment#getOperator <em>Operator</em>}</li>
 *   <li>{@link ccsl.elements.expressions.assignment.Assignment#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.expressions.assignment.AssignmentPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends SimpleAssignment {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.elements.expressions.assignment.AssignmentOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see ccsl.elements.expressions.assignment.AssignmentOperator
	 * @see #setOperator(AssignmentOperator)
	 * @see ccsl.elements.expressions.assignment.AssignmentPackage#getAssignment_Operator()
	 * @model default="ANY"
	 * @generated
	 */
	AssignmentOperator getOperator();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.assignment.Assignment#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see ccsl.elements.expressions.assignment.AssignmentOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(AssignmentOperator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see ccsl.elements.expressions.assignment.AssignmentPackage#getAssignment_Value()
	 * @model containment="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.assignment.Assignment#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // Assignment
