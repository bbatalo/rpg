/**
 */
package rpg;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.Node#getName <em>Name</em>}</li>
 *   <li>{@link rpg.Node#getLore <em>Lore</em>}</li>
 *   <li>{@link rpg.Node#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link rpg.Node#getDescription <em>Description</em>}</li>
 *   <li>{@link rpg.Node#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link rpg.Node#getChildNodes <em>Child Nodes</em>}</li>
 *   <li>{@link rpg.Node#getParentNodes <em>Parent Nodes</em>}</li>
 *   <li>{@link rpg.Node#getActivation <em>Activation</em>}</li>
 *   <li>{@link rpg.Node#getMinActivationLevel <em>Min Activation Level</em>}</li>
 *   <li>{@link rpg.Node#getMaxActivationLevel <em>Max Activation Level</em>}</li>
 *   <li>{@link rpg.Node#getActivationLevel <em>Activation Level</em>}</li>
 *   <li>{@link rpg.Node#isIsActivated <em>Is Activated</em>}</li>
 *   <li>{@link rpg.Node#getAbilities <em>Abilities</em>}</li>
 *   <li>{@link rpg.Node#getTalents <em>Talents</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RootNodeChildren RootNodeParents StandardNodeChildren StandardNodeParents StandaloneNodeConnections ActivationIntegrity MinimalNodeActivation MaximalNodeActivation UniqueNodeActivationLevels ProperNodeActivationLevels ProperAbilityLevels ProperEffectLevels'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot RootNodeChildren='self.nodeType = NodeType::ROOT implies self.childNodes->forAll(node | node.nodeType = NodeType::STANDARD)' RootNodeChildren$message='\'ROOT nodes can have only STANDARD nodes for children.\'' RootNodeParents='self.nodeType = NodeType::ROOT implies self.parentNodes->size() = 0' RootNodeParents$message='\'ROOT nodes can not have any parents.\'' StandardNodeChildren='self.nodeType = NodeType::STANDARD implies self.childNodes->forAll(node | node.nodeType = NodeType::STANDARD)' StandardNodeChildren$message='\'STANDARD nodes can have only STANDARD nodes for children.\'' StandardNodeParents='self.nodeType = NodeType::STANDARD implies self.parentNodes->forAll(node | node.nodeType = NodeType::ROOT or node.nodeType = NodeType::STANDARD)' StandardNodeParents$message='\'STANDARD nodes can have only ROOT or STANDARD nodes for parents.\'' StandaloneNodeConnections='self.nodeType = NodeType::STANDALONE implies self.parentNodes->size() = 0 and self.childNodes->size() = 0' StandaloneNodeConnections$message='\'STANDALONE nodes can not have parent or child nodes.\'' ActivationIntegrity='self.isActivated = true implies self.activationLevel >= self.minActivationLevel and self.activationLevel <= self.maxActivationLevel' ActivationIntegrity$message='\'Activated nodes must have activation level between minimum and maximum activation levels.\'' MinimalNodeActivation='self.isActivated = false implies self.activation->size() = (self.maxActivationLevel - self.minActivationLevel + 1) and self.activationLevel < self.minActivationLevel' MinimalNodeActivation$message='\'Non-activated nodes must have at least one node activation rule and have activation level below minimum.\'' MaximalNodeActivation='self.isActivated = true implies self.activation->size() = (self.maxActivationLevel - self.activationLevel)' MaximalNodeActivation$message='\'Activated nodes must have proper number of node activations.\'' UniqueNodeActivationLevels='self.activation->forAll(n1: NodeActivation, n2: NodeActivation | n1 <> n2 implies n1.level <> n2.level)' UniqueNodeActivationLevels$message='\'All node activations must have unique levels.\'' ProperNodeActivationLevels='\n\t\tif self.isActivated = true then\n\t\t\tself.activation->forAll(n: NodeActivation | n.level > self.activationLevel and n.level <= self.maxActivationLevel)\n\t\telse\n\t\t\tself.activation->forAll(n: NodeActivation | n.level >= self.minActivationLevel and n.level <= self.maxActivationLevel)\n\t\tendif' ProperNodeActivationLevels$message='\'All node activations must have levels between min and max activation levels.\'' ProperAbilityLevels='self.abilities->forAll(a: Ability | a.onLevel >= self.minActivationLevel and a.onLevel <= self.maxActivationLevel)' ProperAbilityLevels$message='\'All abilities must reference an appropriate node level.\'' ProperEffectLevels='self.abilities->forAll(a: Ability | a.effects->forAll(e: Effect | e.onLevel >= self.minActivationLevel and e.onLevel <= self.maxActivationLevel))' ProperEffectLevels$message='\'All ability effects must reference an appropriate node level.\''"
 * @extends CDOObject
 * @generated
 */
public interface Node extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rpg.RpgPackage#getNode_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rpg.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lore</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lore</em>' attribute.
	 * @see #setLore(String)
	 * @see rpg.RpgPackage#getNode_Lore()
	 * @model
	 * @generated
	 */
	String getLore();

	/**
	 * Sets the value of the '{@link rpg.Node#getLore <em>Lore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lore</em>' attribute.
	 * @see #getLore()
	 * @generated
	 */
	void setLore(String value);

	/**
	 * Returns the value of the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tooltip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tooltip</em>' attribute.
	 * @see #setTooltip(String)
	 * @see rpg.RpgPackage#getNode_Tooltip()
	 * @model required="true"
	 * @generated
	 */
	String getTooltip();

	/**
	 * Sets the value of the '{@link rpg.Node#getTooltip <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip</em>' attribute.
	 * @see #getTooltip()
	 * @generated
	 */
	void setTooltip(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see rpg.RpgPackage#getNode_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link rpg.Node#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Node Type</b></em>' attribute.
	 * The default value is <code>"STANDARD"</code>.
	 * The literals are from the enumeration {@link rpg.NodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type</em>' attribute.
	 * @see rpg.NodeType
	 * @see #setNodeType(NodeType)
	 * @see rpg.RpgPackage#getNode_NodeType()
	 * @model default="STANDARD" required="true"
	 * @generated
	 */
	NodeType getNodeType();

	/**
	 * Sets the value of the '{@link rpg.Node#getNodeType <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Type</em>' attribute.
	 * @see rpg.NodeType
	 * @see #getNodeType()
	 * @generated
	 */
	void setNodeType(NodeType value);

	/**
	 * Returns the value of the '<em><b>Child Nodes</b></em>' reference list.
	 * The list contents are of type {@link rpg.Node}.
	 * It is bidirectional and its opposite is '{@link rpg.Node#getParentNodes <em>Parent Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Nodes</em>' reference list.
	 * @see rpg.RpgPackage#getNode_ChildNodes()
	 * @see rpg.Node#getParentNodes
	 * @model type="rpg.Node" opposite="parentNodes"
	 * @generated
	 */
	EList getChildNodes();

	/**
	 * Returns the value of the '<em><b>Parent Nodes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rpg.Node#getChildNodes <em>Child Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Nodes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Nodes</em>' reference.
	 * @see #setParentNodes(Node)
	 * @see rpg.RpgPackage#getNode_ParentNodes()
	 * @see rpg.Node#getChildNodes
	 * @model opposite="childNodes"
	 * @generated
	 */
	Node getParentNodes();

	/**
	 * Sets the value of the '{@link rpg.Node#getParentNodes <em>Parent Nodes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Nodes</em>' reference.
	 * @see #getParentNodes()
	 * @generated
	 */
	void setParentNodes(Node value);

	/**
	 * Returns the value of the '<em><b>Activation</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.NodeActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation</em>' containment reference list.
	 * @see rpg.RpgPackage#getNode_Activation()
	 * @model type="rpg.NodeActivation" containment="true"
	 * @generated
	 */
	EList getActivation();

	/**
	 * Returns the value of the '<em><b>Min Activation Level</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Activation Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Activation Level</em>' attribute.
	 * @see #setMinActivationLevel(int)
	 * @see rpg.RpgPackage#getNode_MinActivationLevel()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getMinActivationLevel();

	/**
	 * Sets the value of the '{@link rpg.Node#getMinActivationLevel <em>Min Activation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Activation Level</em>' attribute.
	 * @see #getMinActivationLevel()
	 * @generated
	 */
	void setMinActivationLevel(int value);

	/**
	 * Returns the value of the '<em><b>Max Activation Level</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Activation Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Activation Level</em>' attribute.
	 * @see #setMaxActivationLevel(int)
	 * @see rpg.RpgPackage#getNode_MaxActivationLevel()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getMaxActivationLevel();

	/**
	 * Sets the value of the '{@link rpg.Node#getMaxActivationLevel <em>Max Activation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Activation Level</em>' attribute.
	 * @see #getMaxActivationLevel()
	 * @generated
	 */
	void setMaxActivationLevel(int value);

	/**
	 * Returns the value of the '<em><b>Activation Level</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Level</em>' attribute.
	 * @see #setActivationLevel(int)
	 * @see rpg.RpgPackage#getNode_ActivationLevel()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getActivationLevel();

	/**
	 * Sets the value of the '{@link rpg.Node#getActivationLevel <em>Activation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Level</em>' attribute.
	 * @see #getActivationLevel()
	 * @generated
	 */
	void setActivationLevel(int value);

	/**
	 * Returns the value of the '<em><b>Is Activated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Activated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Activated</em>' attribute.
	 * @see #setIsActivated(boolean)
	 * @see rpg.RpgPackage#getNode_IsActivated()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsActivated();

	/**
	 * Sets the value of the '{@link rpg.Node#isIsActivated <em>Is Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Activated</em>' attribute.
	 * @see #isIsActivated()
	 * @generated
	 */
	void setIsActivated(boolean value);

	/**
	 * Returns the value of the '<em><b>Abilities</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.Ability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abilities</em>' containment reference list.
	 * @see rpg.RpgPackage#getNode_Abilities()
	 * @model type="rpg.Ability" containment="true"
	 * @generated
	 */
	EList getAbilities();

	/**
	 * Returns the value of the '<em><b>Talents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Talents</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Talents</em>' containment reference.
	 * @see #setTalents(Talent)
	 * @see rpg.RpgPackage#getNode_Talents()
	 * @model containment="true"
	 * @generated
	 */
	Talent getTalents();

	/**
	 * Sets the value of the '{@link rpg.Node#getTalents <em>Talents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Talents</em>' containment reference.
	 * @see #getTalents()
	 * @generated
	 */
	void setTalents(Talent value);

} // Node
