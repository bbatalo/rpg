/**
 */
package rpg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import rpg.Ability;
import rpg.CooldownChange;
import rpg.CooldownTalent;
import rpg.RpgPackage;
import rpg.Talent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cooldown Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.CooldownChangeImpl#getAbility <em>Ability</em>}</li>
 *   <li>{@link rpg.impl.CooldownChangeImpl#getTalent <em>Talent</em>}</li>
 *   <li>{@link rpg.impl.CooldownChangeImpl#getCooldownTalent <em>Cooldown Talent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CooldownChangeImpl extends ChangeImpl implements CooldownChange {
	/**
	 * The cached value of the '{@link #getAbility() <em>Ability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbility()
	 * @generated
	 * @ordered
	 */
	protected Ability ability;

	/**
	 * The cached value of the '{@link #getTalent() <em>Talent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTalent()
	 * @generated
	 * @ordered
	 */
	protected Talent talent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CooldownChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.COOLDOWN_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ability getAbility() {
		if (ability != null && ability.eIsProxy()) {
			InternalEObject oldAbility = (InternalEObject)ability;
			ability = (Ability)eResolveProxy(oldAbility);
			if (ability != oldAbility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RpgPackage.COOLDOWN_CHANGE__ABILITY, oldAbility, ability));
			}
		}
		return ability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ability basicGetAbility() {
		return ability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbility(Ability newAbility) {
		Ability oldAbility = ability;
		ability = newAbility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.COOLDOWN_CHANGE__ABILITY, oldAbility, ability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Talent getTalent() {
		if (talent != null && talent.eIsProxy()) {
			InternalEObject oldTalent = (InternalEObject)talent;
			talent = (Talent)eResolveProxy(oldTalent);
			if (talent != oldTalent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RpgPackage.COOLDOWN_CHANGE__TALENT, oldTalent, talent));
			}
		}
		return talent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Talent basicGetTalent() {
		return talent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTalent(Talent newTalent) {
		Talent oldTalent = talent;
		talent = newTalent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.COOLDOWN_CHANGE__TALENT, oldTalent, talent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CooldownTalent getCooldownTalent() {
		if (eContainerFeatureID() != RpgPackage.COOLDOWN_CHANGE__COOLDOWN_TALENT) return null;
		return (CooldownTalent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCooldownTalent(CooldownTalent newCooldownTalent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCooldownTalent, RpgPackage.COOLDOWN_CHANGE__COOLDOWN_TALENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCooldownTalent(CooldownTalent newCooldownTalent) {
		if (newCooldownTalent != eInternalContainer() || (eContainerFeatureID() != RpgPackage.COOLDOWN_CHANGE__COOLDOWN_TALENT && newCooldownTalent != null)) {
			if (EcoreUtil.isAncestor(this, newCooldownTalent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCooldownTalent != null)
				msgs = ((InternalEObject)newCooldownTalent).eInverseAdd(this, RpgPackage.COOLDOWN_TALENT__COOLDOWN_CHANGES, CooldownTalent.class, msgs);
			msgs = basicSetCooldownTalent(newCooldownTalent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.COOLDOWN_CHANGE__COOLDOWN_TALENT, newCooldownTalent, newCooldownTalent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RpgPackage.COOLDOWN_CHANGE__COOLDOWN_TALENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCooldownTalent((CooldownTalent)otherEnd, msgs);
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
			case RpgPackage.COOLDOWN_CHANGE__COOLDOWN_TALENT:
				return basicSetCooldownTalent(null, msgs);
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
			case RpgPackage.COOLDOWN_CHANGE__COOLDOWN_TALENT:
				return eInternalContainer().eInverseRemove(this, RpgPackage.COOLDOWN_TALENT__COOLDOWN_CHANGES, CooldownTalent.class, msgs);
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
			case RpgPackage.COOLDOWN_CHANGE__ABILITY:
				if (resolve) return getAbility();
				return basicGetAbility();
			case RpgPackage.COOLDOWN_CHANGE__TALENT:
				if (resolve) return getTalent();
				return basicGetTalent();
			case RpgPackage.COOLDOWN_CHANGE__COOLDOWN_TALENT:
				return getCooldownTalent();
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
			case RpgPackage.COOLDOWN_CHANGE__ABILITY:
				setAbility((Ability)newValue);
				return;
			case RpgPackage.COOLDOWN_CHANGE__TALENT:
				setTalent((Talent)newValue);
				return;
			case RpgPackage.COOLDOWN_CHANGE__COOLDOWN_TALENT:
				setCooldownTalent((CooldownTalent)newValue);
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
			case RpgPackage.COOLDOWN_CHANGE__ABILITY:
				setAbility((Ability)null);
				return;
			case RpgPackage.COOLDOWN_CHANGE__TALENT:
				setTalent((Talent)null);
				return;
			case RpgPackage.COOLDOWN_CHANGE__COOLDOWN_TALENT:
				setCooldownTalent((CooldownTalent)null);
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
			case RpgPackage.COOLDOWN_CHANGE__ABILITY:
				return ability != null;
			case RpgPackage.COOLDOWN_CHANGE__TALENT:
				return talent != null;
			case RpgPackage.COOLDOWN_CHANGE__COOLDOWN_TALENT:
				return getCooldownTalent() != null;
		}
		return super.eIsSet(featureID);
	}

} //CooldownChangeImpl
