/**
 */
package ccsl.elements.expressions.invocations.impl;

import ccsl.CollectionKind;

import ccsl.elements.datatype.ObjectType;

import ccsl.elements.expressions.Expression;

import ccsl.elements.expressions.impl.ExpressionImpl;

import ccsl.elements.expressions.invocations.Invocation;
import ccsl.elements.expressions.invocations.InvocationsPackage;

import ccsl.elements.namedElements.method.SimpleMethod;

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
 * An implementation of the model object '<em><b>Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.invocations.impl.InvocationImpl#getArgsKind <em>Args Kind</em>}</li>
 *   <li>{@link ccsl.elements.expressions.invocations.impl.InvocationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link ccsl.elements.expressions.invocations.impl.InvocationImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link ccsl.elements.expressions.invocations.impl.InvocationImpl#getTypeArgs <em>Type Args</em>}</li>
 *   <li>{@link ccsl.elements.expressions.invocations.impl.InvocationImpl#getTypeArgsKind <em>Type Args Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvocationImpl extends ExpressionImpl implements Invocation {
	/**
	 * The default value of the '{@link #getArgsKind() <em>Args Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgsKind()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionKind ARGS_KIND_EDEFAULT = CollectionKind.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getArgsKind() <em>Args Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgsKind()
	 * @generated
	 * @ordered
	 */
	protected CollectionKind argsKind = ARGS_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected SimpleMethod method;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EList args;

	/**
	 * The cached value of the '{@link #getTypeArgs() <em>Type Args</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeArgs()
	 * @generated
	 * @ordered
	 */
	protected EList typeArgs;

	/**
	 * The default value of the '{@link #getTypeArgsKind() <em>Type Args Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeArgsKind()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionKind TYPE_ARGS_KIND_EDEFAULT = CollectionKind.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getTypeArgsKind() <em>Type Args Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeArgsKind()
	 * @generated
	 * @ordered
	 */
	protected CollectionKind typeArgsKind = TYPE_ARGS_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InvocationsPackage.Literals.INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKind getArgsKind() {
		return argsKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgsKind(CollectionKind newArgsKind) {
		CollectionKind oldArgsKind = argsKind;
		argsKind = newArgsKind == null ? ARGS_KIND_EDEFAULT : newArgsKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvocationsPackage.INVOCATION__ARGS_KIND, oldArgsKind,
					argsKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMethod getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject) method;
			method = (SimpleMethod) eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvocationsPackage.INVOCATION__METHOD,
							oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMethod basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(SimpleMethod newMethod) {
		SimpleMethod oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvocationsPackage.INVOCATION__METHOD, oldMethod,
					method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArgs() {
		if (args == null) {
			args = new EObjectContainmentEList.Unsettable(Expression.class, this, InvocationsPackage.INVOCATION__ARGS);
		}
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArgs() {
		if (args != null)
			((InternalEList.Unsettable) args).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArgs() {
		return args != null && ((InternalEList.Unsettable) args).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTypeArgs() {
		if (typeArgs == null) {
			typeArgs = new EObjectResolvingEList(ObjectType.class, this, InvocationsPackage.INVOCATION__TYPE_ARGS);
		}
		return typeArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKind getTypeArgsKind() {
		return typeArgsKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeArgsKind(CollectionKind newTypeArgsKind) {
		CollectionKind oldTypeArgsKind = typeArgsKind;
		typeArgsKind = newTypeArgsKind == null ? TYPE_ARGS_KIND_EDEFAULT : newTypeArgsKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvocationsPackage.INVOCATION__TYPE_ARGS_KIND,
					oldTypeArgsKind, typeArgsKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InvocationsPackage.INVOCATION__ARGS:
			return ((InternalEList) getArgs()).basicRemove(otherEnd, msgs);
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
		case InvocationsPackage.INVOCATION__ARGS_KIND:
			return getArgsKind();
		case InvocationsPackage.INVOCATION__METHOD:
			if (resolve)
				return getMethod();
			return basicGetMethod();
		case InvocationsPackage.INVOCATION__ARGS:
			return getArgs();
		case InvocationsPackage.INVOCATION__TYPE_ARGS:
			return getTypeArgs();
		case InvocationsPackage.INVOCATION__TYPE_ARGS_KIND:
			return getTypeArgsKind();
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
		case InvocationsPackage.INVOCATION__ARGS_KIND:
			setArgsKind((CollectionKind) newValue);
			return;
		case InvocationsPackage.INVOCATION__METHOD:
			setMethod((SimpleMethod) newValue);
			return;
		case InvocationsPackage.INVOCATION__ARGS:
			getArgs().clear();
			getArgs().addAll((Collection) newValue);
			return;
		case InvocationsPackage.INVOCATION__TYPE_ARGS:
			getTypeArgs().clear();
			getTypeArgs().addAll((Collection) newValue);
			return;
		case InvocationsPackage.INVOCATION__TYPE_ARGS_KIND:
			setTypeArgsKind((CollectionKind) newValue);
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
		case InvocationsPackage.INVOCATION__ARGS_KIND:
			setArgsKind(ARGS_KIND_EDEFAULT);
			return;
		case InvocationsPackage.INVOCATION__METHOD:
			setMethod((SimpleMethod) null);
			return;
		case InvocationsPackage.INVOCATION__ARGS:
			unsetArgs();
			return;
		case InvocationsPackage.INVOCATION__TYPE_ARGS:
			getTypeArgs().clear();
			return;
		case InvocationsPackage.INVOCATION__TYPE_ARGS_KIND:
			setTypeArgsKind(TYPE_ARGS_KIND_EDEFAULT);
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
		case InvocationsPackage.INVOCATION__ARGS_KIND:
			return argsKind != ARGS_KIND_EDEFAULT;
		case InvocationsPackage.INVOCATION__METHOD:
			return method != null;
		case InvocationsPackage.INVOCATION__ARGS:
			return isSetArgs();
		case InvocationsPackage.INVOCATION__TYPE_ARGS:
			return typeArgs != null && !typeArgs.isEmpty();
		case InvocationsPackage.INVOCATION__TYPE_ARGS_KIND:
			return typeArgsKind != TYPE_ARGS_KIND_EDEFAULT;
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
		result.append(" (argsKind: ");
		result.append(argsKind);
		result.append(", typeArgsKind: ");
		result.append(typeArgsKind);
		result.append(')');
		return result.toString();
	}

} //InvocationImpl
