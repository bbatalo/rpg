/**
 */
package rpg.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import rpg.CharacterStatistic;
import rpg.RpgPackage;
import rpg.StatType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character Statistic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.CharacterStatisticImpl#getName <em>Name</em>}</li>
 *   <li>{@link rpg.impl.CharacterStatisticImpl#getLore <em>Lore</em>}</li>
 *   <li>{@link rpg.impl.CharacterStatisticImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rpg.impl.CharacterStatisticImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link rpg.impl.CharacterStatisticImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link rpg.impl.CharacterStatisticImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link rpg.impl.CharacterStatisticImpl#getStartLimitValue <em>Start Limit Value</em>}</li>
 *   <li>{@link rpg.impl.CharacterStatisticImpl#getStatType <em>Stat Type</em>}</li>
 *   <li>{@link rpg.impl.CharacterStatisticImpl#isIsTargetable <em>Is Targetable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CharacterStatisticImpl extends CDOObjectImpl implements CharacterStatistic {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterStatisticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.CHARACTER_STATISTIC;
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
		return (String)eGet(RpgPackage.Literals.CHARACTER_STATISTIC__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(RpgPackage.Literals.CHARACTER_STATISTIC__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLore() {
		return (String)eGet(RpgPackage.Literals.CHARACTER_STATISTIC__LORE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLore(String newLore) {
		eSet(RpgPackage.Literals.CHARACTER_STATISTIC__LORE, newLore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(RpgPackage.Literals.CHARACTER_STATISTIC__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(RpgPackage.Literals.CHARACTER_STATISTIC__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTooltip() {
		return (String)eGet(RpgPackage.Literals.CHARACTER_STATISTIC__TOOLTIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTooltip(String newTooltip) {
		eSet(RpgPackage.Literals.CHARACTER_STATISTIC__TOOLTIP, newTooltip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinValue() {
		return ((Double)eGet(RpgPackage.Literals.CHARACTER_STATISTIC__MIN_VALUE, true)).doubleValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(double newMinValue) {
		eSet(RpgPackage.Literals.CHARACTER_STATISTIC__MIN_VALUE, new Double(newMinValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxValue() {
		return ((Double)eGet(RpgPackage.Literals.CHARACTER_STATISTIC__MAX_VALUE, true)).doubleValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(double newMaxValue) {
		eSet(RpgPackage.Literals.CHARACTER_STATISTIC__MAX_VALUE, new Double(newMaxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStartLimitValue() {
		return ((Double)eGet(RpgPackage.Literals.CHARACTER_STATISTIC__START_LIMIT_VALUE, true)).doubleValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartLimitValue(double newStartLimitValue) {
		eSet(RpgPackage.Literals.CHARACTER_STATISTIC__START_LIMIT_VALUE, new Double(newStartLimitValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatType getStatType() {
		return (StatType)eGet(RpgPackage.Literals.CHARACTER_STATISTIC__STAT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatType(StatType newStatType) {
		eSet(RpgPackage.Literals.CHARACTER_STATISTIC__STAT_TYPE, newStatType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTargetable() {
		return ((Boolean)eGet(RpgPackage.Literals.CHARACTER_STATISTIC__IS_TARGETABLE, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTargetable(boolean newIsTargetable) {
		eSet(RpgPackage.Literals.CHARACTER_STATISTIC__IS_TARGETABLE, new Boolean(newIsTargetable));
	}

} //CharacterStatisticImpl
