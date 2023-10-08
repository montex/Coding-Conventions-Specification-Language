/**
 */
package ccsl.elements.statements.tryCatch;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ccsl.elements.statements.tryCatch.TryCatchPackage
 * @generated
 */
public interface TryCatchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TryCatchFactory eINSTANCE = ccsl.elements.statements.tryCatch.impl.TryCatchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Try Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Try Statement</em>'.
	 * @generated
	 */
	TryStatement createTryStatement();

	/**
	 * Returns a new object of class '<em>Catch Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catch Clause</em>'.
	 * @generated
	 */
	CatchClause createCatchClause();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TryCatchPackage getTryCatchPackage();

} //TryCatchFactory
