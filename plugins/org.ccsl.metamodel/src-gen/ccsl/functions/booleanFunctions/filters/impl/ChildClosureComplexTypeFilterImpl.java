/**
 */
package ccsl.functions.booleanFunctions.filters.impl;

import ccsl.context.Context;

import ccsl.elements.namedElements.complexType.ComplexType;

import ccsl.functions.booleanFunctions.filters.ChildClosureComplexTypeFilter;
import ccsl.functions.booleanFunctions.filters.FiltersPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child Closure Complex Type Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.ChildClosureComplexTypeFilterImpl#getSuperComplexType <em>Super Complex Type</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.ChildClosureComplexTypeFilterImpl#getChildComplexType <em>Child Complex Type</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.ChildClosureComplexTypeFilterImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChildClosureComplexTypeFilterImpl extends AtomicFilterImpl implements ChildClosureComplexTypeFilter {
	/**
	 * The cached value of the '{@link #getSuperComplexType() <em>Super Complex Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperComplexType()
	 * @generated
	 * @ordered
	 */
	protected ComplexType superComplexType;

	/**
	 * The cached value of the '{@link #getChildComplexType() <em>Child Complex Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildComplexType()
	 * @generated
	 * @ordered
	 */
	protected ComplexType childComplexType;

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
	protected ChildClosureComplexTypeFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FiltersPackage.Literals.CHILD_CLOSURE_COMPLEX_TYPE_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexType getSuperComplexType() {
		if (superComplexType != null && superComplexType.eIsProxy()) {
			InternalEObject oldSuperComplexType = (InternalEObject) superComplexType;
			superComplexType = (ComplexType) eResolveProxy(oldSuperComplexType);
			if (superComplexType != oldSuperComplexType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__SUPER_COMPLEX_TYPE, oldSuperComplexType,
							superComplexType));
			}
		}
		return superComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexType basicGetSuperComplexType() {
		return superComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperComplexType(ComplexType newSuperComplexType) {
		ComplexType oldSuperComplexType = superComplexType;
		superComplexType = newSuperComplexType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__SUPER_COMPLEX_TYPE, oldSuperComplexType,
					superComplexType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexType getChildComplexType() {
		if (childComplexType != null && childComplexType.eIsProxy()) {
			InternalEObject oldChildComplexType = (InternalEObject) childComplexType;
			childComplexType = (ComplexType) eResolveProxy(oldChildComplexType);
			if (childComplexType != oldChildComplexType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CHILD_COMPLEX_TYPE, oldChildComplexType,
							childComplexType));
			}
		}
		return childComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexType basicGetChildComplexType() {
		return childComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildComplexType(ComplexType newChildComplexType) {
		ComplexType oldChildComplexType = childComplexType;
		childComplexType = newChildComplexType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CHILD_COMPLEX_TYPE, oldChildComplexType,
					childComplexType));
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
					FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CONTEXT, oldContext, newContext);
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
						EOPPOSITE_FEATURE_BASE - FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject) newContext).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CONTEXT:
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
		case FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__SUPER_COMPLEX_TYPE:
			if (resolve)
				return getSuperComplexType();
			return basicGetSuperComplexType();
		case FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CHILD_COMPLEX_TYPE:
			if (resolve)
				return getChildComplexType();
			return basicGetChildComplexType();
		case FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CONTEXT:
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
		case FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__SUPER_COMPLEX_TYPE:
			setSuperComplexType((ComplexType) newValue);
			return;
		case FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CHILD_COMPLEX_TYPE:
			setChildComplexType((ComplexType) newValue);
			return;
		case FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CONTEXT:
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
		case FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__SUPER_COMPLEX_TYPE:
			setSuperComplexType((ComplexType) null);
			return;
		case FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CHILD_COMPLEX_TYPE:
			setChildComplexType((ComplexType) null);
			return;
		case FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CONTEXT:
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
		case FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__SUPER_COMPLEX_TYPE:
			return superComplexType != null;
		case FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CHILD_COMPLEX_TYPE:
			return childComplexType != null;
		case FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER__CONTEXT:
			return context != null;
		}
		return super.eIsSet(featureID);
	}

} //ChildClosureComplexTypeFilterImpl
