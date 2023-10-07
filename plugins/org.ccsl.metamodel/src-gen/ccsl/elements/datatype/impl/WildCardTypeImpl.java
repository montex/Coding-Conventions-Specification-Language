/**
 */
package ccsl.elements.datatype.impl;

import ccsl.elements.datatype.DatatypePackage;
import ccsl.elements.datatype.ObjectType;
import ccsl.elements.datatype.WildCardType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wild Card Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.datatype.impl.WildCardTypeImpl#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WildCardTypeImpl extends ObjectTypeImpl implements WildCardType {
	/**
	 * The cached value of the '{@link #getBound() <em>Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected ObjectType bound;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WildCardTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DatatypePackage.Literals.WILD_CARD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType getBound() {
		if (bound != null && bound.eIsProxy()) {
			InternalEObject oldBound = (InternalEObject) bound;
			bound = (ObjectType) eResolveProxy(oldBound);
			if (bound != oldBound) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypePackage.WILD_CARD_TYPE__BOUND,
							oldBound, bound));
			}
		}
		return bound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType basicGetBound() {
		return bound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBound(ObjectType newBound) {
		ObjectType oldBound = bound;
		bound = newBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.WILD_CARD_TYPE__BOUND, oldBound,
					bound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DatatypePackage.WILD_CARD_TYPE__BOUND:
			if (resolve)
				return getBound();
			return basicGetBound();
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
		case DatatypePackage.WILD_CARD_TYPE__BOUND:
			setBound((ObjectType) newValue);
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
		case DatatypePackage.WILD_CARD_TYPE__BOUND:
			setBound((ObjectType) null);
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
		case DatatypePackage.WILD_CARD_TYPE__BOUND:
			return bound != null;
		}
		return super.eIsSet(featureID);
	}

} //WildCardTypeImpl
