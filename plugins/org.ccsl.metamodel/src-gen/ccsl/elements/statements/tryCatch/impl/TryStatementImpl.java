/**
 */
package ccsl.elements.statements.tryCatch.impl;

import ccsl.CollectionKind;

import ccsl.elements.expressions.Expression;

import ccsl.elements.statements.Block;

import ccsl.elements.statements.impl.StatementImpl;

import ccsl.elements.statements.tryCatch.CatchClause;
import ccsl.elements.statements.tryCatch.TryCatchPackage;
import ccsl.elements.statements.tryCatch.TryStatement;

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
 * An implementation of the model object '<em><b>Try Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.tryCatch.impl.TryStatementImpl#getCatchClauses <em>Catch Clauses</em>}</li>
 *   <li>{@link ccsl.elements.statements.tryCatch.impl.TryStatementImpl#getFinallyBlock <em>Finally Block</em>}</li>
 *   <li>{@link ccsl.elements.statements.tryCatch.impl.TryStatementImpl#getCatchClausesKind <em>Catch Clauses Kind</em>}</li>
 *   <li>{@link ccsl.elements.statements.tryCatch.impl.TryStatementImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link ccsl.elements.statements.tryCatch.impl.TryStatementImpl#getResourcesKind <em>Resources Kind</em>}</li>
 *   <li>{@link ccsl.elements.statements.tryCatch.impl.TryStatementImpl#getTryBlock <em>Try Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TryStatementImpl extends StatementImpl implements TryStatement {
	/**
	 * The cached value of the '{@link #getCatchClauses() <em>Catch Clauses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchClauses()
	 * @generated
	 * @ordered
	 */
	protected EList catchClauses;

	/**
	 * The cached value of the '{@link #getFinallyBlock() <em>Finally Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinallyBlock()
	 * @generated
	 * @ordered
	 */
	protected Block finallyBlock;

	/**
	 * The default value of the '{@link #getCatchClausesKind() <em>Catch Clauses Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchClausesKind()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionKind CATCH_CLAUSES_KIND_EDEFAULT = CollectionKind.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getCatchClausesKind() <em>Catch Clauses Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchClausesKind()
	 * @generated
	 * @ordered
	 */
	protected CollectionKind catchClausesKind = CATCH_CLAUSES_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList resources;

	/**
	 * The default value of the '{@link #getResourcesKind() <em>Resources Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcesKind()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionKind RESOURCES_KIND_EDEFAULT = CollectionKind.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getResourcesKind() <em>Resources Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcesKind()
	 * @generated
	 * @ordered
	 */
	protected CollectionKind resourcesKind = RESOURCES_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTryBlock() <em>Try Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTryBlock()
	 * @generated
	 * @ordered
	 */
	protected Block tryBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TryStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TryCatchPackage.Literals.TRY_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCatchClauses() {
		if (catchClauses == null) {
			catchClauses = new EObjectContainmentEList(CatchClause.class, this,
					TryCatchPackage.TRY_STATEMENT__CATCH_CLAUSES);
		}
		return catchClauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getFinallyBlock() {
		return finallyBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinallyBlock(Block newFinallyBlock, NotificationChain msgs) {
		Block oldFinallyBlock = finallyBlock;
		finallyBlock = newFinallyBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TryCatchPackage.TRY_STATEMENT__FINALLY_BLOCK, oldFinallyBlock, newFinallyBlock);
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
	public void setFinallyBlock(Block newFinallyBlock) {
		if (newFinallyBlock != finallyBlock) {
			NotificationChain msgs = null;
			if (finallyBlock != null)
				msgs = ((InternalEObject) finallyBlock).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TryCatchPackage.TRY_STATEMENT__FINALLY_BLOCK, null, msgs);
			if (newFinallyBlock != null)
				msgs = ((InternalEObject) newFinallyBlock).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TryCatchPackage.TRY_STATEMENT__FINALLY_BLOCK, null, msgs);
			msgs = basicSetFinallyBlock(newFinallyBlock, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TryCatchPackage.TRY_STATEMENT__FINALLY_BLOCK,
					newFinallyBlock, newFinallyBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKind getCatchClausesKind() {
		return catchClausesKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatchClausesKind(CollectionKind newCatchClausesKind) {
		CollectionKind oldCatchClausesKind = catchClausesKind;
		catchClausesKind = newCatchClausesKind == null ? CATCH_CLAUSES_KIND_EDEFAULT : newCatchClausesKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TryCatchPackage.TRY_STATEMENT__CATCH_CLAUSES_KIND,
					oldCatchClausesKind, catchClausesKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList(Expression.class, this, TryCatchPackage.TRY_STATEMENT__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKind getResourcesKind() {
		return resourcesKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourcesKind(CollectionKind newResourcesKind) {
		CollectionKind oldResourcesKind = resourcesKind;
		resourcesKind = newResourcesKind == null ? RESOURCES_KIND_EDEFAULT : newResourcesKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TryCatchPackage.TRY_STATEMENT__RESOURCES_KIND,
					oldResourcesKind, resourcesKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getTryBlock() {
		return tryBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTryBlock(Block newTryBlock, NotificationChain msgs) {
		Block oldTryBlock = tryBlock;
		tryBlock = newTryBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TryCatchPackage.TRY_STATEMENT__TRY_BLOCK, oldTryBlock, newTryBlock);
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
	public void setTryBlock(Block newTryBlock) {
		if (newTryBlock != tryBlock) {
			NotificationChain msgs = null;
			if (tryBlock != null)
				msgs = ((InternalEObject) tryBlock).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TryCatchPackage.TRY_STATEMENT__TRY_BLOCK, null, msgs);
			if (newTryBlock != null)
				msgs = ((InternalEObject) newTryBlock).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TryCatchPackage.TRY_STATEMENT__TRY_BLOCK, null, msgs);
			msgs = basicSetTryBlock(newTryBlock, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TryCatchPackage.TRY_STATEMENT__TRY_BLOCK, newTryBlock,
					newTryBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TryCatchPackage.TRY_STATEMENT__CATCH_CLAUSES:
			return ((InternalEList) getCatchClauses()).basicRemove(otherEnd, msgs);
		case TryCatchPackage.TRY_STATEMENT__FINALLY_BLOCK:
			return basicSetFinallyBlock(null, msgs);
		case TryCatchPackage.TRY_STATEMENT__RESOURCES:
			return ((InternalEList) getResources()).basicRemove(otherEnd, msgs);
		case TryCatchPackage.TRY_STATEMENT__TRY_BLOCK:
			return basicSetTryBlock(null, msgs);
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
		case TryCatchPackage.TRY_STATEMENT__CATCH_CLAUSES:
			return getCatchClauses();
		case TryCatchPackage.TRY_STATEMENT__FINALLY_BLOCK:
			return getFinallyBlock();
		case TryCatchPackage.TRY_STATEMENT__CATCH_CLAUSES_KIND:
			return getCatchClausesKind();
		case TryCatchPackage.TRY_STATEMENT__RESOURCES:
			return getResources();
		case TryCatchPackage.TRY_STATEMENT__RESOURCES_KIND:
			return getResourcesKind();
		case TryCatchPackage.TRY_STATEMENT__TRY_BLOCK:
			return getTryBlock();
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
		case TryCatchPackage.TRY_STATEMENT__CATCH_CLAUSES:
			getCatchClauses().clear();
			getCatchClauses().addAll((Collection) newValue);
			return;
		case TryCatchPackage.TRY_STATEMENT__FINALLY_BLOCK:
			setFinallyBlock((Block) newValue);
			return;
		case TryCatchPackage.TRY_STATEMENT__CATCH_CLAUSES_KIND:
			setCatchClausesKind((CollectionKind) newValue);
			return;
		case TryCatchPackage.TRY_STATEMENT__RESOURCES:
			getResources().clear();
			getResources().addAll((Collection) newValue);
			return;
		case TryCatchPackage.TRY_STATEMENT__RESOURCES_KIND:
			setResourcesKind((CollectionKind) newValue);
			return;
		case TryCatchPackage.TRY_STATEMENT__TRY_BLOCK:
			setTryBlock((Block) newValue);
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
		case TryCatchPackage.TRY_STATEMENT__CATCH_CLAUSES:
			getCatchClauses().clear();
			return;
		case TryCatchPackage.TRY_STATEMENT__FINALLY_BLOCK:
			setFinallyBlock((Block) null);
			return;
		case TryCatchPackage.TRY_STATEMENT__CATCH_CLAUSES_KIND:
			setCatchClausesKind(CATCH_CLAUSES_KIND_EDEFAULT);
			return;
		case TryCatchPackage.TRY_STATEMENT__RESOURCES:
			getResources().clear();
			return;
		case TryCatchPackage.TRY_STATEMENT__RESOURCES_KIND:
			setResourcesKind(RESOURCES_KIND_EDEFAULT);
			return;
		case TryCatchPackage.TRY_STATEMENT__TRY_BLOCK:
			setTryBlock((Block) null);
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
		case TryCatchPackage.TRY_STATEMENT__CATCH_CLAUSES:
			return catchClauses != null && !catchClauses.isEmpty();
		case TryCatchPackage.TRY_STATEMENT__FINALLY_BLOCK:
			return finallyBlock != null;
		case TryCatchPackage.TRY_STATEMENT__CATCH_CLAUSES_KIND:
			return catchClausesKind != CATCH_CLAUSES_KIND_EDEFAULT;
		case TryCatchPackage.TRY_STATEMENT__RESOURCES:
			return resources != null && !resources.isEmpty();
		case TryCatchPackage.TRY_STATEMENT__RESOURCES_KIND:
			return resourcesKind != RESOURCES_KIND_EDEFAULT;
		case TryCatchPackage.TRY_STATEMENT__TRY_BLOCK:
			return tryBlock != null;
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
		result.append(" (catchClausesKind: ");
		result.append(catchClausesKind);
		result.append(", resourcesKind: ");
		result.append(resourcesKind);
		result.append(')');
		return result.toString();
	}

} //TryStatementImpl
