/**
 */
package ccsl.elements.namedElements.complexType.impl;

import ccsl.CollectionKind;

import ccsl.elements.namedElements.complexType.ComplexType;
import ccsl.elements.namedElements.complexType.ComplexTypeDeclaration;
import ccsl.elements.namedElements.complexType.ComplexTypePackage;
import ccsl.elements.namedElements.complexType.JInterface;

import ccsl.elements.namedElements.method.Method;

import ccsl.elements.namedElements.variable.FieldVariable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.complexType.impl.ComplexTypeDeclarationImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.complexType.impl.ComplexTypeDeclarationImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.complexType.impl.ComplexTypeDeclarationImpl#getFieldsKind <em>Fields Kind</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.complexType.impl.ComplexTypeDeclarationImpl#getMethodsKind <em>Methods Kind</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.complexType.impl.ComplexTypeDeclarationImpl#getSuperInterfaces <em>Super Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexTypeDeclarationImpl extends TypeDeclarationImpl implements ComplexTypeDeclaration {
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList fields;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList methods;

	/**
	 * The default value of the '{@link #getFieldsKind() <em>Fields Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldsKind()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionKind FIELDS_KIND_EDEFAULT = CollectionKind.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getFieldsKind() <em>Fields Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldsKind()
	 * @generated
	 * @ordered
	 */
	protected CollectionKind fieldsKind = FIELDS_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodsKind() <em>Methods Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodsKind()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionKind METHODS_KIND_EDEFAULT = CollectionKind.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getMethodsKind() <em>Methods Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodsKind()
	 * @generated
	 * @ordered
	 */
	protected CollectionKind methodsKind = METHODS_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperInterfaces() <em>Super Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList superInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexTypeDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ComplexTypePackage.Literals.COMPLEX_TYPE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList.Unsettable(FieldVariable.class, this,
					ComplexTypePackage.COMPLEX_TYPE_DECLARATION__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFields() {
		if (fields != null)
			((InternalEList.Unsettable) fields).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFields() {
		return fields != null && ((InternalEList.Unsettable) fields).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList.Unsettable(Method.class, this,
					ComplexTypePackage.COMPLEX_TYPE_DECLARATION__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMethods() {
		if (methods != null)
			((InternalEList.Unsettable) methods).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMethods() {
		return methods != null && ((InternalEList.Unsettable) methods).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKind getFieldsKind() {
		return fieldsKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldsKind(CollectionKind newFieldsKind) {
		CollectionKind oldFieldsKind = fieldsKind;
		fieldsKind = newFieldsKind == null ? FIELDS_KIND_EDEFAULT : newFieldsKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComplexTypePackage.COMPLEX_TYPE_DECLARATION__FIELDS_KIND, oldFieldsKind, fieldsKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKind getMethodsKind() {
		return methodsKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodsKind(CollectionKind newMethodsKind) {
		CollectionKind oldMethodsKind = methodsKind;
		methodsKind = newMethodsKind == null ? METHODS_KIND_EDEFAULT : newMethodsKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComplexTypePackage.COMPLEX_TYPE_DECLARATION__METHODS_KIND, oldMethodsKind, methodsKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSuperInterfaces() {
		if (superInterfaces == null) {
			superInterfaces = new EObjectResolvingEList.Unsettable(JInterface.class, this,
					ComplexTypePackage.COMPLEX_TYPE_DECLARATION__SUPER_INTERFACES);
		}
		return superInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSuperInterfaces() {
		if (superInterfaces != null)
			((InternalEList.Unsettable) superInterfaces).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuperInterfaces() {
		return superInterfaces != null && ((InternalEList.Unsettable) superInterfaces).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__FIELDS:
			return ((InternalEList) getFields()).basicRemove(otherEnd, msgs);
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__METHODS:
			return ((InternalEList) getMethods()).basicRemove(otherEnd, msgs);
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
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__FIELDS:
			return getFields();
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__METHODS:
			return getMethods();
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__FIELDS_KIND:
			return getFieldsKind();
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__METHODS_KIND:
			return getMethodsKind();
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__SUPER_INTERFACES:
			return getSuperInterfaces();
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
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__FIELDS:
			getFields().clear();
			getFields().addAll((Collection) newValue);
			return;
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__METHODS:
			getMethods().clear();
			getMethods().addAll((Collection) newValue);
			return;
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__FIELDS_KIND:
			setFieldsKind((CollectionKind) newValue);
			return;
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__METHODS_KIND:
			setMethodsKind((CollectionKind) newValue);
			return;
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__SUPER_INTERFACES:
			getSuperInterfaces().clear();
			getSuperInterfaces().addAll((Collection) newValue);
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
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__FIELDS:
			unsetFields();
			return;
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__METHODS:
			unsetMethods();
			return;
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__FIELDS_KIND:
			setFieldsKind(FIELDS_KIND_EDEFAULT);
			return;
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__METHODS_KIND:
			setMethodsKind(METHODS_KIND_EDEFAULT);
			return;
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__SUPER_INTERFACES:
			unsetSuperInterfaces();
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
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__FIELDS:
			return isSetFields();
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__METHODS:
			return isSetMethods();
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__FIELDS_KIND:
			return fieldsKind != FIELDS_KIND_EDEFAULT;
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__METHODS_KIND:
			return methodsKind != METHODS_KIND_EDEFAULT;
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__SUPER_INTERFACES:
			return isSetSuperInterfaces();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ComplexType.class) {
			switch (derivedFeatureID) {
			case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__FIELDS:
				return ComplexTypePackage.COMPLEX_TYPE__FIELDS;
			case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__METHODS:
				return ComplexTypePackage.COMPLEX_TYPE__METHODS;
			case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__FIELDS_KIND:
				return ComplexTypePackage.COMPLEX_TYPE__FIELDS_KIND;
			case ComplexTypePackage.COMPLEX_TYPE_DECLARATION__METHODS_KIND:
				return ComplexTypePackage.COMPLEX_TYPE__METHODS_KIND;
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
		if (baseClass == ComplexType.class) {
			switch (baseFeatureID) {
			case ComplexTypePackage.COMPLEX_TYPE__FIELDS:
				return ComplexTypePackage.COMPLEX_TYPE_DECLARATION__FIELDS;
			case ComplexTypePackage.COMPLEX_TYPE__METHODS:
				return ComplexTypePackage.COMPLEX_TYPE_DECLARATION__METHODS;
			case ComplexTypePackage.COMPLEX_TYPE__FIELDS_KIND:
				return ComplexTypePackage.COMPLEX_TYPE_DECLARATION__FIELDS_KIND;
			case ComplexTypePackage.COMPLEX_TYPE__METHODS_KIND:
				return ComplexTypePackage.COMPLEX_TYPE_DECLARATION__METHODS_KIND;
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
		result.append(" (fieldsKind: ");
		result.append(fieldsKind);
		result.append(", methodsKind: ");
		result.append(methodsKind);
		result.append(')');
		return result.toString();
	}

} //ComplexTypeDeclarationImpl
