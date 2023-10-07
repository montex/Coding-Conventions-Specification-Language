/**
 */
package ccsl.elements;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.Element#getUniqueName <em>Unique Name</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.ElementsPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Name</em>' attribute.
	 * @see #setUniqueName(String)
	 * @see ccsl.elements.ElementsPackage#getElement_UniqueName()
	 * @model id="true"
	 * @generated
	 */
	String getUniqueName();

	/**
	 * Sets the value of the '{@link ccsl.elements.Element#getUniqueName <em>Unique Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Name</em>' attribute.
	 * @see #getUniqueName()
	 * @generated
	 */
	void setUniqueName(String value);

} // Element
