/**
 */
package ccsl.functions.booleanFunctions.filters.impl;

import ccsl.functions.booleanFunctions.filters.FiltersPackage;
import ccsl.functions.booleanFunctions.filters.IsEmptyBlockFilter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is Empty Block Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.IsEmptyBlockFilterImpl#isAllowEmptyStatement <em>Allow Empty Statement</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.IsEmptyBlockFilterImpl#isAllowComments <em>Allow Comments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IsEmptyBlockFilterImpl extends AtomicFilterImpl implements IsEmptyBlockFilter {
	/**
	 * The default value of the '{@link #isAllowEmptyStatement() <em>Allow Empty Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowEmptyStatement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_EMPTY_STATEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowEmptyStatement() <em>Allow Empty Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowEmptyStatement()
	 * @generated
	 * @ordered
	 */
	protected boolean allowEmptyStatement = ALLOW_EMPTY_STATEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowComments() <em>Allow Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowComments()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_COMMENTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowComments() <em>Allow Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowComments()
	 * @generated
	 * @ordered
	 */
	protected boolean allowComments = ALLOW_COMMENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsEmptyBlockFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FiltersPackage.Literals.IS_EMPTY_BLOCK_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowEmptyStatement() {
		return allowEmptyStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowEmptyStatement(boolean newAllowEmptyStatement) {
		boolean oldAllowEmptyStatement = allowEmptyStatement;
		allowEmptyStatement = newAllowEmptyStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FiltersPackage.IS_EMPTY_BLOCK_FILTER__ALLOW_EMPTY_STATEMENT, oldAllowEmptyStatement,
					allowEmptyStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowComments() {
		return allowComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowComments(boolean newAllowComments) {
		boolean oldAllowComments = allowComments;
		allowComments = newAllowComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.IS_EMPTY_BLOCK_FILTER__ALLOW_COMMENTS,
					oldAllowComments, allowComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FiltersPackage.IS_EMPTY_BLOCK_FILTER__ALLOW_EMPTY_STATEMENT:
			return isAllowEmptyStatement() ? Boolean.TRUE : Boolean.FALSE;
		case FiltersPackage.IS_EMPTY_BLOCK_FILTER__ALLOW_COMMENTS:
			return isAllowComments() ? Boolean.TRUE : Boolean.FALSE;
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
		case FiltersPackage.IS_EMPTY_BLOCK_FILTER__ALLOW_EMPTY_STATEMENT:
			setAllowEmptyStatement(((Boolean) newValue).booleanValue());
			return;
		case FiltersPackage.IS_EMPTY_BLOCK_FILTER__ALLOW_COMMENTS:
			setAllowComments(((Boolean) newValue).booleanValue());
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
		case FiltersPackage.IS_EMPTY_BLOCK_FILTER__ALLOW_EMPTY_STATEMENT:
			setAllowEmptyStatement(ALLOW_EMPTY_STATEMENT_EDEFAULT);
			return;
		case FiltersPackage.IS_EMPTY_BLOCK_FILTER__ALLOW_COMMENTS:
			setAllowComments(ALLOW_COMMENTS_EDEFAULT);
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
		case FiltersPackage.IS_EMPTY_BLOCK_FILTER__ALLOW_EMPTY_STATEMENT:
			return allowEmptyStatement != ALLOW_EMPTY_STATEMENT_EDEFAULT;
		case FiltersPackage.IS_EMPTY_BLOCK_FILTER__ALLOW_COMMENTS:
			return allowComments != ALLOW_COMMENTS_EDEFAULT;
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
		result.append(" (allowEmptyStatement: ");
		result.append(allowEmptyStatement);
		result.append(", allowComments: ");
		result.append(allowComments);
		result.append(')');
		return result.toString();
	}

} //IsEmptyBlockFilterImpl
