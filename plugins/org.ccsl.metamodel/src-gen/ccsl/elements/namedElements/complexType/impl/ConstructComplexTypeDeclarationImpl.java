/**
 */
package ccsl.elements.namedElements.complexType.impl;

import ccsl.elements.namedElements.complexType.ComplexTypePackage;
import ccsl.elements.namedElements.complexType.ConstructComplexTypeDeclaration;

import ccsl.elements.namedElements.method.Constructor;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Construct Complex Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.complexType.impl.ConstructComplexTypeDeclarationImpl#getConstructors <em>Constructors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructComplexTypeDeclarationImpl extends ComplexTypeDeclarationImpl
		implements ConstructComplexTypeDeclaration {
	/**
	 * The cached value of the '{@link #getConstructors() <em>Constructors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructors()
	 * @generated
	 * @ordered
	 */
	protected EList constructors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructComplexTypeDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ComplexTypePackage.Literals.CONSTRUCT_COMPLEX_TYPE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConstructors() {
		if (constructors == null) {
			constructors = new EObjectContainmentEList.Unsettable(Constructor.class, this,
					ComplexTypePackage.CONSTRUCT_COMPLEX_TYPE_DECLARATION__CONSTRUCTORS);
		}
		return constructors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConstructors() {
		if (constructors != null)
			((InternalEList.Unsettable) constructors).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstructors() {
		return constructors != null && ((InternalEList.Unsettable) constructors).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComplexTypePackage.CONSTRUCT_COMPLEX_TYPE_DECLARATION__CONSTRUCTORS:
			return ((InternalEList) getConstructors()).basicRemove(otherEnd, msgs);
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
		case ComplexTypePackage.CONSTRUCT_COMPLEX_TYPE_DECLARATION__CONSTRUCTORS:
			return getConstructors();
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
		case ComplexTypePackage.CONSTRUCT_COMPLEX_TYPE_DECLARATION__CONSTRUCTORS:
			getConstructors().clear();
			getConstructors().addAll((Collection) newValue);
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
		case ComplexTypePackage.CONSTRUCT_COMPLEX_TYPE_DECLARATION__CONSTRUCTORS:
			unsetConstructors();
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
		case ComplexTypePackage.CONSTRUCT_COMPLEX_TYPE_DECLARATION__CONSTRUCTORS:
			return isSetConstructors();
		}
		return super.eIsSet(featureID);
	}

} //ConstructComplexTypeDeclarationImpl
