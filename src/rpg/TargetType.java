/**
 */
package rpg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Target Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rpg.RpgPackage#getTargetType()
 * @model
 * @generated
 */
public final class TargetType extends AbstractEnumerator {
	/**
	 * The '<em><b>SELF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SELF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELF_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SELF = 0;

	/**
	 * The '<em><b>SINGLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SINGLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE = 1;

	/**
	 * The '<em><b>MULTIPLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTIPLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE = 2;

	/**
	 * The '<em><b>SELF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELF
	 * @generated
	 * @ordered
	 */
	public static final TargetType SELF_LITERAL = new TargetType(SELF, "SELF", "SELF");

	/**
	 * The '<em><b>SINGLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE
	 * @generated
	 * @ordered
	 */
	public static final TargetType SINGLE_LITERAL = new TargetType(SINGLE, "SINGLE", "SINGLE");

	/**
	 * The '<em><b>MULTIPLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE
	 * @generated
	 * @ordered
	 */
	public static final TargetType MULTIPLE_LITERAL = new TargetType(MULTIPLE, "MULTIPLE", "MULTIPLE");

	/**
	 * An array of all the '<em><b>Target Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TargetType[] VALUES_ARRAY =
		new TargetType[] {
			SELF_LITERAL,
			SINGLE_LITERAL,
			MULTIPLE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Target Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Target Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TargetType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TargetType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Target Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TargetType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TargetType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Target Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TargetType get(int value) {
		switch (value) {
			case SELF: return SELF_LITERAL;
			case SINGLE: return SINGLE_LITERAL;
			case MULTIPLE: return MULTIPLE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TargetType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TargetType
