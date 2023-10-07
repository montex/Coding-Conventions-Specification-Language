/**
 */
package ccsl.context.impl;

import ccsl.context.Context;
import ccsl.context.ContextPackage;

import ccsl.elements.Element;

import ccsl.functions.booleanFunctions.filters.Filter;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.context.impl.ContextImpl#getContextElements <em>Context Elements</em>}</li>
 *   <li>{@link ccsl.context.impl.ContextImpl#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextImpl extends MinimalEObjectImpl.Container implements Context {
	/**
	 * The cached value of the '{@link #getContextElements() <em>Context Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextElements()
	 * @generated
	 * @ordered
	 */
	protected EList contextElements;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList filters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ContextPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContextElements() {
		if (contextElements == null) {
			contextElements = new EObjectContainmentEList(Element.class, this,
					ContextPackage.CONTEXT__CONTEXT_ELEMENTS);
		}
		return contextElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList(Filter.class, this, ContextPackage.CONTEXT__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ContextPackage.CONTEXT__CONTEXT_ELEMENTS:
			return ((InternalEList) getContextElements()).basicRemove(otherEnd, msgs);
		case ContextPackage.CONTEXT__FILTERS:
			return ((InternalEList) getFilters()).basicRemove(otherEnd, msgs);
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
		case ContextPackage.CONTEXT__CONTEXT_ELEMENTS:
			return getContextElements();
		case ContextPackage.CONTEXT__FILTERS:
			return getFilters();
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
		case ContextPackage.CONTEXT__CONTEXT_ELEMENTS:
			getContextElements().clear();
			getContextElements().addAll((Collection) newValue);
			return;
		case ContextPackage.CONTEXT__FILTERS:
			getFilters().clear();
			getFilters().addAll((Collection) newValue);
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
		case ContextPackage.CONTEXT__CONTEXT_ELEMENTS:
			getContextElements().clear();
			return;
		case ContextPackage.CONTEXT__FILTERS:
			getFilters().clear();
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
		case ContextPackage.CONTEXT__CONTEXT_ELEMENTS:
			return contextElements != null && !contextElements.isEmpty();
		case ContextPackage.CONTEXT__FILTERS:
			return filters != null && !filters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextImpl
