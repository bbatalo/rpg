/**
 */
package rpg.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import rpg.Node;
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
 *   <li>{@link rpg.impl.NodeImpl#isIsActivated <em>Is Activated</em>}</li>
 *   <li>{@link rpg.impl.NodeImpl#getAbilities <em>Abilities</em>}</li>
 *   <li>{@link rpg.impl.NodeImpl#getTalents <em>Talents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends CDOObjectImpl implements Node {
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
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(RpgPackage.Literals.NODE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(RpgPackage.Literals.NODE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLore() {
		return (String)eGet(RpgPackage.Literals.NODE__LORE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLore(String newLore) {
		eSet(RpgPackage.Literals.NODE__LORE, newLore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTooltip() {
		return (String)eGet(RpgPackage.Literals.NODE__TOOLTIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTooltip(String newTooltip) {
		eSet(RpgPackage.Literals.NODE__TOOLTIP, newTooltip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(RpgPackage.Literals.NODE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(RpgPackage.Literals.NODE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType getNodeType() {
		return (NodeType)eGet(RpgPackage.Literals.NODE__NODE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeType(NodeType newNodeType) {
		eSet(RpgPackage.Literals.NODE__NODE_TYPE, newNodeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChildNodes() {
		return (EList)eGet(RpgPackage.Literals.NODE__CHILD_NODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getParentNodes() {
		return (Node)eGet(RpgPackage.Literals.NODE__PARENT_NODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNodes(Node newParentNodes) {
		eSet(RpgPackage.Literals.NODE__PARENT_NODES, newParentNodes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActivation() {
		return (EList)eGet(RpgPackage.Literals.NODE__ACTIVATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinActivationLevel() {
		return ((Integer)eGet(RpgPackage.Literals.NODE__MIN_ACTIVATION_LEVEL, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinActivationLevel(int newMinActivationLevel) {
		eSet(RpgPackage.Literals.NODE__MIN_ACTIVATION_LEVEL, new Integer(newMinActivationLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxActivationLevel() {
		return ((Integer)eGet(RpgPackage.Literals.NODE__MAX_ACTIVATION_LEVEL, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxActivationLevel(int newMaxActivationLevel) {
		eSet(RpgPackage.Literals.NODE__MAX_ACTIVATION_LEVEL, new Integer(newMaxActivationLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActivationLevel() {
		return ((Integer)eGet(RpgPackage.Literals.NODE__ACTIVATION_LEVEL, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationLevel(int newActivationLevel) {
		eSet(RpgPackage.Literals.NODE__ACTIVATION_LEVEL, new Integer(newActivationLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsActivated() {
		return ((Boolean)eGet(RpgPackage.Literals.NODE__IS_ACTIVATED, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActivated(boolean newIsActivated) {
		eSet(RpgPackage.Literals.NODE__IS_ACTIVATED, new Boolean(newIsActivated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAbilities() {
		return (EList)eGet(RpgPackage.Literals.NODE__ABILITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Talent getTalents() {
		return (Talent)eGet(RpgPackage.Literals.NODE__TALENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTalents(Talent newTalents) {
		eSet(RpgPackage.Literals.NODE__TALENTS, newTalents);
	}

} //NodeImpl
