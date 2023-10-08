/**
 */
package ccsl.elements.expressions.impl;

import ccsl.elements.datatype.ObjectType;

import ccsl.elements.expressions.Expression;
import ccsl.elements.expressions.ExpressionsPackage;
import ccsl.elements.expressions.InstanceofExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instanceof Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.impl.InstanceofExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link ccsl.elements.expressions.impl.InstanceofExpressionImpl#getObjectExpression <em>Object Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceofExpressionImpl extends ExpressionImpl implements InstanceofExpression {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ObjectType type;

	/**
	 * The cached value of the '{@link #getObjectExpression() <em>Object Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression objectExpression;

	/**
	 * This is true if the Object Expression containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean objectExpressionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceofExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.INSTANCEOF_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (ObjectType) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExpressionsPackage.INSTANCEOF_EXPRESSION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ObjectType newType) {
		ObjectType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.INSTANCEOF_EXPRESSION__TYPE,
					oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getObjectExpression() {
		return objectExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectExpression(Expression newObjectExpression, NotificationChain msgs) {
		Expression oldObjectExpression = objectExpression;
		objectExpression = newObjectExpression;
		boolean oldObjectExpressionESet = objectExpressionESet;
		objectExpressionESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ExpressionsPackage.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION, oldObjectExpression,
					newObjectExpression, !oldObjectExpressionESet);
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
	public void setObjectExpression(Expression newObjectExpression) {
		if (newObjectExpression != objectExpression) {
			NotificationChain msgs = null;
			if (objectExpression != null)
				msgs = ((InternalEObject) objectExpression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ExpressionsPackage.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION, null,
						msgs);
			if (newObjectExpression != null)
				msgs = ((InternalEObject) newObjectExpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ExpressionsPackage.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION, null,
						msgs);
			msgs = basicSetObjectExpression(newObjectExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldObjectExpressionESet = objectExpressionESet;
			objectExpressionESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET,
						ExpressionsPackage.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION, newObjectExpression,
						newObjectExpression, !oldObjectExpressionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetObjectExpression(NotificationChain msgs) {
		Expression oldObjectExpression = objectExpression;
		objectExpression = null;
		boolean oldObjectExpressionESet = objectExpressionESet;
		objectExpressionESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET,
					ExpressionsPackage.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION, oldObjectExpression, null,
					oldObjectExpressionESet);
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
	public void unsetObjectExpression() {
		if (objectExpression != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject) objectExpression).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - ExpressionsPackage.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION, null, msgs);
			msgs = basicUnsetObjectExpression(msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldObjectExpressionESet = objectExpressionESet;
			objectExpressionESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						ExpressionsPackage.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION, null, null,
						oldObjectExpressionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetObjectExpression() {
		return objectExpressionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExpressionsPackage.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION:
			return basicUnsetObjectExpression(msgs);
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
		case ExpressionsPackage.INSTANCEOF_EXPRESSION__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case ExpressionsPackage.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION:
			return getObjectExpression();
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
		case ExpressionsPackage.INSTANCEOF_EXPRESSION__TYPE:
			setType((ObjectType) newValue);
			return;
		case ExpressionsPackage.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION:
			setObjectExpression((Expression) newValue);
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
		case ExpressionsPackage.INSTANCEOF_EXPRESSION__TYPE:
			setType((ObjectType) null);
			return;
		case ExpressionsPackage.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION:
			unsetObjectExpression();
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
		case ExpressionsPackage.INSTANCEOF_EXPRESSION__TYPE:
			return type != null;
		case ExpressionsPackage.INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION:
			return isSetObjectExpression();
		}
		return super.eIsSet(featureID);
	}

} //InstanceofExpressionImpl
