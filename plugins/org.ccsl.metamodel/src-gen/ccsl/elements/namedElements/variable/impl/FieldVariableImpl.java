/**
 */
package ccsl.elements.namedElements.variable.impl;

import ccsl.elements.ControlledAccessElement;
import ccsl.elements.ElementsPackage;
import ccsl.elements.Visibility;

import ccsl.elements.namedElements.variable.FieldVariable;
import ccsl.elements.namedElements.variable.VariablePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.variable.impl.FieldVariableImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.variable.impl.FieldVariableImpl#getStatic <em>Static</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.variable.impl.FieldVariableImpl#getVolatile <em>Volatile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldVariableImpl extends InitializableVariableImpl implements FieldVariable {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Visibility visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STATIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
	protected Boolean static_ = STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VOLATILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatile()
	 * @generated
	 * @ordered
	 */
	protected Boolean volatile_ = VOLATILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VariablePackage.Literals.FIELD_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Visibility newVisibility) {
		Visibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablePackage.FIELD_VARIABLE__VISIBILITY,
					oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(Boolean newStatic) {
		Boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablePackage.FIELD_VARIABLE__STATIC, oldStatic,
					static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getVolatile() {
		return volatile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatile(Boolean newVolatile) {
		Boolean oldVolatile = volatile_;
		volatile_ = newVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablePackage.FIELD_VARIABLE__VOLATILE, oldVolatile,
					volatile_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case VariablePackage.FIELD_VARIABLE__VISIBILITY:
			return getVisibility();
		case VariablePackage.FIELD_VARIABLE__STATIC:
			return getStatic();
		case VariablePackage.FIELD_VARIABLE__VOLATILE:
			return getVolatile();
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
		case VariablePackage.FIELD_VARIABLE__VISIBILITY:
			setVisibility((Visibility) newValue);
			return;
		case VariablePackage.FIELD_VARIABLE__STATIC:
			setStatic((Boolean) newValue);
			return;
		case VariablePackage.FIELD_VARIABLE__VOLATILE:
			setVolatile((Boolean) newValue);
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
		case VariablePackage.FIELD_VARIABLE__VISIBILITY:
			setVisibility(VISIBILITY_EDEFAULT);
			return;
		case VariablePackage.FIELD_VARIABLE__STATIC:
			setStatic(STATIC_EDEFAULT);
			return;
		case VariablePackage.FIELD_VARIABLE__VOLATILE:
			setVolatile(VOLATILE_EDEFAULT);
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
		case VariablePackage.FIELD_VARIABLE__VISIBILITY:
			return visibility != VISIBILITY_EDEFAULT;
		case VariablePackage.FIELD_VARIABLE__STATIC:
			return STATIC_EDEFAULT == null ? static_ != null : !STATIC_EDEFAULT.equals(static_);
		case VariablePackage.FIELD_VARIABLE__VOLATILE:
			return VOLATILE_EDEFAULT == null ? volatile_ != null : !VOLATILE_EDEFAULT.equals(volatile_);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ControlledAccessElement.class) {
			switch (derivedFeatureID) {
			case VariablePackage.FIELD_VARIABLE__VISIBILITY:
				return ElementsPackage.CONTROLLED_ACCESS_ELEMENT__VISIBILITY;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == ControlledAccessElement.class) {
			switch (baseFeatureID) {
			case ElementsPackage.CONTROLLED_ACCESS_ELEMENT__VISIBILITY:
				return VariablePackage.FIELD_VARIABLE__VISIBILITY;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", static: ");
		result.append(static_);
		result.append(", volatile: ");
		result.append(volatile_);
		result.append(')');
		return result.toString();
	}

} //FieldVariableImpl
