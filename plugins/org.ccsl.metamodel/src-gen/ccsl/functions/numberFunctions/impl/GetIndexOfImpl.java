/**
 */
package ccsl.functions.numberFunctions.impl;

import ccsl.elements.Element;

import ccsl.functions.numberFunctions.GetIndexOf;
import ccsl.functions.numberFunctions.NumberFunctionsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Index Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.numberFunctions.impl.GetIndexOfImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link ccsl.functions.numberFunctions.impl.GetIndexOfImpl#getField <em>Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetIndexOfImpl extends CcslNumberFunctionImpl implements GetIndexOf {
	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected Element container;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected Element field;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetIndexOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NumberFunctionsPackage.Literals.GET_INDEX_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject) container;
			container = (Element) eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							NumberFunctionsPackage.GET_INDEX_OF__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(Element newContainer) {
		Element oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NumberFunctionsPackage.GET_INDEX_OF__CONTAINER,
					oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getField() {
		if (field != null && field.eIsProxy()) {
			InternalEObject oldField = (InternalEObject) field;
			field = (Element) eResolveProxy(oldField);
			if (field != oldField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							NumberFunctionsPackage.GET_INDEX_OF__FIELD, oldField, field));
			}
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField(Element newField) {
		Element oldField = field;
		field = newField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NumberFunctionsPackage.GET_INDEX_OF__FIELD, oldField,
					field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NumberFunctionsPackage.GET_INDEX_OF__CONTAINER:
			if (resolve)
				return getContainer();
			return basicGetContainer();
		case NumberFunctionsPackage.GET_INDEX_OF__FIELD:
			if (resolve)
				return getField();
			return basicGetField();
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
		case NumberFunctionsPackage.GET_INDEX_OF__CONTAINER:
			setContainer((Element) newValue);
			return;
		case NumberFunctionsPackage.GET_INDEX_OF__FIELD:
			setField((Element) newValue);
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
		case NumberFunctionsPackage.GET_INDEX_OF__CONTAINER:
			setContainer((Element) null);
			return;
		case NumberFunctionsPackage.GET_INDEX_OF__FIELD:
			setField((Element) null);
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
		case NumberFunctionsPackage.GET_INDEX_OF__CONTAINER:
			return container != null;
		case NumberFunctionsPackage.GET_INDEX_OF__FIELD:
			return field != null;
		}
		return super.eIsSet(featureID);
	}

} //GetIndexOfImpl
