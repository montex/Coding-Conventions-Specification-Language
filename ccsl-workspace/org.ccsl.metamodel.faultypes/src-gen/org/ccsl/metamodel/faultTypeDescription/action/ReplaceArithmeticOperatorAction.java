/**
 */
package org.ccsl.metamodel.faultTypeDescription.action;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replace Arithmetic Operator Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ccsl.metamodel.faultTypeDescription.action.ReplaceArithmeticOperatorAction#getReplaceMap <em>Replace Map</em>}</li>
 * </ul>
 *
 * @see org.ccsl.metamodel.faultTypeDescription.action.ActionPackage#getReplaceArithmeticOperatorAction()
 * @model
 * @generated
 */
public interface ReplaceArithmeticOperatorAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Replace Map</b></em>' containment reference list.
	 * The list contents are of type {@link org.ccsl.metamodel.faultTypeDescription.action.ArithmeticOperatorMap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replace Map</em>' containment reference list.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.ActionPackage#getReplaceArithmeticOperatorAction_ReplaceMap()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ArithmeticOperatorMap> getReplaceMap();

} // ReplaceArithmeticOperatorAction
