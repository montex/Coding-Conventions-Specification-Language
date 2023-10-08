/**
 */
package ccsl.elements.statements.impl;

import ccsl.CollectionKind;

import ccsl.elements.statements.Block;
import ccsl.elements.statements.Statement;
import ccsl.elements.statements.StatementsPackage;

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
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.impl.BlockImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link ccsl.elements.statements.impl.BlockImpl#getStatementsKind <em>Statements Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockImpl extends StatementImpl implements Block {
	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList statements;

	/**
	 * The default value of the '{@link #getStatementsKind() <em>Statements Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementsKind()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionKind STATEMENTS_KIND_EDEFAULT = CollectionKind.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getStatementsKind() <em>Statements Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementsKind()
	 * @generated
	 * @ordered
	 */
	protected CollectionKind statementsKind = STATEMENTS_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList.Unsettable(Statement.class, this,
					StatementsPackage.BLOCK__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatements() {
		if (statements != null)
			((InternalEList.Unsettable) statements).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatements() {
		return statements != null && ((InternalEList.Unsettable) statements).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKind getStatementsKind() {
		return statementsKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatementsKind(CollectionKind newStatementsKind) {
		CollectionKind oldStatementsKind = statementsKind;
		statementsKind = newStatementsKind == null ? STATEMENTS_KIND_EDEFAULT : newStatementsKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.BLOCK__STATEMENTS_KIND,
					oldStatementsKind, statementsKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatementsPackage.BLOCK__STATEMENTS:
			return ((InternalEList) getStatements()).basicRemove(otherEnd, msgs);
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
		case StatementsPackage.BLOCK__STATEMENTS:
			return getStatements();
		case StatementsPackage.BLOCK__STATEMENTS_KIND:
			return getStatementsKind();
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
		case StatementsPackage.BLOCK__STATEMENTS:
			getStatements().clear();
			getStatements().addAll((Collection) newValue);
			return;
		case StatementsPackage.BLOCK__STATEMENTS_KIND:
			setStatementsKind((CollectionKind) newValue);
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
		case StatementsPackage.BLOCK__STATEMENTS:
			unsetStatements();
			return;
		case StatementsPackage.BLOCK__STATEMENTS_KIND:
			setStatementsKind(STATEMENTS_KIND_EDEFAULT);
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
		case StatementsPackage.BLOCK__STATEMENTS:
			return isSetStatements();
		case StatementsPackage.BLOCK__STATEMENTS_KIND:
			return statementsKind != STATEMENTS_KIND_EDEFAULT;
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
		result.append(" (statementsKind: ");
		result.append(statementsKind);
		result.append(')');
		return result.toString();
	}

} //BlockImpl
