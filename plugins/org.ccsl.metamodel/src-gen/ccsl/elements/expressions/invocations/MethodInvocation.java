/**
 */
package ccsl.elements.expressions.invocations;

import ccsl.elements.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.invocations.MethodInvocation#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.expressions.invocations.InvocationsPackage#getMethodInvocation()
 * @model
 * @generated
 */
public interface MethodInvocation extends Invocation {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #isSetFrom()
	 * @see #unsetFrom()
	 * @see #setFrom(Expression)
	 * @see ccsl.elements.expressions.invocations.InvocationsPackage#getMethodInvocation_From()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	Expression getFrom();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.invocations.MethodInvocation#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #isSetFrom()
	 * @see #unsetFrom()
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Expression value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.expressions.invocations.MethodInvocation#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrom()
	 * @see #getFrom()
	 * @see #setFrom(Expression)
	 * @generated
	 */
	void unsetFrom();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.expressions.invocations.MethodInvocation#getFrom <em>From</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>From</em>' containment reference is set.
	 * @see #unsetFrom()
	 * @see #getFrom()
	 * @see #setFrom(Expression)
	 * @generated
	 */
	boolean isSetFrom();

} // MethodInvocation
