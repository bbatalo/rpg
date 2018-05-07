/**
 */
package rpg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Branch Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rpg.RpgPackage#getBranchType()
 * @model
 * @generated
 */
public final class BranchType extends AbstractEnumerator {
	/**
	 * The '<em><b>TALENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TALENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TALENT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TALENT = 0;

	/**
	 * The '<em><b>ABILITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABILITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABILITY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABILITY = 1;

	/**
	 * The '<em><b>TALENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TALENT
	 * @generated
	 * @ordered
	 */
	public static final BranchType TALENT_LITERAL = new BranchType(TALENT, "TALENT", "TALENT");

	/**
	 * The '<em><b>ABILITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABILITY
	 * @generated
	 * @ordered
	 */
	public static final BranchType ABILITY_LITERAL = new BranchType(ABILITY, "ABILITY", "ABILITY");

	/**
	 * An array of all the '<em><b>Branch Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BranchType[] VALUES_ARRAY =
		new BranchType[] {
			TALENT_LITERAL,
			ABILITY_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Branch Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Branch Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BranchType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BranchType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Branch Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BranchType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BranchType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Branch Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BranchType get(int value) {
		switch (value) {
			case TALENT: return TALENT_LITERAL;
			case ABILITY: return ABILITY_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BranchType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //BranchType
