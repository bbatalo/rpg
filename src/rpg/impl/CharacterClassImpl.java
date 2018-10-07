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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rpg.Branch;
import rpg.CharacterClass;
import rpg.CharacterStatistic;
import rpg.RpgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.CharacterClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link rpg.impl.CharacterClassImpl#getLore <em>Lore</em>}</li>
 *   <li>{@link rpg.impl.CharacterClassImpl#getStatistics <em>Statistics</em>}</li>
 *   <li>{@link rpg.impl.CharacterClassImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rpg.impl.CharacterClassImpl#getChildClasses <em>Child Classes</em>}</li>
 *   <li>{@link rpg.impl.CharacterClassImpl#getParentClasses <em>Parent Classes</em>}</li>
 *   <li>{@link rpg.impl.CharacterClassImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link rpg.impl.CharacterClassImpl#isIsPlayable <em>Is Playable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CharacterClassImpl extends MinimalEObjectImpl.Container implements CharacterClass {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "My class";

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
	 * The cached value of the '{@link #getStatistics() <em>Statistics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatistics()
	 * @generated
	 * @ordered
	 */
	protected EList statistics;

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
	 * The cached value of the '{@link #getChildClasses() <em>Child Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildClasses()
	 * @generated
	 * @ordered
	 */
	protected EList childClasses;

	/**
	 * The cached value of the '{@link #getParentClasses() <em>Parent Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentClasses()
	 * @generated
	 * @ordered
	 */
	protected EList parentClasses;

	/**
	 * The cached value of the '{@link #getBranches() <em>Branches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranches()
	 * @generated
	 * @ordered
	 */
	protected EList branches;

	/**
	 * The default value of the '{@link #isIsPlayable() <em>Is Playable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlayable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PLAYABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPlayable() <em>Is Playable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlayable()
	 * @generated
	 * @ordered
	 */
	protected boolean isPlayable = IS_PLAYABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.CHARACTER_CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.CHARACTER_CLASS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.CHARACTER_CLASS__LORE, oldLore, lore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStatistics() {
		if (statistics == null) {
			statistics = new EObjectContainmentEList(CharacterStatistic.class, this, RpgPackage.CHARACTER_CLASS__STATISTICS);
		}
		return statistics;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.CHARACTER_CLASS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChildClasses() {
		if (childClasses == null) {
			childClasses = new EObjectWithInverseResolvingEList.ManyInverse(CharacterClass.class, this, RpgPackage.CHARACTER_CLASS__CHILD_CLASSES, RpgPackage.CHARACTER_CLASS__PARENT_CLASSES);
		}
		return childClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParentClasses() {
		if (parentClasses == null) {
			parentClasses = new EObjectWithInverseResolvingEList.ManyInverse(CharacterClass.class, this, RpgPackage.CHARACTER_CLASS__PARENT_CLASSES, RpgPackage.CHARACTER_CLASS__CHILD_CLASSES);
		}
		return parentClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBranches() {
		if (branches == null) {
			branches = new EObjectContainmentWithInverseEList(Branch.class, this, RpgPackage.CHARACTER_CLASS__BRANCHES, RpgPackage.BRANCH__CHARACTER_CLASS);
		}
		return branches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPlayable() {
		return isPlayable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPlayable(boolean newIsPlayable) {
		boolean oldIsPlayable = isPlayable;
		isPlayable = newIsPlayable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.CHARACTER_CLASS__IS_PLAYABLE, oldIsPlayable, isPlayable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RpgPackage.CHARACTER_CLASS__CHILD_CLASSES:
				return ((InternalEList)getChildClasses()).basicAdd(otherEnd, msgs);
			case RpgPackage.CHARACTER_CLASS__PARENT_CLASSES:
				return ((InternalEList)getParentClasses()).basicAdd(otherEnd, msgs);
			case RpgPackage.CHARACTER_CLASS__BRANCHES:
				return ((InternalEList)getBranches()).basicAdd(otherEnd, msgs);
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
			case RpgPackage.CHARACTER_CLASS__STATISTICS:
				return ((InternalEList)getStatistics()).basicRemove(otherEnd, msgs);
			case RpgPackage.CHARACTER_CLASS__CHILD_CLASSES:
				return ((InternalEList)getChildClasses()).basicRemove(otherEnd, msgs);
			case RpgPackage.CHARACTER_CLASS__PARENT_CLASSES:
				return ((InternalEList)getParentClasses()).basicRemove(otherEnd, msgs);
			case RpgPackage.CHARACTER_CLASS__BRANCHES:
				return ((InternalEList)getBranches()).basicRemove(otherEnd, msgs);
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
			case RpgPackage.CHARACTER_CLASS__NAME:
				return getName();
			case RpgPackage.CHARACTER_CLASS__LORE:
				return getLore();
			case RpgPackage.CHARACTER_CLASS__STATISTICS:
				return getStatistics();
			case RpgPackage.CHARACTER_CLASS__DESCRIPTION:
				return getDescription();
			case RpgPackage.CHARACTER_CLASS__CHILD_CLASSES:
				return getChildClasses();
			case RpgPackage.CHARACTER_CLASS__PARENT_CLASSES:
				return getParentClasses();
			case RpgPackage.CHARACTER_CLASS__BRANCHES:
				return getBranches();
			case RpgPackage.CHARACTER_CLASS__IS_PLAYABLE:
				return isIsPlayable() ? Boolean.TRUE : Boolean.FALSE;
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
			case RpgPackage.CHARACTER_CLASS__NAME:
				setName((String)newValue);
				return;
			case RpgPackage.CHARACTER_CLASS__LORE:
				setLore((String)newValue);
				return;
			case RpgPackage.CHARACTER_CLASS__STATISTICS:
				getStatistics().clear();
				getStatistics().addAll((Collection)newValue);
				return;
			case RpgPackage.CHARACTER_CLASS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RpgPackage.CHARACTER_CLASS__CHILD_CLASSES:
				getChildClasses().clear();
				getChildClasses().addAll((Collection)newValue);
				return;
			case RpgPackage.CHARACTER_CLASS__PARENT_CLASSES:
				getParentClasses().clear();
				getParentClasses().addAll((Collection)newValue);
				return;
			case RpgPackage.CHARACTER_CLASS__BRANCHES:
				getBranches().clear();
				getBranches().addAll((Collection)newValue);
				return;
			case RpgPackage.CHARACTER_CLASS__IS_PLAYABLE:
				setIsPlayable(((Boolean)newValue).booleanValue());
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
			case RpgPackage.CHARACTER_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RpgPackage.CHARACTER_CLASS__LORE:
				setLore(LORE_EDEFAULT);
				return;
			case RpgPackage.CHARACTER_CLASS__STATISTICS:
				getStatistics().clear();
				return;
			case RpgPackage.CHARACTER_CLASS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RpgPackage.CHARACTER_CLASS__CHILD_CLASSES:
				getChildClasses().clear();
				return;
			case RpgPackage.CHARACTER_CLASS__PARENT_CLASSES:
				getParentClasses().clear();
				return;
			case RpgPackage.CHARACTER_CLASS__BRANCHES:
				getBranches().clear();
				return;
			case RpgPackage.CHARACTER_CLASS__IS_PLAYABLE:
				setIsPlayable(IS_PLAYABLE_EDEFAULT);
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
			case RpgPackage.CHARACTER_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RpgPackage.CHARACTER_CLASS__LORE:
				return LORE_EDEFAULT == null ? lore != null : !LORE_EDEFAULT.equals(lore);
			case RpgPackage.CHARACTER_CLASS__STATISTICS:
				return statistics != null && !statistics.isEmpty();
			case RpgPackage.CHARACTER_CLASS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RpgPackage.CHARACTER_CLASS__CHILD_CLASSES:
				return childClasses != null && !childClasses.isEmpty();
			case RpgPackage.CHARACTER_CLASS__PARENT_CLASSES:
				return parentClasses != null && !parentClasses.isEmpty();
			case RpgPackage.CHARACTER_CLASS__BRANCHES:
				return branches != null && !branches.isEmpty();
			case RpgPackage.CHARACTER_CLASS__IS_PLAYABLE:
				return isPlayable != IS_PLAYABLE_EDEFAULT;
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
		result.append(", isPlayable: ");
		result.append(isPlayable);
		result.append(')');
		return result.toString();
	}

} //CharacterClassImpl
