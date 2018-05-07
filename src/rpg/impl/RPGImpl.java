/**
 */
package rpg.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import rpg.RPG;
import rpg.RpgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.RPGImpl#getName <em>Name</em>}</li>
 *   <li>{@link rpg.impl.RPGImpl#getLore <em>Lore</em>}</li>
 *   <li>{@link rpg.impl.RPGImpl#getAllClasses <em>All Classes</em>}</li>
 *   <li>{@link rpg.impl.RPGImpl#getRangeUnits <em>Range Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RPGImpl extends CDOObjectImpl implements RPG {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.RPG;
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
		return (String)eGet(RpgPackage.Literals.RPG__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(RpgPackage.Literals.RPG__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLore() {
		return (String)eGet(RpgPackage.Literals.RPG__LORE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLore(String newLore) {
		eSet(RpgPackage.Literals.RPG__LORE, newLore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllClasses() {
		return (EList)eGet(RpgPackage.Literals.RPG__ALL_CLASSES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRangeUnits() {
		return (EList)eGet(RpgPackage.Literals.RPG__RANGE_UNITS, true);
	}

} //RPGImpl
