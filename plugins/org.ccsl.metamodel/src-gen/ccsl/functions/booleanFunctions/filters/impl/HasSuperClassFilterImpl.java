/**
 */
package ccsl.functions.booleanFunctions.filters.impl;

import ccsl.context.Context;

import ccsl.elements.namedElements.complexType.JClass;

import ccsl.functions.booleanFunctions.filters.FiltersPackage;
import ccsl.functions.booleanFunctions.filters.HasSuperClassFilter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has Super Class Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.HasSuperClassFilterImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.HasSuperClassFilterImpl#getSubClass <em>Sub Class</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.HasSuperClassFilterImpl#isIncludesTarget <em>Includes Target</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.HasSuperClassFilterImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HasSuperClassFilterImpl extends AtomicFilterImpl implements HasSuperClassFilter {
	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected JClass superClass;

	/**
	 * The cached value of the '{@link #getSubClass() <em>Sub Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClass()
	 * @generated
	 * @ordered
	 */
	protected JClass subClass;

	/**
	 * The default value of the '{@link #isIncludesTarget() <em>Includes Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludesTarget()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDES_TARGET_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIncludesTarget() <em>Includes Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludesTarget()
	 * @generated
	 * @ordered
	 */
	protected boolean includesTarget = INCLUDES_TARGET_EDEFAULT;

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
	protected HasSuperClassFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FiltersPackage.Literals.HAS_SUPER_CLASS_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass getSuperClass() {
		if (superClass != null && superClass.eIsProxy()) {
			InternalEObject oldSuperClass = (InternalEObject) superClass;
			superClass = (JClass) eResolveProxy(oldSuperClass);
			if (superClass != oldSuperClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FiltersPackage.HAS_SUPER_CLASS_FILTER__SUPER_CLASS, oldSuperClass, superClass));
			}
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass basicGetSuperClass() {
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperClass(JClass newSuperClass) {
		JClass oldSuperClass = superClass;
		superClass = newSuperClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.HAS_SUPER_CLASS_FILTER__SUPER_CLASS,
					oldSuperClass, superClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass getSubClass() {
		if (subClass != null && subClass.eIsProxy()) {
			InternalEObject oldSubClass = (InternalEObject) subClass;
			subClass = (JClass) eResolveProxy(oldSubClass);
			if (subClass != oldSubClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FiltersPackage.HAS_SUPER_CLASS_FILTER__SUB_CLASS, oldSubClass, subClass));
			}
		}
		return subClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass basicGetSubClass() {
		return subClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubClass(JClass newSubClass) {
		JClass oldSubClass = subClass;
		subClass = newSubClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.HAS_SUPER_CLASS_FILTER__SUB_CLASS,
					oldSubClass, subClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludesTarget() {
		return includesTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludesTarget(boolean newIncludesTarget) {
		boolean oldIncludesTarget = includesTarget;
		includesTarget = newIncludesTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FiltersPackage.HAS_SUPER_CLASS_FILTER__INCLUDES_TARGET, oldIncludesTarget, includesTarget));
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
					FiltersPackage.HAS_SUPER_CLASS_FILTER__CONTEXT, oldContext, newContext);
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
						EOPPOSITE_FEATURE_BASE - FiltersPackage.HAS_SUPER_CLASS_FILTER__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject) newContext).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FiltersPackage.HAS_SUPER_CLASS_FILTER__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.HAS_SUPER_CLASS_FILTER__CONTEXT,
					newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FiltersPackage.HAS_SUPER_CLASS_FILTER__CONTEXT:
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
		case FiltersPackage.HAS_SUPER_CLASS_FILTER__SUPER_CLASS:
			if (resolve)
				return getSuperClass();
			return basicGetSuperClass();
		case FiltersPackage.HAS_SUPER_CLASS_FILTER__SUB_CLASS:
			if (resolve)
				return getSubClass();
			return basicGetSubClass();
		case FiltersPackage.HAS_SUPER_CLASS_FILTER__INCLUDES_TARGET:
			return isIncludesTarget() ? Boolean.TRUE : Boolean.FALSE;
		case FiltersPackage.HAS_SUPER_CLASS_FILTER__CONTEXT:
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
		case FiltersPackage.HAS_SUPER_CLASS_FILTER__SUPER_CLASS:
			setSuperClass((JClass) newValue);
			return;
		case FiltersPackage.HAS_SUPER_CLASS_FILTER__SUB_CLASS:
			setSubClass((JClass) newValue);
			return;
		case FiltersPackage.HAS_SUPER_CLASS_FILTER__INCLUDES_TARGET:
			setIncludesTarget(((Boolean) newValue).booleanValue());
			return;
		case FiltersPackage.HAS_SUPER_CLASS_FILTER__CONTEXT:
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
		case FiltersPackage.HAS_SUPER_CLASS_FILTER__SUPER_CLASS:
			setSuperClass((JClass) null);
			return;
		case FiltersPackage.HAS_SUPER_CLASS_FILTER__SUB_CLASS:
			setSubClass((JClass) null);
			return;
		case FiltersPackage.HAS_SUPER_CLASS_FILTER__INCLUDES_TARGET:
			setIncludesTarget(INCLUDES_TARGET_EDEFAULT);
			return;
		case FiltersPackage.HAS_SUPER_CLASS_FILTER__CONTEXT:
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
		case FiltersPackage.HAS_SUPER_CLASS_FILTER__SUPER_CLASS:
			return superClass != null;
		case FiltersPackage.HAS_SUPER_CLASS_FILTER__SUB_CLASS:
			return subClass != null;
		case FiltersPackage.HAS_SUPER_CLASS_FILTER__INCLUDES_TARGET:
			return includesTarget != INCLUDES_TARGET_EDEFAULT;
		case FiltersPackage.HAS_SUPER_CLASS_FILTER__CONTEXT:
			return context != null;
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
		result.append(" (includesTarget: ");
		result.append(includesTarget);
		result.append(')');
		return result.toString();
	}

} //HasSuperClassFilterImpl
