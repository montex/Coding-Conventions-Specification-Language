/**
 */
package ccsl.elements.statements.impl;

import ccsl.elements.statements.Statement;
import ccsl.elements.statements.StatementsPackage;
import ccsl.elements.statements.SynchronizedBlock;

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
 * An implementation of the model object '<em><b>Synchronized Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.impl.SynchronizedBlockImpl#getBodyStatements <em>Body Statements</em>}</li>
 *   <li>{@link ccsl.elements.statements.impl.SynchronizedBlockImpl#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchronizedBlockImpl extends StatementImpl implements SynchronizedBlock {
	/**
	 * The cached value of the '{@link #getBodyStatements() <em>Body Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyStatements()
	 * @generated
	 * @ordered
	 */
	protected EList bodyStatements;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Statement key;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizedBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.SYNCHRONIZED_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBodyStatements() {
		if (bodyStatements == null) {
			bodyStatements = new EObjectContainmentEList(Statement.class, this,
					StatementsPackage.SYNCHRONIZED_BLOCK__BODY_STATEMENTS);
		}
		return bodyStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey(Statement newKey, NotificationChain msgs) {
		Statement oldKey = key;
		key = newKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatementsPackage.SYNCHRONIZED_BLOCK__KEY, oldKey, newKey);
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
	public void setKey(Statement newKey) {
		if (newKey != key) {
			NotificationChain msgs = null;
			if (key != null)
				msgs = ((InternalEObject) key).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatementsPackage.SYNCHRONIZED_BLOCK__KEY, null, msgs);
			if (newKey != null)
				msgs = ((InternalEObject) newKey).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatementsPackage.SYNCHRONIZED_BLOCK__KEY, null, msgs);
			msgs = basicSetKey(newKey, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.SYNCHRONIZED_BLOCK__KEY, newKey,
					newKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatementsPackage.SYNCHRONIZED_BLOCK__BODY_STATEMENTS:
			return ((InternalEList) getBodyStatements()).basicRemove(otherEnd, msgs);
		case StatementsPackage.SYNCHRONIZED_BLOCK__KEY:
			return basicSetKey(null, msgs);
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
		case StatementsPackage.SYNCHRONIZED_BLOCK__BODY_STATEMENTS:
			return getBodyStatements();
		case StatementsPackage.SYNCHRONIZED_BLOCK__KEY:
			return getKey();
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
		case StatementsPackage.SYNCHRONIZED_BLOCK__BODY_STATEMENTS:
			getBodyStatements().clear();
			getBodyStatements().addAll((Collection) newValue);
			return;
		case StatementsPackage.SYNCHRONIZED_BLOCK__KEY:
			setKey((Statement) newValue);
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
		case StatementsPackage.SYNCHRONIZED_BLOCK__BODY_STATEMENTS:
			getBodyStatements().clear();
			return;
		case StatementsPackage.SYNCHRONIZED_BLOCK__KEY:
			setKey((Statement) null);
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
		case StatementsPackage.SYNCHRONIZED_BLOCK__BODY_STATEMENTS:
			return bodyStatements != null && !bodyStatements.isEmpty();
		case StatementsPackage.SYNCHRONIZED_BLOCK__KEY:
			return key != null;
		}
		return super.eIsSet(featureID);
	}

} //SynchronizedBlockImpl
