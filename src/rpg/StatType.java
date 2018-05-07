/**
 */
package rpg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Stat Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rpg.RpgPackage#getStatType()
 * @model
 * @generated
 */
public final class StatType extends AbstractEnumerator {
	/**
	 * The '<em><b>ASCENDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASCENDING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASCENDING_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASCENDING = 0;

	/**
	 * The '<em><b>DESCENDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DESCENDING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESCENDING_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DESCENDING = 1;

	/**
	 * The '<em><b>ASCENDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASCENDING
	 * @generated
	 * @ordered
	 */
	public static final StatType ASCENDING_LITERAL = new StatType(ASCENDING, "ASCENDING", "ASCENDING");

	/**
	 * The '<em><b>DESCENDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCENDING
	 * @generated
	 * @ordered
	 */
	public static final StatType DESCENDING_LITERAL = new StatType(DESCENDING, "DESCENDING", "DESCENDING");

	/**
	 * An array of all the '<em><b>Stat Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StatType[] VALUES_ARRAY =
		new StatType[] {
			ASCENDING_LITERAL,
			DESCENDING_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Stat Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Stat Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stat Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stat Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatType get(int value) {
		switch (value) {
			case ASCENDING: return ASCENDING_LITERAL;
			case DESCENDING: return DESCENDING_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StatType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //StatType
