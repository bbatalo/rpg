/**
 */
package rpg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Node Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rpg.RpgPackage#getNodeType()
 * @model
 * @generated
 */
public final class NodeType extends AbstractEnumerator {
	/**
	 * The '<em><b>STANDARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STANDARD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD = 0;

	/**
	 * The '<em><b>ROOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROOT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROOT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROOT = 1;

	/**
	 * The '<em><b>STANDALONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STANDALONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDALONE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDALONE = 2;

	/**
	 * The '<em><b>STANDARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD
	 * @generated
	 * @ordered
	 */
	public static final NodeType STANDARD_LITERAL = new NodeType(STANDARD, "STANDARD", "STANDARD");

	/**
	 * The '<em><b>ROOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOT
	 * @generated
	 * @ordered
	 */
	public static final NodeType ROOT_LITERAL = new NodeType(ROOT, "ROOT", "ROOT");

	/**
	 * The '<em><b>STANDALONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDALONE
	 * @generated
	 * @ordered
	 */
	public static final NodeType STANDALONE_LITERAL = new NodeType(STANDALONE, "STANDALONE", "STANDALONE");

	/**
	 * An array of all the '<em><b>Node Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NodeType[] VALUES_ARRAY =
		new NodeType[] {
			STANDARD_LITERAL,
			ROOT_LITERAL,
			STANDALONE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Node Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Node Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NodeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NodeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NodeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NodeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NodeType get(int value) {
		switch (value) {
			case STANDARD: return STANDARD_LITERAL;
			case ROOT: return ROOT_LITERAL;
			case STANDALONE: return STANDALONE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NodeType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //NodeType
