/**
 */
package ccsl.elements.expressions.arrays.impl;

import ccsl.CollectionKind;

import ccsl.elements.expressions.Expression;

import ccsl.elements.expressions.arrays.ArrayIndexesAccess;
import ccsl.elements.expressions.arrays.ArraysPackage;

import ccsl.elements.expressions.impl.ExpressionImpl;

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
 * An implementation of the model object '<em><b>Array Indexes Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.arrays.impl.ArrayIndexesAccessImpl#getIndexes <em>Indexes</em>}</li>
 *   <li>{@link ccsl.elements.expressions.arrays.impl.ArrayIndexesAccessImpl#getIndexesKind <em>Indexes Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayIndexesAccessImpl extends ExpressionImpl implements ArrayIndexesAccess {
	/**
	 * The cached value of the '{@link #getIndexes() <em>Indexes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexes()
	 * @generated
	 * @ordered
	 */
	protected EList indexes;

	/**
	 * The default value of the '{@link #getIndexesKind() <em>Indexes Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexesKind()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionKind INDEXES_KIND_EDEFAULT = CollectionKind.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getIndexesKind() <em>Indexes Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexesKind()
	 * @generated
	 * @ordered
	 */
	protected CollectionKind indexesKind = INDEXES_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayIndexesAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ArraysPackage.Literals.ARRAY_INDEXES_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIndexes() {
		if (indexes == null) {
			indexes = new EObjectContainmentEList.Unsettable(Expression.class, this,
					ArraysPackage.ARRAY_INDEXES_ACCESS__INDEXES);
		}
		return indexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIndexes() {
		if (indexes != null)
			((InternalEList.Unsettable) indexes).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIndexes() {
		return indexes != null && ((InternalEList.Unsettable) indexes).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKind getIndexesKind() {
		return indexesKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexesKind(CollectionKind newIndexesKind) {
		CollectionKind oldIndexesKind = indexesKind;
		indexesKind = newIndexesKind == null ? INDEXES_KIND_EDEFAULT : newIndexesKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArraysPackage.ARRAY_INDEXES_ACCESS__INDEXES_KIND,
					oldIndexesKind, indexesKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArraysPackage.ARRAY_INDEXES_ACCESS__INDEXES:
			return ((InternalEList) getIndexes()).basicRemove(otherEnd, msgs);
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
		case ArraysPackage.ARRAY_INDEXES_ACCESS__INDEXES:
			return getIndexes();
		case ArraysPackage.ARRAY_INDEXES_ACCESS__INDEXES_KIND:
			return getIndexesKind();
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
		case ArraysPackage.ARRAY_INDEXES_ACCESS__INDEXES:
			getIndexes().clear();
			getIndexes().addAll((Collection) newValue);
			return;
		case ArraysPackage.ARRAY_INDEXES_ACCESS__INDEXES_KIND:
			setIndexesKind((CollectionKind) newValue);
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
		case ArraysPackage.ARRAY_INDEXES_ACCESS__INDEXES:
			unsetIndexes();
			return;
		case ArraysPackage.ARRAY_INDEXES_ACCESS__INDEXES_KIND:
			setIndexesKind(INDEXES_KIND_EDEFAULT);
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
		case ArraysPackage.ARRAY_INDEXES_ACCESS__INDEXES:
			return isSetIndexes();
		case ArraysPackage.ARRAY_INDEXES_ACCESS__INDEXES_KIND:
			return indexesKind != INDEXES_KIND_EDEFAULT;
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
		result.append(" (indexesKind: ");
		result.append(indexesKind);
		result.append(')');
		return result.toString();
	}

} //ArrayIndexesAccessImpl
