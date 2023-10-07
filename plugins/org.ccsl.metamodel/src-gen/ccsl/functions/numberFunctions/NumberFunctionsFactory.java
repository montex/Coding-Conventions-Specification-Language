/**
 */
package ccsl.functions.numberFunctions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ccsl.functions.numberFunctions.NumberFunctionsPackage
 * @generated
 */
public interface NumberFunctionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NumberFunctionsFactory eINSTANCE = ccsl.functions.numberFunctions.impl.NumberFunctionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ccsl Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ccsl Integer Literal</em>'.
	 * @generated
	 */
	CcslIntegerLiteral createCcslIntegerLiteral();

	/**
	 * Returns a new object of class '<em>Get Index Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Index Of</em>'.
	 * @generated
	 */
	GetIndexOf createGetIndexOf();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NumberFunctionsPackage getNumberFunctionsPackage();

} //NumberFunctionsFactory
