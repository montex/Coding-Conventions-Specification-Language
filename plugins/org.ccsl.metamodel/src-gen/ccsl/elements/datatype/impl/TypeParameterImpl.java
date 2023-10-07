/**
 */
package ccsl.elements.datatype.impl;

import ccsl.CollectionKind;

import ccsl.elements.datatype.DatatypePackage;
import ccsl.elements.datatype.ObjectType;
import ccsl.elements.datatype.TypeParameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.datatype.impl.TypeParameterImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link ccsl.elements.datatype.impl.TypeParameterImpl#getBoundsKind <em>Bounds Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeParameterImpl extends ObjectTypeImpl implements TypeParameter {
	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected EList bounds;

	/**
	 * The default value of the '{@link #getBoundsKind() <em>Bounds Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundsKind()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionKind BOUNDS_KIND_EDEFAULT = CollectionKind.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getBoundsKind() <em>Bounds Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundsKind()
	 * @generated
	 * @ordered
	 */
	protected CollectionKind boundsKind = BOUNDS_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DatatypePackage.Literals.TYPE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBounds() {
		if (bounds == null) {
			bounds = new EObjectResolvingEList(ObjectType.class, this, DatatypePackage.TYPE_PARAMETER__BOUNDS);
		}
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKind getBoundsKind() {
		return boundsKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundsKind(CollectionKind newBoundsKind) {
		CollectionKind oldBoundsKind = boundsKind;
		boundsKind = newBoundsKind == null ? BOUNDS_KIND_EDEFAULT : newBoundsKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.TYPE_PARAMETER__BOUNDS_KIND,
					oldBoundsKind, boundsKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DatatypePackage.TYPE_PARAMETER__BOUNDS:
			return getBounds();
		case DatatypePackage.TYPE_PARAMETER__BOUNDS_KIND:
			return getBoundsKind();
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
		case DatatypePackage.TYPE_PARAMETER__BOUNDS:
			getBounds().clear();
			getBounds().addAll((Collection) newValue);
			return;
		case DatatypePackage.TYPE_PARAMETER__BOUNDS_KIND:
			setBoundsKind((CollectionKind) newValue);
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
		case DatatypePackage.TYPE_PARAMETER__BOUNDS:
			getBounds().clear();
			return;
		case DatatypePackage.TYPE_PARAMETER__BOUNDS_KIND:
			setBoundsKind(BOUNDS_KIND_EDEFAULT);
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
		case DatatypePackage.TYPE_PARAMETER__BOUNDS:
			return bounds != null && !bounds.isEmpty();
		case DatatypePackage.TYPE_PARAMETER__BOUNDS_KIND:
			return boundsKind != BOUNDS_KIND_EDEFAULT;
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
		result.append(" (boundsKind: ");
		result.append(boundsKind);
		result.append(')');
		return result.toString();
	}

} //TypeParameterImpl
