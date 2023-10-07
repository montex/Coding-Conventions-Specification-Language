/**
 */
package ccsl.functions.booleanFunctions.filters.impl;

import ccsl.elements.Element;

import ccsl.elements.expressions.Expression;

import ccsl.functions.booleanFunctions.filters.FiltersPackage;
import ccsl.functions.booleanFunctions.filters.ImplicityOperandFilter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implicity Operand Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.ImplicityOperandFilterImpl#getImplicityOperand <em>Implicity Operand</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.impl.ImplicityOperandFilterImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplicityOperandFilterImpl extends TemplateFilterImpl implements ImplicityOperandFilter {
	/**
	 * The cached value of the '{@link #getImplicityOperand() <em>Implicity Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicityOperand()
	 * @generated
	 * @ordered
	 */
	protected Element implicityOperand;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicityOperandFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FiltersPackage.Literals.IMPLICITY_OPERAND_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getImplicityOperand() {
		if (implicityOperand != null && implicityOperand.eIsProxy()) {
			InternalEObject oldImplicityOperand = (InternalEObject) implicityOperand;
			implicityOperand = (Element) eResolveProxy(oldImplicityOperand);
			if (implicityOperand != oldImplicityOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FiltersPackage.IMPLICITY_OPERAND_FILTER__IMPLICITY_OPERAND, oldImplicityOperand,
							implicityOperand));
			}
		}
		return implicityOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetImplicityOperand() {
		return implicityOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplicityOperand(Element newImplicityOperand) {
		Element oldImplicityOperand = implicityOperand;
		implicityOperand = newImplicityOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FiltersPackage.IMPLICITY_OPERAND_FILTER__IMPLICITY_OPERAND, oldImplicityOperand, implicityOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		if (expression != null && expression.eIsProxy()) {
			InternalEObject oldExpression = (InternalEObject) expression;
			expression = (Expression) eResolveProxy(oldExpression);
			if (expression != oldExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FiltersPackage.IMPLICITY_OPERAND_FILTER__EXPRESSION, oldExpression, expression));
			}
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.IMPLICITY_OPERAND_FILTER__EXPRESSION,
					oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FiltersPackage.IMPLICITY_OPERAND_FILTER__IMPLICITY_OPERAND:
			if (resolve)
				return getImplicityOperand();
			return basicGetImplicityOperand();
		case FiltersPackage.IMPLICITY_OPERAND_FILTER__EXPRESSION:
			if (resolve)
				return getExpression();
			return basicGetExpression();
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
		case FiltersPackage.IMPLICITY_OPERAND_FILTER__IMPLICITY_OPERAND:
			setImplicityOperand((Element) newValue);
			return;
		case FiltersPackage.IMPLICITY_OPERAND_FILTER__EXPRESSION:
			setExpression((Expression) newValue);
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
		case FiltersPackage.IMPLICITY_OPERAND_FILTER__IMPLICITY_OPERAND:
			setImplicityOperand((Element) null);
			return;
		case FiltersPackage.IMPLICITY_OPERAND_FILTER__EXPRESSION:
			setExpression((Expression) null);
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
		case FiltersPackage.IMPLICITY_OPERAND_FILTER__IMPLICITY_OPERAND:
			return implicityOperand != null;
		case FiltersPackage.IMPLICITY_OPERAND_FILTER__EXPRESSION:
			return expression != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplicityOperandFilterImpl
