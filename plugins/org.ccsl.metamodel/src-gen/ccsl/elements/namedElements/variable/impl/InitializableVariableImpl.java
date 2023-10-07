/**
 */
package ccsl.elements.namedElements.variable.impl;

import ccsl.elements.expressions.Expression;

import ccsl.elements.namedElements.variable.InitializableVariable;
import ccsl.elements.namedElements.variable.VariablePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initializable Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.variable.impl.InitializableVariableImpl#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitializableVariableImpl extends VariableImpl implements InitializableVariable {
	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected Expression initialValue;

	/**
	 * This is true if the Initial Value containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initialValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitializableVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VariablePackage.Literals.INITIALIZABLE_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialValue(Expression newInitialValue, NotificationChain msgs) {
		Expression oldInitialValue = initialValue;
		initialValue = newInitialValue;
		boolean oldInitialValueESet = initialValueESet;
		initialValueESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					VariablePackage.INITIALIZABLE_VARIABLE__INITIAL_VALUE, oldInitialValue, newInitialValue,
					!oldInitialValueESet);
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
	public void setInitialValue(Expression newInitialValue) {
		if (newInitialValue != initialValue) {
			NotificationChain msgs = null;
			if (initialValue != null)
				msgs = ((InternalEObject) initialValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - VariablePackage.INITIALIZABLE_VARIABLE__INITIAL_VALUE, null, msgs);
			if (newInitialValue != null)
				msgs = ((InternalEObject) newInitialValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - VariablePackage.INITIALIZABLE_VARIABLE__INITIAL_VALUE, null, msgs);
			msgs = basicSetInitialValue(newInitialValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldInitialValueESet = initialValueESet;
			initialValueESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET,
						VariablePackage.INITIALIZABLE_VARIABLE__INITIAL_VALUE, newInitialValue, newInitialValue,
						!oldInitialValueESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetInitialValue(NotificationChain msgs) {
		Expression oldInitialValue = initialValue;
		initialValue = null;
		boolean oldInitialValueESet = initialValueESet;
		initialValueESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET,
					VariablePackage.INITIALIZABLE_VARIABLE__INITIAL_VALUE, oldInitialValue, null, oldInitialValueESet);
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
	public void unsetInitialValue() {
		if (initialValue != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject) initialValue).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - VariablePackage.INITIALIZABLE_VARIABLE__INITIAL_VALUE, null, msgs);
			msgs = basicUnsetInitialValue(msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldInitialValueESet = initialValueESet;
			initialValueESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						VariablePackage.INITIALIZABLE_VARIABLE__INITIAL_VALUE, null, null, oldInitialValueESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInitialValue() {
		return initialValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case VariablePackage.INITIALIZABLE_VARIABLE__INITIAL_VALUE:
			return basicUnsetInitialValue(msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case VariablePackage.INITIALIZABLE_VARIABLE__INITIAL_VALUE:
			return getInitialValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case VariablePackage.INITIALIZABLE_VARIABLE__INITIAL_VALUE:
			setInitialValue((Expression) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case VariablePackage.INITIALIZABLE_VARIABLE__INITIAL_VALUE:
			unsetInitialValue();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case VariablePackage.INITIALIZABLE_VARIABLE__INITIAL_VALUE:
			return isSetInitialValue();
		}
		return super.eIsSet(featureID);
	}

} //InitializableVariableImpl
