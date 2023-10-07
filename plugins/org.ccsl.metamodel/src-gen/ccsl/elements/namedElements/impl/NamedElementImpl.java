/**
 */
package ccsl.elements.namedElements.impl;

import ccsl.elements.Annotable;
import ccsl.elements.ElementsPackage;

import ccsl.elements.expressions.annotation.Annotation;

import ccsl.elements.impl.ElementImpl;

import ccsl.elements.namedElements.NamedElement;
import ccsl.elements.namedElements.NamedElementsPackage;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.impl.NamedElementImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.impl.NamedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.impl.NamedElementImpl#getAvailableInSourceCode <em>Available In Source Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedElementImpl extends ElementImpl implements NamedElement {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList annotations;

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
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * The default value of the '{@link #getAvailableInSourceCode() <em>Available In Source Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableInSourceCode()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AVAILABLE_IN_SOURCE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableInSourceCode() <em>Available In Source Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableInSourceCode()
	 * @generated
	 * @ordered
	 */
	protected Boolean availableInSourceCode = AVAILABLE_IN_SOURCE_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NamedElementsPackage.Literals.NAMED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList(Annotation.class, this,
					NamedElementsPackage.NAMED_ELEMENT__ANNOTATIONS);
		}
		return annotations;
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
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamedElementsPackage.NAMED_ELEMENT__NAME, oldName,
					name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NamedElementsPackage.NAMED_ELEMENT__NAME, oldName,
					NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAvailableInSourceCode() {
		return availableInSourceCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableInSourceCode(Boolean newAvailableInSourceCode) {
		Boolean oldAvailableInSourceCode = availableInSourceCode;
		availableInSourceCode = newAvailableInSourceCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NamedElementsPackage.NAMED_ELEMENT__AVAILABLE_IN_SOURCE_CODE, oldAvailableInSourceCode,
					availableInSourceCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NamedElementsPackage.NAMED_ELEMENT__ANNOTATIONS:
			return ((InternalEList) getAnnotations()).basicRemove(otherEnd, msgs);
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
		case NamedElementsPackage.NAMED_ELEMENT__ANNOTATIONS:
			return getAnnotations();
		case NamedElementsPackage.NAMED_ELEMENT__NAME:
			return getName();
		case NamedElementsPackage.NAMED_ELEMENT__AVAILABLE_IN_SOURCE_CODE:
			return getAvailableInSourceCode();
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
		case NamedElementsPackage.NAMED_ELEMENT__ANNOTATIONS:
			getAnnotations().clear();
			getAnnotations().addAll((Collection) newValue);
			return;
		case NamedElementsPackage.NAMED_ELEMENT__NAME:
			setName((String) newValue);
			return;
		case NamedElementsPackage.NAMED_ELEMENT__AVAILABLE_IN_SOURCE_CODE:
			setAvailableInSourceCode((Boolean) newValue);
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
		case NamedElementsPackage.NAMED_ELEMENT__ANNOTATIONS:
			getAnnotations().clear();
			return;
		case NamedElementsPackage.NAMED_ELEMENT__NAME:
			unsetName();
			return;
		case NamedElementsPackage.NAMED_ELEMENT__AVAILABLE_IN_SOURCE_CODE:
			setAvailableInSourceCode(AVAILABLE_IN_SOURCE_CODE_EDEFAULT);
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
		case NamedElementsPackage.NAMED_ELEMENT__ANNOTATIONS:
			return annotations != null && !annotations.isEmpty();
		case NamedElementsPackage.NAMED_ELEMENT__NAME:
			return isSetName();
		case NamedElementsPackage.NAMED_ELEMENT__AVAILABLE_IN_SOURCE_CODE:
			return AVAILABLE_IN_SOURCE_CODE_EDEFAULT == null ? availableInSourceCode != null
					: !AVAILABLE_IN_SOURCE_CODE_EDEFAULT.equals(availableInSourceCode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Annotable.class) {
			switch (derivedFeatureID) {
			case NamedElementsPackage.NAMED_ELEMENT__ANNOTATIONS:
				return ElementsPackage.ANNOTABLE__ANNOTATIONS;
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
		if (baseClass == Annotable.class) {
			switch (baseFeatureID) {
			case ElementsPackage.ANNOTABLE__ANNOTATIONS:
				return NamedElementsPackage.NAMED_ELEMENT__ANNOTATIONS;
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
		result.append(" (name: ");
		if (nameESet)
			result.append(name);
		else
			result.append("<unset>");
		result.append(", availableInSourceCode: ");
		result.append(availableInSourceCode);
		result.append(')');
		return result.toString();
	}

} //NamedElementImpl
