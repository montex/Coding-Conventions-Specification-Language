/**
 */
package ccsl.elements.namedElements.method.impl;

import ccsl.CollectionKind;

import ccsl.elements.Annotable;
import ccsl.elements.ControlledAccessElement;
import ccsl.elements.ElementsPackage;
import ccsl.elements.Visibility;

import ccsl.elements.expressions.annotation.Annotation;

import ccsl.elements.impl.ElementImpl;

import ccsl.elements.namedElements.complexType.JClass;

import ccsl.elements.namedElements.method.MethodPackage;
import ccsl.elements.namedElements.method.SimpleMethod;

import ccsl.elements.namedElements.variable.ParameterVariable;

import ccsl.elements.statements.Block;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.method.impl.SimpleMethodImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.method.impl.SimpleMethodImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.method.impl.SimpleMethodImpl#getParams <em>Params</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.method.impl.SimpleMethodImpl#getParamsKind <em>Params Kind</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.method.impl.SimpleMethodImpl#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.method.impl.SimpleMethodImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleMethodImpl extends ElementImpl implements SimpleMethod {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Visibility visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList annotations;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList params;

	/**
	 * The default value of the '{@link #getParamsKind() <em>Params Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamsKind()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionKind PARAMS_KIND_EDEFAULT = CollectionKind.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getParamsKind() <em>Params Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamsKind()
	 * @generated
	 * @ordered
	 */
	protected CollectionKind paramsKind = PARAMS_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThrownExceptions() <em>Thrown Exceptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrownExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList thrownExceptions;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Block body;

	/**
	 * This is true if the Body containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bodyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MethodPackage.Literals.SIMPLE_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Visibility newVisibility) {
		Visibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MethodPackage.SIMPLE_METHOD__VISIBILITY,
					oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList(Annotation.class, this, MethodPackage.SIMPLE_METHOD__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParams() {
		if (params == null) {
			params = new EObjectContainmentEList.Unsettable(ParameterVariable.class, this,
					MethodPackage.SIMPLE_METHOD__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetParams() {
		if (params != null)
			((InternalEList.Unsettable) params).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParams() {
		return params != null && ((InternalEList.Unsettable) params).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKind getParamsKind() {
		return paramsKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamsKind(CollectionKind newParamsKind) {
		CollectionKind oldParamsKind = paramsKind;
		paramsKind = newParamsKind == null ? PARAMS_KIND_EDEFAULT : newParamsKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MethodPackage.SIMPLE_METHOD__PARAMS_KIND,
					oldParamsKind, paramsKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getThrownExceptions() {
		if (thrownExceptions == null) {
			thrownExceptions = new EObjectResolvingEList.Unsettable(JClass.class, this,
					MethodPackage.SIMPLE_METHOD__THROWN_EXCEPTIONS);
		}
		return thrownExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThrownExceptions() {
		if (thrownExceptions != null)
			((InternalEList.Unsettable) thrownExceptions).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThrownExceptions() {
		return thrownExceptions != null && ((InternalEList.Unsettable) thrownExceptions).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Block newBody, NotificationChain msgs) {
		Block oldBody = body;
		body = newBody;
		boolean oldBodyESet = bodyESet;
		bodyESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MethodPackage.SIMPLE_METHOD__BODY, oldBody, newBody, !oldBodyESet);
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
	public void setBody(Block newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject) body).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MethodPackage.SIMPLE_METHOD__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject) newBody).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MethodPackage.SIMPLE_METHOD__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldBodyESet = bodyESet;
			bodyESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, MethodPackage.SIMPLE_METHOD__BODY, newBody,
						newBody, !oldBodyESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetBody(NotificationChain msgs) {
		Block oldBody = body;
		body = null;
		boolean oldBodyESet = bodyESet;
		bodyESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET,
					MethodPackage.SIMPLE_METHOD__BODY, oldBody, null, oldBodyESet);
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
	public void unsetBody() {
		if (body != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject) body).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - MethodPackage.SIMPLE_METHOD__BODY, null, msgs);
			msgs = basicUnsetBody(msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldBodyESet = bodyESet;
			bodyESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, MethodPackage.SIMPLE_METHOD__BODY, null, null,
						oldBodyESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBody() {
		return bodyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MethodPackage.SIMPLE_METHOD__ANNOTATIONS:
			return ((InternalEList) getAnnotations()).basicRemove(otherEnd, msgs);
		case MethodPackage.SIMPLE_METHOD__PARAMS:
			return ((InternalEList) getParams()).basicRemove(otherEnd, msgs);
		case MethodPackage.SIMPLE_METHOD__BODY:
			return basicUnsetBody(msgs);
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
		case MethodPackage.SIMPLE_METHOD__VISIBILITY:
			return getVisibility();
		case MethodPackage.SIMPLE_METHOD__ANNOTATIONS:
			return getAnnotations();
		case MethodPackage.SIMPLE_METHOD__PARAMS:
			return getParams();
		case MethodPackage.SIMPLE_METHOD__PARAMS_KIND:
			return getParamsKind();
		case MethodPackage.SIMPLE_METHOD__THROWN_EXCEPTIONS:
			return getThrownExceptions();
		case MethodPackage.SIMPLE_METHOD__BODY:
			return getBody();
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
		case MethodPackage.SIMPLE_METHOD__VISIBILITY:
			setVisibility((Visibility) newValue);
			return;
		case MethodPackage.SIMPLE_METHOD__ANNOTATIONS:
			getAnnotations().clear();
			getAnnotations().addAll((Collection) newValue);
			return;
		case MethodPackage.SIMPLE_METHOD__PARAMS:
			getParams().clear();
			getParams().addAll((Collection) newValue);
			return;
		case MethodPackage.SIMPLE_METHOD__PARAMS_KIND:
			setParamsKind((CollectionKind) newValue);
			return;
		case MethodPackage.SIMPLE_METHOD__THROWN_EXCEPTIONS:
			getThrownExceptions().clear();
			getThrownExceptions().addAll((Collection) newValue);
			return;
		case MethodPackage.SIMPLE_METHOD__BODY:
			setBody((Block) newValue);
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
		case MethodPackage.SIMPLE_METHOD__VISIBILITY:
			setVisibility(VISIBILITY_EDEFAULT);
			return;
		case MethodPackage.SIMPLE_METHOD__ANNOTATIONS:
			getAnnotations().clear();
			return;
		case MethodPackage.SIMPLE_METHOD__PARAMS:
			unsetParams();
			return;
		case MethodPackage.SIMPLE_METHOD__PARAMS_KIND:
			setParamsKind(PARAMS_KIND_EDEFAULT);
			return;
		case MethodPackage.SIMPLE_METHOD__THROWN_EXCEPTIONS:
			unsetThrownExceptions();
			return;
		case MethodPackage.SIMPLE_METHOD__BODY:
			unsetBody();
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
		case MethodPackage.SIMPLE_METHOD__VISIBILITY:
			return visibility != VISIBILITY_EDEFAULT;
		case MethodPackage.SIMPLE_METHOD__ANNOTATIONS:
			return annotations != null && !annotations.isEmpty();
		case MethodPackage.SIMPLE_METHOD__PARAMS:
			return isSetParams();
		case MethodPackage.SIMPLE_METHOD__PARAMS_KIND:
			return paramsKind != PARAMS_KIND_EDEFAULT;
		case MethodPackage.SIMPLE_METHOD__THROWN_EXCEPTIONS:
			return isSetThrownExceptions();
		case MethodPackage.SIMPLE_METHOD__BODY:
			return isSetBody();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ControlledAccessElement.class) {
			switch (derivedFeatureID) {
			case MethodPackage.SIMPLE_METHOD__VISIBILITY:
				return ElementsPackage.CONTROLLED_ACCESS_ELEMENT__VISIBILITY;
			default:
				return -1;
			}
		}
		if (baseClass == Annotable.class) {
			switch (derivedFeatureID) {
			case MethodPackage.SIMPLE_METHOD__ANNOTATIONS:
				return ElementsPackage.ANNOTABLE__ANNOTATIONS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == ControlledAccessElement.class) {
			switch (baseFeatureID) {
			case ElementsPackage.CONTROLLED_ACCESS_ELEMENT__VISIBILITY:
				return MethodPackage.SIMPLE_METHOD__VISIBILITY;
			default:
				return -1;
			}
		}
		if (baseClass == Annotable.class) {
			switch (baseFeatureID) {
			case ElementsPackage.ANNOTABLE__ANNOTATIONS:
				return MethodPackage.SIMPLE_METHOD__ANNOTATIONS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", paramsKind: ");
		result.append(paramsKind);
		result.append(')');
		return result.toString();
	}

} //SimpleMethodImpl
