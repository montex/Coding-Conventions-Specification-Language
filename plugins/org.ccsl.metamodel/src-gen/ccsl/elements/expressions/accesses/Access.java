/**
 */
package ccsl.elements.expressions.accesses;

import ccsl.elements.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.accesses.Access#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.expressions.accesses.AccessesPackage#getAccess()
 * @model
 * @generated
 */
public interface Access extends Expression {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(Expression)
	 * @see ccsl.elements.expressions.accesses.AccessesPackage#getAccess_From()
	 * @model containment="true"
	 * @generated
	 */
	Expression getFrom();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.accesses.Access#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Expression value);

} // Access
