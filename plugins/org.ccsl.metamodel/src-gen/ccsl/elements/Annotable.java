/**
 */
package ccsl.elements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.Annotable#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.ElementsPackage#getAnnotable()
 * @model abstract="true"
 * @generated
 */
public interface Annotable extends Element {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.expressions.annotation.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see ccsl.elements.ElementsPackage#getAnnotable_Annotations()
	 * @model type="ccsl.elements.expressions.annotation.Annotation" containment="true"
	 * @generated
	 */
	EList getAnnotations();

} // Annotable
