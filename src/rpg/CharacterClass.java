/**
 */
package rpg;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.CharacterClass#getName <em>Name</em>}</li>
 *   <li>{@link rpg.CharacterClass#getLore <em>Lore</em>}</li>
 *   <li>{@link rpg.CharacterClass#getStatistics <em>Statistics</em>}</li>
 *   <li>{@link rpg.CharacterClass#getDescription <em>Description</em>}</li>
 *   <li>{@link rpg.CharacterClass#getChildClasses <em>Child Classes</em>}</li>
 *   <li>{@link rpg.CharacterClass#getParentClasses <em>Parent Classes</em>}</li>
 *   <li>{@link rpg.CharacterClass#getBranches <em>Branches</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getCharacterClass()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MeaningfulInheritance'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot MeaningfulInheritance='\n\t\t\tself.parentClasses->size() > 0 implies statistics->size() > 0 or branches->size() > 0' MeaningfulInheritance$message='\'Child classes should have their own statistics or branches.\''"
 * @extends CDOObject
 * @generated
 */
public interface CharacterClass extends CDOObject {
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
	 * @see rpg.RpgPackage#getCharacterClass_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rpg.CharacterClass#getName <em>Name</em>}' attribute.
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
	 * @see rpg.RpgPackage#getCharacterClass_Lore()
	 * @model
	 * @generated
	 */
	String getLore();

	/**
	 * Sets the value of the '{@link rpg.CharacterClass#getLore <em>Lore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lore</em>' attribute.
	 * @see #getLore()
	 * @generated
	 */
	void setLore(String value);

	/**
	 * Returns the value of the '<em><b>Statistics</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.CharacterStatistic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statistics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statistics</em>' containment reference list.
	 * @see rpg.RpgPackage#getCharacterClass_Statistics()
	 * @model type="rpg.CharacterStatistic" containment="true"
	 * @generated
	 */
	EList getStatistics();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see rpg.RpgPackage#getCharacterClass_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link rpg.CharacterClass#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Child Classes</b></em>' reference list.
	 * The list contents are of type {@link rpg.CharacterClass}.
	 * It is bidirectional and its opposite is '{@link rpg.CharacterClass#getParentClasses <em>Parent Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Classes</em>' reference list.
	 * @see rpg.RpgPackage#getCharacterClass_ChildClasses()
	 * @see rpg.CharacterClass#getParentClasses
	 * @model type="rpg.CharacterClass" opposite="parentClasses"
	 * @generated
	 */
	EList getChildClasses();

	/**
	 * Returns the value of the '<em><b>Parent Classes</b></em>' reference list.
	 * The list contents are of type {@link rpg.CharacterClass}.
	 * It is bidirectional and its opposite is '{@link rpg.CharacterClass#getChildClasses <em>Child Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Classes</em>' reference list.
	 * @see rpg.RpgPackage#getCharacterClass_ParentClasses()
	 * @see rpg.CharacterClass#getChildClasses
	 * @model type="rpg.CharacterClass" opposite="childClasses"
	 * @generated
	 */
	EList getParentClasses();

	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.Branch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see rpg.RpgPackage#getCharacterClass_Branches()
	 * @model type="rpg.Branch" containment="true"
	 * @generated
	 */
	EList getBranches();

} // CharacterClass
