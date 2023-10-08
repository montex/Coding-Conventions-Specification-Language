/**
 */
package ccsl.elements.namedElements.complexType.impl;

import ccsl.elements.namedElements.complexType.ComplexTypePackage;
import ccsl.elements.namedElements.complexType.EnumConstant;
import ccsl.elements.namedElements.complexType.JEnum;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JEnum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.complexType.impl.JEnumImpl#getEnumConstants <em>Enum Constants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JEnumImpl extends ConstructComplexTypeDeclarationImpl implements JEnum {
	/**
	 * The cached value of the '{@link #getEnumConstants() <em>Enum Constants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumConstants()
	 * @generated
	 * @ordered
	 */
	protected EList enumConstants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JEnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ComplexTypePackage.Literals.JENUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEnumConstants() {
		if (enumConstants == null) {
			enumConstants = new EObjectContainmentEList.Unsettable(EnumConstant.class, this,
					ComplexTypePackage.JENUM__ENUM_CONSTANTS);
		}
		return enumConstants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnumConstants() {
		if (enumConstants != null)
			((InternalEList.Unsettable) enumConstants).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnumConstants() {
		return enumConstants != null && ((InternalEList.Unsettable) enumConstants).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComplexTypePackage.JENUM__ENUM_CONSTANTS:
			return ((InternalEList) getEnumConstants()).basicRemove(otherEnd, msgs);
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
		case ComplexTypePackage.JENUM__ENUM_CONSTANTS:
			return getEnumConstants();
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
		case ComplexTypePackage.JENUM__ENUM_CONSTANTS:
			getEnumConstants().clear();
			getEnumConstants().addAll((Collection) newValue);
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
		case ComplexTypePackage.JENUM__ENUM_CONSTANTS:
			unsetEnumConstants();
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
		case ComplexTypePackage.JENUM__ENUM_CONSTANTS:
			return isSetEnumConstants();
		}
		return super.eIsSet(featureID);
	}

} //JEnumImpl
