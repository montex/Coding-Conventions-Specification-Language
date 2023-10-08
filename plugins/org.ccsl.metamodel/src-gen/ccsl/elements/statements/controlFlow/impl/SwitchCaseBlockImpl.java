/**
 */
package ccsl.elements.statements.controlFlow.impl;

import ccsl.elements.expressions.Expression;

import ccsl.elements.statements.controlFlow.ControlFlowPackage;
import ccsl.elements.statements.controlFlow.SwitchCaseBlock;

import ccsl.elements.statements.impl.BlockImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Case Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.controlFlow.impl.SwitchCaseBlockImpl#isDefault <em>Default</em>}</li>
 *   <li>{@link ccsl.elements.statements.controlFlow.impl.SwitchCaseBlockImpl#getCaseExpression <em>Case Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchCaseBlockImpl extends BlockImpl implements SwitchCaseBlock {
	/**
	 * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean default_ = DEFAULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCaseExpression() <em>Case Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression caseExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchCaseBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ControlFlowPackage.Literals.SWITCH_CASE_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(boolean newDefault) {
		boolean oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlFlowPackage.SWITCH_CASE_BLOCK__DEFAULT,
					oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCaseExpression() {
		return caseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseExpression(Expression newCaseExpression, NotificationChain msgs) {
		Expression oldCaseExpression = caseExpression;
		caseExpression = newCaseExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ControlFlowPackage.SWITCH_CASE_BLOCK__CASE_EXPRESSION, oldCaseExpression, newCaseExpression);
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
	public void setCaseExpression(Expression newCaseExpression) {
		if (newCaseExpression != caseExpression) {
			NotificationChain msgs = null;
			if (caseExpression != null)
				msgs = ((InternalEObject) caseExpression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ControlFlowPackage.SWITCH_CASE_BLOCK__CASE_EXPRESSION, null, msgs);
			if (newCaseExpression != null)
				msgs = ((InternalEObject) newCaseExpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ControlFlowPackage.SWITCH_CASE_BLOCK__CASE_EXPRESSION, null, msgs);
			msgs = basicSetCaseExpression(newCaseExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlFlowPackage.SWITCH_CASE_BLOCK__CASE_EXPRESSION,
					newCaseExpression, newCaseExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ControlFlowPackage.SWITCH_CASE_BLOCK__CASE_EXPRESSION:
			return basicSetCaseExpression(null, msgs);
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
		case ControlFlowPackage.SWITCH_CASE_BLOCK__DEFAULT:
			return isDefault() ? Boolean.TRUE : Boolean.FALSE;
		case ControlFlowPackage.SWITCH_CASE_BLOCK__CASE_EXPRESSION:
			return getCaseExpression();
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
		case ControlFlowPackage.SWITCH_CASE_BLOCK__DEFAULT:
			setDefault(((Boolean) newValue).booleanValue());
			return;
		case ControlFlowPackage.SWITCH_CASE_BLOCK__CASE_EXPRESSION:
			setCaseExpression((Expression) newValue);
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
		case ControlFlowPackage.SWITCH_CASE_BLOCK__DEFAULT:
			setDefault(DEFAULT_EDEFAULT);
			return;
		case ControlFlowPackage.SWITCH_CASE_BLOCK__CASE_EXPRESSION:
			setCaseExpression((Expression) null);
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
		case ControlFlowPackage.SWITCH_CASE_BLOCK__DEFAULT:
			return default_ != DEFAULT_EDEFAULT;
		case ControlFlowPackage.SWITCH_CASE_BLOCK__CASE_EXPRESSION:
			return caseExpression != null;
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
		result.append(" (default: ");
		result.append(default_);
		result.append(')');
		return result.toString();
	}

} //SwitchCaseBlockImpl
