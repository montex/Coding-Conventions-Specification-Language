/**
 */
package org.ccsl.metamodel.faultTypeDescription.impl;

import ccsl.AtomicRule;

import ccsl.impl.RootImpl;

import java.util.Collection;

import org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription;
import org.ccsl.metamodel.faultTypeDescription.FaultypesPackage;
import org.ccsl.metamodel.faultTypeDescription.InjectionAction;
import org.ccsl.metamodel.faultTypeDescription.InjectionStrategy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault Type Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ccsl.metamodel.faultTypeDescription.impl.FaultTypeDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ccsl.metamodel.faultTypeDescription.impl.FaultTypeDescriptionImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.ccsl.metamodel.faultTypeDescription.impl.FaultTypeDescriptionImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.ccsl.metamodel.faultTypeDescription.impl.FaultTypeDescriptionImpl#getStrategies <em>Strategies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FaultTypeDescriptionImpl extends RootImpl implements FaultTypeDescription {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected AtomicRule rule;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<InjectionAction> actions;

	/**
	 * The cached value of the '{@link #getStrategies() <em>Strategies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategies()
	 * @generated
	 * @ordered
	 */
	protected EList<InjectionStrategy> strategies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultTypeDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaultypesPackage.Literals.FAULT_TYPE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultypesPackage.FAULT_TYPE_DESCRIPTION__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicRule getRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(AtomicRule newRule, NotificationChain msgs) {
		AtomicRule oldRule = rule;
		rule = newRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FaultypesPackage.FAULT_TYPE_DESCRIPTION__RULE, oldRule, newRule);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(AtomicRule newRule) {
		if (newRule != rule) {
			NotificationChain msgs = null;
			if (rule != null)
				msgs = ((InternalEObject) rule).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FaultypesPackage.FAULT_TYPE_DESCRIPTION__RULE, null, msgs);
			if (newRule != null)
				msgs = ((InternalEObject) newRule).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FaultypesPackage.FAULT_TYPE_DESCRIPTION__RULE, null, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultypesPackage.FAULT_TYPE_DESCRIPTION__RULE,
					newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InjectionAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<InjectionAction>(InjectionAction.class, this,
					FaultypesPackage.FAULT_TYPE_DESCRIPTION__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InjectionStrategy> getStrategies() {
		if (strategies == null) {
			strategies = new EObjectContainmentEList<InjectionStrategy>(InjectionStrategy.class, this,
					FaultypesPackage.FAULT_TYPE_DESCRIPTION__STRATEGIES);
		}
		return strategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION__RULE:
			return basicSetRule(null, msgs);
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION__ACTIONS:
			return ((InternalEList<?>) getActions()).basicRemove(otherEnd, msgs);
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION__STRATEGIES:
			return ((InternalEList<?>) getStrategies()).basicRemove(otherEnd, msgs);
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
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION__NAME:
			return getName();
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION__RULE:
			return getRule();
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION__ACTIONS:
			return getActions();
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION__STRATEGIES:
			return getStrategies();
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
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION__NAME:
			setName((String) newValue);
			return;
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION__RULE:
			setRule((AtomicRule) newValue);
			return;
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends InjectionAction>) newValue);
			return;
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION__STRATEGIES:
			getStrategies().clear();
			getStrategies().addAll((Collection<? extends InjectionStrategy>) newValue);
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
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION__RULE:
			setRule((AtomicRule) null);
			return;
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION__ACTIONS:
			getActions().clear();
			return;
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION__STRATEGIES:
			getStrategies().clear();
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
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION__RULE:
			return rule != null;
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION__ACTIONS:
			return actions != null && !actions.isEmpty();
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION__STRATEGIES:
			return strategies != null && !strategies.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FaultTypeDescriptionImpl
