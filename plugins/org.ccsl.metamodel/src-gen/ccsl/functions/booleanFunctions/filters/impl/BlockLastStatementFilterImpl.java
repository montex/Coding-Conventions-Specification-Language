/**
 */
package ccsl.functions.booleanFunctions.filters.impl;

import ccsl.context.Context;

import ccsl.elements.statements.Statement;

import ccsl.functions.booleanFunctions.filters.BlockLastStatementFilter;
import ccsl.functions.booleanFunctions.filters.FiltersPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Last Statement Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.BlockLastStatementFilterImpl#getLastStatement <em>Last Statement</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.BlockLastStatementFilterImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockLastStatementFilterImpl extends AtomicFilterImpl implements BlockLastStatementFilter {
	/**
	 * The cached value of the '{@link #getLastStatement() <em>Last Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement lastStatement;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockLastStatementFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FiltersPackage.Literals.BLOCK_LAST_STATEMENT_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getLastStatement() {
		if (lastStatement != null && lastStatement.eIsProxy()) {
			InternalEObject oldLastStatement = (InternalEObject) lastStatement;
			lastStatement = (Statement) eResolveProxy(oldLastStatement);
			if (lastStatement != oldLastStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FiltersPackage.BLOCK_LAST_STATEMENT_FILTER__LAST_STATEMENT, oldLastStatement,
							lastStatement));
			}
		}
		return lastStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement basicGetLastStatement() {
		return lastStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastStatement(Statement newLastStatement) {
		Statement oldLastStatement = lastStatement;
		lastStatement = newLastStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FiltersPackage.BLOCK_LAST_STATEMENT_FILTER__LAST_STATEMENT, oldLastStatement, lastStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Context newContext, NotificationChain msgs) {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FiltersPackage.BLOCK_LAST_STATEMENT_FILTER__CONTEXT, oldContext, newContext);
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
	public void setContext(Context newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject) context).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FiltersPackage.BLOCK_LAST_STATEMENT_FILTER__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject) newContext).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FiltersPackage.BLOCK_LAST_STATEMENT_FILTER__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.BLOCK_LAST_STATEMENT_FILTER__CONTEXT,
					newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FiltersPackage.BLOCK_LAST_STATEMENT_FILTER__CONTEXT:
			return basicSetContext(null, msgs);
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
		case FiltersPackage.BLOCK_LAST_STATEMENT_FILTER__LAST_STATEMENT:
			if (resolve)
				return getLastStatement();
			return basicGetLastStatement();
		case FiltersPackage.BLOCK_LAST_STATEMENT_FILTER__CONTEXT:
			return getContext();
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
		case FiltersPackage.BLOCK_LAST_STATEMENT_FILTER__LAST_STATEMENT:
			setLastStatement((Statement) newValue);
			return;
		case FiltersPackage.BLOCK_LAST_STATEMENT_FILTER__CONTEXT:
			setContext((Context) newValue);
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
		case FiltersPackage.BLOCK_LAST_STATEMENT_FILTER__LAST_STATEMENT:
			setLastStatement((Statement) null);
			return;
		case FiltersPackage.BLOCK_LAST_STATEMENT_FILTER__CONTEXT:
			setContext((Context) null);
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
		case FiltersPackage.BLOCK_LAST_STATEMENT_FILTER__LAST_STATEMENT:
			return lastStatement != null;
		case FiltersPackage.BLOCK_LAST_STATEMENT_FILTER__CONTEXT:
			return context != null;
		}
		return super.eIsSet(featureID);
	}

} //BlockLastStatementFilterImpl
