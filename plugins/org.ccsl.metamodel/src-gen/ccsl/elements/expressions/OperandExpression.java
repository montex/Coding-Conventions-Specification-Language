/**
 */
package ccsl.elements.expressions;

import ccsl.CollectionKind;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.OperandExpression#getOperands <em>Operands</em>}</li>
 *   <li>{@link ccsl.elements.expressions.OperandExpression#getKind <em>Kind</em>}</li>
 *   <li>{@link ccsl.elements.expressions.OperandExpression#getOperandsKind <em>Operands Kind</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.expressions.ExpressionsPackage#getOperandExpression()
 * @model
 * @generated
 */
public interface OperandExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see #isSetOperands()
	 * @see #unsetOperands()
	 * @see ccsl.elements.expressions.ExpressionsPackage#getOperandExpression_Operands()
	 * @model type="ccsl.elements.expressions.Expression" containment="true" unsettable="true"
	 * @generated
	 */
	EList getOperands();

	/**
	 * Unsets the value of the '{@link ccsl.elements.expressions.OperandExpression#getOperands <em>Operands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperands()
	 * @see #getOperands()
	 * @generated
	 */
	void unsetOperands();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.expressions.OperandExpression#getOperands <em>Operands</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operands</em>' containment reference list is set.
	 * @see #unsetOperands()
	 * @see #getOperands()
	 * @generated
	 */
	boolean isSetOperands();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.elements.expressions.ExpressionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see ccsl.elements.expressions.ExpressionKind
	 * @see #setKind(ExpressionKind)
	 * @see ccsl.elements.expressions.ExpressionsPackage#getOperandExpression_Kind()
	 * @model default="ANY"
	 * @generated
	 */
	ExpressionKind getKind();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.OperandExpression#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see ccsl.elements.expressions.ExpressionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ExpressionKind value);

	/**
	 * Returns the value of the '<em><b>Operands Kind</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #setOperandsKind(CollectionKind)
	 * @see ccsl.elements.expressions.ExpressionsPackage#getOperandExpression_OperandsKind()
	 * @model default="ANY"
	 * @generated
	 */
	CollectionKind getOperandsKind();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.OperandExpression#getOperandsKind <em>Operands Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operands Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #getOperandsKind()
	 * @generated
	 */
	void setOperandsKind(CollectionKind value);

} // OperandExpression
