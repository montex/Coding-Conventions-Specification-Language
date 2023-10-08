/**
 */
package ccsl.elements.expressions.invocations.impl;

import ccsl.elements.expressions.invocations.ConstructorInvocation;
import ccsl.elements.expressions.invocations.InvocationsPackage;

import ccsl.elements.namedElements.method.Constructor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.invocations.impl.ConstructorInvocationImpl#getConstructor <em>Constructor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructorInvocationImpl extends InvocationImpl implements ConstructorInvocation {
	/**
	 * The cached value of the '{@link #getConstructor() <em>Constructor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructor()
	 * @generated
	 * @ordered
	 */
	protected Constructor constructor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InvocationsPackage.Literals.CONSTRUCTOR_INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constructor getConstructor() {
		if (constructor != null && constructor.eIsProxy()) {
			InternalEObject oldConstructor = (InternalEObject) constructor;
			constructor = (Constructor) eResolveProxy(oldConstructor);
			if (constructor != oldConstructor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							InvocationsPackage.CONSTRUCTOR_INVOCATION__CONSTRUCTOR, oldConstructor, constructor));
			}
		}
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constructor basicGetConstructor() {
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructor(Constructor newConstructor) {
		Constructor oldConstructor = constructor;
		constructor = newConstructor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InvocationsPackage.CONSTRUCTOR_INVOCATION__CONSTRUCTOR, oldConstructor, constructor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case InvocationsPackage.CONSTRUCTOR_INVOCATION__CONSTRUCTOR:
			if (resolve)
				return getConstructor();
			return basicGetConstructor();
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
		case InvocationsPackage.CONSTRUCTOR_INVOCATION__CONSTRUCTOR:
			setConstructor((Constructor) newValue);
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
		case InvocationsPackage.CONSTRUCTOR_INVOCATION__CONSTRUCTOR:
			setConstructor((Constructor) null);
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
		case InvocationsPackage.CONSTRUCTOR_INVOCATION__CONSTRUCTOR:
			return constructor != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstructorInvocationImpl
