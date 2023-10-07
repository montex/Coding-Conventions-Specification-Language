/**
 */
package ccsl.functions.booleanFunctions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ccsl.functions.booleanFunctions.BooleanFunctionsPackage
 * @generated
 */
public interface BooleanFunctionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BooleanFunctionsFactory eINSTANCE = ccsl.functions.booleanFunctions.impl.BooleanFunctionsFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BooleanFunctionsPackage getBooleanFunctionsPackage();

} //BooleanFunctionsFactory
