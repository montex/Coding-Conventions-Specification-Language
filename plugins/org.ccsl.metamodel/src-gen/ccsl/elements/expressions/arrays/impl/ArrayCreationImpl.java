/**
 */
package ccsl.elements.expressions.arrays.impl;

import ccsl.CollectionKind;

import ccsl.elements.datatype.ObjectType;

import ccsl.elements.expressions.Expression;

import ccsl.elements.expressions.arrays.ArrayCreation;
import ccsl.elements.expressions.arrays.ArrayInitializer;
import ccsl.elements.expressions.arrays.ArraysPackage;

import ccsl.elements.expressions.impl.ExpressionImpl;

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
 * An implementation of the model object '<em><b>Array Creation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.arrays.impl.ArrayCreationImpl#getType <em>Type</em>}</li>
 *   <li>{@link ccsl.elements.expressions.arrays.impl.ArrayCreationImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link ccsl.elements.expressions.arrays.impl.ArrayCreationImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link ccsl.elements.expressions.arrays.impl.ArrayCreationImpl#getDimensionsKind <em>Dimensions Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayCreationImpl extends ExpressionImpl implements ArrayCreation {
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
	 * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected ArrayInitializer initializer;

	/**
	 * This is true if the Initializer containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initializerESet;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList dimensions;

	/**
	 * The default value of the '{@link #getDimensionsKind() <em>Dimensions Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionsKind()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionKind DIMENSIONS_KIND_EDEFAULT = CollectionKind.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getDimensionsKind() <em>Dimensions Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionsKind()
	 * @generated
	 * @ordered
	 */
	protected CollectionKind dimensionsKind = DIMENSIONS_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayCreationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ArraysPackage.Literals.ARRAY_CREATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArraysPackage.ARRAY_CREATION__TYPE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArraysPackage.ARRAY_CREATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInitializer getInitializer() {
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitializer(ArrayInitializer newInitializer, NotificationChain msgs) {
		ArrayInitializer oldInitializer = initializer;
		initializer = newInitializer;
		boolean oldInitializerESet = initializerESet;
		initializerESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArraysPackage.ARRAY_CREATION__INITIALIZER, oldInitializer, newInitializer, !oldInitializerESet);
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
	public void setInitializer(ArrayInitializer newInitializer) {
		if (newInitializer != initializer) {
			NotificationChain msgs = null;
			if (initializer != null)
				msgs = ((InternalEObject) initializer).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArraysPackage.ARRAY_CREATION__INITIALIZER, null, msgs);
			if (newInitializer != null)
				msgs = ((InternalEObject) newInitializer).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArraysPackage.ARRAY_CREATION__INITIALIZER, null, msgs);
			msgs = basicSetInitializer(newInitializer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldInitializerESet = initializerESet;
			initializerESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ArraysPackage.ARRAY_CREATION__INITIALIZER,
						newInitializer, newInitializer, !oldInitializerESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetInitializer(NotificationChain msgs) {
		ArrayInitializer oldInitializer = initializer;
		initializer = null;
		boolean oldInitializerESet = initializerESet;
		initializerESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET,
					ArraysPackage.ARRAY_CREATION__INITIALIZER, oldInitializer, null, oldInitializerESet);
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
	public void unsetInitializer() {
		if (initializer != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject) initializer).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - ArraysPackage.ARRAY_CREATION__INITIALIZER, null, msgs);
			msgs = basicUnsetInitializer(msgs);
			if (msgs != null)
				msgs.dispatch();
		} else {
			boolean oldInitializerESet = initializerESet;
			initializerESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, ArraysPackage.ARRAY_CREATION__INITIALIZER, null,
						null, oldInitializerESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInitializer() {
		return initializerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDimensions() {
		if (dimensions == null) {
			dimensions = new EObjectContainmentEList.Unsettable(Expression.class, this,
					ArraysPackage.ARRAY_CREATION__DIMENSIONS);
		}
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDimensions() {
		if (dimensions != null)
			((InternalEList.Unsettable) dimensions).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDimensions() {
		return dimensions != null && ((InternalEList.Unsettable) dimensions).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKind getDimensionsKind() {
		return dimensionsKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensionsKind(CollectionKind newDimensionsKind) {
		CollectionKind oldDimensionsKind = dimensionsKind;
		dimensionsKind = newDimensionsKind == null ? DIMENSIONS_KIND_EDEFAULT : newDimensionsKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArraysPackage.ARRAY_CREATION__DIMENSIONS_KIND,
					oldDimensionsKind, dimensionsKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArraysPackage.ARRAY_CREATION__INITIALIZER:
			return basicUnsetInitializer(msgs);
		case ArraysPackage.ARRAY_CREATION__DIMENSIONS:
			return ((InternalEList) getDimensions()).basicRemove(otherEnd, msgs);
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
		case ArraysPackage.ARRAY_CREATION__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case ArraysPackage.ARRAY_CREATION__INITIALIZER:
			return getInitializer();
		case ArraysPackage.ARRAY_CREATION__DIMENSIONS:
			return getDimensions();
		case ArraysPackage.ARRAY_CREATION__DIMENSIONS_KIND:
			return getDimensionsKind();
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
		case ArraysPackage.ARRAY_CREATION__TYPE:
			setType((ObjectType) newValue);
			return;
		case ArraysPackage.ARRAY_CREATION__INITIALIZER:
			setInitializer((ArrayInitializer) newValue);
			return;
		case ArraysPackage.ARRAY_CREATION__DIMENSIONS:
			getDimensions().clear();
			getDimensions().addAll((Collection) newValue);
			return;
		case ArraysPackage.ARRAY_CREATION__DIMENSIONS_KIND:
			setDimensionsKind((CollectionKind) newValue);
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
		case ArraysPackage.ARRAY_CREATION__TYPE:
			setType((ObjectType) null);
			return;
		case ArraysPackage.ARRAY_CREATION__INITIALIZER:
			unsetInitializer();
			return;
		case ArraysPackage.ARRAY_CREATION__DIMENSIONS:
			unsetDimensions();
			return;
		case ArraysPackage.ARRAY_CREATION__DIMENSIONS_KIND:
			setDimensionsKind(DIMENSIONS_KIND_EDEFAULT);
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
		case ArraysPackage.ARRAY_CREATION__TYPE:
			return type != null;
		case ArraysPackage.ARRAY_CREATION__INITIALIZER:
			return isSetInitializer();
		case ArraysPackage.ARRAY_CREATION__DIMENSIONS:
			return isSetDimensions();
		case ArraysPackage.ARRAY_CREATION__DIMENSIONS_KIND:
			return dimensionsKind != DIMENSIONS_KIND_EDEFAULT;
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
		result.append(" (dimensionsKind: ");
		result.append(dimensionsKind);
		result.append(')');
		return result.toString();
	}

} //ArrayCreationImpl
