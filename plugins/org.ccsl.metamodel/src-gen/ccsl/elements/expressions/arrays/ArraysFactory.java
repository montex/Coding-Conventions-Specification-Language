/**
 */
package ccsl.elements.expressions.arrays;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ccsl.elements.expressions.arrays.ArraysPackage
 * @generated
 */
public interface ArraysFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArraysFactory eINSTANCE = ccsl.elements.expressions.arrays.impl.ArraysFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Array Creation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Creation</em>'.
	 * @generated
	 */
	ArrayCreation createArrayCreation();

	/**
	 * Returns a new object of class '<em>Array Indexes Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Indexes Access</em>'.
	 * @generated
	 */
	ArrayIndexesAccess createArrayIndexesAccess();

	/**
	 * Returns a new object of class '<em>Array Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Initializer</em>'.
	 * @generated
	 */
	ArrayInitializer createArrayInitializer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArraysPackage getArraysPackage();

} //ArraysFactory
