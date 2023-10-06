/**
 */
package org.ccsl.metamodel.faultTypeDescription.action.impl;

import java.util.Collection;

import org.ccsl.metamodel.faultTypeDescription.action.ActionPackage;
import org.ccsl.metamodel.faultTypeDescription.action.ArithmeticOperatorMap;
import org.ccsl.metamodel.faultTypeDescription.action.ReplaceArithmeticOperatorAction;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Replace Arithmetic Operator Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ccsl.metamodel.faultTypeDescription.action.impl.ReplaceArithmeticOperatorActionImpl#getReplaceMap <em>Replace Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReplaceArithmeticOperatorActionImpl extends MinimalEObjectImpl.Container
		implements ReplaceArithmeticOperatorAction {
	/**
	 * The cached value of the '{@link #getReplaceMap() <em>Replace Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplaceMap()
	 * @generated
	 * @ordered
	 */
	protected EList<ArithmeticOperatorMap> replaceMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplaceArithmeticOperatorActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionPackage.Literals.REPLACE_ARITHMETIC_OPERATOR_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArithmeticOperatorMap> getReplaceMap() {
		if (replaceMap == null) {
			replaceMap = new EObjectContainmentEList<ArithmeticOperatorMap>(ArithmeticOperatorMap.class, this,
					ActionPackage.REPLACE_ARITHMETIC_OPERATOR_ACTION__REPLACE_MAP);
		}
		return replaceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ActionPackage.REPLACE_ARITHMETIC_OPERATOR_ACTION__REPLACE_MAP:
			return ((InternalEList<?>) getReplaceMap()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ActionPackage.REPLACE_ARITHMETIC_OPERATOR_ACTION__REPLACE_MAP:
			return getReplaceMap();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ActionPackage.REPLACE_ARITHMETIC_OPERATOR_ACTION__REPLACE_MAP:
			getReplaceMap().clear();
			getReplaceMap().addAll((Collection<? extends ArithmeticOperatorMap>) newValue);
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
		case ActionPackage.REPLACE_ARITHMETIC_OPERATOR_ACTION__REPLACE_MAP:
			getReplaceMap().clear();
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
		case ActionPackage.REPLACE_ARITHMETIC_OPERATOR_ACTION__REPLACE_MAP:
			return replaceMap != null && !replaceMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReplaceArithmeticOperatorActionImpl
