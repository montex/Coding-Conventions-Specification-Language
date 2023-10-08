/**
 */
package ccsl.elements.expressions.invocations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ccsl.elements.expressions.invocations.InvocationsPackage
 * @generated
 */
public interface InvocationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InvocationsFactory eINSTANCE = ccsl.elements.expressions.invocations.impl.InvocationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Invocation</em>'.
	 * @generated
	 */
	MethodInvocation createMethodInvocation();

	/**
	 * Returns a new object of class '<em>Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invocation</em>'.
	 * @generated
	 */
	Invocation createInvocation();

	/**
	 * Returns a new object of class '<em>Constructor Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor Invocation</em>'.
	 * @generated
	 */
	ConstructorInvocation createConstructorInvocation();

	/**
	 * Returns a new object of class '<em>Super Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super Method Invocation</em>'.
	 * @generated
	 */
	SuperMethodInvocation createSuperMethodInvocation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InvocationsPackage getInvocationsPackage();

} //InvocationsFactory
