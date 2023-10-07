/**
 */
package ccsl.elements.expressions.assignment.impl;

import ccsl.elements.expressions.assignment.AssignmentPackage;
import ccsl.elements.expressions.assignment.UnaryAssignment;
import ccsl.elements.expressions.assignment.UnaryAssignmentKind;
import ccsl.elements.expressions.assignment.UnaryAssignmentOperator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.assignment.impl.UnaryAssignmentImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link ccsl.elements.expressions.assignment.impl.UnaryAssignmentImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryAssignmentImpl extends SimpleAssignmentImpl implements UnaryAssignment {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final UnaryAssignmentKind KIND_EDEFAULT = UnaryAssignmentKind.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected UnaryAssignmentKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final UnaryAssignmentOperator OPERATOR_EDEFAULT = UnaryAssignmentOperator.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected UnaryAssignmentOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AssignmentPackage.Literals.UNARY_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryAssignmentKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(UnaryAssignmentKind newKind) {
		UnaryAssignmentKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.UNARY_ASSIGNMENT__KIND, oldKind,
					kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryAssignmentOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(UnaryAssignmentOperator newOperator) {
		UnaryAssignmentOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentPackage.UNARY_ASSIGNMENT__OPERATOR,
					oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AssignmentPackage.UNARY_ASSIGNMENT__KIND:
			return getKind();
		case AssignmentPackage.UNARY_ASSIGNMENT__OPERATOR:
			return getOperator();
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
		case AssignmentPackage.UNARY_ASSIGNMENT__KIND:
			setKind((UnaryAssignmentKind) newValue);
			return;
		case AssignmentPackage.UNARY_ASSIGNMENT__OPERATOR:
			setOperator((UnaryAssignmentOperator) newValue);
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
		case AssignmentPackage.UNARY_ASSIGNMENT__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case AssignmentPackage.UNARY_ASSIGNMENT__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
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
		case AssignmentPackage.UNARY_ASSIGNMENT__KIND:
			return kind != KIND_EDEFAULT;
		case AssignmentPackage.UNARY_ASSIGNMENT__OPERATOR:
			return operator != OPERATOR_EDEFAULT;
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
		result.append(", operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //UnaryAssignmentImpl
