/**
 */
package ccsl.functions.booleanFunctions.filters;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.AtomicFilter#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getAtomicFilter()
 * @model
 * @generated
 */
public interface AtomicFilter extends Filter {
	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link ccsl.elements.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getAtomicFilter_Targets()
	 * @model type="ccsl.elements.Element" required="true"
	 * @generated
	 */
	EList getTargets();

} // AtomicFilter
