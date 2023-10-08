/**
 */
package ccsl.elements.expressions.arrays.impl;

import ccsl.CollectionKind;

import ccsl.elements.expressions.Expression;

import ccsl.elements.expressions.arrays.ArrayInitializer;
import ccsl.elements.expressions.arrays.ArraysPackage;

import ccsl.elements.expressions.impl.ExpressionImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.arrays.impl.ArrayInitializerImpl#getValues <em>Values</em>}</li>
 *   <li>{@link ccsl.elements.expressions.arrays.impl.ArrayInitializerImpl#getValuesKind <em>Values Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayInitializerImpl extends ExpressionImpl implements ArrayInitializer {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList values;

	/**
	 * The cached value of the '{@link #getValuesKind() <em>Values Kind</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuesKind()
	 * @generated
	 * @ordered
	 */
	protected EList valuesKind;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayInitializerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ArraysPackage.Literals.ARRAY_INITIALIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getValues() {
		if (values == null) {
			values = new EObjectContainmentEList(Expression.class, this, ArraysPackage.ARRAY_INITIALIZER__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getValuesKind() {
		if (valuesKind == null) {
			valuesKind = new EDataTypeUniqueEList.Unsettable(CollectionKind.class, this,
					ArraysPackage.ARRAY_INITIALIZER__VALUES_KIND);
		}
		return valuesKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValuesKind() {
		if (valuesKind != null)
			((InternalEList.Unsettable) valuesKind).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValuesKind() {
		return valuesKind != null && ((InternalEList.Unsettable) valuesKind).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArraysPackage.ARRAY_INITIALIZER__VALUES:
			return ((InternalEList) getValues()).basicRemove(otherEnd, msgs);
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
		case ArraysPackage.ARRAY_INITIALIZER__VALUES:
			return getValues();
		case ArraysPackage.ARRAY_INITIALIZER__VALUES_KIND:
			return getValuesKind();
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
		case ArraysPackage.ARRAY_INITIALIZER__VALUES:
			getValues().clear();
			getValues().addAll((Collection) newValue);
			return;
		case ArraysPackage.ARRAY_INITIALIZER__VALUES_KIND:
			getValuesKind().clear();
			getValuesKind().addAll((Collection) newValue);
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
		case ArraysPackage.ARRAY_INITIALIZER__VALUES:
			getValues().clear();
			return;
		case ArraysPackage.ARRAY_INITIALIZER__VALUES_KIND:
			unsetValuesKind();
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
		case ArraysPackage.ARRAY_INITIALIZER__VALUES:
			return values != null && !values.isEmpty();
		case ArraysPackage.ARRAY_INITIALIZER__VALUES_KIND:
			return isSetValuesKind();
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
		result.append(" (valuesKind: ");
		result.append(valuesKind);
		result.append(')');
		return result.toString();
	}

} //ArrayInitializerImpl
