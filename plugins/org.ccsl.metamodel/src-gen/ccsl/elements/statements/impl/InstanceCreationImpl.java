/**
 */
package ccsl.elements.statements.impl;

import ccsl.CollectionKind;

import ccsl.elements.datatype.ObjectType;

import ccsl.elements.namedElements.method.Constructor;

import ccsl.elements.statements.InstanceCreation;
import ccsl.elements.statements.Statement;
import ccsl.elements.statements.StatementsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Creation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.impl.InstanceCreationImpl#getType <em>Type</em>}</li>
 *   <li>{@link ccsl.elements.statements.impl.InstanceCreationImpl#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link ccsl.elements.statements.impl.InstanceCreationImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link ccsl.elements.statements.impl.InstanceCreationImpl#getArgsKind <em>Args Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceCreationImpl extends StatementImpl implements InstanceCreation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ObjectType type;

	/**
	 * The cached value of the '{@link #getConstructor() <em>Constructor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructor()
	 * @generated
	 * @ordered
	 */
	protected Constructor constructor;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceCreationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.INSTANCE_CREATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (ObjectType) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.INSTANCE_CREATION__TYPE,
							oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ObjectType newType) {
		ObjectType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.INSTANCE_CREATION__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constructor getConstructor() {
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstructor(Constructor newConstructor, NotificationChain msgs) {
		Constructor oldConstructor = constructor;
		constructor = newConstructor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatementsPackage.INSTANCE_CREATION__CONSTRUCTOR, oldConstructor, newConstructor);
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
	public void setConstructor(Constructor newConstructor) {
		if (newConstructor != constructor) {
			NotificationChain msgs = null;
			if (constructor != null)
				msgs = ((InternalEObject) constructor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatementsPackage.INSTANCE_CREATION__CONSTRUCTOR, null, msgs);
			if (newConstructor != null)
				msgs = ((InternalEObject) newConstructor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatementsPackage.INSTANCE_CREATION__CONSTRUCTOR, null, msgs);
			msgs = basicSetConstructor(newConstructor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.INSTANCE_CREATION__CONSTRUCTOR,
					newConstructor, newConstructor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArgs() {
		if (args == null) {
			args = new EObjectContainmentEList.Unsettable(Statement.class, this,
					StatementsPackage.INSTANCE_CREATION__ARGS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.INSTANCE_CREATION__ARGS_KIND,
					oldArgsKind, argsKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatementsPackage.INSTANCE_CREATION__CONSTRUCTOR:
			return basicSetConstructor(null, msgs);
		case StatementsPackage.INSTANCE_CREATION__ARGS:
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
		case StatementsPackage.INSTANCE_CREATION__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case StatementsPackage.INSTANCE_CREATION__CONSTRUCTOR:
			return getConstructor();
		case StatementsPackage.INSTANCE_CREATION__ARGS:
			return getArgs();
		case StatementsPackage.INSTANCE_CREATION__ARGS_KIND:
			return getArgsKind();
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
		case StatementsPackage.INSTANCE_CREATION__TYPE:
			setType((ObjectType) newValue);
			return;
		case StatementsPackage.INSTANCE_CREATION__CONSTRUCTOR:
			setConstructor((Constructor) newValue);
			return;
		case StatementsPackage.INSTANCE_CREATION__ARGS:
			getArgs().clear();
			getArgs().addAll((Collection) newValue);
			return;
		case StatementsPackage.INSTANCE_CREATION__ARGS_KIND:
			setArgsKind((CollectionKind) newValue);
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
		case StatementsPackage.INSTANCE_CREATION__TYPE:
			setType((ObjectType) null);
			return;
		case StatementsPackage.INSTANCE_CREATION__CONSTRUCTOR:
			setConstructor((Constructor) null);
			return;
		case StatementsPackage.INSTANCE_CREATION__ARGS:
			unsetArgs();
			return;
		case StatementsPackage.INSTANCE_CREATION__ARGS_KIND:
			setArgsKind(ARGS_KIND_EDEFAULT);
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
		case StatementsPackage.INSTANCE_CREATION__TYPE:
			return type != null;
		case StatementsPackage.INSTANCE_CREATION__CONSTRUCTOR:
			return constructor != null;
		case StatementsPackage.INSTANCE_CREATION__ARGS:
			return isSetArgs();
		case StatementsPackage.INSTANCE_CREATION__ARGS_KIND:
			return argsKind != ARGS_KIND_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //InstanceCreationImpl
