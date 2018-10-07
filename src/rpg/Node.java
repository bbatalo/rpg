/**
 */
package rpg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link rpg.Node#getAbilities <em>Abilities</em>}</li>
 *   <li>{@link rpg.Node#getTalents <em>Talents</em>}</li>
 *   <li>{@link rpg.Node#isIsLocked <em>Is Locked</em>}</li>
 *   <li>{@link rpg.Node#getBranch <em>Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RootNodeChildren StandardNodeChildren StandaloneNodeConnections SelfReference CircularReference ProperReference ActivationCondition ActivationIntegrity MinimalNodeActivation MaximalNodeActivation UniqueNodeActivationLevels ValidBranchTypeImplication'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot RootNodeChildren='\n\t\t\tself.nodeType = NodeType::ROOT implies \n\t\t\t(self.childNodes->forAll(node | node.nodeType = NodeType::STANDARD) and self.parentNodes->size() = 0)' RootNodeChildren$message='\'ROOT nodes can have only STANDARD nodes for children and can not have any parents.\'' StandardNodeChildren='\n\t\t\tself.nodeType = NodeType::STANDARD implies \n\t\t\t(self.childNodes->forAll(node | node.nodeType = NodeType::STANDARD) and\n\t\t\tself.parentNodes->forAll(node | node.nodeType = NodeType::ROOT or node.nodeType = NodeType::STANDARD))' StandardNodeChildren$message='\'STANDARD nodes can have only STANDARD nodes for children and ROOT or STANDARD nodes for parents\'' StandaloneNodeConnections='\n\t\t\tself.nodeType = NodeType::STANDALONE implies self.parentNodes->size() = 0 and self.childNodes->size() = 0' StandaloneNodeConnections$message='\'STANDALONE nodes cannot have parent or child nodes.\'' SelfReference='\n\t\t\tself.childNodes->forAll(node | node <> self) and self.parentNodes->forAll(node | node <> self)' SelfReference$message='\'Nodes cannot reference themselves as either parent or child. \'' CircularReference='\n\t\t\tself->closure(childNodes)->excludes(self) and self->closure(parentNodes)->excludes(self)' CircularReference$message='\'Nodes cannot form circular references to themselves through parent and child relationships.\'' ProperReference='\n\t\t\tself.childNodes->forAll(node | self.branch.nodes->includes(node)) and self.parentNodes->forAll(node | self.branch.nodes->includes(node))' ProperReference$message='\'Nodes can only reference nodes within the same Branch.\'' ActivationCondition='\n\t\t\tself.nodeType = NodeType::STANDARD implies \n\t\t\t(self.activationLevel >= self.minActivationLevel implies self.parentNodes->exists(parentNode | parentNode.activationLevel >= parentNode.minActivationLevel))' ActivationCondition$message='\'Before a node can be activated, at least one parent must be activated.\'' ActivationIntegrity='\n\t\t\tself.activationLevel <= self.maxActivationLevel' ActivationIntegrity$message='\'Activation level must be cannot exceed maximum activation levels.\'' MinimalNodeActivation='\n\t\t\tself.activationLevel < self.minActivationLevel implies \n\t\t\tself.activation->size() = (self.maxActivationLevel - self.minActivationLevel + 1) and self.activationLevel < self.minActivationLevel' MinimalNodeActivation$message='\'Non-activated nodes must have at least one node activation rule and have activation level below minimum.\'' MaximalNodeActivation='\n\t\t\tself.activationLevel >= self.minActivationLevel implies self.activation->size() = (self.maxActivationLevel - self.activationLevel)' MaximalNodeActivation$message='\'Activated nodes must have proper number of node activations.\'' UniqueNodeActivationLevels='\n\t\t\tself.activation->forAll(n1: NodeActivation, n2: NodeActivation | n1 <> n2 implies n1.level <> n2.level)' UniqueNodeActivationLevels$message='\'All node activations must have unique levels.\'' ValidBranchTypeImplication='\n\t\t\tif self.branch.branchType = BranchType::TALENT then\n\t\t\t\tself.talents->size() > 0 and self.abilities->size() = 0\n\t\t\telse \n\t\t\t\tself.talents->size() = 0 and self.abilities->size() > 0\n\t\t\tendif' ValidBranchTypeImplication$message='\'Branch type dictates what the nodes can contain: abilities or talents.\''"
 * @generated
 */
public interface Node extends EObject {
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
	 * Returns the value of the '<em><b>Parent Nodes</b></em>' reference list.
	 * The list contents are of type {@link rpg.Node}.
	 * It is bidirectional and its opposite is '{@link rpg.Node#getChildNodes <em>Child Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Nodes</em>' reference list.
	 * @see rpg.RpgPackage#getNode_ParentNodes()
	 * @see rpg.Node#getChildNodes
	 * @model type="rpg.Node" opposite="childNodes"
	 * @generated
	 */
	EList getParentNodes();

	/**
	 * Returns the value of the '<em><b>Activation</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.NodeActivation}.
	 * It is bidirectional and its opposite is '{@link rpg.NodeActivation#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation</em>' containment reference list.
	 * @see rpg.RpgPackage#getNode_Activation()
	 * @see rpg.NodeActivation#getNode
	 * @model type="rpg.NodeActivation" opposite="node" containment="true"
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
	 * Returns the value of the '<em><b>Abilities</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.Ability}.
	 * It is bidirectional and its opposite is '{@link rpg.Ability#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abilities</em>' containment reference list.
	 * @see rpg.RpgPackage#getNode_Abilities()
	 * @see rpg.Ability#getNode
	 * @model type="rpg.Ability" opposite="node" containment="true"
	 * @generated
	 */
	EList getAbilities();

	/**
	 * Returns the value of the '<em><b>Talents</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.Talent}.
	 * It is bidirectional and its opposite is '{@link rpg.Talent#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Talents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Talents</em>' containment reference list.
	 * @see rpg.RpgPackage#getNode_Talents()
	 * @see rpg.Talent#getNode
	 * @model type="rpg.Talent" opposite="node" containment="true"
	 * @generated
	 */
	EList getTalents();

	/**
	 * Returns the value of the '<em><b>Is Locked</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Locked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Locked</em>' attribute.
	 * @see #setIsLocked(boolean)
	 * @see rpg.RpgPackage#getNode_IsLocked()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsLocked();

	/**
	 * Sets the value of the '{@link rpg.Node#isIsLocked <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Locked</em>' attribute.
	 * @see #isIsLocked()
	 * @generated
	 */
	void setIsLocked(boolean value);

	/**
	 * Returns the value of the '<em><b>Branch</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rpg.Branch#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' container reference.
	 * @see #setBranch(Branch)
	 * @see rpg.RpgPackage#getNode_Branch()
	 * @see rpg.Branch#getNodes
	 * @model opposite="nodes" required="true" transient="false"
	 * @generated
	 */
	Branch getBranch();

	/**
	 * Sets the value of the '{@link rpg.Node#getBranch <em>Branch</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch</em>' container reference.
	 * @see #getBranch()
	 * @generated
	 */
	void setBranch(Branch value);

} // Node
