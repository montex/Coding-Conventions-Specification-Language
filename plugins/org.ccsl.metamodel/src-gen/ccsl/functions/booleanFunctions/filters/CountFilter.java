/**
 */
package ccsl.functions.booleanFunctions.filters;

import ccsl.elements.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Count Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.CountFilter#getMin <em>Min</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.CountFilter#getMax <em>Max</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.CountFilter#getContext <em>Context</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.CountFilter#getContainer <em>Container</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.CountFilter#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getCountFilter()
 * @model
 * @generated
 */
public interface CountFilter extends AtomicFilter {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getCountFilter_Min()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.CountFilter#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getCountFilter_Max()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.CountFilter#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.context.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getCountFilter_Context()
	 * @model type="ccsl.context.Context" containment="true" required="true"
	 * @generated
	 */
	EList getContext();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Element)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getCountFilter_Container()
	 * @model
	 * @generated
	 */
	Element getContainer();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.CountFilter#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Element value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Element)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getCountFilter_Field()
	 * @model required="true"
	 * @generated
	 */
	Element getField();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.CountFilter#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Element value);

} // CountFilter
