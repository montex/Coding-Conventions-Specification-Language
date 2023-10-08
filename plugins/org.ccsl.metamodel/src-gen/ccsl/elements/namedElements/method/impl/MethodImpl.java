/**
 */
package ccsl.elements.namedElements.method.impl;

import ccsl.CollectionKind;

import ccsl.elements.ControlledAccessElement;
import ccsl.elements.ElementsPackage;
import ccsl.elements.Inheritance;
import ccsl.elements.Visibility;

import ccsl.elements.datatype.DataType;

import ccsl.elements.namedElements.complexType.JClass;

import ccsl.elements.namedElements.impl.NamedElementImpl;

import ccsl.elements.namedElements.method.Method;
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
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.method.impl.MethodImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.method.impl.MethodImpl#getParams <em>Params</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.method.impl.MethodImpl#getParamsKind <em>Params Kind</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.method.impl.MethodImpl#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.method.impl.MethodImpl#getBody <em>Body</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.method.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.method.impl.MethodImpl#getStatic <em>Static</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.method.impl.MethodImpl#getInheritance <em>Inheritance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends NamedElementImpl implements Method {
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
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected DataType returnType;

	/**
	 * The default value of the '{@link #getStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STATIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
	protected Boolean static_ = STATIC_EDEFAULT;

	/**
	 * This is true if the Static attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean staticESet;

	/**
	 * The default value of the '{@link #getInheritance() <em>Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritance()
	 * @generated
	 * @ordered
	 */
	protected static final Inheritance INHERITANCE_EDEFAULT = Inheritance.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getInheritance() <em>Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritance()
	 * @generated
	 * @ordered
	 */
	protected Inheritance inheritance = INHERITANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MethodPackage.Literals.METHOD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MethodPackage.METHOD__VISIBILITY, oldVisibility,
					visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParams() {
		if (params == null) {
			params = new EObjectContainmentEList.Unsettable(ParameterVariable.class, this,
					MethodPackage.METHOD__PARAMS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MethodPackage.METHOD__PARAMS_KIND, oldParamsKind,
					paramsKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getThrownExceptions() {
		if (thrownExceptions == null) {
			thrownExceptions = new EObjectResolvingEList.Unsettable(JClass.class, this,
					MethodPackage.METHOD__THROWN_EXCEPTIONS);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MethodPackage.METHOD__BODY,
					oldBody, newBody, !oldBodyESet);
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
						EOPPOSITE_FEATURE_BASE - MethodPackage.METHOD__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject) newBody).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MethodPackage.METHOD__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldBodyESet = bodyESet;
			bodyESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, MethodPackage.METHOD__BODY, newBody, newBody,
						!oldBodyESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, MethodPackage.METHOD__BODY,
					oldBody, null, oldBodyESet);
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
			msgs = ((InternalEObject) body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MethodPackage.METHOD__BODY,
					null, msgs);
			msgs = basicUnsetBody(msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldBodyESet = bodyESet;
			bodyESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, MethodPackage.METHOD__BODY, null, null,
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
	public DataType getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject) returnType;
			returnType = (DataType) eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MethodPackage.METHOD__RETURN_TYPE,
							oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(DataType newReturnType) {
		DataType oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MethodPackage.METHOD__RETURN_TYPE, oldReturnType,
					returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(Boolean newStatic) {
		Boolean oldStatic = static_;
		static_ = newStatic;
		boolean oldStaticESet = staticESet;
		staticESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MethodPackage.METHOD__STATIC, oldStatic, static_,
					!oldStaticESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatic() {
		Boolean oldStatic = static_;
		boolean oldStaticESet = staticESet;
		static_ = STATIC_EDEFAULT;
		staticESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MethodPackage.METHOD__STATIC, oldStatic,
					STATIC_EDEFAULT, oldStaticESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatic() {
		return staticESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance getInheritance() {
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritance(Inheritance newInheritance) {
		Inheritance oldInheritance = inheritance;
		inheritance = newInheritance == null ? INHERITANCE_EDEFAULT : newInheritance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MethodPackage.METHOD__INHERITANCE, oldInheritance,
					inheritance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MethodPackage.METHOD__PARAMS:
			return ((InternalEList) getParams()).basicRemove(otherEnd, msgs);
		case MethodPackage.METHOD__BODY:
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
		case MethodPackage.METHOD__VISIBILITY:
			return getVisibility();
		case MethodPackage.METHOD__PARAMS:
			return getParams();
		case MethodPackage.METHOD__PARAMS_KIND:
			return getParamsKind();
		case MethodPackage.METHOD__THROWN_EXCEPTIONS:
			return getThrownExceptions();
		case MethodPackage.METHOD__BODY:
			return getBody();
		case MethodPackage.METHOD__RETURN_TYPE:
			if (resolve)
				return getReturnType();
			return basicGetReturnType();
		case MethodPackage.METHOD__STATIC:
			return getStatic();
		case MethodPackage.METHOD__INHERITANCE:
			return getInheritance();
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
		case MethodPackage.METHOD__VISIBILITY:
			setVisibility((Visibility) newValue);
			return;
		case MethodPackage.METHOD__PARAMS:
			getParams().clear();
			getParams().addAll((Collection) newValue);
			return;
		case MethodPackage.METHOD__PARAMS_KIND:
			setParamsKind((CollectionKind) newValue);
			return;
		case MethodPackage.METHOD__THROWN_EXCEPTIONS:
			getThrownExceptions().clear();
			getThrownExceptions().addAll((Collection) newValue);
			return;
		case MethodPackage.METHOD__BODY:
			setBody((Block) newValue);
			return;
		case MethodPackage.METHOD__RETURN_TYPE:
			setReturnType((DataType) newValue);
			return;
		case MethodPackage.METHOD__STATIC:
			setStatic((Boolean) newValue);
			return;
		case MethodPackage.METHOD__INHERITANCE:
			setInheritance((Inheritance) newValue);
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
		case MethodPackage.METHOD__VISIBILITY:
			setVisibility(VISIBILITY_EDEFAULT);
			return;
		case MethodPackage.METHOD__PARAMS:
			unsetParams();
			return;
		case MethodPackage.METHOD__PARAMS_KIND:
			setParamsKind(PARAMS_KIND_EDEFAULT);
			return;
		case MethodPackage.METHOD__THROWN_EXCEPTIONS:
			unsetThrownExceptions();
			return;
		case MethodPackage.METHOD__BODY:
			unsetBody();
			return;
		case MethodPackage.METHOD__RETURN_TYPE:
			setReturnType((DataType) null);
			return;
		case MethodPackage.METHOD__STATIC:
			unsetStatic();
			return;
		case MethodPackage.METHOD__INHERITANCE:
			setInheritance(INHERITANCE_EDEFAULT);
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
		case MethodPackage.METHOD__VISIBILITY:
			return visibility != VISIBILITY_EDEFAULT;
		case MethodPackage.METHOD__PARAMS:
			return isSetParams();
		case MethodPackage.METHOD__PARAMS_KIND:
			return paramsKind != PARAMS_KIND_EDEFAULT;
		case MethodPackage.METHOD__THROWN_EXCEPTIONS:
			return isSetThrownExceptions();
		case MethodPackage.METHOD__BODY:
			return isSetBody();
		case MethodPackage.METHOD__RETURN_TYPE:
			return returnType != null;
		case MethodPackage.METHOD__STATIC:
			return isSetStatic();
		case MethodPackage.METHOD__INHERITANCE:
			return inheritance != INHERITANCE_EDEFAULT;
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
			case MethodPackage.METHOD__VISIBILITY:
				return ElementsPackage.CONTROLLED_ACCESS_ELEMENT__VISIBILITY;
			default:
				return -1;
			}
		}
		if (baseClass == SimpleMethod.class) {
			switch (derivedFeatureID) {
			case MethodPackage.METHOD__PARAMS:
				return MethodPackage.SIMPLE_METHOD__PARAMS;
			case MethodPackage.METHOD__PARAMS_KIND:
				return MethodPackage.SIMPLE_METHOD__PARAMS_KIND;
			case MethodPackage.METHOD__THROWN_EXCEPTIONS:
				return MethodPackage.SIMPLE_METHOD__THROWN_EXCEPTIONS;
			case MethodPackage.METHOD__BODY:
				return MethodPackage.SIMPLE_METHOD__BODY;
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
				return MethodPackage.METHOD__VISIBILITY;
			default:
				return -1;
			}
		}
		if (baseClass == SimpleMethod.class) {
			switch (baseFeatureID) {
			case MethodPackage.SIMPLE_METHOD__PARAMS:
				return MethodPackage.METHOD__PARAMS;
			case MethodPackage.SIMPLE_METHOD__PARAMS_KIND:
				return MethodPackage.METHOD__PARAMS_KIND;
			case MethodPackage.SIMPLE_METHOD__THROWN_EXCEPTIONS:
				return MethodPackage.METHOD__THROWN_EXCEPTIONS;
			case MethodPackage.SIMPLE_METHOD__BODY:
				return MethodPackage.METHOD__BODY;
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
		result.append(", static: ");
		if (staticESet)
			result.append(static_);
		else
			result.append("<unset>");
		result.append(", inheritance: ");
		result.append(inheritance);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
