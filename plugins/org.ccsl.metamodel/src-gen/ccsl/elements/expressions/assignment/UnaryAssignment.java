/**
 */
package ccsl.elements.expressions.assignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.assignment.UnaryAssignment#getKind <em>Kind</em>}</li>
 *   <li>{@link ccsl.elements.expressions.assignment.UnaryAssignment#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.expressions.assignment.AssignmentPackage#getUnaryAssignment()
 * @model
 * @generated
 */
public interface UnaryAssignment extends SimpleAssignment {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.elements.expressions.assignment.UnaryAssignmentKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see ccsl.elements.expressions.assignment.UnaryAssignmentKind
	 * @see #setKind(UnaryAssignmentKind)
	 * @see ccsl.elements.expressions.assignment.AssignmentPackage#getUnaryAssignment_Kind()
	 * @model default="ANY"
	 * @generated
	 */
	UnaryAssignmentKind getKind();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.assignment.UnaryAssignment#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see ccsl.elements.expressions.assignment.UnaryAssignmentKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(UnaryAssignmentKind value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.elements.expressions.assignment.UnaryAssignmentOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see ccsl.elements.expressions.assignment.UnaryAssignmentOperator
	 * @see #setOperator(UnaryAssignmentOperator)
	 * @see ccsl.elements.expressions.assignment.AssignmentPackage#getUnaryAssignment_Operator()
	 * @model default="ANY"
	 * @generated
	 */
	UnaryAssignmentOperator getOperator();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.assignment.UnaryAssignment#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see ccsl.elements.expressions.assignment.UnaryAssignmentOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UnaryAssignmentOperator value);

} // UnaryAssignment
