/**
 */
package rpg.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rpg.CooldownChange;
import rpg.CooldownTalent;
import rpg.RpgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cooldown Talent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.CooldownTalentImpl#getCooldownChanges <em>Cooldown Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CooldownTalentImpl extends TalentImpl implements CooldownTalent {
	/**
	 * The cached value of the '{@link #getCooldownChanges() <em>Cooldown Changes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooldownChanges()
	 * @generated
	 * @ordered
	 */
	protected EList cooldownChanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CooldownTalentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.COOLDOWN_TALENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCooldownChanges() {
		if (cooldownChanges == null) {
			cooldownChanges = new EObjectContainmentWithInverseEList(CooldownChange.class, this, RpgPackage.COOLDOWN_TALENT__COOLDOWN_CHANGES, RpgPackage.COOLDOWN_CHANGE__COOLDOWN_TALENT);
		}
		return cooldownChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RpgPackage.COOLDOWN_TALENT__COOLDOWN_CHANGES:
				return ((InternalEList)getCooldownChanges()).basicAdd(otherEnd, msgs);
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
			case RpgPackage.COOLDOWN_TALENT__COOLDOWN_CHANGES:
				return ((InternalEList)getCooldownChanges()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RpgPackage.COOLDOWN_TALENT__COOLDOWN_CHANGES:
				return getCooldownChanges();
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
			case RpgPackage.COOLDOWN_TALENT__COOLDOWN_CHANGES:
				getCooldownChanges().clear();
				getCooldownChanges().addAll((Collection)newValue);
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
			case RpgPackage.COOLDOWN_TALENT__COOLDOWN_CHANGES:
				getCooldownChanges().clear();
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
			case RpgPackage.COOLDOWN_TALENT__COOLDOWN_CHANGES:
				return cooldownChanges != null && !cooldownChanges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CooldownTalentImpl
