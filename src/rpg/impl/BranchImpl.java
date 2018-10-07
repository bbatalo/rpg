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

import rpg.Branch;
import rpg.BranchType;
import rpg.CharacterClass;
import rpg.Node;
import rpg.RpgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.BranchImpl#getName <em>Name</em>}</li>
 *   <li>{@link rpg.impl.BranchImpl#getLore <em>Lore</em>}</li>
 *   <li>{@link rpg.impl.BranchImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rpg.impl.BranchImpl#getBranchType <em>Branch Type</em>}</li>
 *   <li>{@link rpg.impl.BranchImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link rpg.impl.BranchImpl#isIsInheritable <em>Is Inheritable</em>}</li>
 *   <li>{@link rpg.impl.BranchImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link rpg.impl.BranchImpl#getCharacterClass <em>Character Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchImpl extends MinimalEObjectImpl.Container implements Branch {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

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
	 * The default value of the '{@link #getBranchType() <em>Branch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchType()
	 * @generated
	 * @ordered
	 */
	protected static final BranchType BRANCH_TYPE_EDEFAULT = BranchType.TALENT_LITERAL;

	/**
	 * The cached value of the '{@link #getBranchType() <em>Branch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchType()
	 * @generated
	 * @ordered
	 */
	protected BranchType branchType = BRANCH_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #isIsInheritable() <em>Is Inheritable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInheritable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INHERITABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsInheritable() <em>Is Inheritable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInheritable()
	 * @generated
	 * @ordered
	 */
	protected boolean isInheritable = IS_INHERITABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList nodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.BRANCH;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.BRANCH__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.BRANCH__LORE, oldLore, lore));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.BRANCH__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchType getBranchType() {
		return branchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranchType(BranchType newBranchType) {
		BranchType oldBranchType = branchType;
		branchType = newBranchType == null ? BRANCH_TYPE_EDEFAULT : newBranchType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.BRANCH__BRANCH_TYPE, oldBranchType, branchType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.BRANCH__TOOLTIP, oldTooltip, tooltip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInheritable() {
		return isInheritable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInheritable(boolean newIsInheritable) {
		boolean oldIsInheritable = isInheritable;
		isInheritable = newIsInheritable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.BRANCH__IS_INHERITABLE, oldIsInheritable, isInheritable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList(Node.class, this, RpgPackage.BRANCH__NODES, RpgPackage.NODE__BRANCH);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterClass getCharacterClass() {
		if (eContainerFeatureID() != RpgPackage.BRANCH__CHARACTER_CLASS) return null;
		return (CharacterClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCharacterClass(CharacterClass newCharacterClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCharacterClass, RpgPackage.BRANCH__CHARACTER_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterClass(CharacterClass newCharacterClass) {
		if (newCharacterClass != eInternalContainer() || (eContainerFeatureID() != RpgPackage.BRANCH__CHARACTER_CLASS && newCharacterClass != null)) {
			if (EcoreUtil.isAncestor(this, newCharacterClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCharacterClass != null)
				msgs = ((InternalEObject)newCharacterClass).eInverseAdd(this, RpgPackage.CHARACTER_CLASS__BRANCHES, CharacterClass.class, msgs);
			msgs = basicSetCharacterClass(newCharacterClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.BRANCH__CHARACTER_CLASS, newCharacterClass, newCharacterClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RpgPackage.BRANCH__NODES:
				return ((InternalEList)getNodes()).basicAdd(otherEnd, msgs);
			case RpgPackage.BRANCH__CHARACTER_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCharacterClass((CharacterClass)otherEnd, msgs);
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
			case RpgPackage.BRANCH__NODES:
				return ((InternalEList)getNodes()).basicRemove(otherEnd, msgs);
			case RpgPackage.BRANCH__CHARACTER_CLASS:
				return basicSetCharacterClass(null, msgs);
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
			case RpgPackage.BRANCH__CHARACTER_CLASS:
				return eInternalContainer().eInverseRemove(this, RpgPackage.CHARACTER_CLASS__BRANCHES, CharacterClass.class, msgs);
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
			case RpgPackage.BRANCH__NAME:
				return getName();
			case RpgPackage.BRANCH__LORE:
				return getLore();
			case RpgPackage.BRANCH__DESCRIPTION:
				return getDescription();
			case RpgPackage.BRANCH__BRANCH_TYPE:
				return getBranchType();
			case RpgPackage.BRANCH__TOOLTIP:
				return getTooltip();
			case RpgPackage.BRANCH__IS_INHERITABLE:
				return isIsInheritable() ? Boolean.TRUE : Boolean.FALSE;
			case RpgPackage.BRANCH__NODES:
				return getNodes();
			case RpgPackage.BRANCH__CHARACTER_CLASS:
				return getCharacterClass();
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
			case RpgPackage.BRANCH__NAME:
				setName((String)newValue);
				return;
			case RpgPackage.BRANCH__LORE:
				setLore((String)newValue);
				return;
			case RpgPackage.BRANCH__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RpgPackage.BRANCH__BRANCH_TYPE:
				setBranchType((BranchType)newValue);
				return;
			case RpgPackage.BRANCH__TOOLTIP:
				setTooltip((String)newValue);
				return;
			case RpgPackage.BRANCH__IS_INHERITABLE:
				setIsInheritable(((Boolean)newValue).booleanValue());
				return;
			case RpgPackage.BRANCH__NODES:
				getNodes().clear();
				getNodes().addAll((Collection)newValue);
				return;
			case RpgPackage.BRANCH__CHARACTER_CLASS:
				setCharacterClass((CharacterClass)newValue);
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
			case RpgPackage.BRANCH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RpgPackage.BRANCH__LORE:
				setLore(LORE_EDEFAULT);
				return;
			case RpgPackage.BRANCH__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RpgPackage.BRANCH__BRANCH_TYPE:
				setBranchType(BRANCH_TYPE_EDEFAULT);
				return;
			case RpgPackage.BRANCH__TOOLTIP:
				setTooltip(TOOLTIP_EDEFAULT);
				return;
			case RpgPackage.BRANCH__IS_INHERITABLE:
				setIsInheritable(IS_INHERITABLE_EDEFAULT);
				return;
			case RpgPackage.BRANCH__NODES:
				getNodes().clear();
				return;
			case RpgPackage.BRANCH__CHARACTER_CLASS:
				setCharacterClass((CharacterClass)null);
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
			case RpgPackage.BRANCH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RpgPackage.BRANCH__LORE:
				return LORE_EDEFAULT == null ? lore != null : !LORE_EDEFAULT.equals(lore);
			case RpgPackage.BRANCH__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RpgPackage.BRANCH__BRANCH_TYPE:
				return branchType != BRANCH_TYPE_EDEFAULT;
			case RpgPackage.BRANCH__TOOLTIP:
				return TOOLTIP_EDEFAULT == null ? tooltip != null : !TOOLTIP_EDEFAULT.equals(tooltip);
			case RpgPackage.BRANCH__IS_INHERITABLE:
				return isInheritable != IS_INHERITABLE_EDEFAULT;
			case RpgPackage.BRANCH__NODES:
				return nodes != null && !nodes.isEmpty();
			case RpgPackage.BRANCH__CHARACTER_CLASS:
				return getCharacterClass() != null;
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
		result.append(", branchType: ");
		result.append(branchType);
		result.append(", tooltip: ");
		result.append(tooltip);
		result.append(", isInheritable: ");
		result.append(isInheritable);
		result.append(')');
		return result.toString();
	}

} //BranchImpl
