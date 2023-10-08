/**
 */
package ccsl.elements.datatype.impl;

import ccsl.elements.datatype.DatatypePackage;
import ccsl.elements.datatype.ObjectType;
import ccsl.elements.datatype.ParameterizedType;

import ccsl.elements.namedElements.complexType.TypeDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameterized Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.datatype.impl.ParameterizedTypeImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link ccsl.elements.datatype.impl.ParameterizedTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterizedTypeImpl extends ObjectTypeImpl implements ParameterizedType {
	/**
	 * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList typeArguments;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDeclaration type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterizedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DatatypePackage.Literals.PARAMETERIZED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTypeArguments() {
		if (typeArguments == null) {
			typeArguments = new EObjectResolvingEList(ObjectType.class, this,
					DatatypePackage.PARAMETERIZED_TYPE__TYPE_ARGUMENTS);
		}
		return typeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclaration getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (TypeDeclaration) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypePackage.PARAMETERIZED_TYPE__TYPE,
							oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclaration basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDeclaration newType) {
		TypeDeclaration oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.PARAMETERIZED_TYPE__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DatatypePackage.PARAMETERIZED_TYPE__TYPE_ARGUMENTS:
			return getTypeArguments();
		case DatatypePackage.PARAMETERIZED_TYPE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
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
		case DatatypePackage.PARAMETERIZED_TYPE__TYPE_ARGUMENTS:
			getTypeArguments().clear();
			getTypeArguments().addAll((Collection) newValue);
			return;
		case DatatypePackage.PARAMETERIZED_TYPE__TYPE:
			setType((TypeDeclaration) newValue);
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
		case DatatypePackage.PARAMETERIZED_TYPE__TYPE_ARGUMENTS:
			getTypeArguments().clear();
			return;
		case DatatypePackage.PARAMETERIZED_TYPE__TYPE:
			setType((TypeDeclaration) null);
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
		case DatatypePackage.PARAMETERIZED_TYPE__TYPE_ARGUMENTS:
			return typeArguments != null && !typeArguments.isEmpty();
		case DatatypePackage.PARAMETERIZED_TYPE__TYPE:
			return type != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterizedTypeImpl
