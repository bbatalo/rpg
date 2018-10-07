/**
 */
package rpg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Change Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rpg.RpgPackage#getChangeValueType()
 * @model
 * @generated
 */
public final class ChangeValueType extends AbstractEnumerator {
	/**
	 * The '<em><b>VALUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VALUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALUE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VALUE = 0;

	/**
	 * The '<em><b>PERCENTAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERCENTAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERCENTAGE = 1;

	/**
	 * The '<em><b>VALUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE
	 * @generated
	 * @ordered
	 */
	public static final ChangeValueType VALUE_LITERAL = new ChangeValueType(VALUE, "VALUE", "VALUE");

	/**
	 * The '<em><b>PERCENTAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE
	 * @generated
	 * @ordered
	 */
	public static final ChangeValueType PERCENTAGE_LITERAL = new ChangeValueType(PERCENTAGE, "PERCENTAGE", "PERCENTAGE");

	/**
	 * An array of all the '<em><b>Change Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChangeValueType[] VALUES_ARRAY =
		new ChangeValueType[] {
			VALUE_LITERAL,
			PERCENTAGE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Change Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Change Value Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangeValueType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeValueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Change Value Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangeValueType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeValueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Change Value Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangeValueType get(int value) {
		switch (value) {
			case VALUE: return VALUE_LITERAL;
			case PERCENTAGE: return PERCENTAGE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ChangeValueType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ChangeValueType
