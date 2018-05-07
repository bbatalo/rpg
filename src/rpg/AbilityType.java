/**
 */
package rpg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ability Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rpg.RpgPackage#getAbilityType()
 * @model
 * @generated
 */
public final class AbilityType extends AbstractEnumerator {
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
	public static final int SINGLE = 0;

	/**
	 * The '<em><b>AOE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AOE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AOE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AOE = 1;

	/**
	 * The '<em><b>SINGLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE
	 * @generated
	 * @ordered
	 */
	public static final AbilityType SINGLE_LITERAL = new AbilityType(SINGLE, "SINGLE", "SINGLE");

	/**
	 * The '<em><b>AOE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AOE
	 * @generated
	 * @ordered
	 */
	public static final AbilityType AOE_LITERAL = new AbilityType(AOE, "AOE", "AOE");

	/**
	 * An array of all the '<em><b>Ability Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AbilityType[] VALUES_ARRAY =
		new AbilityType[] {
			SINGLE_LITERAL,
			AOE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Ability Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ability Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbilityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AbilityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ability Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbilityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AbilityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ability Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbilityType get(int value) {
		switch (value) {
			case SINGLE: return SINGLE_LITERAL;
			case AOE: return AOE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AbilityType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //AbilityType
