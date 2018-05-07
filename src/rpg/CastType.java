/**
 */
package rpg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cast Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rpg.RpgPackage#getCastType()
 * @model
 * @generated
 */
public final class CastType extends AbstractEnumerator {
	/**
	 * The '<em><b>NO CAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO CAST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_CAST_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_CAST = 0;

	/**
	 * The '<em><b>INSTANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INSTANT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTANT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSTANT = 1;

	/**
	 * The '<em><b>CAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAST_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAST = 2;

	/**
	 * The '<em><b>CHANNELED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHANNELED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHANNELED_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHANNELED = 3;

	/**
	 * The '<em><b>NO CAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CAST
	 * @generated
	 * @ordered
	 */
	public static final CastType NO_CAST_LITERAL = new CastType(NO_CAST, "NO_CAST", "NO_CAST");

	/**
	 * The '<em><b>INSTANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANT
	 * @generated
	 * @ordered
	 */
	public static final CastType INSTANT_LITERAL = new CastType(INSTANT, "INSTANT", "INSTANT");

	/**
	 * The '<em><b>CAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAST
	 * @generated
	 * @ordered
	 */
	public static final CastType CAST_LITERAL = new CastType(CAST, "CAST", "CAST");

	/**
	 * The '<em><b>CHANNELED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANNELED
	 * @generated
	 * @ordered
	 */
	public static final CastType CHANNELED_LITERAL = new CastType(CHANNELED, "CHANNELED", "CHANNELED");

	/**
	 * An array of all the '<em><b>Cast Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CastType[] VALUES_ARRAY =
		new CastType[] {
			NO_CAST_LITERAL,
			INSTANT_LITERAL,
			CAST_LITERAL,
			CHANNELED_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Cast Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cast Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CastType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CastType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cast Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CastType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CastType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cast Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CastType get(int value) {
		switch (value) {
			case NO_CAST: return NO_CAST_LITERAL;
			case INSTANT: return INSTANT_LITERAL;
			case CAST: return CAST_LITERAL;
			case CHANNELED: return CHANNELED_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CastType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //CastType
