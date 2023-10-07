/**
 */
package ccsl.functions.booleanFunctions.filters.impl;

import ccsl.context.Context;

import ccsl.elements.Element;

import ccsl.functions.booleanFunctions.filters.FiltersPackage;
import ccsl.functions.booleanFunctions.filters.ImplicityContainerFilter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implicity Container Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.ImplicityContainerFilterImpl#getImplicityContainer <em>Implicity Container</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.ImplicityContainerFilterImpl#getImplicityField <em>Implicity Field</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.ImplicityContainerFilterImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplicityContainerFilterImpl extends AtomicFilterImpl implements ImplicityContainerFilter {
	/**
	 * The cached value of the '{@link #getImplicityContainer() <em>Implicity Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicityContainer()
	 * @generated
	 * @ordered
	 */
	protected Element implicityContainer;

	/**
	 * The cached value of the '{@link #getImplicityField() <em>Implicity Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicityField()
	 * @generated
	 * @ordered
	 */
	protected Element implicityField;

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
	protected ImplicityContainerFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FiltersPackage.Literals.IMPLICITY_CONTAINER_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getImplicityContainer() {
		if (implicityContainer != null && implicityContainer.eIsProxy()) {
			InternalEObject oldImplicityContainer = (InternalEObject) implicityContainer;
			implicityContainer = (Element) eResolveProxy(oldImplicityContainer);
			if (implicityContainer != oldImplicityContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FiltersPackage.IMPLICITY_CONTAINER_FILTER__IMPLICITY_CONTAINER, oldImplicityContainer,
							implicityContainer));
			}
		}
		return implicityContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetImplicityContainer() {
		return implicityContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplicityContainer(Element newImplicityContainer) {
		Element oldImplicityContainer = implicityContainer;
		implicityContainer = newImplicityContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FiltersPackage.IMPLICITY_CONTAINER_FILTER__IMPLICITY_CONTAINER, oldImplicityContainer,
					implicityContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getImplicityField() {
		if (implicityField != null && implicityField.eIsProxy()) {
			InternalEObject oldImplicityField = (InternalEObject) implicityField;
			implicityField = (Element) eResolveProxy(oldImplicityField);
			if (implicityField != oldImplicityField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FiltersPackage.IMPLICITY_CONTAINER_FILTER__IMPLICITY_FIELD, oldImplicityField,
							implicityField));
			}
		}
		return implicityField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetImplicityField() {
		return implicityField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplicityField(Element newImplicityField) {
		Element oldImplicityField = implicityField;
		implicityField = newImplicityField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FiltersPackage.IMPLICITY_CONTAINER_FILTER__IMPLICITY_FIELD, oldImplicityField, implicityField));
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
					FiltersPackage.IMPLICITY_CONTAINER_FILTER__CONTEXT, oldContext, newContext);
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
						EOPPOSITE_FEATURE_BASE - FiltersPackage.IMPLICITY_CONTAINER_FILTER__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject) newContext).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FiltersPackage.IMPLICITY_CONTAINER_FILTER__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.IMPLICITY_CONTAINER_FILTER__CONTEXT,
					newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FiltersPackage.IMPLICITY_CONTAINER_FILTER__CONTEXT:
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
		case FiltersPackage.IMPLICITY_CONTAINER_FILTER__IMPLICITY_CONTAINER:
			if (resolve)
				return getImplicityContainer();
			return basicGetImplicityContainer();
		case FiltersPackage.IMPLICITY_CONTAINER_FILTER__IMPLICITY_FIELD:
			if (resolve)
				return getImplicityField();
			return basicGetImplicityField();
		case FiltersPackage.IMPLICITY_CONTAINER_FILTER__CONTEXT:
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
		case FiltersPackage.IMPLICITY_CONTAINER_FILTER__IMPLICITY_CONTAINER:
			setImplicityContainer((Element) newValue);
			return;
		case FiltersPackage.IMPLICITY_CONTAINER_FILTER__IMPLICITY_FIELD:
			setImplicityField((Element) newValue);
			return;
		case FiltersPackage.IMPLICITY_CONTAINER_FILTER__CONTEXT:
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
		case FiltersPackage.IMPLICITY_CONTAINER_FILTER__IMPLICITY_CONTAINER:
			setImplicityContainer((Element) null);
			return;
		case FiltersPackage.IMPLICITY_CONTAINER_FILTER__IMPLICITY_FIELD:
			setImplicityField((Element) null);
			return;
		case FiltersPackage.IMPLICITY_CONTAINER_FILTER__CONTEXT:
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
		case FiltersPackage.IMPLICITY_CONTAINER_FILTER__IMPLICITY_CONTAINER:
			return implicityContainer != null;
		case FiltersPackage.IMPLICITY_CONTAINER_FILTER__IMPLICITY_FIELD:
			return implicityField != null;
		case FiltersPackage.IMPLICITY_CONTAINER_FILTER__CONTEXT:
			return context != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplicityContainerFilterImpl
