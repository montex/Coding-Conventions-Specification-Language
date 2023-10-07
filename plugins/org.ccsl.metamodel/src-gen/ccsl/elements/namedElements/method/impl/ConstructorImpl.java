/**
 */
package ccsl.elements.namedElements.method.impl;

import ccsl.elements.namedElements.method.Constructor;
import ccsl.elements.namedElements.method.MethodPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.method.impl.ConstructorImpl#getAvaliableInSourceCode <em>Avaliable In Source Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructorImpl extends SimpleMethodImpl implements Constructor {
	/**
	 * The default value of the '{@link #getAvaliableInSourceCode() <em>Avaliable In Source Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvaliableInSourceCode()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AVALIABLE_IN_SOURCE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvaliableInSourceCode() <em>Avaliable In Source Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvaliableInSourceCode()
	 * @generated
	 * @ordered
	 */
	protected Boolean avaliableInSourceCode = AVALIABLE_IN_SOURCE_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MethodPackage.Literals.CONSTRUCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAvaliableInSourceCode() {
		return avaliableInSourceCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvaliableInSourceCode(Boolean newAvaliableInSourceCode) {
		Boolean oldAvaliableInSourceCode = avaliableInSourceCode;
		avaliableInSourceCode = newAvaliableInSourceCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MethodPackage.CONSTRUCTOR__AVALIABLE_IN_SOURCE_CODE,
					oldAvaliableInSourceCode, avaliableInSourceCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MethodPackage.CONSTRUCTOR__AVALIABLE_IN_SOURCE_CODE:
			return getAvaliableInSourceCode();
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
		case MethodPackage.CONSTRUCTOR__AVALIABLE_IN_SOURCE_CODE:
			setAvaliableInSourceCode((Boolean) newValue);
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
		case MethodPackage.CONSTRUCTOR__AVALIABLE_IN_SOURCE_CODE:
			setAvaliableInSourceCode(AVALIABLE_IN_SOURCE_CODE_EDEFAULT);
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
		case MethodPackage.CONSTRUCTOR__AVALIABLE_IN_SOURCE_CODE:
			return AVALIABLE_IN_SOURCE_CODE_EDEFAULT == null ? avaliableInSourceCode != null
					: !AVALIABLE_IN_SOURCE_CODE_EDEFAULT.equals(avaliableInSourceCode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (avaliableInSourceCode: ");
		result.append(avaliableInSourceCode);
		result.append(')');
		return result.toString();
	}

} //ConstructorImpl
