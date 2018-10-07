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
	 * The '<em><b>STAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STAT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STAT = 0;

	/**
	 * The '<em><b>FUEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUEL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUEL = 1;

	/**
	 * The '<em><b>STAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAT
	 * @generated
	 * @ordered
	 */
	public static final StatType STAT_LITERAL = new StatType(STAT, "STAT", "STAT");

	/**
	 * The '<em><b>FUEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUEL
	 * @generated
	 * @ordered
	 */
	public static final StatType FUEL_LITERAL = new StatType(FUEL, "FUEL", "FUEL");

	/**
	 * An array of all the '<em><b>Stat Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StatType[] VALUES_ARRAY =
		new StatType[] {
			STAT_LITERAL,
			FUEL_LITERAL,
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
			case STAT: return STAT_LITERAL;
			case FUEL: return FUEL_LITERAL;
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
