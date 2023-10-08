/**
 */
package ccsl.elements.expressions;

import ccsl.elements.datatype.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.CastExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link ccsl.elements.expressions.CastExpression#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.expressions.ExpressionsPackage#getCastExpression()
 * @model
 * @generated
 */
public interface CastExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #isSetExpression()
	 * @see #unsetExpression()
	 * @see #setExpression(Expression)
	 * @see ccsl.elements.expressions.ExpressionsPackage#getCastExpression_Expression()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.CastExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #isSetExpression()
	 * @see #unsetExpression()
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.expressions.CastExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExpression()
	 * @see #getExpression()
	 * @see #setExpression(Expression)
	 * @generated
	 */
	void unsetExpression();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.expressions.CastExpression#getExpression <em>Expression</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Expression</em>' containment reference is set.
	 * @see #unsetExpression()
	 * @see #getExpression()
	 * @see #setExpression(Expression)
	 * @generated
	 */
	boolean isSetExpression();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see ccsl.elements.expressions.ExpressionsPackage#getCastExpression_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.CastExpression#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // CastExpression
