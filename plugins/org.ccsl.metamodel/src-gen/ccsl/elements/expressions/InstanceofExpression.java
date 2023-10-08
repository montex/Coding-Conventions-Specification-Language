/**
 */
package ccsl.elements.expressions;

import ccsl.elements.datatype.ObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instanceof Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.InstanceofExpression#getType <em>Type</em>}</li>
 *   <li>{@link ccsl.elements.expressions.InstanceofExpression#getObjectExpression <em>Object Expression</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.expressions.ExpressionsPackage#getInstanceofExpression()
 * @model
 * @generated
 */
public interface InstanceofExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ObjectType)
	 * @see ccsl.elements.expressions.ExpressionsPackage#getInstanceofExpression_Type()
	 * @model
	 * @generated
	 */
	ObjectType getType();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.InstanceofExpression#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ObjectType value);

	/**
	 * Returns the value of the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Expression</em>' containment reference.
	 * @see #isSetObjectExpression()
	 * @see #unsetObjectExpression()
	 * @see #setObjectExpression(Expression)
	 * @see ccsl.elements.expressions.ExpressionsPackage#getInstanceofExpression_ObjectExpression()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	Expression getObjectExpression();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.InstanceofExpression#getObjectExpression <em>Object Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Expression</em>' containment reference.
	 * @see #isSetObjectExpression()
	 * @see #unsetObjectExpression()
	 * @see #getObjectExpression()
	 * @generated
	 */
	void setObjectExpression(Expression value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.expressions.InstanceofExpression#getObjectExpression <em>Object Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectExpression()
	 * @see #getObjectExpression()
	 * @see #setObjectExpression(Expression)
	 * @generated
	 */
	void unsetObjectExpression();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.expressions.InstanceofExpression#getObjectExpression <em>Object Expression</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object Expression</em>' containment reference is set.
	 * @see #unsetObjectExpression()
	 * @see #getObjectExpression()
	 * @see #setObjectExpression(Expression)
	 * @generated
	 */
	boolean isSetObjectExpression();

} // InstanceofExpression
