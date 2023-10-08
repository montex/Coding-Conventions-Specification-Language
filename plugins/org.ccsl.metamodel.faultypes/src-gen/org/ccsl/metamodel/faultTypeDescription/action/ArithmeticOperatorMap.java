/**
 */
package org.ccsl.metamodel.faultTypeDescription.action;

import ccsl.elements.expressions.ArithmeticOperator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetic Operator Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ccsl.metamodel.faultTypeDescription.action.ArithmeticOperatorMap#getOldArithmeticOperator <em>Old Arithmetic Operator</em>}</li>
 *   <li>{@link org.ccsl.metamodel.faultTypeDescription.action.ArithmeticOperatorMap#getNewArithmeticOperator <em>New Arithmetic Operator</em>}</li>
 * </ul>
 *
 * @see org.ccsl.metamodel.faultTypeDescription.action.ActionPackage#getArithmeticOperatorMap()
 * @model
 * @generated
 */
public interface ArithmeticOperatorMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Old Arithmetic Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ccsl.elements.expressions.ArithmeticOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Arithmetic Operator</em>' attribute.
	 * @see ccsl.elements.expressions.ArithmeticOperator
	 * @see #setOldArithmeticOperator(ArithmeticOperator)
	 * @see org.ccsl.metamodel.faultTypeDescription.action.ActionPackage#getArithmeticOperatorMap_OldArithmeticOperator()
	 * @model
	 * @generated
	 */
	ArithmeticOperator getOldArithmeticOperator();

	/**
	 * Sets the value of the '{@link org.ccsl.metamodel.faultTypeDescription.action.ArithmeticOperatorMap#getOldArithmeticOperator <em>Old Arithmetic Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Arithmetic Operator</em>' attribute.
	 * @see ccsl.elements.expressions.ArithmeticOperator
	 * @see #getOldArithmeticOperator()
	 * @generated
	 */
	void setOldArithmeticOperator(ArithmeticOperator value);

	/**
	 * Returns the value of the '<em><b>New Arithmetic Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ccsl.elements.expressions.ArithmeticOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Arithmetic Operator</em>' attribute.
	 * @see ccsl.elements.expressions.ArithmeticOperator
	 * @see #setNewArithmeticOperator(ArithmeticOperator)
	 * @see org.ccsl.metamodel.faultTypeDescription.action.ActionPackage#getArithmeticOperatorMap_NewArithmeticOperator()
	 * @model
	 * @generated
	 */
	ArithmeticOperator getNewArithmeticOperator();

	/**
	 * Sets the value of the '{@link org.ccsl.metamodel.faultTypeDescription.action.ArithmeticOperatorMap#getNewArithmeticOperator <em>New Arithmetic Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Arithmetic Operator</em>' attribute.
	 * @see ccsl.elements.expressions.ArithmeticOperator
	 * @see #getNewArithmeticOperator()
	 * @generated
	 */
	void setNewArithmeticOperator(ArithmeticOperator value);

} // ArithmeticOperatorMap
