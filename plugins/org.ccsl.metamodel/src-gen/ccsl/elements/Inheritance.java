/**
 */
package ccsl.elements;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Inheritance</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ccsl.elements.ElementsPackage#getInheritance()
 * @model
 * @generated
 */
public final class Inheritance extends AbstractEnumerator {
	/**
	 * The '<em><b>ABSTRACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT = 0;

	/**
	 * The '<em><b>FINAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINAL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FINAL = 1;

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE = 2;

	/**
	 * The '<em><b>ANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY = 3;

	/**
	 * The '<em><b>ABSTRACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT
	 * @generated
	 * @ordered
	 */
	public static final Inheritance ABSTRACT_LITERAL = new Inheritance(ABSTRACT, "ABSTRACT", "ABSTRACT");

	/**
	 * The '<em><b>FINAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINAL
	 * @generated
	 * @ordered
	 */
	public static final Inheritance FINAL_LITERAL = new Inheritance(FINAL, "FINAL", "FINAL");

	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @generated
	 * @ordered
	 */
	public static final Inheritance NONE_LITERAL = new Inheritance(NONE, "NONE", "NONE");

	/**
	 * The '<em><b>ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @generated
	 * @ordered
	 */
	public static final Inheritance ANY_LITERAL = new Inheritance(ANY, "ANY", "ANY");

	/**
	 * An array of all the '<em><b>Inheritance</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Inheritance[] VALUES_ARRAY = new Inheritance[] { ABSTRACT_LITERAL, FINAL_LITERAL, NONE_LITERAL,
			ANY_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>Inheritance</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Inheritance</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Inheritance get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Inheritance result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Inheritance</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Inheritance getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Inheritance result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Inheritance</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Inheritance get(int value) {
		switch (value) {
		case ABSTRACT:
			return ABSTRACT_LITERAL;
		case FINAL:
			return FINAL_LITERAL;
		case NONE:
			return NONE_LITERAL;
		case ANY:
			return ANY_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Inheritance(int value, String name, String literal) {
		super(value, name, literal);
	}

} //Inheritance
