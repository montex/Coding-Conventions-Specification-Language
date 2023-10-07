/**
 */
package ccsl.elements.expressions.annotation.impl;

import ccsl.elements.expressions.Expression;

import ccsl.elements.expressions.annotation.AnnotationFieldValue;
import ccsl.elements.expressions.annotation.AnnotationPackage;

import ccsl.elements.impl.ElementImpl;

import ccsl.elements.namedElements.complexType.AnnotationField;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.annotation.impl.AnnotationFieldValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link ccsl.elements.expressions.annotation.impl.AnnotationFieldValueImpl#getField <em>Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationFieldValueImpl extends ElementImpl implements AnnotationFieldValue {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Expression value;

	/**
	 * This is true if the Value containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected AnnotationField field;

	/**
	 * This is true if the Field reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fieldESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationFieldValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AnnotationPackage.Literals.ANNOTATION_FIELD_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs) {
		Expression oldValue = value;
		value = newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AnnotationPackage.ANNOTATION_FIELD_VALUE__VALUE, oldValue, newValue, !oldValueESet);
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
	public void setValue(Expression newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AnnotationPackage.ANNOTATION_FIELD_VALUE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AnnotationPackage.ANNOTATION_FIELD_VALUE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldValueESet = valueESet;
			valueESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, AnnotationPackage.ANNOTATION_FIELD_VALUE__VALUE,
						newValue, newValue, !oldValueESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetValue(NotificationChain msgs) {
		Expression oldValue = value;
		value = null;
		boolean oldValueESet = valueESet;
		valueESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET,
					AnnotationPackage.ANNOTATION_FIELD_VALUE__VALUE, oldValue, null, oldValueESet);
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
	public void unsetValue() {
		if (value != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject) value).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - AnnotationPackage.ANNOTATION_FIELD_VALUE__VALUE, null, msgs);
			msgs = basicUnsetValue(msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldValueESet = valueESet;
			valueESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, AnnotationPackage.ANNOTATION_FIELD_VALUE__VALUE,
						null, null, oldValueESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationField getField() {
		if (field != null && field.eIsProxy()) {
			InternalEObject oldField = (InternalEObject) field;
			field = (AnnotationField) eResolveProxy(oldField);
			if (field != oldField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AnnotationPackage.ANNOTATION_FIELD_VALUE__FIELD, oldField, field));
			}
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationField basicGetField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField(AnnotationField newField) {
		AnnotationField oldField = field;
		field = newField;
		boolean oldFieldESet = fieldESet;
		fieldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationPackage.ANNOTATION_FIELD_VALUE__FIELD,
					oldField, field, !oldFieldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetField() {
		AnnotationField oldField = field;
		boolean oldFieldESet = fieldESet;
		field = null;
		fieldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnnotationPackage.ANNOTATION_FIELD_VALUE__FIELD,
					oldField, null, oldFieldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetField() {
		return fieldESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AnnotationPackage.ANNOTATION_FIELD_VALUE__VALUE:
			return basicUnsetValue(msgs);
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
		case AnnotationPackage.ANNOTATION_FIELD_VALUE__VALUE:
			return getValue();
		case AnnotationPackage.ANNOTATION_FIELD_VALUE__FIELD:
			if (resolve)
				return getField();
			return basicGetField();
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
		case AnnotationPackage.ANNOTATION_FIELD_VALUE__VALUE:
			setValue((Expression) newValue);
			return;
		case AnnotationPackage.ANNOTATION_FIELD_VALUE__FIELD:
			setField((AnnotationField) newValue);
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
		case AnnotationPackage.ANNOTATION_FIELD_VALUE__VALUE:
			unsetValue();
			return;
		case AnnotationPackage.ANNOTATION_FIELD_VALUE__FIELD:
			unsetField();
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
		case AnnotationPackage.ANNOTATION_FIELD_VALUE__VALUE:
			return isSetValue();
		case AnnotationPackage.ANNOTATION_FIELD_VALUE__FIELD:
			return isSetField();
		}
		return super.eIsSet(featureID);
	}

} //AnnotationFieldValueImpl
