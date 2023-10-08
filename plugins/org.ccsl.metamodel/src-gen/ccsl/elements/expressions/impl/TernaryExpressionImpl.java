/**
 */
package ccsl.elements.expressions.impl;

import ccsl.elements.expressions.Expression;
import ccsl.elements.expressions.ExpressionsPackage;
import ccsl.elements.expressions.TernaryExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ternary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.impl.TernaryExpressionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link ccsl.elements.expressions.impl.TernaryExpressionImpl#getElseExpression <em>Else Expression</em>}</li>
 *   <li>{@link ccsl.elements.expressions.impl.TernaryExpressionImpl#getThenExpression <em>Then Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TernaryExpressionImpl extends ExpressionImpl implements TernaryExpression {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getElseExpression() <em>Else Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression elseExpression;

	/**
	 * The cached value of the '{@link #getThenExpression() <em>Then Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression thenExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TernaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.TERNARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ExpressionsPackage.TERNARY_EXPRESSION__CONDITION, oldCondition, newCondition);
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
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ExpressionsPackage.TERNARY_EXPRESSION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ExpressionsPackage.TERNARY_EXPRESSION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TERNARY_EXPRESSION__CONDITION,
					newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getElseExpression() {
		return elseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseExpression(Expression newElseExpression, NotificationChain msgs) {
		Expression oldElseExpression = elseExpression;
		elseExpression = newElseExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ExpressionsPackage.TERNARY_EXPRESSION__ELSE_EXPRESSION, oldElseExpression, newElseExpression);
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
	public void setElseExpression(Expression newElseExpression) {
		if (newElseExpression != elseExpression) {
			NotificationChain msgs = null;
			if (elseExpression != null)
				msgs = ((InternalEObject) elseExpression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ExpressionsPackage.TERNARY_EXPRESSION__ELSE_EXPRESSION, null, msgs);
			if (newElseExpression != null)
				msgs = ((InternalEObject) newElseExpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ExpressionsPackage.TERNARY_EXPRESSION__ELSE_EXPRESSION, null, msgs);
			msgs = basicSetElseExpression(newElseExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExpressionsPackage.TERNARY_EXPRESSION__ELSE_EXPRESSION, newElseExpression, newElseExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getThenExpression() {
		return thenExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThenExpression(Expression newThenExpression, NotificationChain msgs) {
		Expression oldThenExpression = thenExpression;
		thenExpression = newThenExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ExpressionsPackage.TERNARY_EXPRESSION__THEN_EXPRESSION, oldThenExpression, newThenExpression);
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
	public void setThenExpression(Expression newThenExpression) {
		if (newThenExpression != thenExpression) {
			NotificationChain msgs = null;
			if (thenExpression != null)
				msgs = ((InternalEObject) thenExpression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ExpressionsPackage.TERNARY_EXPRESSION__THEN_EXPRESSION, null, msgs);
			if (newThenExpression != null)
				msgs = ((InternalEObject) newThenExpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ExpressionsPackage.TERNARY_EXPRESSION__THEN_EXPRESSION, null, msgs);
			msgs = basicSetThenExpression(newThenExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExpressionsPackage.TERNARY_EXPRESSION__THEN_EXPRESSION, newThenExpression, newThenExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExpressionsPackage.TERNARY_EXPRESSION__CONDITION:
			return basicSetCondition(null, msgs);
		case ExpressionsPackage.TERNARY_EXPRESSION__ELSE_EXPRESSION:
			return basicSetElseExpression(null, msgs);
		case ExpressionsPackage.TERNARY_EXPRESSION__THEN_EXPRESSION:
			return basicSetThenExpression(null, msgs);
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
		case ExpressionsPackage.TERNARY_EXPRESSION__CONDITION:
			return getCondition();
		case ExpressionsPackage.TERNARY_EXPRESSION__ELSE_EXPRESSION:
			return getElseExpression();
		case ExpressionsPackage.TERNARY_EXPRESSION__THEN_EXPRESSION:
			return getThenExpression();
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
		case ExpressionsPackage.TERNARY_EXPRESSION__CONDITION:
			setCondition((Expression) newValue);
			return;
		case ExpressionsPackage.TERNARY_EXPRESSION__ELSE_EXPRESSION:
			setElseExpression((Expression) newValue);
			return;
		case ExpressionsPackage.TERNARY_EXPRESSION__THEN_EXPRESSION:
			setThenExpression((Expression) newValue);
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
		case ExpressionsPackage.TERNARY_EXPRESSION__CONDITION:
			setCondition((Expression) null);
			return;
		case ExpressionsPackage.TERNARY_EXPRESSION__ELSE_EXPRESSION:
			setElseExpression((Expression) null);
			return;
		case ExpressionsPackage.TERNARY_EXPRESSION__THEN_EXPRESSION:
			setThenExpression((Expression) null);
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
		case ExpressionsPackage.TERNARY_EXPRESSION__CONDITION:
			return condition != null;
		case ExpressionsPackage.TERNARY_EXPRESSION__ELSE_EXPRESSION:
			return elseExpression != null;
		case ExpressionsPackage.TERNARY_EXPRESSION__THEN_EXPRESSION:
			return thenExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //TernaryExpressionImpl
