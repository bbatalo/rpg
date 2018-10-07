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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import rpg.Ability;
import rpg.Branch;
import rpg.Node;
import rpg.NodeActivation;
import rpg.NodeType;
import rpg.RpgPackage;
import rpg.Talent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link rpg.impl.NodeImpl#getLore <em>Lore</em>}</li>
 *   <li>{@link rpg.impl.NodeImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link rpg.impl.NodeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rpg.impl.NodeImpl#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link rpg.impl.NodeImpl#getChildNodes <em>Child Nodes</em>}</li>
 *   <li>{@link rpg.impl.NodeImpl#getParentNodes <em>Parent Nodes</em>}</li>
 *   <li>{@link rpg.impl.NodeImpl#getActivation <em>Activation</em>}</li>
 *   <li>{@link rpg.impl.NodeImpl#getMinActivationLevel <em>Min Activation Level</em>}</li>
 *   <li>{@link rpg.impl.NodeImpl#getMaxActivationLevel <em>Max Activation Level</em>}</li>
 *   <li>{@link rpg.impl.NodeImpl#getActivationLevel <em>Activation Level</em>}</li>
 *   <li>{@link rpg.impl.NodeImpl#getAbilities <em>Abilities</em>}</li>
 *   <li>{@link rpg.impl.NodeImpl#getTalents <em>Talents</em>}</li>
 *   <li>{@link rpg.impl.NodeImpl#isIsLocked <em>Is Locked</em>}</li>
 *   <li>{@link rpg.impl.NodeImpl#getBranch <em>Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
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
	 * The default value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeType NODE_TYPE_EDEFAULT = NodeType.STANDARD_LITERAL;

	/**
	 * The cached value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected NodeType nodeType = NODE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildNodes() <em>Child Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildNodes()
	 * @generated
	 * @ordered
	 */
	protected EList childNodes;

	/**
	 * The cached value of the '{@link #getParentNodes() <em>Parent Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentNodes()
	 * @generated
	 * @ordered
	 */
	protected EList parentNodes;

	/**
	 * The cached value of the '{@link #getActivation() <em>Activation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation()
	 * @generated
	 * @ordered
	 */
	protected EList activation;

	/**
	 * The default value of the '{@link #getMinActivationLevel() <em>Min Activation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinActivationLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_ACTIVATION_LEVEL_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMinActivationLevel() <em>Min Activation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinActivationLevel()
	 * @generated
	 * @ordered
	 */
	protected int minActivationLevel = MIN_ACTIVATION_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxActivationLevel() <em>Max Activation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxActivationLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ACTIVATION_LEVEL_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMaxActivationLevel() <em>Max Activation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxActivationLevel()
	 * @generated
	 * @ordered
	 */
	protected int maxActivationLevel = MAX_ACTIVATION_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivationLevel() <em>Activation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTIVATION_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActivationLevel() <em>Activation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationLevel()
	 * @generated
	 * @ordered
	 */
	protected int activationLevel = ACTIVATION_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAbilities() <em>Abilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbilities()
	 * @generated
	 * @ordered
	 */
	protected EList abilities;

	/**
	 * The cached value of the '{@link #getTalents() <em>Talents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTalents()
	 * @generated
	 * @ordered
	 */
	protected EList talents;

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
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.NODE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.NODE__LORE, oldLore, lore));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.NODE__TOOLTIP, oldTooltip, tooltip));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.NODE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType getNodeType() {
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeType(NodeType newNodeType) {
		NodeType oldNodeType = nodeType;
		nodeType = newNodeType == null ? NODE_TYPE_EDEFAULT : newNodeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.NODE__NODE_TYPE, oldNodeType, nodeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChildNodes() {
		if (childNodes == null) {
			childNodes = new EObjectWithInverseResolvingEList.ManyInverse(Node.class, this, RpgPackage.NODE__CHILD_NODES, RpgPackage.NODE__PARENT_NODES);
		}
		return childNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParentNodes() {
		if (parentNodes == null) {
			parentNodes = new EObjectWithInverseResolvingEList.ManyInverse(Node.class, this, RpgPackage.NODE__PARENT_NODES, RpgPackage.NODE__CHILD_NODES);
		}
		return parentNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActivation() {
		if (activation == null) {
			activation = new EObjectContainmentWithInverseEList(NodeActivation.class, this, RpgPackage.NODE__ACTIVATION, RpgPackage.NODE_ACTIVATION__NODE);
		}
		return activation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinActivationLevel() {
		return minActivationLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinActivationLevel(int newMinActivationLevel) {
		int oldMinActivationLevel = minActivationLevel;
		minActivationLevel = newMinActivationLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.NODE__MIN_ACTIVATION_LEVEL, oldMinActivationLevel, minActivationLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxActivationLevel() {
		return maxActivationLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxActivationLevel(int newMaxActivationLevel) {
		int oldMaxActivationLevel = maxActivationLevel;
		maxActivationLevel = newMaxActivationLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.NODE__MAX_ACTIVATION_LEVEL, oldMaxActivationLevel, maxActivationLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActivationLevel() {
		return activationLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationLevel(int newActivationLevel) {
		int oldActivationLevel = activationLevel;
		activationLevel = newActivationLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.NODE__ACTIVATION_LEVEL, oldActivationLevel, activationLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAbilities() {
		if (abilities == null) {
			abilities = new EObjectContainmentWithInverseEList(Ability.class, this, RpgPackage.NODE__ABILITIES, RpgPackage.ABILITY__NODE);
		}
		return abilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTalents() {
		if (talents == null) {
			talents = new EObjectContainmentWithInverseEList(Talent.class, this, RpgPackage.NODE__TALENTS, RpgPackage.TALENT__NODE);
		}
		return talents;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.NODE__IS_LOCKED, oldIsLocked, isLocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch getBranch() {
		if (eContainerFeatureID() != RpgPackage.NODE__BRANCH) return null;
		return (Branch)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranch(Branch newBranch, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBranch, RpgPackage.NODE__BRANCH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranch(Branch newBranch) {
		if (newBranch != eInternalContainer() || (eContainerFeatureID() != RpgPackage.NODE__BRANCH && newBranch != null)) {
			if (EcoreUtil.isAncestor(this, newBranch))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBranch != null)
				msgs = ((InternalEObject)newBranch).eInverseAdd(this, RpgPackage.BRANCH__NODES, Branch.class, msgs);
			msgs = basicSetBranch(newBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.NODE__BRANCH, newBranch, newBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RpgPackage.NODE__CHILD_NODES:
				return ((InternalEList)getChildNodes()).basicAdd(otherEnd, msgs);
			case RpgPackage.NODE__PARENT_NODES:
				return ((InternalEList)getParentNodes()).basicAdd(otherEnd, msgs);
			case RpgPackage.NODE__ACTIVATION:
				return ((InternalEList)getActivation()).basicAdd(otherEnd, msgs);
			case RpgPackage.NODE__ABILITIES:
				return ((InternalEList)getAbilities()).basicAdd(otherEnd, msgs);
			case RpgPackage.NODE__TALENTS:
				return ((InternalEList)getTalents()).basicAdd(otherEnd, msgs);
			case RpgPackage.NODE__BRANCH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBranch((Branch)otherEnd, msgs);
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
			case RpgPackage.NODE__CHILD_NODES:
				return ((InternalEList)getChildNodes()).basicRemove(otherEnd, msgs);
			case RpgPackage.NODE__PARENT_NODES:
				return ((InternalEList)getParentNodes()).basicRemove(otherEnd, msgs);
			case RpgPackage.NODE__ACTIVATION:
				return ((InternalEList)getActivation()).basicRemove(otherEnd, msgs);
			case RpgPackage.NODE__ABILITIES:
				return ((InternalEList)getAbilities()).basicRemove(otherEnd, msgs);
			case RpgPackage.NODE__TALENTS:
				return ((InternalEList)getTalents()).basicRemove(otherEnd, msgs);
			case RpgPackage.NODE__BRANCH:
				return basicSetBranch(null, msgs);
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
			case RpgPackage.NODE__BRANCH:
				return eInternalContainer().eInverseRemove(this, RpgPackage.BRANCH__NODES, Branch.class, msgs);
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
			case RpgPackage.NODE__NAME:
				return getName();
			case RpgPackage.NODE__LORE:
				return getLore();
			case RpgPackage.NODE__TOOLTIP:
				return getTooltip();
			case RpgPackage.NODE__DESCRIPTION:
				return getDescription();
			case RpgPackage.NODE__NODE_TYPE:
				return getNodeType();
			case RpgPackage.NODE__CHILD_NODES:
				return getChildNodes();
			case RpgPackage.NODE__PARENT_NODES:
				return getParentNodes();
			case RpgPackage.NODE__ACTIVATION:
				return getActivation();
			case RpgPackage.NODE__MIN_ACTIVATION_LEVEL:
				return new Integer(getMinActivationLevel());
			case RpgPackage.NODE__MAX_ACTIVATION_LEVEL:
				return new Integer(getMaxActivationLevel());
			case RpgPackage.NODE__ACTIVATION_LEVEL:
				return new Integer(getActivationLevel());
			case RpgPackage.NODE__ABILITIES:
				return getAbilities();
			case RpgPackage.NODE__TALENTS:
				return getTalents();
			case RpgPackage.NODE__IS_LOCKED:
				return isIsLocked() ? Boolean.TRUE : Boolean.FALSE;
			case RpgPackage.NODE__BRANCH:
				return getBranch();
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
			case RpgPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case RpgPackage.NODE__LORE:
				setLore((String)newValue);
				return;
			case RpgPackage.NODE__TOOLTIP:
				setTooltip((String)newValue);
				return;
			case RpgPackage.NODE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RpgPackage.NODE__NODE_TYPE:
				setNodeType((NodeType)newValue);
				return;
			case RpgPackage.NODE__CHILD_NODES:
				getChildNodes().clear();
				getChildNodes().addAll((Collection)newValue);
				return;
			case RpgPackage.NODE__PARENT_NODES:
				getParentNodes().clear();
				getParentNodes().addAll((Collection)newValue);
				return;
			case RpgPackage.NODE__ACTIVATION:
				getActivation().clear();
				getActivation().addAll((Collection)newValue);
				return;
			case RpgPackage.NODE__MIN_ACTIVATION_LEVEL:
				setMinActivationLevel(((Integer)newValue).intValue());
				return;
			case RpgPackage.NODE__MAX_ACTIVATION_LEVEL:
				setMaxActivationLevel(((Integer)newValue).intValue());
				return;
			case RpgPackage.NODE__ACTIVATION_LEVEL:
				setActivationLevel(((Integer)newValue).intValue());
				return;
			case RpgPackage.NODE__ABILITIES:
				getAbilities().clear();
				getAbilities().addAll((Collection)newValue);
				return;
			case RpgPackage.NODE__TALENTS:
				getTalents().clear();
				getTalents().addAll((Collection)newValue);
				return;
			case RpgPackage.NODE__IS_LOCKED:
				setIsLocked(((Boolean)newValue).booleanValue());
				return;
			case RpgPackage.NODE__BRANCH:
				setBranch((Branch)newValue);
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
			case RpgPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RpgPackage.NODE__LORE:
				setLore(LORE_EDEFAULT);
				return;
			case RpgPackage.NODE__TOOLTIP:
				setTooltip(TOOLTIP_EDEFAULT);
				return;
			case RpgPackage.NODE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RpgPackage.NODE__NODE_TYPE:
				setNodeType(NODE_TYPE_EDEFAULT);
				return;
			case RpgPackage.NODE__CHILD_NODES:
				getChildNodes().clear();
				return;
			case RpgPackage.NODE__PARENT_NODES:
				getParentNodes().clear();
				return;
			case RpgPackage.NODE__ACTIVATION:
				getActivation().clear();
				return;
			case RpgPackage.NODE__MIN_ACTIVATION_LEVEL:
				setMinActivationLevel(MIN_ACTIVATION_LEVEL_EDEFAULT);
				return;
			case RpgPackage.NODE__MAX_ACTIVATION_LEVEL:
				setMaxActivationLevel(MAX_ACTIVATION_LEVEL_EDEFAULT);
				return;
			case RpgPackage.NODE__ACTIVATION_LEVEL:
				setActivationLevel(ACTIVATION_LEVEL_EDEFAULT);
				return;
			case RpgPackage.NODE__ABILITIES:
				getAbilities().clear();
				return;
			case RpgPackage.NODE__TALENTS:
				getTalents().clear();
				return;
			case RpgPackage.NODE__IS_LOCKED:
				setIsLocked(IS_LOCKED_EDEFAULT);
				return;
			case RpgPackage.NODE__BRANCH:
				setBranch((Branch)null);
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
			case RpgPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RpgPackage.NODE__LORE:
				return LORE_EDEFAULT == null ? lore != null : !LORE_EDEFAULT.equals(lore);
			case RpgPackage.NODE__TOOLTIP:
				return TOOLTIP_EDEFAULT == null ? tooltip != null : !TOOLTIP_EDEFAULT.equals(tooltip);
			case RpgPackage.NODE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RpgPackage.NODE__NODE_TYPE:
				return nodeType != NODE_TYPE_EDEFAULT;
			case RpgPackage.NODE__CHILD_NODES:
				return childNodes != null && !childNodes.isEmpty();
			case RpgPackage.NODE__PARENT_NODES:
				return parentNodes != null && !parentNodes.isEmpty();
			case RpgPackage.NODE__ACTIVATION:
				return activation != null && !activation.isEmpty();
			case RpgPackage.NODE__MIN_ACTIVATION_LEVEL:
				return minActivationLevel != MIN_ACTIVATION_LEVEL_EDEFAULT;
			case RpgPackage.NODE__MAX_ACTIVATION_LEVEL:
				return maxActivationLevel != MAX_ACTIVATION_LEVEL_EDEFAULT;
			case RpgPackage.NODE__ACTIVATION_LEVEL:
				return activationLevel != ACTIVATION_LEVEL_EDEFAULT;
			case RpgPackage.NODE__ABILITIES:
				return abilities != null && !abilities.isEmpty();
			case RpgPackage.NODE__TALENTS:
				return talents != null && !talents.isEmpty();
			case RpgPackage.NODE__IS_LOCKED:
				return isLocked != IS_LOCKED_EDEFAULT;
			case RpgPackage.NODE__BRANCH:
				return getBranch() != null;
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
		result.append(", description: ");
		result.append(description);
		result.append(", nodeType: ");
		result.append(nodeType);
		result.append(", minActivationLevel: ");
		result.append(minActivationLevel);
		result.append(", maxActivationLevel: ");
		result.append(maxActivationLevel);
		result.append(", activationLevel: ");
		result.append(activationLevel);
		result.append(", isLocked: ");
		result.append(isLocked);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
