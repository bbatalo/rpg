/**
 */
package rpg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propagation Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.PropagationRequirement#getRequiredLevel <em>Required Level</em>}</li>
 *   <li>{@link rpg.PropagationRequirement#getFollowsActivationOf <em>Follows Activation Of</em>}</li>
 *   <li>{@link rpg.PropagationRequirement#getNodeActivation <em>Node Activation</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getPropagationRequirement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProperRequiredLevel SelfReference ProperPropagationReference'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProperRequiredLevel='\n\t\t\tself.requiredLevel >= self.followsActivationOf.minActivationLevel and self.requiredLevel <= self.followsActivationOf.maxActivationLevel' ProperRequiredLevel$message='\'Required level must be between minimum and maximum possible values of the level.\'' SelfReference='\n\t\t\tself.nodeActivation.node <> self.followsActivationOf' SelfReference$message='\'Cannot reference host Node.\'' ProperPropagationReference='\n\t\t\tself.nodeActivation.node.branch.characterClass.branches->collect(nodes)->includes(self.followsActivationOf) or\n\t\t\tself.nodeActivation.node.branch.characterClass->closure(parentClasses)->exists(charClass | charClass.branches->collect(nodes)->includes(self.followsActivationOf))' ProperPropagationReference$message='\'Referenced Node must be within host class or parent classes, recursively.\''"
 * @generated
 */
public interface PropagationRequirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Level</em>' attribute.
	 * @see #setRequiredLevel(int)
	 * @see rpg.RpgPackage#getPropagationRequirement_RequiredLevel()
	 * @model required="true"
	 * @generated
	 */
	int getRequiredLevel();

	/**
	 * Sets the value of the '{@link rpg.PropagationRequirement#getRequiredLevel <em>Required Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Level</em>' attribute.
	 * @see #getRequiredLevel()
	 * @generated
	 */
	void setRequiredLevel(int value);

	/**
	 * Returns the value of the '<em><b>Follows Activation Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Follows Activation Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Follows Activation Of</em>' reference.
	 * @see #setFollowsActivationOf(Node)
	 * @see rpg.RpgPackage#getPropagationRequirement_FollowsActivationOf()
	 * @model required="true"
	 * @generated
	 */
	Node getFollowsActivationOf();

	/**
	 * Sets the value of the '{@link rpg.PropagationRequirement#getFollowsActivationOf <em>Follows Activation Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Follows Activation Of</em>' reference.
	 * @see #getFollowsActivationOf()
	 * @generated
	 */
	void setFollowsActivationOf(Node value);

	/**
	 * Returns the value of the '<em><b>Node Activation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rpg.NodeActivation#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Activation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Activation</em>' container reference.
	 * @see #setNodeActivation(NodeActivation)
	 * @see rpg.RpgPackage#getPropagationRequirement_NodeActivation()
	 * @see rpg.NodeActivation#getRequirements
	 * @model opposite="requirements" required="true" transient="false"
	 * @generated
	 */
	NodeActivation getNodeActivation();

	/**
	 * Sets the value of the '{@link rpg.PropagationRequirement#getNodeActivation <em>Node Activation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Activation</em>' container reference.
	 * @see #getNodeActivation()
	 * @generated
	 */
	void setNodeActivation(NodeActivation value);

} // PropagationRequirement
