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

import rpg.RpgPackage;
import rpg.StatChange;
import rpg.StatTalent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stat Talent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.StatTalentImpl#getStatChanges <em>Stat Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatTalentImpl extends TalentImpl implements StatTalent {
	/**
	 * The cached value of the '{@link #getStatChanges() <em>Stat Changes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatChanges()
	 * @generated
	 * @ordered
	 */
	protected EList statChanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatTalentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.STAT_TALENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStatChanges() {
		if (statChanges == null) {
			statChanges = new EObjectContainmentWithInverseEList(StatChange.class, this, RpgPackage.STAT_TALENT__STAT_CHANGES, RpgPackage.STAT_CHANGE__STAT_TALENT);
		}
		return statChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RpgPackage.STAT_TALENT__STAT_CHANGES:
				return ((InternalEList)getStatChanges()).basicAdd(otherEnd, msgs);
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
			case RpgPackage.STAT_TALENT__STAT_CHANGES:
				return ((InternalEList)getStatChanges()).basicRemove(otherEnd, msgs);
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
			case RpgPackage.STAT_TALENT__STAT_CHANGES:
				return getStatChanges();
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
			case RpgPackage.STAT_TALENT__STAT_CHANGES:
				getStatChanges().clear();
				getStatChanges().addAll((Collection)newValue);
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
			case RpgPackage.STAT_TALENT__STAT_CHANGES:
				getStatChanges().clear();
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
			case RpgPackage.STAT_TALENT__STAT_CHANGES:
				return statChanges != null && !statChanges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StatTalentImpl
