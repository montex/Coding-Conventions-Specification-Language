/**
 */
package ccsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.CompositeRule#getOperator <em>Operator</em>}</li>
 *   <li>{@link ccsl.CompositeRule#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see ccsl.ccslPackage#getCompositeRule()
 * @model
 * @generated
 */
public interface CompositeRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ccsl.LogicOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see ccsl.LogicOperator
	 * @see #setOperator(LogicOperator)
	 * @see ccsl.ccslPackage#getCompositeRule_Operator()
	 * @model
	 * @generated
	 */
	LogicOperator getOperator();

	/**
	 * Sets the value of the '{@link ccsl.CompositeRule#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see ccsl.LogicOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicOperator value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see ccsl.ccslPackage#getCompositeRule_Rules()
	 * @model type="ccsl.Rule" containment="true" lower="2"
	 * @generated
	 */
	EList getRules();

} // CompositeRule
