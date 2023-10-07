/**
 */
package ccsl.elements.expressions.assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unary Assignment Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ccsl.elements.expressions.assignment.AssignmentPackage#getUnaryAssignmentOperator()
 * @model
 * @generated
 */
public final class UnaryAssignmentOperator extends AbstractEnumerator {
	/**
	 * The '<em><b>DECREMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECREMENT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DECREMENT = 0;

	/**
	 * The '<em><b>INCREMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCREMENT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENT = 1;

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
	 * The '<em><b>DECREMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECREMENT
	 * @generated
	 * @ordered
	 */
	public static final UnaryAssignmentOperator DECREMENT_LITERAL = new UnaryAssignmentOperator(DECREMENT, "DECREMENT",
			"DECREMENT");

	/**
	 * The '<em><b>INCREMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCREMENT
	 * @generated
	 * @ordered
	 */
	public static final UnaryAssignmentOperator INCREMENT_LITERAL = new UnaryAssignmentOperator(INCREMENT, "INCREMENT",
			"INCREMENT");

	/**
	 * The '<em><b>ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @generated
	 * @ordered
	 */
	public static final UnaryAssignmentOperator ANY_LITERAL = new UnaryAssignmentOperator(ANY, "ANY", "ANY");

	/**
	 * An array of all the '<em><b>Unary Assignment Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnaryAssignmentOperator[] VALUES_ARRAY = new UnaryAssignmentOperator[] { DECREMENT_LITERAL,
			INCREMENT_LITERAL, ANY_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>Unary Assignment Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Unary Assignment Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnaryAssignmentOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnaryAssignmentOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unary Assignment Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnaryAssignmentOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnaryAssignmentOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unary Assignment Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnaryAssignmentOperator get(int value) {
		switch (value) {
		case DECREMENT:
			return DECREMENT_LITERAL;
		case INCREMENT:
			return INCREMENT_LITERAL;
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
	private UnaryAssignmentOperator(int value, String name, String literal) {
		super(value, name, literal);
	}

} //UnaryAssignmentOperator
