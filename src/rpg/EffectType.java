/**
 */
package rpg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Effect Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rpg.RpgPackage#getEffectType()
 * @model
 * @generated
 */
public final class EffectType extends AbstractEnumerator {
	/**
	 * The '<em><b>PASSIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PASSIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASSIVE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PASSIVE = 0;

	/**
	 * The '<em><b>ACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACTIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTIVE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE = 1;

	/**
	 * The '<em><b>INSTANTIATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INSTANTIATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTANTIATE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSTANTIATE = 2;

	/**
	 * The '<em><b>PASSIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSIVE
	 * @generated
	 * @ordered
	 */
	public static final EffectType PASSIVE_LITERAL = new EffectType(PASSIVE, "PASSIVE", "PASSIVE");

	/**
	 * The '<em><b>ACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE
	 * @generated
	 * @ordered
	 */
	public static final EffectType ACTIVE_LITERAL = new EffectType(ACTIVE, "ACTIVE", "ACTIVE");

	/**
	 * The '<em><b>INSTANTIATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANTIATE
	 * @generated
	 * @ordered
	 */
	public static final EffectType INSTANTIATE_LITERAL = new EffectType(INSTANTIATE, "INSTANTIATE", "INSTANTIATE");

	/**
	 * An array of all the '<em><b>Effect Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EffectType[] VALUES_ARRAY =
		new EffectType[] {
			PASSIVE_LITERAL,
			ACTIVE_LITERAL,
			INSTANTIATE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Effect Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Effect Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EffectType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EffectType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Effect Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EffectType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EffectType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Effect Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EffectType get(int value) {
		switch (value) {
			case PASSIVE: return PASSIVE_LITERAL;
			case ACTIVE: return ACTIVE_LITERAL;
			case INSTANTIATE: return INSTANTIATE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EffectType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EffectType
