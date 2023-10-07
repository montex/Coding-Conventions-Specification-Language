/**
 */
package ccsl.functions.booleanFunctions.filters;

import ccsl.elements.Element;

import ccsl.elements.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implicity Operand Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.ImplicityOperandFilter#getImplicityOperand <em>Implicity Operand</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.ImplicityOperandFilter#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getImplicityOperandFilter()
 * @model
 * @generated
 */
public interface ImplicityOperandFilter extends TemplateFilter {
	/**
	 * Returns the value of the '<em><b>Implicity Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicity Operand</em>' reference.
	 * @see #setImplicityOperand(Element)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getImplicityOperandFilter_ImplicityOperand()
	 * @model required="true"
	 * @generated
	 */
	Element getImplicityOperand();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.ImplicityOperandFilter#getImplicityOperand <em>Implicity Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicity Operand</em>' reference.
	 * @see #getImplicityOperand()
	 * @generated
	 */
	void setImplicityOperand(Element value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(Expression)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getImplicityOperandFilter_Expression()
	 * @model required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.ImplicityOperandFilter#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // ImplicityOperandFilter
