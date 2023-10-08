/**
 */
package org.ccsl.metamodel.faultTypeDescription;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ccsl.metamodel.faultTypeDescription.FaultypesPackage
 * @generated
 */
public interface FaultypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FaultypesFactory eINSTANCE = org.ccsl.metamodel.faultTypeDescription.impl.FaultypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fault Type Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Type Description</em>'.
	 * @generated
	 */
	FaultTypeDescription createFaultTypeDescription();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FaultypesPackage getFaultypesPackage();

} //FaultypesFactory
