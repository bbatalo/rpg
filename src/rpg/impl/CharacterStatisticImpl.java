/**
 */
package rpg.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
public class CharacterStatisticImpl extends MinimalEObjectImpl.Container implements CharacterStatistic {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "My statistic";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLore() <em>Lore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLore()
	 * @generated
	 * @ordered
	 */
	protected static final String LORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLore() <em>Lore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLore()
	 * @generated
	 * @ordered
	 */
	protected String lore = LORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = "Placeholder description";

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOLTIP_EDEFAULT = "Placeholder tooltip";

	/**
	 * The cached value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected String tooltip = TOOLTIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_VALUE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected double minValue = MIN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_VALUE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected double maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartLimitValue() <em>Start Limit Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLimitValue()
	 * @generated
	 * @ordered
	 */
	protected static final double START_LIMIT_VALUE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getStartLimitValue() <em>Start Limit Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLimitValue()
	 * @generated
	 * @ordered
	 */
	protected double startLimitValue = START_LIMIT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatType() <em>Stat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatType()
	 * @generated
	 * @ordered
	 */
	protected static final StatType STAT_TYPE_EDEFAULT = StatType.STAT_LITERAL;

	/**
	 * The cached value of the '{@link #getStatType() <em>Stat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatType()
	 * @generated
	 * @ordered
	 */
	protected StatType statType = STAT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsTargetable() <em>Is Targetable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTargetable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TARGETABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsTargetable() <em>Is Targetable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTargetable()
	 * @generated
	 * @ordered
	 */
	protected boolean isTargetable = IS_TARGETABLE_EDEFAULT;

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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.CHARACTER_STATISTIC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLore() {
		return lore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLore(String newLore) {
		String oldLore = lore;
		lore = newLore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.CHARACTER_STATISTIC__LORE, oldLore, lore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.CHARACTER_STATISTIC__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTooltip() {
		return tooltip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTooltip(String newTooltip) {
		String oldTooltip = tooltip;
		tooltip = newTooltip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.CHARACTER_STATISTIC__TOOLTIP, oldTooltip, tooltip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(double newMinValue) {
		double oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.CHARACTER_STATISTIC__MIN_VALUE, oldMinValue, minValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(double newMaxValue) {
		double oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.CHARACTER_STATISTIC__MAX_VALUE, oldMaxValue, maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStartLimitValue() {
		return startLimitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartLimitValue(double newStartLimitValue) {
		double oldStartLimitValue = startLimitValue;
		startLimitValue = newStartLimitValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.CHARACTER_STATISTIC__START_LIMIT_VALUE, oldStartLimitValue, startLimitValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatType getStatType() {
		return statType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatType(StatType newStatType) {
		StatType oldStatType = statType;
		statType = newStatType == null ? STAT_TYPE_EDEFAULT : newStatType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.CHARACTER_STATISTIC__STAT_TYPE, oldStatType, statType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTargetable() {
		return isTargetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTargetable(boolean newIsTargetable) {
		boolean oldIsTargetable = isTargetable;
		isTargetable = newIsTargetable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.CHARACTER_STATISTIC__IS_TARGETABLE, oldIsTargetable, isTargetable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RpgPackage.CHARACTER_STATISTIC__NAME:
				return getName();
			case RpgPackage.CHARACTER_STATISTIC__LORE:
				return getLore();
			case RpgPackage.CHARACTER_STATISTIC__DESCRIPTION:
				return getDescription();
			case RpgPackage.CHARACTER_STATISTIC__TOOLTIP:
				return getTooltip();
			case RpgPackage.CHARACTER_STATISTIC__MIN_VALUE:
				return new Double(getMinValue());
			case RpgPackage.CHARACTER_STATISTIC__MAX_VALUE:
				return new Double(getMaxValue());
			case RpgPackage.CHARACTER_STATISTIC__START_LIMIT_VALUE:
				return new Double(getStartLimitValue());
			case RpgPackage.CHARACTER_STATISTIC__STAT_TYPE:
				return getStatType();
			case RpgPackage.CHARACTER_STATISTIC__IS_TARGETABLE:
				return isIsTargetable() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RpgPackage.CHARACTER_STATISTIC__NAME:
				setName((String)newValue);
				return;
			case RpgPackage.CHARACTER_STATISTIC__LORE:
				setLore((String)newValue);
				return;
			case RpgPackage.CHARACTER_STATISTIC__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RpgPackage.CHARACTER_STATISTIC__TOOLTIP:
				setTooltip((String)newValue);
				return;
			case RpgPackage.CHARACTER_STATISTIC__MIN_VALUE:
				setMinValue(((Double)newValue).doubleValue());
				return;
			case RpgPackage.CHARACTER_STATISTIC__MAX_VALUE:
				setMaxValue(((Double)newValue).doubleValue());
				return;
			case RpgPackage.CHARACTER_STATISTIC__START_LIMIT_VALUE:
				setStartLimitValue(((Double)newValue).doubleValue());
				return;
			case RpgPackage.CHARACTER_STATISTIC__STAT_TYPE:
				setStatType((StatType)newValue);
				return;
			case RpgPackage.CHARACTER_STATISTIC__IS_TARGETABLE:
				setIsTargetable(((Boolean)newValue).booleanValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case RpgPackage.CHARACTER_STATISTIC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RpgPackage.CHARACTER_STATISTIC__LORE:
				setLore(LORE_EDEFAULT);
				return;
			case RpgPackage.CHARACTER_STATISTIC__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RpgPackage.CHARACTER_STATISTIC__TOOLTIP:
				setTooltip(TOOLTIP_EDEFAULT);
				return;
			case RpgPackage.CHARACTER_STATISTIC__MIN_VALUE:
				setMinValue(MIN_VALUE_EDEFAULT);
				return;
			case RpgPackage.CHARACTER_STATISTIC__MAX_VALUE:
				setMaxValue(MAX_VALUE_EDEFAULT);
				return;
			case RpgPackage.CHARACTER_STATISTIC__START_LIMIT_VALUE:
				setStartLimitValue(START_LIMIT_VALUE_EDEFAULT);
				return;
			case RpgPackage.CHARACTER_STATISTIC__STAT_TYPE:
				setStatType(STAT_TYPE_EDEFAULT);
				return;
			case RpgPackage.CHARACTER_STATISTIC__IS_TARGETABLE:
				setIsTargetable(IS_TARGETABLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RpgPackage.CHARACTER_STATISTIC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RpgPackage.CHARACTER_STATISTIC__LORE:
				return LORE_EDEFAULT == null ? lore != null : !LORE_EDEFAULT.equals(lore);
			case RpgPackage.CHARACTER_STATISTIC__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RpgPackage.CHARACTER_STATISTIC__TOOLTIP:
				return TOOLTIP_EDEFAULT == null ? tooltip != null : !TOOLTIP_EDEFAULT.equals(tooltip);
			case RpgPackage.CHARACTER_STATISTIC__MIN_VALUE:
				return minValue != MIN_VALUE_EDEFAULT;
			case RpgPackage.CHARACTER_STATISTIC__MAX_VALUE:
				return maxValue != MAX_VALUE_EDEFAULT;
			case RpgPackage.CHARACTER_STATISTIC__START_LIMIT_VALUE:
				return startLimitValue != START_LIMIT_VALUE_EDEFAULT;
			case RpgPackage.CHARACTER_STATISTIC__STAT_TYPE:
				return statType != STAT_TYPE_EDEFAULT;
			case RpgPackage.CHARACTER_STATISTIC__IS_TARGETABLE:
				return isTargetable != IS_TARGETABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", lore: ");
		result.append(lore);
		result.append(", description: ");
		result.append(description);
		result.append(", tooltip: ");
		result.append(tooltip);
		result.append(", minValue: ");
		result.append(minValue);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(", startLimitValue: ");
		result.append(startLimitValue);
		result.append(", statType: ");
		result.append(statType);
		result.append(", isTargetable: ");
		result.append(isTargetable);
		result.append(')');
		return result.toString();
	}

} //CharacterStatisticImpl
