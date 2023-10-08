/**
 */
package ccsl.elements.expressions.assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unary Assignment Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ccsl.elements.expressions.assignment.AssignmentPackage#getUnaryAssignmentKind()
 * @model
 * @generated
 */
public final class UnaryAssignmentKind extends AbstractEnumerator {
	/**
	 * The '<em><b>POST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POST = 0;

	/**
	 * The '<em><b>PRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRE = 1;

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
	 * The '<em><b>POST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST
	 * @generated
	 * @ordered
	 */
	public static final UnaryAssignmentKind POST_LITERAL = new UnaryAssignmentKind(POST, "POST", "POST");

	/**
	 * The '<em><b>PRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE
	 * @generated
	 * @ordered
	 */
	public static final UnaryAssignmentKind PRE_LITERAL = new UnaryAssignmentKind(PRE, "PRE", "PRE");

	/**
	 * The '<em><b>ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @generated
	 * @ordered
	 */
	public static final UnaryAssignmentKind ANY_LITERAL = new UnaryAssignmentKind(ANY, "ANY", "ANY");

	/**
	 * An array of all the '<em><b>Unary Assignment Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnaryAssignmentKind[] VALUES_ARRAY = new UnaryAssignmentKind[] { POST_LITERAL, PRE_LITERAL,
			ANY_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>Unary Assignment Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Unary Assignment Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnaryAssignmentKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnaryAssignmentKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unary Assignment Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnaryAssignmentKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnaryAssignmentKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unary Assignment Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnaryAssignmentKind get(int value) {
		switch (value) {
		case POST:
			return POST_LITERAL;
		case PRE:
			return PRE_LITERAL;
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
	private UnaryAssignmentKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //UnaryAssignmentKind
