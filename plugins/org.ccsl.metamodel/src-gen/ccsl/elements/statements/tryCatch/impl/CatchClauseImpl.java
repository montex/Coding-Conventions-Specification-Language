/**
 */
package ccsl.elements.statements.tryCatch.impl;

import ccsl.elements.namedElements.complexType.JClass;

import ccsl.elements.namedElements.variable.ParameterVariable;

import ccsl.elements.statements.Block;

import ccsl.elements.statements.impl.StatementImpl;

import ccsl.elements.statements.tryCatch.CatchClause;
import ccsl.elements.statements.tryCatch.TryCatchPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catch Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.tryCatch.impl.CatchClauseImpl#getBody <em>Body</em>}</li>
 *   <li>{@link ccsl.elements.statements.tryCatch.impl.CatchClauseImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link ccsl.elements.statements.tryCatch.impl.CatchClauseImpl#getHandledExceptions <em>Handled Exceptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatchClauseImpl extends StatementImpl implements CatchClause {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Block body;

	/**
	 * This is true if the Body containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bodyESet;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected ParameterVariable variable;

	/**
	 * This is true if the Variable containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean variableESet;

	/**
	 * The cached value of the '{@link #getHandledExceptions() <em>Handled Exceptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandledExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList handledExceptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatchClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TryCatchPackage.Literals.CATCH_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Block newBody, NotificationChain msgs) {
		Block oldBody = body;
		body = newBody;
		boolean oldBodyESet = bodyESet;
		bodyESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TryCatchPackage.CATCH_CLAUSE__BODY, oldBody, newBody, !oldBodyESet);
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
	public void setBody(Block newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject) body).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TryCatchPackage.CATCH_CLAUSE__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject) newBody).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TryCatchPackage.CATCH_CLAUSE__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldBodyESet = bodyESet;
			bodyESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TryCatchPackage.CATCH_CLAUSE__BODY, newBody,
						newBody, !oldBodyESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetBody(NotificationChain msgs) {
		Block oldBody = body;
		body = null;
		boolean oldBodyESet = bodyESet;
		bodyESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET,
					TryCatchPackage.CATCH_CLAUSE__BODY, oldBody, null, oldBodyESet);
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
	public void unsetBody() {
		if (body != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject) body).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - TryCatchPackage.CATCH_CLAUSE__BODY, null, msgs);
			msgs = basicUnsetBody(msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldBodyESet = bodyESet;
			bodyESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TryCatchPackage.CATCH_CLAUSE__BODY, null, null,
						oldBodyESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBody() {
		return bodyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterVariable getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(ParameterVariable newVariable, NotificationChain msgs) {
		ParameterVariable oldVariable = variable;
		variable = newVariable;
		boolean oldVariableESet = variableESet;
		variableESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TryCatchPackage.CATCH_CLAUSE__VARIABLE, oldVariable, newVariable, !oldVariableESet);
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
	public void setVariable(ParameterVariable newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject) variable).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TryCatchPackage.CATCH_CLAUSE__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject) newVariable).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TryCatchPackage.CATCH_CLAUSE__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldVariableESet = variableESet;
			variableESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, TryCatchPackage.CATCH_CLAUSE__VARIABLE,
						newVariable, newVariable, !oldVariableESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetVariable(NotificationChain msgs) {
		ParameterVariable oldVariable = variable;
		variable = null;
		boolean oldVariableESet = variableESet;
		variableESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET,
					TryCatchPackage.CATCH_CLAUSE__VARIABLE, oldVariable, null, oldVariableESet);
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
	public void unsetVariable() {
		if (variable != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject) variable).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - TryCatchPackage.CATCH_CLAUSE__VARIABLE, null, msgs);
			msgs = basicUnsetVariable(msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldVariableESet = variableESet;
			variableESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, TryCatchPackage.CATCH_CLAUSE__VARIABLE, null,
						null, oldVariableESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVariable() {
		return variableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHandledExceptions() {
		if (handledExceptions == null) {
			handledExceptions = new EObjectResolvingEList.Unsettable(JClass.class, this,
					TryCatchPackage.CATCH_CLAUSE__HANDLED_EXCEPTIONS);
		}
		return handledExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHandledExceptions() {
		if (handledExceptions != null)
			((InternalEList.Unsettable) handledExceptions).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHandledExceptions() {
		return handledExceptions != null && ((InternalEList.Unsettable) handledExceptions).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TryCatchPackage.CATCH_CLAUSE__BODY:
			return basicUnsetBody(msgs);
		case TryCatchPackage.CATCH_CLAUSE__VARIABLE:
			return basicUnsetVariable(msgs);
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
		case TryCatchPackage.CATCH_CLAUSE__BODY:
			return getBody();
		case TryCatchPackage.CATCH_CLAUSE__VARIABLE:
			return getVariable();
		case TryCatchPackage.CATCH_CLAUSE__HANDLED_EXCEPTIONS:
			return getHandledExceptions();
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
		case TryCatchPackage.CATCH_CLAUSE__BODY:
			setBody((Block) newValue);
			return;
		case TryCatchPackage.CATCH_CLAUSE__VARIABLE:
			setVariable((ParameterVariable) newValue);
			return;
		case TryCatchPackage.CATCH_CLAUSE__HANDLED_EXCEPTIONS:
			getHandledExceptions().clear();
			getHandledExceptions().addAll((Collection) newValue);
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
		case TryCatchPackage.CATCH_CLAUSE__BODY:
			unsetBody();
			return;
		case TryCatchPackage.CATCH_CLAUSE__VARIABLE:
			unsetVariable();
			return;
		case TryCatchPackage.CATCH_CLAUSE__HANDLED_EXCEPTIONS:
			unsetHandledExceptions();
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
		case TryCatchPackage.CATCH_CLAUSE__BODY:
			return isSetBody();
		case TryCatchPackage.CATCH_CLAUSE__VARIABLE:
			return isSetVariable();
		case TryCatchPackage.CATCH_CLAUSE__HANDLED_EXCEPTIONS:
			return isSetHandledExceptions();
		}
		return super.eIsSet(featureID);
	}

} //CatchClauseImpl
