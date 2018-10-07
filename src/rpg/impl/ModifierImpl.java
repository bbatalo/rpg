/**
 */
package rpg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import rpg.ChangeType;
import rpg.CharacterStatistic;
import rpg.Modifier;
import rpg.Randomizer;
import rpg.RpgPackage;
import rpg.StatChange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.ModifierImpl#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link rpg.impl.ModifierImpl#getValue <em>Value</em>}</li>
 *   <li>{@link rpg.impl.ModifierImpl#getBasedOnModifier <em>Based On Modifier</em>}</li>
 *   <li>{@link rpg.impl.ModifierImpl#getPriorityOrder <em>Priority Order</em>}</li>
 *   <li>{@link rpg.impl.ModifierImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link rpg.impl.ModifierImpl#getBasedOnValue <em>Based On Value</em>}</li>
 *   <li>{@link rpg.impl.ModifierImpl#getStatChange <em>Stat Change</em>}</li>
 *   <li>{@link rpg.impl.ModifierImpl#getRandomizer <em>Randomizer</em>}</li>
 *   <li>{@link rpg.impl.ModifierImpl#getOnLevel <em>On Level</em>}</li>
 *   <li>{@link rpg.impl.ModifierImpl#isExclusive <em>Exclusive</em>}</li>
 *   <li>{@link rpg.impl.ModifierImpl#isTargetStatistic <em>Target Statistic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModifierImpl extends MinimalEObjectImpl.Container implements Modifier {
	/**
	 * The default value of the '{@link #getChangeType() <em>Change Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeType()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeType CHANGE_TYPE_EDEFAULT = ChangeType.ADD_LITERAL;

	/**
	 * The cached value of the '{@link #getChangeType() <em>Change Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeType()
	 * @generated
	 * @ordered
	 */
	protected ChangeType changeType = CHANGE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasedOnModifier() <em>Based On Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOnModifier()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeType BASED_ON_MODIFIER_EDEFAULT = ChangeType.ADD_LITERAL;

	/**
	 * The cached value of the '{@link #getBasedOnModifier() <em>Based On Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOnModifier()
	 * @generated
	 * @ordered
	 */
	protected ChangeType basedOnModifier = BASED_ON_MODIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriorityOrder() <em>Priority Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriorityOrder() <em>Priority Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityOrder()
	 * @generated
	 * @ordered
	 */
	protected int priorityOrder = PRIORITY_ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected CharacterStatistic basedOn;

	/**
	 * The default value of the '{@link #getBasedOnValue() <em>Based On Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOnValue()
	 * @generated
	 * @ordered
	 */
	protected static final double BASED_ON_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBasedOnValue() <em>Based On Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOnValue()
	 * @generated
	 * @ordered
	 */
	protected double basedOnValue = BASED_ON_VALUE_EDEFAULT;

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
	 * The default value of the '{@link #getOnLevel() <em>On Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int ON_LEVEL_EDEFAULT = 1;

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
	 * The default value of the '{@link #isExclusive() <em>Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXCLUSIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExclusive() <em>Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean exclusive = EXCLUSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTargetStatistic() <em>Target Statistic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTargetStatistic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TARGET_STATISTIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTargetStatistic() <em>Target Statistic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTargetStatistic()
	 * @generated
	 * @ordered
	 */
	protected boolean targetStatistic = TARGET_STATISTIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.MODIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeType getChangeType() {
		return changeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeType(ChangeType newChangeType) {
		ChangeType oldChangeType = changeType;
		changeType = newChangeType == null ? CHANGE_TYPE_EDEFAULT : newChangeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.MODIFIER__CHANGE_TYPE, oldChangeType, changeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.MODIFIER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeType getBasedOnModifier() {
		return basedOnModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasedOnModifier(ChangeType newBasedOnModifier) {
		ChangeType oldBasedOnModifier = basedOnModifier;
		basedOnModifier = newBasedOnModifier == null ? BASED_ON_MODIFIER_EDEFAULT : newBasedOnModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.MODIFIER__BASED_ON_MODIFIER, oldBasedOnModifier, basedOnModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriorityOrder() {
		return priorityOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorityOrder(int newPriorityOrder) {
		int oldPriorityOrder = priorityOrder;
		priorityOrder = newPriorityOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.MODIFIER__PRIORITY_ORDER, oldPriorityOrder, priorityOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterStatistic getBasedOn() {
		if (basedOn != null && basedOn.eIsProxy()) {
			InternalEObject oldBasedOn = (InternalEObject)basedOn;
			basedOn = (CharacterStatistic)eResolveProxy(oldBasedOn);
			if (basedOn != oldBasedOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RpgPackage.MODIFIER__BASED_ON, oldBasedOn, basedOn));
			}
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterStatistic basicGetBasedOn() {
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasedOn(CharacterStatistic newBasedOn) {
		CharacterStatistic oldBasedOn = basedOn;
		basedOn = newBasedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.MODIFIER__BASED_ON, oldBasedOn, basedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBasedOnValue() {
		return basedOnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasedOnValue(double newBasedOnValue) {
		double oldBasedOnValue = basedOnValue;
		basedOnValue = newBasedOnValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.MODIFIER__BASED_ON_VALUE, oldBasedOnValue, basedOnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatChange getStatChange() {
		if (eContainerFeatureID() != RpgPackage.MODIFIER__STAT_CHANGE) return null;
		return (StatChange)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatChange(StatChange newStatChange, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStatChange, RpgPackage.MODIFIER__STAT_CHANGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatChange(StatChange newStatChange) {
		if (newStatChange != eInternalContainer() || (eContainerFeatureID() != RpgPackage.MODIFIER__STAT_CHANGE && newStatChange != null)) {
			if (EcoreUtil.isAncestor(this, newStatChange))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStatChange != null)
				msgs = ((InternalEObject)newStatChange).eInverseAdd(this, RpgPackage.STAT_CHANGE__MODIFIERS, StatChange.class, msgs);
			msgs = basicSetStatChange(newStatChange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.MODIFIER__STAT_CHANGE, newStatChange, newStatChange));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RpgPackage.MODIFIER__RANDOMIZER, oldRandomizer, newRandomizer);
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
				msgs = ((InternalEObject)randomizer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RpgPackage.MODIFIER__RANDOMIZER, null, msgs);
			if (newRandomizer != null)
				msgs = ((InternalEObject)newRandomizer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RpgPackage.MODIFIER__RANDOMIZER, null, msgs);
			msgs = basicSetRandomizer(newRandomizer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.MODIFIER__RANDOMIZER, newRandomizer, newRandomizer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.MODIFIER__ON_LEVEL, oldOnLevel, onLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExclusive() {
		return exclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusive(boolean newExclusive) {
		boolean oldExclusive = exclusive;
		exclusive = newExclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.MODIFIER__EXCLUSIVE, oldExclusive, exclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTargetStatistic() {
		return targetStatistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetStatistic(boolean newTargetStatistic) {
		boolean oldTargetStatistic = targetStatistic;
		targetStatistic = newTargetStatistic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.MODIFIER__TARGET_STATISTIC, oldTargetStatistic, targetStatistic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RpgPackage.MODIFIER__STAT_CHANGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStatChange((StatChange)otherEnd, msgs);
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
			case RpgPackage.MODIFIER__STAT_CHANGE:
				return basicSetStatChange(null, msgs);
			case RpgPackage.MODIFIER__RANDOMIZER:
				return basicSetRandomizer(null, msgs);
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
			case RpgPackage.MODIFIER__STAT_CHANGE:
				return eInternalContainer().eInverseRemove(this, RpgPackage.STAT_CHANGE__MODIFIERS, StatChange.class, msgs);
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
			case RpgPackage.MODIFIER__CHANGE_TYPE:
				return getChangeType();
			case RpgPackage.MODIFIER__VALUE:
				return new Double(getValue());
			case RpgPackage.MODIFIER__BASED_ON_MODIFIER:
				return getBasedOnModifier();
			case RpgPackage.MODIFIER__PRIORITY_ORDER:
				return new Integer(getPriorityOrder());
			case RpgPackage.MODIFIER__BASED_ON:
				if (resolve) return getBasedOn();
				return basicGetBasedOn();
			case RpgPackage.MODIFIER__BASED_ON_VALUE:
				return new Double(getBasedOnValue());
			case RpgPackage.MODIFIER__STAT_CHANGE:
				return getStatChange();
			case RpgPackage.MODIFIER__RANDOMIZER:
				return getRandomizer();
			case RpgPackage.MODIFIER__ON_LEVEL:
				return new Integer(getOnLevel());
			case RpgPackage.MODIFIER__EXCLUSIVE:
				return isExclusive() ? Boolean.TRUE : Boolean.FALSE;
			case RpgPackage.MODIFIER__TARGET_STATISTIC:
				return isTargetStatistic() ? Boolean.TRUE : Boolean.FALSE;
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
			case RpgPackage.MODIFIER__CHANGE_TYPE:
				setChangeType((ChangeType)newValue);
				return;
			case RpgPackage.MODIFIER__VALUE:
				setValue(((Double)newValue).doubleValue());
				return;
			case RpgPackage.MODIFIER__BASED_ON_MODIFIER:
				setBasedOnModifier((ChangeType)newValue);
				return;
			case RpgPackage.MODIFIER__PRIORITY_ORDER:
				setPriorityOrder(((Integer)newValue).intValue());
				return;
			case RpgPackage.MODIFIER__BASED_ON:
				setBasedOn((CharacterStatistic)newValue);
				return;
			case RpgPackage.MODIFIER__BASED_ON_VALUE:
				setBasedOnValue(((Double)newValue).doubleValue());
				return;
			case RpgPackage.MODIFIER__STAT_CHANGE:
				setStatChange((StatChange)newValue);
				return;
			case RpgPackage.MODIFIER__RANDOMIZER:
				setRandomizer((Randomizer)newValue);
				return;
			case RpgPackage.MODIFIER__ON_LEVEL:
				setOnLevel(((Integer)newValue).intValue());
				return;
			case RpgPackage.MODIFIER__EXCLUSIVE:
				setExclusive(((Boolean)newValue).booleanValue());
				return;
			case RpgPackage.MODIFIER__TARGET_STATISTIC:
				setTargetStatistic(((Boolean)newValue).booleanValue());
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
			case RpgPackage.MODIFIER__CHANGE_TYPE:
				setChangeType(CHANGE_TYPE_EDEFAULT);
				return;
			case RpgPackage.MODIFIER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case RpgPackage.MODIFIER__BASED_ON_MODIFIER:
				setBasedOnModifier(BASED_ON_MODIFIER_EDEFAULT);
				return;
			case RpgPackage.MODIFIER__PRIORITY_ORDER:
				setPriorityOrder(PRIORITY_ORDER_EDEFAULT);
				return;
			case RpgPackage.MODIFIER__BASED_ON:
				setBasedOn((CharacterStatistic)null);
				return;
			case RpgPackage.MODIFIER__BASED_ON_VALUE:
				setBasedOnValue(BASED_ON_VALUE_EDEFAULT);
				return;
			case RpgPackage.MODIFIER__STAT_CHANGE:
				setStatChange((StatChange)null);
				return;
			case RpgPackage.MODIFIER__RANDOMIZER:
				setRandomizer((Randomizer)null);
				return;
			case RpgPackage.MODIFIER__ON_LEVEL:
				setOnLevel(ON_LEVEL_EDEFAULT);
				return;
			case RpgPackage.MODIFIER__EXCLUSIVE:
				setExclusive(EXCLUSIVE_EDEFAULT);
				return;
			case RpgPackage.MODIFIER__TARGET_STATISTIC:
				setTargetStatistic(TARGET_STATISTIC_EDEFAULT);
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
			case RpgPackage.MODIFIER__CHANGE_TYPE:
				return changeType != CHANGE_TYPE_EDEFAULT;
			case RpgPackage.MODIFIER__VALUE:
				return value != VALUE_EDEFAULT;
			case RpgPackage.MODIFIER__BASED_ON_MODIFIER:
				return basedOnModifier != BASED_ON_MODIFIER_EDEFAULT;
			case RpgPackage.MODIFIER__PRIORITY_ORDER:
				return priorityOrder != PRIORITY_ORDER_EDEFAULT;
			case RpgPackage.MODIFIER__BASED_ON:
				return basedOn != null;
			case RpgPackage.MODIFIER__BASED_ON_VALUE:
				return basedOnValue != BASED_ON_VALUE_EDEFAULT;
			case RpgPackage.MODIFIER__STAT_CHANGE:
				return getStatChange() != null;
			case RpgPackage.MODIFIER__RANDOMIZER:
				return randomizer != null;
			case RpgPackage.MODIFIER__ON_LEVEL:
				return onLevel != ON_LEVEL_EDEFAULT;
			case RpgPackage.MODIFIER__EXCLUSIVE:
				return exclusive != EXCLUSIVE_EDEFAULT;
			case RpgPackage.MODIFIER__TARGET_STATISTIC:
				return targetStatistic != TARGET_STATISTIC_EDEFAULT;
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
		result.append(" (changeType: ");
		result.append(changeType);
		result.append(", value: ");
		result.append(value);
		result.append(", basedOnModifier: ");
		result.append(basedOnModifier);
		result.append(", priorityOrder: ");
		result.append(priorityOrder);
		result.append(", basedOnValue: ");
		result.append(basedOnValue);
		result.append(", onLevel: ");
		result.append(onLevel);
		result.append(", exclusive: ");
		result.append(exclusive);
		result.append(", targetStatistic: ");
		result.append(targetStatistic);
		result.append(')');
		return result.toString();
	}

} //ModifierImpl
