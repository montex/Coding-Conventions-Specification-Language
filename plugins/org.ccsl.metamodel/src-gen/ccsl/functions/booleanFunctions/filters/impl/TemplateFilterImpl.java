/**
 */
package ccsl.functions.booleanFunctions.filters.impl;

import ccsl.context.Context;

import ccsl.elements.Element;

import ccsl.functions.booleanFunctions.filters.FiltersPackage;
import ccsl.functions.booleanFunctions.filters.TemplateFilter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.TemplateFilterImpl#getTargetTemplate <em>Target Template</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.TemplateFilterImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateFilterImpl extends AtomicFilterImpl implements TemplateFilter {
	/**
	 * The cached value of the '{@link #getTargetTemplate() <em>Target Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTemplate()
	 * @generated
	 * @ordered
	 */
	protected Element targetTemplate;

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
	protected TemplateFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FiltersPackage.Literals.TEMPLATE_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getTargetTemplate() {
		if (targetTemplate != null && targetTemplate.eIsProxy()) {
			InternalEObject oldTargetTemplate = (InternalEObject) targetTemplate;
			targetTemplate = (Element) eResolveProxy(oldTargetTemplate);
			if (targetTemplate != oldTargetTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FiltersPackage.TEMPLATE_FILTER__TARGET_TEMPLATE, oldTargetTemplate, targetTemplate));
			}
		}
		return targetTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetTargetTemplate() {
		return targetTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetTemplate(Element newTargetTemplate) {
		Element oldTargetTemplate = targetTemplate;
		targetTemplate = newTargetTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.TEMPLATE_FILTER__TARGET_TEMPLATE,
					oldTargetTemplate, targetTemplate));
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
					FiltersPackage.TEMPLATE_FILTER__CONTEXT, oldContext, newContext);
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
						EOPPOSITE_FEATURE_BASE - FiltersPackage.TEMPLATE_FILTER__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject) newContext).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FiltersPackage.TEMPLATE_FILTER__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.TEMPLATE_FILTER__CONTEXT, newContext,
					newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FiltersPackage.TEMPLATE_FILTER__CONTEXT:
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
		case FiltersPackage.TEMPLATE_FILTER__TARGET_TEMPLATE:
			if (resolve)
				return getTargetTemplate();
			return basicGetTargetTemplate();
		case FiltersPackage.TEMPLATE_FILTER__CONTEXT:
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
		case FiltersPackage.TEMPLATE_FILTER__TARGET_TEMPLATE:
			setTargetTemplate((Element) newValue);
			return;
		case FiltersPackage.TEMPLATE_FILTER__CONTEXT:
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
		case FiltersPackage.TEMPLATE_FILTER__TARGET_TEMPLATE:
			setTargetTemplate((Element) null);
			return;
		case FiltersPackage.TEMPLATE_FILTER__CONTEXT:
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
		case FiltersPackage.TEMPLATE_FILTER__TARGET_TEMPLATE:
			return targetTemplate != null;
		case FiltersPackage.TEMPLATE_FILTER__CONTEXT:
			return context != null;
		}
		return super.eIsSet(featureID);
	}

} //TemplateFilterImpl
