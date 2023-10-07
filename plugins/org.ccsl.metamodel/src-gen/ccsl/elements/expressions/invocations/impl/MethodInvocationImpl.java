/**
 */
package ccsl.elements.expressions.invocations.impl;

import ccsl.elements.expressions.Expression;

import ccsl.elements.expressions.invocations.InvocationsPackage;
import ccsl.elements.expressions.invocations.MethodInvocation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.invocations.impl.MethodInvocationImpl#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodInvocationImpl extends InvocationImpl implements MethodInvocation {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Expression from;

	/**
	 * This is true if the From containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fromESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InvocationsPackage.Literals.METHOD_INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(Expression newFrom, NotificationChain msgs) {
		Expression oldFrom = from;
		from = newFrom;
		boolean oldFromESet = fromESet;
		fromESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					InvocationsPackage.METHOD_INVOCATION__FROM, oldFrom, newFrom, !oldFromESet);
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
	public void setFrom(Expression newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject) from).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - InvocationsPackage.METHOD_INVOCATION__FROM, null, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject) newFrom).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - InvocationsPackage.METHOD_INVOCATION__FROM, null, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldFromESet = fromESet;
			fromESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, InvocationsPackage.METHOD_INVOCATION__FROM,
						newFrom, newFrom, !oldFromESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetFrom(NotificationChain msgs) {
		Expression oldFrom = from;
		from = null;
		boolean oldFromESet = fromESet;
		fromESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET,
					InvocationsPackage.METHOD_INVOCATION__FROM, oldFrom, null, oldFromESet);
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
	public void unsetFrom() {
		if (from != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject) from).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - InvocationsPackage.METHOD_INVOCATION__FROM, null, msgs);
			msgs = basicUnsetFrom(msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldFromESet = fromESet;
			fromESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, InvocationsPackage.METHOD_INVOCATION__FROM,
						null, null, oldFromESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrom() {
		return fromESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InvocationsPackage.METHOD_INVOCATION__FROM:
			return basicUnsetFrom(msgs);
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
		case InvocationsPackage.METHOD_INVOCATION__FROM:
			return getFrom();
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
		case InvocationsPackage.METHOD_INVOCATION__FROM:
			setFrom((Expression) newValue);
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
		case InvocationsPackage.METHOD_INVOCATION__FROM:
			unsetFrom();
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
		case InvocationsPackage.METHOD_INVOCATION__FROM:
			return isSetFrom();
		}
		return super.eIsSet(featureID);
	}

} //MethodInvocationImpl
