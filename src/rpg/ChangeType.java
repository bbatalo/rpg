/**
 */
package rpg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Change Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rpg.RpgPackage#getChangeType()
 * @model
 * @generated
 */
public final class ChangeType extends AbstractEnumerator {
	/**
	 * The '<em><b>ADD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADD_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADD = 0;

	/**
	 * The '<em><b>SUBSTRACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUBSTRACT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTRACT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTRACT = 1;

	/**
	 * The '<em><b>MULTIPLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTIPLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLY = 2;

	/**
	 * The '<em><b>MOVE LIMIT UP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOVE LIMIT UP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVE_LIMIT_UP_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVE_LIMIT_UP = 3;

	/**
	 * The '<em><b>MOVE LIMIT DOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOVE LIMIT DOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVE_LIMIT_DOWN_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVE_LIMIT_DOWN = 4;

	/**
	 * The '<em><b>SET LIMIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SET LIMIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_LIMIT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SET_LIMIT = 5;

	/**
	 * The '<em><b>ADD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD
	 * @generated
	 * @ordered
	 */
	public static final ChangeType ADD_LITERAL = new ChangeType(ADD, "ADD", "ADD");

	/**
	 * The '<em><b>SUBSTRACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTRACT
	 * @generated
	 * @ordered
	 */
	public static final ChangeType SUBSTRACT_LITERAL = new ChangeType(SUBSTRACT, "SUBSTRACT", "SUBSTRACT");

	/**
	 * The '<em><b>MULTIPLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLY
	 * @generated
	 * @ordered
	 */
	public static final ChangeType MULTIPLY_LITERAL = new ChangeType(MULTIPLY, "MULTIPLY", "MULTIPLY");

	/**
	 * The '<em><b>MOVE LIMIT UP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVE_LIMIT_UP
	 * @generated
	 * @ordered
	 */
	public static final ChangeType MOVE_LIMIT_UP_LITERAL = new ChangeType(MOVE_LIMIT_UP, "MOVE_LIMIT_UP", "MOVE_LIMIT_UP");

	/**
	 * The '<em><b>MOVE LIMIT DOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVE_LIMIT_DOWN
	 * @generated
	 * @ordered
	 */
	public static final ChangeType MOVE_LIMIT_DOWN_LITERAL = new ChangeType(MOVE_LIMIT_DOWN, "MOVE_LIMIT_DOWN", "MOVE_LIMIT_DOWN");

	/**
	 * The '<em><b>SET LIMIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_LIMIT
	 * @generated
	 * @ordered
	 */
	public static final ChangeType SET_LIMIT_LITERAL = new ChangeType(SET_LIMIT, "SET_LIMIT", "SET_LIMIT");

	/**
	 * An array of all the '<em><b>Change Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChangeType[] VALUES_ARRAY =
		new ChangeType[] {
			ADD_LITERAL,
			SUBSTRACT_LITERAL,
			MULTIPLY_LITERAL,
			MOVE_LIMIT_UP_LITERAL,
			MOVE_LIMIT_DOWN_LITERAL,
			SET_LIMIT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Change Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Change Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Change Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Change Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangeType get(int value) {
		switch (value) {
			case ADD: return ADD_LITERAL;
			case SUBSTRACT: return SUBSTRACT_LITERAL;
			case MULTIPLY: return MULTIPLY_LITERAL;
			case MOVE_LIMIT_UP: return MOVE_LIMIT_UP_LITERAL;
			case MOVE_LIMIT_DOWN: return MOVE_LIMIT_DOWN_LITERAL;
			case SET_LIMIT: return SET_LIMIT_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ChangeType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ChangeType
