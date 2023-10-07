/**
 */
package ccsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Collection Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ccsl.ccslPackage#getCollectionKind()
 * @model
 * @generated
 */
public final class CollectionKind extends AbstractEnumerator {
	/**
	 * The '<em><b>EXACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXACT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXACT = 0;

	/**
	 * The '<em><b>SEQUENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE = 1;

	/**
	 * The '<em><b>ANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY = 2;

	/**
	 * The '<em><b>IMMEDIATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMEDIATE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMMEDIATE = 3;

	/**
	 * The '<em><b>EXACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXACT
	 * @generated
	 * @ordered
	 */
	public static final CollectionKind EXACT_LITERAL = new CollectionKind(EXACT, "EXACT", "EXACT");

	/**
	 * The '<em><b>SEQUENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE
	 * @generated
	 * @ordered
	 */
	public static final CollectionKind SEQUENCE_LITERAL = new CollectionKind(SEQUENCE, "SEQUENCE", "SEQUENCE");

	/**
	 * The '<em><b>ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @generated
	 * @ordered
	 */
	public static final CollectionKind ANY_LITERAL = new CollectionKind(ANY, "ANY", "ANY");

	/**
	 * The '<em><b>IMMEDIATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMEDIATE
	 * @generated
	 * @ordered
	 */
	public static final CollectionKind IMMEDIATE_LITERAL = new CollectionKind(IMMEDIATE, "IMMEDIATE", "IMMEDIATE");

	/**
	 * An array of all the '<em><b>Collection Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CollectionKind[] VALUES_ARRAY = new CollectionKind[] { EXACT_LITERAL, SEQUENCE_LITERAL,
			ANY_LITERAL, IMMEDIATE_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>Collection Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Collection Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CollectionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CollectionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Collection Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CollectionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CollectionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Collection Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CollectionKind get(int value) {
		switch (value) {
		case EXACT:
			return EXACT_LITERAL;
		case SEQUENCE:
			return SEQUENCE_LITERAL;
		case ANY:
			return ANY_LITERAL;
		case IMMEDIATE:
			return IMMEDIATE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CollectionKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //CollectionKind
