/**
 */
package ccsl.functions.booleanFunctions.filters;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Same Name Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.SameNameFilter#getElements <em>Elements</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.SameNameFilter#isIgnoreCase <em>Ignore Case</em>}</li>
 * </ul>
 *
 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getSameNameFilter()
 * @model
 * @generated
 */
public interface SameNameFilter extends AtomicFilter {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link ccsl.elements.namedElements.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getSameNameFilter_Elements()
	 * @model type="ccsl.elements.namedElements.NamedElement"
	 * @generated
	 */
	EList getElements();

	/**
	 * Returns the value of the '<em><b>Ignore Case</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Case</em>' attribute.
	 * @see #setIgnoreCase(boolean)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getSameNameFilter_IgnoreCase()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIgnoreCase();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.SameNameFilter#isIgnoreCase <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Case</em>' attribute.
	 * @see #isIgnoreCase()
	 * @generated
	 */
	void setIgnoreCase(boolean value);

} // SameNameFilter
