/**
 */
package rpg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tick Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rpg.RpgPackage#getTickType()
 * @model
 * @generated
 */
public final class TickType extends AbstractEnumerator {
	/**
	 * The '<em><b>PER TICK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PER TICK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PER_TICK_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PER_TICK = 1;

	/**
	 * The '<em><b>DELAYED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELAYED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELAYED_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELAYED = 2;

	/**
	 * The '<em><b>PER TICK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PER_TICK
	 * @generated
	 * @ordered
	 */
	public static final TickType PER_TICK_LITERAL = new TickType(PER_TICK, "PER_TICK", "PER_TICK");

	/**
	 * The '<em><b>DELAYED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELAYED
	 * @generated
	 * @ordered
	 */
	public static final TickType DELAYED_LITERAL = new TickType(DELAYED, "DELAYED", "DELAYED");

	/**
	 * An array of all the '<em><b>Tick Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TickType[] VALUES_ARRAY =
		new TickType[] {
			PER_TICK_LITERAL,
			DELAYED_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tick Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tick Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TickType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TickType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tick Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TickType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TickType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tick Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TickType get(int value) {
		switch (value) {
			case PER_TICK: return PER_TICK_LITERAL;
			case DELAYED: return DELAYED_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TickType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TickType
