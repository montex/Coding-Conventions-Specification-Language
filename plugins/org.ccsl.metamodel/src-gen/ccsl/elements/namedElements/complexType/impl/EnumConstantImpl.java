/**
 */
package ccsl.elements.namedElements.complexType.impl;

import ccsl.CollectionKind;

import ccsl.elements.expressions.Expression;

import ccsl.elements.namedElements.complexType.ComplexTypePackage;
import ccsl.elements.namedElements.complexType.EnumConstant;

import ccsl.elements.namedElements.impl.NamedElementImpl;

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
 * An implementation of the model object '<em><b>Enum Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.complexType.impl.EnumConstantImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.complexType.impl.EnumConstantImpl#getArgumentsKind <em>Arguments Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumConstantImpl extends NamedElementImpl implements EnumConstant {
	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList arguments;

	/**
	 * The default value of the '{@link #getArgumentsKind() <em>Arguments Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentsKind()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionKind ARGUMENTS_KIND_EDEFAULT = CollectionKind.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getArgumentsKind() <em>Arguments Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentsKind()
	 * @generated
	 * @ordered
	 */
	protected CollectionKind argumentsKind = ARGUMENTS_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ComplexTypePackage.Literals.ENUM_CONSTANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList.Unsettable(Expression.class, this,
					ComplexTypePackage.ENUM_CONSTANT__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArguments() {
		if (arguments != null)
			((InternalEList.Unsettable) arguments).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArguments() {
		return arguments != null && ((InternalEList.Unsettable) arguments).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKind getArgumentsKind() {
		return argumentsKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentsKind(CollectionKind newArgumentsKind) {
		CollectionKind oldArgumentsKind = argumentsKind;
		argumentsKind = newArgumentsKind == null ? ARGUMENTS_KIND_EDEFAULT : newArgumentsKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComplexTypePackage.ENUM_CONSTANT__ARGUMENTS_KIND,
					oldArgumentsKind, argumentsKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComplexTypePackage.ENUM_CONSTANT__ARGUMENTS:
			return ((InternalEList) getArguments()).basicRemove(otherEnd, msgs);
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
		case ComplexTypePackage.ENUM_CONSTANT__ARGUMENTS:
			return getArguments();
		case ComplexTypePackage.ENUM_CONSTANT__ARGUMENTS_KIND:
			return getArgumentsKind();
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
		case ComplexTypePackage.ENUM_CONSTANT__ARGUMENTS:
			getArguments().clear();
			getArguments().addAll((Collection) newValue);
			return;
		case ComplexTypePackage.ENUM_CONSTANT__ARGUMENTS_KIND:
			setArgumentsKind((CollectionKind) newValue);
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
		case ComplexTypePackage.ENUM_CONSTANT__ARGUMENTS:
			unsetArguments();
			return;
		case ComplexTypePackage.ENUM_CONSTANT__ARGUMENTS_KIND:
			setArgumentsKind(ARGUMENTS_KIND_EDEFAULT);
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
		case ComplexTypePackage.ENUM_CONSTANT__ARGUMENTS:
			return isSetArguments();
		case ComplexTypePackage.ENUM_CONSTANT__ARGUMENTS_KIND:
			return argumentsKind != ARGUMENTS_KIND_EDEFAULT;
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
		result.append(" (argumentsKind: ");
		result.append(argumentsKind);
		result.append(')');
		return result.toString();
	}

} //EnumConstantImpl
