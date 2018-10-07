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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rpg.CharacterClass;
import rpg.RPG;
import rpg.RangeUnit;
import rpg.RpgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.RPGImpl#getName <em>Name</em>}</li>
 *   <li>{@link rpg.impl.RPGImpl#getLore <em>Lore</em>}</li>
 *   <li>{@link rpg.impl.RPGImpl#getAllClasses <em>All Classes</em>}</li>
 *   <li>{@link rpg.impl.RPGImpl#getRangeUnits <em>Range Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RPGImpl extends MinimalEObjectImpl.Container implements RPG {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "My Role-Playing Game";

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
	protected static final String LORE_EDEFAULT = "My lore";

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
	 * The cached value of the '{@link #getAllClasses() <em>All Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllClasses()
	 * @generated
	 * @ordered
	 */
	protected EList allClasses;

	/**
	 * The cached value of the '{@link #getRangeUnits() <em>Range Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeUnits()
	 * @generated
	 * @ordered
	 */
	protected EList rangeUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.RPG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.RPG__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.RPG__LORE, oldLore, lore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllClasses() {
		if (allClasses == null) {
			allClasses = new EObjectContainmentEList(CharacterClass.class, this, RpgPackage.RPG__ALL_CLASSES);
		}
		return allClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRangeUnits() {
		if (rangeUnits == null) {
			rangeUnits = new EObjectContainmentEList(RangeUnit.class, this, RpgPackage.RPG__RANGE_UNITS);
		}
		return rangeUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RpgPackage.RPG__ALL_CLASSES:
				return ((InternalEList)getAllClasses()).basicRemove(otherEnd, msgs);
			case RpgPackage.RPG__RANGE_UNITS:
				return ((InternalEList)getRangeUnits()).basicRemove(otherEnd, msgs);
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
			case RpgPackage.RPG__NAME:
				return getName();
			case RpgPackage.RPG__LORE:
				return getLore();
			case RpgPackage.RPG__ALL_CLASSES:
				return getAllClasses();
			case RpgPackage.RPG__RANGE_UNITS:
				return getRangeUnits();
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
			case RpgPackage.RPG__NAME:
				setName((String)newValue);
				return;
			case RpgPackage.RPG__LORE:
				setLore((String)newValue);
				return;
			case RpgPackage.RPG__ALL_CLASSES:
				getAllClasses().clear();
				getAllClasses().addAll((Collection)newValue);
				return;
			case RpgPackage.RPG__RANGE_UNITS:
				getRangeUnits().clear();
				getRangeUnits().addAll((Collection)newValue);
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
			case RpgPackage.RPG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RpgPackage.RPG__LORE:
				setLore(LORE_EDEFAULT);
				return;
			case RpgPackage.RPG__ALL_CLASSES:
				getAllClasses().clear();
				return;
			case RpgPackage.RPG__RANGE_UNITS:
				getRangeUnits().clear();
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
			case RpgPackage.RPG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RpgPackage.RPG__LORE:
				return LORE_EDEFAULT == null ? lore != null : !LORE_EDEFAULT.equals(lore);
			case RpgPackage.RPG__ALL_CLASSES:
				return allClasses != null && !allClasses.isEmpty();
			case RpgPackage.RPG__RANGE_UNITS:
				return rangeUnits != null && !rangeUnits.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //RPGImpl
