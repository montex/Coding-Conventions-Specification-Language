/**
 */
package ccsl.functions.booleanFunctions.filters.impl;

import ccsl.context.Context;

import ccsl.elements.Element;

import ccsl.functions.booleanFunctions.filters.FiltersPackage;
import ccsl.functions.booleanFunctions.filters.ImplicitContentsFilter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implicit Contents Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.ImplicitContentsFilterImpl#getContext <em>Context</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.ImplicitContentsFilterImpl#getImplicitField <em>Implicit Field</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.ImplicitContentsFilterImpl#getImplicitContainer <em>Implicit Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplicitContentsFilterImpl extends AtomicFilterImpl implements ImplicitContentsFilter {
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
	 * The cached value of the '{@link #getImplicitField() <em>Implicit Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitField()
	 * @generated
	 * @ordered
	 */
	protected Element implicitField;

	/**
	 * The cached value of the '{@link #getImplicitContainer() <em>Implicit Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitContainer()
	 * @generated
	 * @ordered
	 */
	protected Element implicitContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicitContentsFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FiltersPackage.Literals.IMPLICIT_CONTENTS_FILTER;
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
					FiltersPackage.IMPLICIT_CONTENTS_FILTER__CONTEXT, oldContext, newContext);
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
						EOPPOSITE_FEATURE_BASE - FiltersPackage.IMPLICIT_CONTENTS_FILTER__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject) newContext).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FiltersPackage.IMPLICIT_CONTENTS_FILTER__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.IMPLICIT_CONTENTS_FILTER__CONTEXT,
					newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getImplicitField() {
		if (implicitField != null && implicitField.eIsProxy()) {
			InternalEObject oldImplicitField = (InternalEObject) implicitField;
			implicitField = (Element) eResolveProxy(oldImplicitField);
			if (implicitField != oldImplicitField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FiltersPackage.IMPLICIT_CONTENTS_FILTER__IMPLICIT_FIELD, oldImplicitField, implicitField));
			}
		}
		return implicitField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetImplicitField() {
		return implicitField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplicitField(Element newImplicitField) {
		Element oldImplicitField = implicitField;
		implicitField = newImplicitField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FiltersPackage.IMPLICIT_CONTENTS_FILTER__IMPLICIT_FIELD, oldImplicitField, implicitField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getImplicitContainer() {
		if (implicitContainer != null && implicitContainer.eIsProxy()) {
			InternalEObject oldImplicitContainer = (InternalEObject) implicitContainer;
			implicitContainer = (Element) eResolveProxy(oldImplicitContainer);
			if (implicitContainer != oldImplicitContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FiltersPackage.IMPLICIT_CONTENTS_FILTER__IMPLICIT_CONTAINER, oldImplicitContainer,
							implicitContainer));
			}
		}
		return implicitContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetImplicitContainer() {
		return implicitContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplicitContainer(Element newImplicitContainer) {
		Element oldImplicitContainer = implicitContainer;
		implicitContainer = newImplicitContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FiltersPackage.IMPLICIT_CONTENTS_FILTER__IMPLICIT_CONTAINER, oldImplicitContainer,
					implicitContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FiltersPackage.IMPLICIT_CONTENTS_FILTER__CONTEXT:
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
		case FiltersPackage.IMPLICIT_CONTENTS_FILTER__CONTEXT:
			return getContext();
		case FiltersPackage.IMPLICIT_CONTENTS_FILTER__IMPLICIT_FIELD:
			if (resolve)
				return getImplicitField();
			return basicGetImplicitField();
		case FiltersPackage.IMPLICIT_CONTENTS_FILTER__IMPLICIT_CONTAINER:
			if (resolve)
				return getImplicitContainer();
			return basicGetImplicitContainer();
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
		case FiltersPackage.IMPLICIT_CONTENTS_FILTER__CONTEXT:
			setContext((Context) newValue);
			return;
		case FiltersPackage.IMPLICIT_CONTENTS_FILTER__IMPLICIT_FIELD:
			setImplicitField((Element) newValue);
			return;
		case FiltersPackage.IMPLICIT_CONTENTS_FILTER__IMPLICIT_CONTAINER:
			setImplicitContainer((Element) newValue);
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
		case FiltersPackage.IMPLICIT_CONTENTS_FILTER__CONTEXT:
			setContext((Context) null);
			return;
		case FiltersPackage.IMPLICIT_CONTENTS_FILTER__IMPLICIT_FIELD:
			setImplicitField((Element) null);
			return;
		case FiltersPackage.IMPLICIT_CONTENTS_FILTER__IMPLICIT_CONTAINER:
			setImplicitContainer((Element) null);
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
		case FiltersPackage.IMPLICIT_CONTENTS_FILTER__CONTEXT:
			return context != null;
		case FiltersPackage.IMPLICIT_CONTENTS_FILTER__IMPLICIT_FIELD:
			return implicitField != null;
		case FiltersPackage.IMPLICIT_CONTENTS_FILTER__IMPLICIT_CONTAINER:
			return implicitContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplicitContentsFilterImpl
