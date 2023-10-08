/**
 */
package ccsl;

import ccsl.context.Context;

import ccsl.elements.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.AtomicRule#getSubject <em>Subject</em>}</li>
 *   <li>{@link ccsl.AtomicRule#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see ccsl.ccslPackage#getAtomicRule()
 * @model
 * @generated
 */
public interface AtomicRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(Element)
	 * @see ccsl.ccslPackage#getAtomicRule_Subject()
	 * @model required="true"
	 * @generated
	 */
	Element getSubject();

	/**
	 * Sets the value of the '{@link ccsl.AtomicRule#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Element value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Context)
	 * @see ccsl.ccslPackage#getAtomicRule_Context()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link ccsl.AtomicRule#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

} // AtomicRule
