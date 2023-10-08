/**
 */
package ccsl.elements.namedElements.complexType.impl;

import ccsl.elements.datatype.DataType;

import ccsl.elements.expressions.Expression;

import ccsl.elements.namedElements.complexType.AnnotationField;
import ccsl.elements.namedElements.complexType.ComplexTypePackage;

import ccsl.elements.namedElements.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.complexType.impl.AnnotationFieldImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.complexType.impl.AnnotationFieldImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationFieldImpl extends NamedElementImpl implements AnnotationField {
	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected Expression default_;

	/**
	 * This is true if the Default containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultESet;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataType type;

	/**
	 * This is true if the Type reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ComplexTypePackage.Literals.ANNOTATION_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefault(Expression newDefault, NotificationChain msgs) {
		Expression oldDefault = default_;
		default_ = newDefault;
		boolean oldDefaultESet = defaultESet;
		defaultESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ComplexTypePackage.ANNOTATION_FIELD__DEFAULT, oldDefault, newDefault, !oldDefaultESet);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(Expression newDefault) {
		if (newDefault != default_) {
			NotificationChain msgs = null;
			if (default_ != null)
				msgs = ((InternalEObject) default_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ComplexTypePackage.ANNOTATION_FIELD__DEFAULT, null, msgs);
			if (newDefault != null)
				msgs = ((InternalEObject) newDefault).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ComplexTypePackage.ANNOTATION_FIELD__DEFAULT, null, msgs);
			msgs = basicSetDefault(newDefault, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldDefaultESet = defaultESet;
			defaultESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ComplexTypePackage.ANNOTATION_FIELD__DEFAULT,
						newDefault, newDefault, !oldDefaultESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDefault(NotificationChain msgs) {
		Expression oldDefault = default_;
		default_ = null;
		boolean oldDefaultESet = defaultESet;
		defaultESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET,
					ComplexTypePackage.ANNOTATION_FIELD__DEFAULT, oldDefault, null, oldDefaultESet);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefault() {
		if (default_ != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject) default_).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - ComplexTypePackage.ANNOTATION_FIELD__DEFAULT, null, msgs);
			msgs = basicUnsetDefault(msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldDefaultESet = defaultESet;
			defaultESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, ComplexTypePackage.ANNOTATION_FIELD__DEFAULT,
						null, null, oldDefaultESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefault() {
		return defaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (DataType) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComplexTypePackage.ANNOTATION_FIELD__TYPE,
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
	public DataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataType newType) {
		DataType oldType = type;
		type = newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComplexTypePackage.ANNOTATION_FIELD__TYPE, oldType,
					type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		DataType oldType = type;
		boolean oldTypeESet = typeESet;
		type = null;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ComplexTypePackage.ANNOTATION_FIELD__TYPE, oldType,
					null, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComplexTypePackage.ANNOTATION_FIELD__DEFAULT:
			return basicUnsetDefault(msgs);
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
		case ComplexTypePackage.ANNOTATION_FIELD__DEFAULT:
			return getDefault();
		case ComplexTypePackage.ANNOTATION_FIELD__TYPE:
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
		case ComplexTypePackage.ANNOTATION_FIELD__DEFAULT:
			setDefault((Expression) newValue);
			return;
		case ComplexTypePackage.ANNOTATION_FIELD__TYPE:
			setType((DataType) newValue);
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
		case ComplexTypePackage.ANNOTATION_FIELD__DEFAULT:
			unsetDefault();
			return;
		case ComplexTypePackage.ANNOTATION_FIELD__TYPE:
			unsetType();
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
		case ComplexTypePackage.ANNOTATION_FIELD__DEFAULT:
			return isSetDefault();
		case ComplexTypePackage.ANNOTATION_FIELD__TYPE:
			return isSetType();
		}
		return super.eIsSet(featureID);
	}

} //AnnotationFieldImpl
