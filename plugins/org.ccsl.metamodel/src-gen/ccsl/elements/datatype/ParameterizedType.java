/**
 */
package ccsl.elements.datatype;

import ccsl.elements.namedElements.complexType.TypeDeclaration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.datatype.ParameterizedType#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link ccsl.elements.datatype.ParameterizedType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.datatype.DatatypePackage#getParameterizedType()
 * @model
 * @generated
 */
public interface ParameterizedType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Type Arguments</b></em>' reference list.
	 * The list contents are of type {@link ccsl.elements.datatype.ObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Arguments</em>' reference list.
	 * @see ccsl.elements.datatype.DatatypePackage#getParameterizedType_TypeArguments()
	 * @model type="ccsl.elements.datatype.ObjectType"
	 * @generated
	 */
	EList getTypeArguments();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeDeclaration)
	 * @see ccsl.elements.datatype.DatatypePackage#getParameterizedType_Type()
	 * @model
	 * @generated
	 */
	TypeDeclaration getType();

	/**
	 * Sets the value of the '{@link ccsl.elements.datatype.ParameterizedType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDeclaration value);

} // ParameterizedType
