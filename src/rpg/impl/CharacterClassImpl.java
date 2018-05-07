/**
 */
package rpg.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import rpg.CharacterClass;
import rpg.RpgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.CharacterClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link rpg.impl.CharacterClassImpl#getLore <em>Lore</em>}</li>
 *   <li>{@link rpg.impl.CharacterClassImpl#getStatistics <em>Statistics</em>}</li>
 *   <li>{@link rpg.impl.CharacterClassImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rpg.impl.CharacterClassImpl#getChildClasses <em>Child Classes</em>}</li>
 *   <li>{@link rpg.impl.CharacterClassImpl#getParentClasses <em>Parent Classes</em>}</li>
 *   <li>{@link rpg.impl.CharacterClassImpl#getBranches <em>Branches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CharacterClassImpl extends CDOObjectImpl implements CharacterClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.CHARACTER_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(RpgPackage.Literals.CHARACTER_CLASS__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(RpgPackage.Literals.CHARACTER_CLASS__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLore() {
		return (String)eGet(RpgPackage.Literals.CHARACTER_CLASS__LORE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLore(String newLore) {
		eSet(RpgPackage.Literals.CHARACTER_CLASS__LORE, newLore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStatistics() {
		return (EList)eGet(RpgPackage.Literals.CHARACTER_CLASS__STATISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(RpgPackage.Literals.CHARACTER_CLASS__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(RpgPackage.Literals.CHARACTER_CLASS__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChildClasses() {
		return (EList)eGet(RpgPackage.Literals.CHARACTER_CLASS__CHILD_CLASSES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParentClasses() {
		return (EList)eGet(RpgPackage.Literals.CHARACTER_CLASS__PARENT_CLASSES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBranches() {
		return (EList)eGet(RpgPackage.Literals.CHARACTER_CLASS__BRANCHES, true);
	}

} //CharacterClassImpl
