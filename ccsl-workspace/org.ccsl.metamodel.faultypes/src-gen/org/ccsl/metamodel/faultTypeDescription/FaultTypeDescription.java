/**
 */
package org.ccsl.metamodel.faultTypeDescription;

import ccsl.AtomicRule;
import ccsl.Root;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Type Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription#getName <em>Name</em>}</li>
 *   <li>{@link org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription#getRule <em>Rule</em>}</li>
 *   <li>{@link org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription#getActions <em>Actions</em>}</li>
 *   <li>{@link org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription#getStrategies <em>Strategies</em>}</li>
 * </ul>
 *
 * @see org.ccsl.metamodel.faultTypeDescription.FaultypesPackage#getFaultTypeDescription()
 * @model
 * @generated
 */
public interface FaultTypeDescription extends Root {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ccsl.metamodel.faultTypeDescription.FaultypesPackage#getFaultTypeDescription_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(AtomicRule)
	 * @see org.ccsl.metamodel.faultTypeDescription.FaultypesPackage#getFaultTypeDescription_Rule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AtomicRule getRule();

	/**
	 * Sets the value of the '{@link org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(AtomicRule value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.ccsl.metamodel.faultTypeDescription.InjectionAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.ccsl.metamodel.faultTypeDescription.FaultypesPackage#getFaultTypeDescription_Actions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InjectionAction> getActions();

	/**
	 * Returns the value of the '<em><b>Strategies</b></em>' containment reference list.
	 * The list contents are of type {@link org.ccsl.metamodel.faultTypeDescription.InjectionStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategies</em>' containment reference list.
	 * @see org.ccsl.metamodel.faultTypeDescription.FaultypesPackage#getFaultTypeDescription_Strategies()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InjectionStrategy> getStrategies();

} // FaultTypeDescription
