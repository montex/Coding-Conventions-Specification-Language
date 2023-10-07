/**
 */
package ccsl.elements.expressions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.BooleanExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.expressions.ExpressionsPackage#getBooleanExpression()
 * @model
 * @generated
 */
public interface BooleanExpression extends OperandExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ccsl.elements.expressions.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see ccsl.elements.expressions.BooleanOperator
	 * @see #setOperator(BooleanOperator)
	 * @see ccsl.elements.expressions.ExpressionsPackage#getBooleanExpression_Operator()
	 * @model
	 * @generated
	 */
	BooleanOperator getOperator();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.BooleanExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see ccsl.elements.expressions.BooleanOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BooleanOperator value);

} // BooleanExpression
