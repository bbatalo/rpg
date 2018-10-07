/**
 */
package rpg.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import rpg.Ability;
import rpg.AbilityType;
import rpg.CastType;
import rpg.Effect;
import rpg.Node;
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
 *   <li>{@link rpg.impl.AbilityImpl#getCooldown <em>Cooldown</em>}</li>
 *   <li>{@link rpg.impl.AbilityImpl#getAbilityType <em>Ability Type</em>}</li>
 *   <li>{@link rpg.impl.AbilityImpl#getCastTime <em>Cast Time</em>}</li>
 *   <li>{@link rpg.impl.AbilityImpl#getRange <em>Range</em>}</li>
 *   <li>{@link rpg.impl.AbilityImpl#getRangeUnit <em>Range Unit</em>}</li>
 *   <li>{@link rpg.impl.AbilityImpl#getOnLevel <em>On Level</em>}</li>
 *   <li>{@link rpg.impl.AbilityImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link rpg.impl.AbilityImpl#getNode <em>Node</em>}</li>
 *   <li>{@link rpg.impl.AbilityImpl#isIsLocked <em>Is Locked</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbilityImpl extends MinimalEObjectImpl.Container implements Ability {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOLTIP_EDEFAULT = null;

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
	 * The default value of the '{@link #getCastType() <em>Cast Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCastType()
	 * @generated
	 * @ordered
	 */
	protected static final CastType CAST_TYPE_EDEFAULT = CastType.NO_CAST_LITERAL;

	/**
	 * The cached value of the '{@link #getCastType() <em>Cast Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCastType()
	 * @generated
	 * @ordered
	 */
	protected CastType castType = CAST_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCooldown() <em>Cooldown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooldown()
	 * @generated
	 * @ordered
	 */
	protected static final double COOLDOWN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCooldown() <em>Cooldown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooldown()
	 * @generated
	 * @ordered
	 */
	protected double cooldown = COOLDOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbilityType() <em>Ability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbilityType()
	 * @generated
	 * @ordered
	 */
	protected static final AbilityType ABILITY_TYPE_EDEFAULT = AbilityType.SINGLE_LITERAL;

	/**
	 * The cached value of the '{@link #getAbilityType() <em>Ability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbilityType()
	 * @generated
	 * @ordered
	 */
	protected AbilityType abilityType = ABILITY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCastTime() <em>Cast Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCastTime()
	 * @generated
	 * @ordered
	 */
	protected static final double CAST_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCastTime() <em>Cast Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCastTime()
	 * @generated
	 * @ordered
	 */
	protected double castTime = CAST_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final double RANGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected double range = RANGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRangeUnit() <em>Range Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeUnit()
	 * @generated
	 * @ordered
	 */
	protected RangeUnit rangeUnit;

	/**
	 * The default value of the '{@link #getOnLevel() <em>On Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int ON_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOnLevel() <em>On Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnLevel()
	 * @generated
	 * @ordered
	 */
	protected int onLevel = ON_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEffects() <em>Effects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffects()
	 * @generated
	 * @ordered
	 */
	protected EList effects;

	/**
	 * The default value of the '{@link #isIsLocked() <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLocked() <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocked()
	 * @generated
	 * @ordered
	 */
	protected boolean isLocked = IS_LOCKED_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.ABILITY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.ABILITY__LORE, oldLore, lore));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.ABILITY__TOOLTIP, oldTooltip, tooltip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CastType getCastType() {
		return castType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCastType(CastType newCastType) {
		CastType oldCastType = castType;
		castType = newCastType == null ? CAST_TYPE_EDEFAULT : newCastType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.ABILITY__CAST_TYPE, oldCastType, castType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCooldown() {
		return cooldown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCooldown(double newCooldown) {
		double oldCooldown = cooldown;
		cooldown = newCooldown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.ABILITY__COOLDOWN, oldCooldown, cooldown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbilityType getAbilityType() {
		return abilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbilityType(AbilityType newAbilityType) {
		AbilityType oldAbilityType = abilityType;
		abilityType = newAbilityType == null ? ABILITY_TYPE_EDEFAULT : newAbilityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.ABILITY__ABILITY_TYPE, oldAbilityType, abilityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCastTime() {
		return castTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCastTime(double newCastTime) {
		double oldCastTime = castTime;
		castTime = newCastTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.ABILITY__CAST_TIME, oldCastTime, castTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(double newRange) {
		double oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.ABILITY__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeUnit getRangeUnit() {
		if (rangeUnit != null && rangeUnit.eIsProxy()) {
			InternalEObject oldRangeUnit = (InternalEObject)rangeUnit;
			rangeUnit = (RangeUnit)eResolveProxy(oldRangeUnit);
			if (rangeUnit != oldRangeUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RpgPackage.ABILITY__RANGE_UNIT, oldRangeUnit, rangeUnit));
			}
		}
		return rangeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeUnit basicGetRangeUnit() {
		return rangeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeUnit(RangeUnit newRangeUnit) {
		RangeUnit oldRangeUnit = rangeUnit;
		rangeUnit = newRangeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.ABILITY__RANGE_UNIT, oldRangeUnit, rangeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOnLevel() {
		return onLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnLevel(int newOnLevel) {
		int oldOnLevel = onLevel;
		onLevel = newOnLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.ABILITY__ON_LEVEL, oldOnLevel, onLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEffects() {
		if (effects == null) {
			effects = new EObjectContainmentWithInverseEList(Effect.class, this, RpgPackage.ABILITY__EFFECTS, RpgPackage.EFFECT__ABILITY);
		}
		return effects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNode() {
		if (eContainerFeatureID() != RpgPackage.ABILITY__NODE) return null;
		return (Node)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(Node newNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNode, RpgPackage.ABILITY__NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Node newNode) {
		if (newNode != eInternalContainer() || (eContainerFeatureID() != RpgPackage.ABILITY__NODE && newNode != null)) {
			if (EcoreUtil.isAncestor(this, newNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNode != null)
				msgs = ((InternalEObject)newNode).eInverseAdd(this, RpgPackage.NODE__ABILITIES, Node.class, msgs);
			msgs = basicSetNode(newNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.ABILITY__NODE, newNode, newNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLocked() {
		return isLocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLocked(boolean newIsLocked) {
		boolean oldIsLocked = isLocked;
		isLocked = newIsLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.ABILITY__IS_LOCKED, oldIsLocked, isLocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RpgPackage.ABILITY__EFFECTS:
				return ((InternalEList)getEffects()).basicAdd(otherEnd, msgs);
			case RpgPackage.ABILITY__NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNode((Node)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RpgPackage.ABILITY__EFFECTS:
				return ((InternalEList)getEffects()).basicRemove(otherEnd, msgs);
			case RpgPackage.ABILITY__NODE:
				return basicSetNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RpgPackage.ABILITY__NODE:
				return eInternalContainer().eInverseRemove(this, RpgPackage.NODE__ABILITIES, Node.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RpgPackage.ABILITY__NAME:
				return getName();
			case RpgPackage.ABILITY__LORE:
				return getLore();
			case RpgPackage.ABILITY__TOOLTIP:
				return getTooltip();
			case RpgPackage.ABILITY__CAST_TYPE:
				return getCastType();
			case RpgPackage.ABILITY__COOLDOWN:
				return new Double(getCooldown());
			case RpgPackage.ABILITY__ABILITY_TYPE:
				return getAbilityType();
			case RpgPackage.ABILITY__CAST_TIME:
				return new Double(getCastTime());
			case RpgPackage.ABILITY__RANGE:
				return new Double(getRange());
			case RpgPackage.ABILITY__RANGE_UNIT:
				if (resolve) return getRangeUnit();
				return basicGetRangeUnit();
			case RpgPackage.ABILITY__ON_LEVEL:
				return new Integer(getOnLevel());
			case RpgPackage.ABILITY__EFFECTS:
				return getEffects();
			case RpgPackage.ABILITY__NODE:
				return getNode();
			case RpgPackage.ABILITY__IS_LOCKED:
				return isIsLocked() ? Boolean.TRUE : Boolean.FALSE;
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
			case RpgPackage.ABILITY__NAME:
				setName((String)newValue);
				return;
			case RpgPackage.ABILITY__LORE:
				setLore((String)newValue);
				return;
			case RpgPackage.ABILITY__TOOLTIP:
				setTooltip((String)newValue);
				return;
			case RpgPackage.ABILITY__CAST_TYPE:
				setCastType((CastType)newValue);
				return;
			case RpgPackage.ABILITY__COOLDOWN:
				setCooldown(((Double)newValue).doubleValue());
				return;
			case RpgPackage.ABILITY__ABILITY_TYPE:
				setAbilityType((AbilityType)newValue);
				return;
			case RpgPackage.ABILITY__CAST_TIME:
				setCastTime(((Double)newValue).doubleValue());
				return;
			case RpgPackage.ABILITY__RANGE:
				setRange(((Double)newValue).doubleValue());
				return;
			case RpgPackage.ABILITY__RANGE_UNIT:
				setRangeUnit((RangeUnit)newValue);
				return;
			case RpgPackage.ABILITY__ON_LEVEL:
				setOnLevel(((Integer)newValue).intValue());
				return;
			case RpgPackage.ABILITY__EFFECTS:
				getEffects().clear();
				getEffects().addAll((Collection)newValue);
				return;
			case RpgPackage.ABILITY__NODE:
				setNode((Node)newValue);
				return;
			case RpgPackage.ABILITY__IS_LOCKED:
				setIsLocked(((Boolean)newValue).booleanValue());
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
			case RpgPackage.ABILITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RpgPackage.ABILITY__LORE:
				setLore(LORE_EDEFAULT);
				return;
			case RpgPackage.ABILITY__TOOLTIP:
				setTooltip(TOOLTIP_EDEFAULT);
				return;
			case RpgPackage.ABILITY__CAST_TYPE:
				setCastType(CAST_TYPE_EDEFAULT);
				return;
			case RpgPackage.ABILITY__COOLDOWN:
				setCooldown(COOLDOWN_EDEFAULT);
				return;
			case RpgPackage.ABILITY__ABILITY_TYPE:
				setAbilityType(ABILITY_TYPE_EDEFAULT);
				return;
			case RpgPackage.ABILITY__CAST_TIME:
				setCastTime(CAST_TIME_EDEFAULT);
				return;
			case RpgPackage.ABILITY__RANGE:
				setRange(RANGE_EDEFAULT);
				return;
			case RpgPackage.ABILITY__RANGE_UNIT:
				setRangeUnit((RangeUnit)null);
				return;
			case RpgPackage.ABILITY__ON_LEVEL:
				setOnLevel(ON_LEVEL_EDEFAULT);
				return;
			case RpgPackage.ABILITY__EFFECTS:
				getEffects().clear();
				return;
			case RpgPackage.ABILITY__NODE:
				setNode((Node)null);
				return;
			case RpgPackage.ABILITY__IS_LOCKED:
				setIsLocked(IS_LOCKED_EDEFAULT);
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
			case RpgPackage.ABILITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RpgPackage.ABILITY__LORE:
				return LORE_EDEFAULT == null ? lore != null : !LORE_EDEFAULT.equals(lore);
			case RpgPackage.ABILITY__TOOLTIP:
				return TOOLTIP_EDEFAULT == null ? tooltip != null : !TOOLTIP_EDEFAULT.equals(tooltip);
			case RpgPackage.ABILITY__CAST_TYPE:
				return castType != CAST_TYPE_EDEFAULT;
			case RpgPackage.ABILITY__COOLDOWN:
				return cooldown != COOLDOWN_EDEFAULT;
			case RpgPackage.ABILITY__ABILITY_TYPE:
				return abilityType != ABILITY_TYPE_EDEFAULT;
			case RpgPackage.ABILITY__CAST_TIME:
				return castTime != CAST_TIME_EDEFAULT;
			case RpgPackage.ABILITY__RANGE:
				return range != RANGE_EDEFAULT;
			case RpgPackage.ABILITY__RANGE_UNIT:
				return rangeUnit != null;
			case RpgPackage.ABILITY__ON_LEVEL:
				return onLevel != ON_LEVEL_EDEFAULT;
			case RpgPackage.ABILITY__EFFECTS:
				return effects != null && !effects.isEmpty();
			case RpgPackage.ABILITY__NODE:
				return getNode() != null;
			case RpgPackage.ABILITY__IS_LOCKED:
				return isLocked != IS_LOCKED_EDEFAULT;
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
		result.append(", tooltip: ");
		result.append(tooltip);
		result.append(", castType: ");
		result.append(castType);
		result.append(", cooldown: ");
		result.append(cooldown);
		result.append(", abilityType: ");
		result.append(abilityType);
		result.append(", castTime: ");
		result.append(castTime);
		result.append(", range: ");
		result.append(range);
		result.append(", onLevel: ");
		result.append(onLevel);
		result.append(", isLocked: ");
		result.append(isLocked);
		result.append(')');
		return result.toString();
	}

} //AbilityImpl
