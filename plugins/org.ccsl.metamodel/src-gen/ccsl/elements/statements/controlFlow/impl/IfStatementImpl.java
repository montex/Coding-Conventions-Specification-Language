/**
 */
package ccsl.elements.statements.controlFlow.impl;

import ccsl.elements.statements.Statement;

import ccsl.elements.statements.controlFlow.ControlFlowPackage;
import ccsl.elements.statements.controlFlow.IfStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.controlFlow.impl.IfStatementImpl#getThenStatement <em>Then Statement</em>}</li>
 *   <li>{@link ccsl.elements.statements.controlFlow.impl.IfStatementImpl#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatementImpl extends ConditionalControlFlowStatementImpl implements IfStatement {
	/**
	 * The cached value of the '{@link #getThenStatement() <em>Then Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement thenStatement;

	/**
	 * This is true if the Then Statement containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thenStatementESet;

	/**
	 * The cached value of the '{@link #getElseStatement() <em>Else Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement elseStatement;

	/**
	 * This is true if the Else Statement containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elseStatementESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ControlFlowPackage.Literals.IF_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getThenStatement() {
		return thenStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThenStatement(Statement newThenStatement, NotificationChain msgs) {
		Statement oldThenStatement = thenStatement;
		thenStatement = newThenStatement;
		boolean oldThenStatementESet = thenStatementESet;
		thenStatementESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ControlFlowPackage.IF_STATEMENT__THEN_STATEMENT, oldThenStatement, newThenStatement,
					!oldThenStatementESet);
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
	public void setThenStatement(Statement newThenStatement) {
		if (newThenStatement != thenStatement) {
			NotificationChain msgs = null;
			if (thenStatement != null)
				msgs = ((InternalEObject) thenStatement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ControlFlowPackage.IF_STATEMENT__THEN_STATEMENT, null, msgs);
			if (newThenStatement != null)
				msgs = ((InternalEObject) newThenStatement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ControlFlowPackage.IF_STATEMENT__THEN_STATEMENT, null, msgs);
			msgs = basicSetThenStatement(newThenStatement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldThenStatementESet = thenStatementESet;
			thenStatementESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ControlFlowPackage.IF_STATEMENT__THEN_STATEMENT,
						newThenStatement, newThenStatement, !oldThenStatementESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetThenStatement(NotificationChain msgs) {
		Statement oldThenStatement = thenStatement;
		thenStatement = null;
		boolean oldThenStatementESet = thenStatementESet;
		thenStatementESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET,
					ControlFlowPackage.IF_STATEMENT__THEN_STATEMENT, oldThenStatement, null, oldThenStatementESet);
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
	public void unsetThenStatement() {
		if (thenStatement != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject) thenStatement).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - ControlFlowPackage.IF_STATEMENT__THEN_STATEMENT, null, msgs);
			msgs = basicUnsetThenStatement(msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldThenStatementESet = thenStatementESet;
			thenStatementESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, ControlFlowPackage.IF_STATEMENT__THEN_STATEMENT,
						null, null, oldThenStatementESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThenStatement() {
		return thenStatementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getElseStatement() {
		return elseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseStatement(Statement newElseStatement, NotificationChain msgs) {
		Statement oldElseStatement = elseStatement;
		elseStatement = newElseStatement;
		boolean oldElseStatementESet = elseStatementESet;
		elseStatementESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ControlFlowPackage.IF_STATEMENT__ELSE_STATEMENT, oldElseStatement, newElseStatement,
					!oldElseStatementESet);
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
	public void setElseStatement(Statement newElseStatement) {
		if (newElseStatement != elseStatement) {
			NotificationChain msgs = null;
			if (elseStatement != null)
				msgs = ((InternalEObject) elseStatement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ControlFlowPackage.IF_STATEMENT__ELSE_STATEMENT, null, msgs);
			if (newElseStatement != null)
				msgs = ((InternalEObject) newElseStatement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ControlFlowPackage.IF_STATEMENT__ELSE_STATEMENT, null, msgs);
			msgs = basicSetElseStatement(newElseStatement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldElseStatementESet = elseStatementESet;
			elseStatementESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ControlFlowPackage.IF_STATEMENT__ELSE_STATEMENT,
						newElseStatement, newElseStatement, !oldElseStatementESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetElseStatement(NotificationChain msgs) {
		Statement oldElseStatement = elseStatement;
		elseStatement = null;
		boolean oldElseStatementESet = elseStatementESet;
		elseStatementESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET,
					ControlFlowPackage.IF_STATEMENT__ELSE_STATEMENT, oldElseStatement, null, oldElseStatementESet);
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
	public void unsetElseStatement() {
		if (elseStatement != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject) elseStatement).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - ControlFlowPackage.IF_STATEMENT__ELSE_STATEMENT, null, msgs);
			msgs = basicUnsetElseStatement(msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldElseStatementESet = elseStatementESet;
			elseStatementESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, ControlFlowPackage.IF_STATEMENT__ELSE_STATEMENT,
						null, null, oldElseStatementESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElseStatement() {
		return elseStatementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ControlFlowPackage.IF_STATEMENT__THEN_STATEMENT:
			return basicUnsetThenStatement(msgs);
		case ControlFlowPackage.IF_STATEMENT__ELSE_STATEMENT:
			return basicUnsetElseStatement(msgs);
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
		case ControlFlowPackage.IF_STATEMENT__THEN_STATEMENT:
			return getThenStatement();
		case ControlFlowPackage.IF_STATEMENT__ELSE_STATEMENT:
			return getElseStatement();
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
		case ControlFlowPackage.IF_STATEMENT__THEN_STATEMENT:
			setThenStatement((Statement) newValue);
			return;
		case ControlFlowPackage.IF_STATEMENT__ELSE_STATEMENT:
			setElseStatement((Statement) newValue);
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
		case ControlFlowPackage.IF_STATEMENT__THEN_STATEMENT:
			unsetThenStatement();
			return;
		case ControlFlowPackage.IF_STATEMENT__ELSE_STATEMENT:
			unsetElseStatement();
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
		case ControlFlowPackage.IF_STATEMENT__THEN_STATEMENT:
			return isSetThenStatement();
		case ControlFlowPackage.IF_STATEMENT__ELSE_STATEMENT:
			return isSetElseStatement();
		}
		return super.eIsSet(featureID);
	}

} //IfStatementImpl
