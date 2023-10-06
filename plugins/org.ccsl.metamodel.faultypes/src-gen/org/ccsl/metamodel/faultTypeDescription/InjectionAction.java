/**
 */
package org.ccsl.metamodel.faultTypeDescription;

import ccsl.elements.Element;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Injection Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ccsl.metamodel.faultTypeDescription.InjectionAction#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.ccsl.metamodel.faultTypeDescription.FaultypesPackage#getInjectionAction()
 * @model abstract="true"
 * @generated
 */
public interface InjectionAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Element)
	 * @see org.ccsl.metamodel.faultTypeDescription.FaultypesPackage#getInjectionAction_Target()
	 * @model
	 * @generated
	 */
	Element getTarget();

	/**
	 * Sets the value of the '{@link org.ccsl.metamodel.faultTypeDescription.InjectionAction#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Element value);

} // InjectionAction
