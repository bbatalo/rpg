/**
 */
package rpg.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import rpg.Ability;
import rpg.AbilityType;
import rpg.CastType;
import rpg.RangeUnit;
import rpg.RpgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.AbilityImpl#getName <em>Name</em>}</li>
 *   <li>{@link rpg.impl.AbilityImpl#getLore <em>Lore</em>}</li>
 *   <li>{@link rpg.impl.AbilityImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link rpg.impl.AbilityImpl#getCastType <em>Cast Type</em>}</li>
 *   <li>{@link rpg.impl.AbilityImpl#getAbilityType <em>Ability Type</em>}</li>
 *   <li>{@link rpg.impl.AbilityImpl#getCastTime <em>Cast Time</em>}</li>
 *   <li>{@link rpg.impl.AbilityImpl#getRange <em>Range</em>}</li>
 *   <li>{@link rpg.impl.AbilityImpl#getRangeUnit <em>Range Unit</em>}</li>
 *   <li>{@link rpg.impl.AbilityImpl#getOnLevel <em>On Level</em>}</li>
 *   <li>{@link rpg.impl.AbilityImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link rpg.impl.AbilityImpl#getCosts <em>Costs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbilityImpl extends CDOObjectImpl implements Ability {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.ABILITY;
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
		return (String)eGet(RpgPackage.Literals.ABILITY__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(RpgPackage.Literals.ABILITY__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLore() {
		return (String)eGet(RpgPackage.Literals.ABILITY__LORE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLore(String newLore) {
		eSet(RpgPackage.Literals.ABILITY__LORE, newLore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTooltip() {
		return (String)eGet(RpgPackage.Literals.ABILITY__TOOLTIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTooltip(String newTooltip) {
		eSet(RpgPackage.Literals.ABILITY__TOOLTIP, newTooltip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CastType getCastType() {
		return (CastType)eGet(RpgPackage.Literals.ABILITY__CAST_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCastType(CastType newCastType) {
		eSet(RpgPackage.Literals.ABILITY__CAST_TYPE, newCastType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbilityType getAbilityType() {
		return (AbilityType)eGet(RpgPackage.Literals.ABILITY__ABILITY_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbilityType(AbilityType newAbilityType) {
		eSet(RpgPackage.Literals.ABILITY__ABILITY_TYPE, newAbilityType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCastTime() {
		return ((Double)eGet(RpgPackage.Literals.ABILITY__CAST_TIME, true)).doubleValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCastTime(double newCastTime) {
		eSet(RpgPackage.Literals.ABILITY__CAST_TIME, new Double(newCastTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRange() {
		return ((Double)eGet(RpgPackage.Literals.ABILITY__RANGE, true)).doubleValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(double newRange) {
		eSet(RpgPackage.Literals.ABILITY__RANGE, new Double(newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeUnit getRangeUnit() {
		return (RangeUnit)eGet(RpgPackage.Literals.ABILITY__RANGE_UNIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeUnit(RangeUnit newRangeUnit) {
		eSet(RpgPackage.Literals.ABILITY__RANGE_UNIT, newRangeUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOnLevel() {
		return ((Integer)eGet(RpgPackage.Literals.ABILITY__ON_LEVEL, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnLevel(int newOnLevel) {
		eSet(RpgPackage.Literals.ABILITY__ON_LEVEL, new Integer(newOnLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEffects() {
		return (EList)eGet(RpgPackage.Literals.ABILITY__EFFECTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCosts() {
		return (EList)eGet(RpgPackage.Literals.ABILITY__COSTS, true);
	}

} //AbilityImpl
