/**
 */
package ccsl.elements.expressions.annotation.impl;

import ccsl.CollectionKind;

import ccsl.elements.expressions.annotation.Annotation;
import ccsl.elements.expressions.annotation.AnnotationFieldValue;
import ccsl.elements.expressions.annotation.AnnotationPackage;

import ccsl.elements.expressions.impl.ExpressionImpl;

import ccsl.elements.namedElements.complexType.AnnotationType;

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
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.annotation.impl.AnnotationImpl#getType <em>Type</em>}</li>
 *   <li>{@link ccsl.elements.expressions.annotation.impl.AnnotationImpl#getValues <em>Values</em>}</li>
 *   <li>{@link ccsl.elements.expressions.annotation.impl.AnnotationImpl#getValuesKind <em>Values Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationImpl extends ExpressionImpl implements Annotation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AnnotationType type;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList values;

	/**
	 * The default value of the '{@link #getValuesKind() <em>Values Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuesKind()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionKind VALUES_KIND_EDEFAULT = CollectionKind.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getValuesKind() <em>Values Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuesKind()
	 * @generated
	 * @ordered
	 */
	protected CollectionKind valuesKind = VALUES_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AnnotationPackage.Literals.ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (AnnotationType) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationPackage.ANNOTATION__TYPE,
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
	public AnnotationType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AnnotationType newType) {
		AnnotationType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationPackage.ANNOTATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getValues() {
		if (values == null) {
			values = new EObjectContainmentEList.Unsettable(AnnotationFieldValue.class, this,
					AnnotationPackage.ANNOTATION__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValues() {
		if (values != null)
			((InternalEList.Unsettable) values).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValues() {
		return values != null && ((InternalEList.Unsettable) values).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKind getValuesKind() {
		return valuesKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuesKind(CollectionKind newValuesKind) {
		CollectionKind oldValuesKind = valuesKind;
		valuesKind = newValuesKind == null ? VALUES_KIND_EDEFAULT : newValuesKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationPackage.ANNOTATION__VALUES_KIND,
					oldValuesKind, valuesKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AnnotationPackage.ANNOTATION__VALUES:
			return ((InternalEList) getValues()).basicRemove(otherEnd, msgs);
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
		case AnnotationPackage.ANNOTATION__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case AnnotationPackage.ANNOTATION__VALUES:
			return getValues();
		case AnnotationPackage.ANNOTATION__VALUES_KIND:
			return getValuesKind();
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
		case AnnotationPackage.ANNOTATION__TYPE:
			setType((AnnotationType) newValue);
			return;
		case AnnotationPackage.ANNOTATION__VALUES:
			getValues().clear();
			getValues().addAll((Collection) newValue);
			return;
		case AnnotationPackage.ANNOTATION__VALUES_KIND:
			setValuesKind((CollectionKind) newValue);
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
		case AnnotationPackage.ANNOTATION__TYPE:
			setType((AnnotationType) null);
			return;
		case AnnotationPackage.ANNOTATION__VALUES:
			unsetValues();
			return;
		case AnnotationPackage.ANNOTATION__VALUES_KIND:
			setValuesKind(VALUES_KIND_EDEFAULT);
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
		case AnnotationPackage.ANNOTATION__TYPE:
			return type != null;
		case AnnotationPackage.ANNOTATION__VALUES:
			return isSetValues();
		case AnnotationPackage.ANNOTATION__VALUES_KIND:
			return valuesKind != VALUES_KIND_EDEFAULT;
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
		result.append(" (valuesKind: ");
		result.append(valuesKind);
		result.append(')');
		return result.toString();
	}

} //AnnotationImpl
