/**
 */
package ccsl.elements.datatype;

import ccsl.CollectionKind;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.datatype.TypeParameter#getBounds <em>Bounds</em>}</li>
 *   <li>{@link ccsl.elements.datatype.TypeParameter#getBoundsKind <em>Bounds Kind</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.datatype.DatatypePackage#getTypeParameter()
 * @model
 * @generated
 */
public interface TypeParameter extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' reference list.
	 * The list contents are of type {@link ccsl.elements.datatype.ObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' reference list.
	 * @see ccsl.elements.datatype.DatatypePackage#getTypeParameter_Bounds()
	 * @model type="ccsl.elements.datatype.ObjectType"
	 * @generated
	 */
	EList getBounds();

	/**
	 * Returns the value of the '<em><b>Bounds Kind</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #setBoundsKind(CollectionKind)
	 * @see ccsl.elements.datatype.DatatypePackage#getTypeParameter_BoundsKind()
	 * @model default="ANY"
	 * @generated
	 */
	CollectionKind getBoundsKind();

	/**
	 * Sets the value of the '{@link ccsl.elements.datatype.TypeParameter#getBoundsKind <em>Bounds Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #getBoundsKind()
	 * @generated
	 */
	void setBoundsKind(CollectionKind value);

} // TypeParameter
