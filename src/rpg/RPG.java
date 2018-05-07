/**
 */
package rpg;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.RPG#getName <em>Name</em>}</li>
 *   <li>{@link rpg.RPG#getLore <em>Lore</em>}</li>
 *   <li>{@link rpg.RPG#getAllClasses <em>All Classes</em>}</li>
 *   <li>{@link rpg.RPG#getRangeUnits <em>Range Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getRPG()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface RPG extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rpg.RpgPackage#getRPG_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rpg.RPG#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lore</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lore</em>' attribute.
	 * @see #setLore(String)
	 * @see rpg.RpgPackage#getRPG_Lore()
	 * @model required="true"
	 * @generated
	 */
	String getLore();

	/**
	 * Sets the value of the '{@link rpg.RPG#getLore <em>Lore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lore</em>' attribute.
	 * @see #getLore()
	 * @generated
	 */
	void setLore(String value);

	/**
	 * Returns the value of the '<em><b>All Classes</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.CharacterClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Classes</em>' containment reference list.
	 * @see rpg.RpgPackage#getRPG_AllClasses()
	 * @model type="rpg.CharacterClass" containment="true" required="true"
	 * @generated
	 */
	EList getAllClasses();

	/**
	 * Returns the value of the '<em><b>Range Units</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.RangeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Units</em>' containment reference list.
	 * @see rpg.RpgPackage#getRPG_RangeUnits()
	 * @model type="rpg.RangeUnit" containment="true" required="true"
	 * @generated
	 */
	EList getRangeUnits();

} // RPG
