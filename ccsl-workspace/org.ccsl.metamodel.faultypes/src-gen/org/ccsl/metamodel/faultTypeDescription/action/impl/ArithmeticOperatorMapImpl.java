/**
 */
package org.ccsl.metamodel.faultTypeDescription.action.impl;

import ccsl.elements.expressions.ArithmeticOperator;

import org.ccsl.metamodel.faultTypeDescription.action.ActionPackage;
import org.ccsl.metamodel.faultTypeDescription.action.ArithmeticOperatorMap;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arithmetic Operator Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ccsl.metamodel.faultTypeDescription.action.impl.ArithmeticOperatorMapImpl#getOldArithmeticOperator <em>Old Arithmetic Operator</em>}</li>
 *   <li>{@link org.ccsl.metamodel.faultTypeDescription.action.impl.ArithmeticOperatorMapImpl#getNewArithmeticOperator <em>New Arithmetic Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArithmeticOperatorMapImpl extends MinimalEObjectImpl.Container implements ArithmeticOperatorMap {
	/**
	 * The default value of the '{@link #getOldArithmeticOperator() <em>Old Arithmetic Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldArithmeticOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ArithmeticOperator OLD_ARITHMETIC_OPERATOR_EDEFAULT = ArithmeticOperator.ADDITION_LITERAL;

	/**
	 * The cached value of the '{@link #getOldArithmeticOperator() <em>Old Arithmetic Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldArithmeticOperator()
	 * @generated
	 * @ordered
	 */
	protected ArithmeticOperator oldArithmeticOperator = OLD_ARITHMETIC_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewArithmeticOperator() <em>New Arithmetic Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewArithmeticOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ArithmeticOperator NEW_ARITHMETIC_OPERATOR_EDEFAULT = ArithmeticOperator.ADDITION_LITERAL;

	/**
	 * The cached value of the '{@link #getNewArithmeticOperator() <em>New Arithmetic Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewArithmeticOperator()
	 * @generated
	 * @ordered
	 */
	protected ArithmeticOperator newArithmeticOperator = NEW_ARITHMETIC_OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmeticOperatorMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionPackage.Literals.ARITHMETIC_OPERATOR_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperator getOldArithmeticOperator() {
		return oldArithmeticOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldArithmeticOperator(ArithmeticOperator newOldArithmeticOperator) {
		ArithmeticOperator oldOldArithmeticOperator = oldArithmeticOperator;
		oldArithmeticOperator = newOldArithmeticOperator == null ? OLD_ARITHMETIC_OPERATOR_EDEFAULT
				: newOldArithmeticOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ActionPackage.ARITHMETIC_OPERATOR_MAP__OLD_ARITHMETIC_OPERATOR, oldOldArithmeticOperator,
					oldArithmeticOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperator getNewArithmeticOperator() {
		return newArithmeticOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewArithmeticOperator(ArithmeticOperator newNewArithmeticOperator) {
		ArithmeticOperator oldNewArithmeticOperator = newArithmeticOperator;
		newArithmeticOperator = newNewArithmeticOperator == null ? NEW_ARITHMETIC_OPERATOR_EDEFAULT
				: newNewArithmeticOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ActionPackage.ARITHMETIC_OPERATOR_MAP__NEW_ARITHMETIC_OPERATOR, oldNewArithmeticOperator,
					newArithmeticOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ActionPackage.ARITHMETIC_OPERATOR_MAP__OLD_ARITHMETIC_OPERATOR:
			return getOldArithmeticOperator();
		case ActionPackage.ARITHMETIC_OPERATOR_MAP__NEW_ARITHMETIC_OPERATOR:
			return getNewArithmeticOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ActionPackage.ARITHMETIC_OPERATOR_MAP__OLD_ARITHMETIC_OPERATOR:
			setOldArithmeticOperator((ArithmeticOperator) newValue);
			return;
		case ActionPackage.ARITHMETIC_OPERATOR_MAP__NEW_ARITHMETIC_OPERATOR:
			setNewArithmeticOperator((ArithmeticOperator) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ActionPackage.ARITHMETIC_OPERATOR_MAP__OLD_ARITHMETIC_OPERATOR:
			setOldArithmeticOperator(OLD_ARITHMETIC_OPERATOR_EDEFAULT);
			return;
		case ActionPackage.ARITHMETIC_OPERATOR_MAP__NEW_ARITHMETIC_OPERATOR:
			setNewArithmeticOperator(NEW_ARITHMETIC_OPERATOR_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ActionPackage.ARITHMETIC_OPERATOR_MAP__OLD_ARITHMETIC_OPERATOR:
			return oldArithmeticOperator != OLD_ARITHMETIC_OPERATOR_EDEFAULT;
		case ActionPackage.ARITHMETIC_OPERATOR_MAP__NEW_ARITHMETIC_OPERATOR:
			return newArithmeticOperator != NEW_ARITHMETIC_OPERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (oldArithmeticOperator: ");
		result.append(oldArithmeticOperator);
		result.append(", newArithmeticOperator: ");
		result.append(newArithmeticOperator);
		result.append(')');
		return result.toString();
	}

} //ArithmeticOperatorMapImpl
