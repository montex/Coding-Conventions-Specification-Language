/**
 */
package ccsl.elements.expressions.impl;

import ccsl.CollectionKind;

import ccsl.elements.expressions.Expression;
import ccsl.elements.expressions.ExpressionKind;
import ccsl.elements.expressions.ExpressionsPackage;
import ccsl.elements.expressions.OperandExpression;

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
 * An implementation of the model object '<em><b>Operand Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.impl.OperandExpressionImpl#getOperands <em>Operands</em>}</li>
 *   <li>{@link ccsl.elements.expressions.impl.OperandExpressionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link ccsl.elements.expressions.impl.OperandExpressionImpl#getOperandsKind <em>Operands Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperandExpressionImpl extends ExpressionImpl implements OperandExpression {
	/**
	 * The cached value of the '{@link #getOperands() <em>Operands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperands()
	 * @generated
	 * @ordered
	 */
	protected EList operands;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ExpressionKind KIND_EDEFAULT = ExpressionKind.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ExpressionKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperandsKind() <em>Operands Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandsKind()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionKind OPERANDS_KIND_EDEFAULT = CollectionKind.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getOperandsKind() <em>Operands Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandsKind()
	 * @generated
	 * @ordered
	 */
	protected CollectionKind operandsKind = OPERANDS_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperandExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.OPERAND_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOperands() {
		if (operands == null) {
			operands = new EObjectContainmentEList.Unsettable(Expression.class, this,
					ExpressionsPackage.OPERAND_EXPRESSION__OPERANDS);
		}
		return operands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperands() {
		if (operands != null)
			((InternalEList.Unsettable) operands).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperands() {
		return operands != null && ((InternalEList.Unsettable) operands).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ExpressionKind newKind) {
		ExpressionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.OPERAND_EXPRESSION__KIND, oldKind,
					kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKind getOperandsKind() {
		return operandsKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperandsKind(CollectionKind newOperandsKind) {
		CollectionKind oldOperandsKind = operandsKind;
		operandsKind = newOperandsKind == null ? OPERANDS_KIND_EDEFAULT : newOperandsKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.OPERAND_EXPRESSION__OPERANDS_KIND,
					oldOperandsKind, operandsKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExpressionsPackage.OPERAND_EXPRESSION__OPERANDS:
			return ((InternalEList) getOperands()).basicRemove(otherEnd, msgs);
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
		case ExpressionsPackage.OPERAND_EXPRESSION__OPERANDS:
			return getOperands();
		case ExpressionsPackage.OPERAND_EXPRESSION__KIND:
			return getKind();
		case ExpressionsPackage.OPERAND_EXPRESSION__OPERANDS_KIND:
			return getOperandsKind();
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
		case ExpressionsPackage.OPERAND_EXPRESSION__OPERANDS:
			getOperands().clear();
			getOperands().addAll((Collection) newValue);
			return;
		case ExpressionsPackage.OPERAND_EXPRESSION__KIND:
			setKind((ExpressionKind) newValue);
			return;
		case ExpressionsPackage.OPERAND_EXPRESSION__OPERANDS_KIND:
			setOperandsKind((CollectionKind) newValue);
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
		case ExpressionsPackage.OPERAND_EXPRESSION__OPERANDS:
			unsetOperands();
			return;
		case ExpressionsPackage.OPERAND_EXPRESSION__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case ExpressionsPackage.OPERAND_EXPRESSION__OPERANDS_KIND:
			setOperandsKind(OPERANDS_KIND_EDEFAULT);
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
		case ExpressionsPackage.OPERAND_EXPRESSION__OPERANDS:
			return isSetOperands();
		case ExpressionsPackage.OPERAND_EXPRESSION__KIND:
			return kind != KIND_EDEFAULT;
		case ExpressionsPackage.OPERAND_EXPRESSION__OPERANDS_KIND:
			return operandsKind != OPERANDS_KIND_EDEFAULT;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", operandsKind: ");
		result.append(operandsKind);
		result.append(')');
		return result.toString();
	}

} //OperandExpressionImpl
