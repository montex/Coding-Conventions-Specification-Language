/**
 */
package ccsl.elements.expressions.invocations;

import ccsl.elements.namedElements.method.Constructor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.invocations.ConstructorInvocation#getConstructor <em>Constructor</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.expressions.invocations.InvocationsPackage#getConstructorInvocation()
 * @model
 * @generated
 */
public interface ConstructorInvocation extends Invocation {
	/**
	 * Returns the value of the '<em><b>Constructor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor</em>' reference.
	 * @see #setConstructor(Constructor)
	 * @see ccsl.elements.expressions.invocations.InvocationsPackage#getConstructorInvocation_Constructor()
	 * @model
	 * @generated
	 */
	Constructor getConstructor();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.invocations.ConstructorInvocation#getConstructor <em>Constructor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor</em>' reference.
	 * @see #getConstructor()
	 * @generated
	 */
	void setConstructor(Constructor value);

} // ConstructorInvocation
