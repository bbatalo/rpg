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
import rpg.Change;
import rpg.CharacterClass;
import rpg.Effect;
import rpg.EffectType;
import rpg.Randomizer;
import rpg.RpgPackage;
import rpg.TargetType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.EffectImpl#getName <em>Name</em>}</li>
 *   <li>{@link rpg.impl.EffectImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link rpg.impl.EffectImpl#getEffectType <em>Effect Type</em>}</li>
 *   <li>{@link rpg.impl.EffectImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link rpg.impl.EffectImpl#getOnLevel <em>On Level</em>}</li>
 *   <li>{@link rpg.impl.EffectImpl#getInstantiate <em>Instantiate</em>}</li>
 *   <li>{@link rpg.impl.EffectImpl#getAbility <em>Ability</em>}</li>
 *   <li>{@link rpg.impl.EffectImpl#getRandomizer <em>Randomizer</em>}</li>
 *   <li>{@link rpg.impl.EffectImpl#getChanges <em>Changes</em>}</li>
 *   <li>{@link rpg.impl.EffectImpl#isIsLocked <em>Is Locked</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EffectImpl extends MinimalEObjectImpl.Container implements Effect {
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
	 * The default value of the '{@link #getEffectType() <em>Effect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectType()
	 * @generated
	 * @ordered
	 */
	protected static final EffectType EFFECT_TYPE_EDEFAULT = EffectType.PASSIVE_LITERAL;

	/**
	 * The cached value of the '{@link #getEffectType() <em>Effect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectType()
	 * @generated
	 * @ordered
	 */
	protected EffectType effectType = EFFECT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetType() <em>Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetType()
	 * @generated
	 * @ordered
	 */
	protected static final TargetType TARGET_TYPE_EDEFAULT = TargetType.SELF_LITERAL;

	/**
	 * The cached value of the '{@link #getTargetType() <em>Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetType()
	 * @generated
	 * @ordered
	 */
	protected TargetType targetType = TARGET_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getInstantiate() <em>Instantiate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiate()
	 * @generated
	 * @ordered
	 */
	protected CharacterClass instantiate;

	/**
	 * The cached value of the '{@link #getRandomizer() <em>Randomizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomizer()
	 * @generated
	 * @ordered
	 */
	protected Randomizer randomizer;

	/**
	 * The cached value of the '{@link #getChanges() <em>Changes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChanges()
	 * @generated
	 * @ordered
	 */
	protected EList changes;

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
	protected EffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.EFFECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.EFFECT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.EFFECT__TOOLTIP, oldTooltip, tooltip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectType getEffectType() {
		return effectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectType(EffectType newEffectType) {
		EffectType oldEffectType = effectType;
		effectType = newEffectType == null ? EFFECT_TYPE_EDEFAULT : newEffectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.EFFECT__EFFECT_TYPE, oldEffectType, effectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetType getTargetType() {
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetType(TargetType newTargetType) {
		TargetType oldTargetType = targetType;
		targetType = newTargetType == null ? TARGET_TYPE_EDEFAULT : newTargetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.EFFECT__TARGET_TYPE, oldTargetType, targetType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.EFFECT__ON_LEVEL, oldOnLevel, onLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterClass getInstantiate() {
		if (instantiate != null && instantiate.eIsProxy()) {
			InternalEObject oldInstantiate = (InternalEObject)instantiate;
			instantiate = (CharacterClass)eResolveProxy(oldInstantiate);
			if (instantiate != oldInstantiate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RpgPackage.EFFECT__INSTANTIATE, oldInstantiate, instantiate));
			}
		}
		return instantiate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterClass basicGetInstantiate() {
		return instantiate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiate(CharacterClass newInstantiate) {
		CharacterClass oldInstantiate = instantiate;
		instantiate = newInstantiate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.EFFECT__INSTANTIATE, oldInstantiate, instantiate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ability getAbility() {
		if (eContainerFeatureID() != RpgPackage.EFFECT__ABILITY) return null;
		return (Ability)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbility(Ability newAbility, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAbility, RpgPackage.EFFECT__ABILITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbility(Ability newAbility) {
		if (newAbility != eInternalContainer() || (eContainerFeatureID() != RpgPackage.EFFECT__ABILITY && newAbility != null)) {
			if (EcoreUtil.isAncestor(this, newAbility))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAbility != null)
				msgs = ((InternalEObject)newAbility).eInverseAdd(this, RpgPackage.ABILITY__EFFECTS, Ability.class, msgs);
			msgs = basicSetAbility(newAbility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.EFFECT__ABILITY, newAbility, newAbility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Randomizer getRandomizer() {
		return randomizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRandomizer(Randomizer newRandomizer, NotificationChain msgs) {
		Randomizer oldRandomizer = randomizer;
		randomizer = newRandomizer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RpgPackage.EFFECT__RANDOMIZER, oldRandomizer, newRandomizer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandomizer(Randomizer newRandomizer) {
		if (newRandomizer != randomizer) {
			NotificationChain msgs = null;
			if (randomizer != null)
				msgs = ((InternalEObject)randomizer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RpgPackage.EFFECT__RANDOMIZER, null, msgs);
			if (newRandomizer != null)
				msgs = ((InternalEObject)newRandomizer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RpgPackage.EFFECT__RANDOMIZER, null, msgs);
			msgs = basicSetRandomizer(newRandomizer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.EFFECT__RANDOMIZER, newRandomizer, newRandomizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChanges() {
		if (changes == null) {
			changes = new EObjectContainmentWithInverseEList(Change.class, this, RpgPackage.EFFECT__CHANGES, RpgPackage.CHANGE__EFFECT);
		}
		return changes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.EFFECT__IS_LOCKED, oldIsLocked, isLocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RpgPackage.EFFECT__ABILITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAbility((Ability)otherEnd, msgs);
			case RpgPackage.EFFECT__CHANGES:
				return ((InternalEList)getChanges()).basicAdd(otherEnd, msgs);
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
			case RpgPackage.EFFECT__ABILITY:
				return basicSetAbility(null, msgs);
			case RpgPackage.EFFECT__RANDOMIZER:
				return basicSetRandomizer(null, msgs);
			case RpgPackage.EFFECT__CHANGES:
				return ((InternalEList)getChanges()).basicRemove(otherEnd, msgs);
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
			case RpgPackage.EFFECT__ABILITY:
				return eInternalContainer().eInverseRemove(this, RpgPackage.ABILITY__EFFECTS, Ability.class, msgs);
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
			case RpgPackage.EFFECT__NAME:
				return getName();
			case RpgPackage.EFFECT__TOOLTIP:
				return getTooltip();
			case RpgPackage.EFFECT__EFFECT_TYPE:
				return getEffectType();
			case RpgPackage.EFFECT__TARGET_TYPE:
				return getTargetType();
			case RpgPackage.EFFECT__ON_LEVEL:
				return new Integer(getOnLevel());
			case RpgPackage.EFFECT__INSTANTIATE:
				if (resolve) return getInstantiate();
				return basicGetInstantiate();
			case RpgPackage.EFFECT__ABILITY:
				return getAbility();
			case RpgPackage.EFFECT__RANDOMIZER:
				return getRandomizer();
			case RpgPackage.EFFECT__CHANGES:
				return getChanges();
			case RpgPackage.EFFECT__IS_LOCKED:
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
			case RpgPackage.EFFECT__NAME:
				setName((String)newValue);
				return;
			case RpgPackage.EFFECT__TOOLTIP:
				setTooltip((String)newValue);
				return;
			case RpgPackage.EFFECT__EFFECT_TYPE:
				setEffectType((EffectType)newValue);
				return;
			case RpgPackage.EFFECT__TARGET_TYPE:
				setTargetType((TargetType)newValue);
				return;
			case RpgPackage.EFFECT__ON_LEVEL:
				setOnLevel(((Integer)newValue).intValue());
				return;
			case RpgPackage.EFFECT__INSTANTIATE:
				setInstantiate((CharacterClass)newValue);
				return;
			case RpgPackage.EFFECT__ABILITY:
				setAbility((Ability)newValue);
				return;
			case RpgPackage.EFFECT__RANDOMIZER:
				setRandomizer((Randomizer)newValue);
				return;
			case RpgPackage.EFFECT__CHANGES:
				getChanges().clear();
				getChanges().addAll((Collection)newValue);
				return;
			case RpgPackage.EFFECT__IS_LOCKED:
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
			case RpgPackage.EFFECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RpgPackage.EFFECT__TOOLTIP:
				setTooltip(TOOLTIP_EDEFAULT);
				return;
			case RpgPackage.EFFECT__EFFECT_TYPE:
				setEffectType(EFFECT_TYPE_EDEFAULT);
				return;
			case RpgPackage.EFFECT__TARGET_TYPE:
				setTargetType(TARGET_TYPE_EDEFAULT);
				return;
			case RpgPackage.EFFECT__ON_LEVEL:
				setOnLevel(ON_LEVEL_EDEFAULT);
				return;
			case RpgPackage.EFFECT__INSTANTIATE:
				setInstantiate((CharacterClass)null);
				return;
			case RpgPackage.EFFECT__ABILITY:
				setAbility((Ability)null);
				return;
			case RpgPackage.EFFECT__RANDOMIZER:
				setRandomizer((Randomizer)null);
				return;
			case RpgPackage.EFFECT__CHANGES:
				getChanges().clear();
				return;
			case RpgPackage.EFFECT__IS_LOCKED:
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
			case RpgPackage.EFFECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RpgPackage.EFFECT__TOOLTIP:
				return TOOLTIP_EDEFAULT == null ? tooltip != null : !TOOLTIP_EDEFAULT.equals(tooltip);
			case RpgPackage.EFFECT__EFFECT_TYPE:
				return effectType != EFFECT_TYPE_EDEFAULT;
			case RpgPackage.EFFECT__TARGET_TYPE:
				return targetType != TARGET_TYPE_EDEFAULT;
			case RpgPackage.EFFECT__ON_LEVEL:
				return onLevel != ON_LEVEL_EDEFAULT;
			case RpgPackage.EFFECT__INSTANTIATE:
				return instantiate != null;
			case RpgPackage.EFFECT__ABILITY:
				return getAbility() != null;
			case RpgPackage.EFFECT__RANDOMIZER:
				return randomizer != null;
			case RpgPackage.EFFECT__CHANGES:
				return changes != null && !changes.isEmpty();
			case RpgPackage.EFFECT__IS_LOCKED:
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
		result.append(", tooltip: ");
		result.append(tooltip);
		result.append(", effectType: ");
		result.append(effectType);
		result.append(", targetType: ");
		result.append(targetType);
		result.append(", onLevel: ");
		result.append(onLevel);
		result.append(", isLocked: ");
		result.append(isLocked);
		result.append(')');
		return result.toString();
	}

} //EffectImpl
