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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import rpg.CharacterStatistic;
import rpg.Modifier;
import rpg.Randomizer;
import rpg.RpgPackage;
import rpg.StatChange;
import rpg.StatTalent;
import rpg.Tick;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stat Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.StatChangeImpl#getChangesStatistic <em>Changes Statistic</em>}</li>
 *   <li>{@link rpg.impl.StatChangeImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link rpg.impl.StatChangeImpl#getRandomizer <em>Randomizer</em>}</li>
 *   <li>{@link rpg.impl.StatChangeImpl#getTick <em>Tick</em>}</li>
 *   <li>{@link rpg.impl.StatChangeImpl#getStatTalent <em>Stat Talent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatChangeImpl extends ChangeImpl implements StatChange {
	/**
	 * The cached value of the '{@link #getChangesStatistic() <em>Changes Statistic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangesStatistic()
	 * @generated
	 * @ordered
	 */
	protected CharacterStatistic changesStatistic;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList modifiers;

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
	 * The cached value of the '{@link #getTick() <em>Tick</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTick()
	 * @generated
	 * @ordered
	 */
	protected Tick tick;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.STAT_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterStatistic getChangesStatistic() {
		if (changesStatistic != null && changesStatistic.eIsProxy()) {
			InternalEObject oldChangesStatistic = (InternalEObject)changesStatistic;
			changesStatistic = (CharacterStatistic)eResolveProxy(oldChangesStatistic);
			if (changesStatistic != oldChangesStatistic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RpgPackage.STAT_CHANGE__CHANGES_STATISTIC, oldChangesStatistic, changesStatistic));
			}
		}
		return changesStatistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterStatistic basicGetChangesStatistic() {
		return changesStatistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangesStatistic(CharacterStatistic newChangesStatistic) {
		CharacterStatistic oldChangesStatistic = changesStatistic;
		changesStatistic = newChangesStatistic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.STAT_CHANGE__CHANGES_STATISTIC, oldChangesStatistic, changesStatistic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectContainmentWithInverseEList(Modifier.class, this, RpgPackage.STAT_CHANGE__MODIFIERS, RpgPackage.MODIFIER__STAT_CHANGE);
		}
		return modifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RpgPackage.STAT_CHANGE__RANDOMIZER, oldRandomizer, newRandomizer);
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
				msgs = ((InternalEObject)randomizer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RpgPackage.STAT_CHANGE__RANDOMIZER, null, msgs);
			if (newRandomizer != null)
				msgs = ((InternalEObject)newRandomizer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RpgPackage.STAT_CHANGE__RANDOMIZER, null, msgs);
			msgs = basicSetRandomizer(newRandomizer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.STAT_CHANGE__RANDOMIZER, newRandomizer, newRandomizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tick getTick() {
		return tick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTick(Tick newTick, NotificationChain msgs) {
		Tick oldTick = tick;
		tick = newTick;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RpgPackage.STAT_CHANGE__TICK, oldTick, newTick);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTick(Tick newTick) {
		if (newTick != tick) {
			NotificationChain msgs = null;
			if (tick != null)
				msgs = ((InternalEObject)tick).eInverseRemove(this, RpgPackage.TICK__STAT_CHANGE, Tick.class, msgs);
			if (newTick != null)
				msgs = ((InternalEObject)newTick).eInverseAdd(this, RpgPackage.TICK__STAT_CHANGE, Tick.class, msgs);
			msgs = basicSetTick(newTick, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.STAT_CHANGE__TICK, newTick, newTick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatTalent getStatTalent() {
		if (eContainerFeatureID() != RpgPackage.STAT_CHANGE__STAT_TALENT) return null;
		return (StatTalent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatTalent(StatTalent newStatTalent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStatTalent, RpgPackage.STAT_CHANGE__STAT_TALENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatTalent(StatTalent newStatTalent) {
		if (newStatTalent != eInternalContainer() || (eContainerFeatureID() != RpgPackage.STAT_CHANGE__STAT_TALENT && newStatTalent != null)) {
			if (EcoreUtil.isAncestor(this, newStatTalent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStatTalent != null)
				msgs = ((InternalEObject)newStatTalent).eInverseAdd(this, RpgPackage.STAT_TALENT__STAT_CHANGES, StatTalent.class, msgs);
			msgs = basicSetStatTalent(newStatTalent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.STAT_CHANGE__STAT_TALENT, newStatTalent, newStatTalent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RpgPackage.STAT_CHANGE__MODIFIERS:
				return ((InternalEList)getModifiers()).basicAdd(otherEnd, msgs);
			case RpgPackage.STAT_CHANGE__TICK:
				if (tick != null)
					msgs = ((InternalEObject)tick).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RpgPackage.STAT_CHANGE__TICK, null, msgs);
				return basicSetTick((Tick)otherEnd, msgs);
			case RpgPackage.STAT_CHANGE__STAT_TALENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStatTalent((StatTalent)otherEnd, msgs);
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
			case RpgPackage.STAT_CHANGE__MODIFIERS:
				return ((InternalEList)getModifiers()).basicRemove(otherEnd, msgs);
			case RpgPackage.STAT_CHANGE__RANDOMIZER:
				return basicSetRandomizer(null, msgs);
			case RpgPackage.STAT_CHANGE__TICK:
				return basicSetTick(null, msgs);
			case RpgPackage.STAT_CHANGE__STAT_TALENT:
				return basicSetStatTalent(null, msgs);
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
			case RpgPackage.STAT_CHANGE__STAT_TALENT:
				return eInternalContainer().eInverseRemove(this, RpgPackage.STAT_TALENT__STAT_CHANGES, StatTalent.class, msgs);
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
			case RpgPackage.STAT_CHANGE__CHANGES_STATISTIC:
				if (resolve) return getChangesStatistic();
				return basicGetChangesStatistic();
			case RpgPackage.STAT_CHANGE__MODIFIERS:
				return getModifiers();
			case RpgPackage.STAT_CHANGE__RANDOMIZER:
				return getRandomizer();
			case RpgPackage.STAT_CHANGE__TICK:
				return getTick();
			case RpgPackage.STAT_CHANGE__STAT_TALENT:
				return getStatTalent();
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
			case RpgPackage.STAT_CHANGE__CHANGES_STATISTIC:
				setChangesStatistic((CharacterStatistic)newValue);
				return;
			case RpgPackage.STAT_CHANGE__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection)newValue);
				return;
			case RpgPackage.STAT_CHANGE__RANDOMIZER:
				setRandomizer((Randomizer)newValue);
				return;
			case RpgPackage.STAT_CHANGE__TICK:
				setTick((Tick)newValue);
				return;
			case RpgPackage.STAT_CHANGE__STAT_TALENT:
				setStatTalent((StatTalent)newValue);
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
			case RpgPackage.STAT_CHANGE__CHANGES_STATISTIC:
				setChangesStatistic((CharacterStatistic)null);
				return;
			case RpgPackage.STAT_CHANGE__MODIFIERS:
				getModifiers().clear();
				return;
			case RpgPackage.STAT_CHANGE__RANDOMIZER:
				setRandomizer((Randomizer)null);
				return;
			case RpgPackage.STAT_CHANGE__TICK:
				setTick((Tick)null);
				return;
			case RpgPackage.STAT_CHANGE__STAT_TALENT:
				setStatTalent((StatTalent)null);
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
			case RpgPackage.STAT_CHANGE__CHANGES_STATISTIC:
				return changesStatistic != null;
			case RpgPackage.STAT_CHANGE__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case RpgPackage.STAT_CHANGE__RANDOMIZER:
				return randomizer != null;
			case RpgPackage.STAT_CHANGE__TICK:
				return tick != null;
			case RpgPackage.STAT_CHANGE__STAT_TALENT:
				return getStatTalent() != null;
		}
		return super.eIsSet(featureID);
	}

} //StatChangeImpl
