/**
 */
package ccsl.functions.booleanFunctions.filters.impl;

import ccsl.elements.namedElements.NamedElement;

import ccsl.functions.booleanFunctions.filters.FiltersPackage;
import ccsl.functions.booleanFunctions.filters.SameNameFilter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Same Name Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.SameNameFilterImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.SameNameFilterImpl#isIgnoreCase <em>Ignore Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SameNameFilterImpl extends AtomicFilterImpl implements SameNameFilter {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList elements;

	/**
	 * The default value of the '{@link #isIgnoreCase() <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreCase()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_CASE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIgnoreCase() <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreCase()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreCase = IGNORE_CASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SameNameFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FiltersPackage.Literals.SAME_NAME_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList(NamedElement.class, this, FiltersPackage.SAME_NAME_FILTER__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIgnoreCase() {
		return ignoreCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreCase(boolean newIgnoreCase) {
		boolean oldIgnoreCase = ignoreCase;
		ignoreCase = newIgnoreCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.SAME_NAME_FILTER__IGNORE_CASE,
					oldIgnoreCase, ignoreCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FiltersPackage.SAME_NAME_FILTER__ELEMENTS:
			return getElements();
		case FiltersPackage.SAME_NAME_FILTER__IGNORE_CASE:
			return isIgnoreCase() ? Boolean.TRUE : Boolean.FALSE;
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
		case FiltersPackage.SAME_NAME_FILTER__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection) newValue);
			return;
		case FiltersPackage.SAME_NAME_FILTER__IGNORE_CASE:
			setIgnoreCase(((Boolean) newValue).booleanValue());
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
		case FiltersPackage.SAME_NAME_FILTER__ELEMENTS:
			getElements().clear();
			return;
		case FiltersPackage.SAME_NAME_FILTER__IGNORE_CASE:
			setIgnoreCase(IGNORE_CASE_EDEFAULT);
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
		case FiltersPackage.SAME_NAME_FILTER__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case FiltersPackage.SAME_NAME_FILTER__IGNORE_CASE:
			return ignoreCase != IGNORE_CASE_EDEFAULT;
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
		result.append(" (ignoreCase: ");
		result.append(ignoreCase);
		result.append(')');
		return result.toString();
	}

} //SameNameFilterImpl
