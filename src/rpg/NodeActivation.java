/**
 */
package rpg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.NodeActivation#isIsAuto <em>Is Auto</em>}</li>
 *   <li>{@link rpg.NodeActivation#getLevel <em>Level</em>}</li>
 *   <li>{@link rpg.NodeActivation#getCosts <em>Costs</em>}</li>
 *   <li>{@link rpg.NodeActivation#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link rpg.NodeActivation#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getNodeActivation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProperNodeActivationLevels MeaningfulActivationCondition'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProperNodeActivationLevels='\n\t\t\tif self.node.activationLevel >= self.node.minActivationLevel then\n\t\t\t\tself.level > self.node.activationLevel and self.level <= self.node.maxActivationLevel\n\t\t\telse\n\t\t\t\tself.level >= self.node.minActivationLevel and self.level <= self.node.maxActivationLevel\n\t\t\tendif' ProperNodeActivationLevels$message='\'All node activations must have levels between min and max activation levels.\'' MeaningfulActivationCondition='\n\t\t\tself.costs->size() > 0 or self.requirements->size() > 0' MeaningfulActivationCondition$message='\'Node activation should have at least one cost or propagation requirement.\''"
 * @generated
 */
public interface NodeActivation extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Auto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Auto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Auto</em>' attribute.
	 * @see #setIsAuto(boolean)
	 * @see rpg.RpgPackage#getNodeActivation_IsAuto()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsAuto();

	/**
	 * Sets the value of the '{@link rpg.NodeActivation#isIsAuto <em>Is Auto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Auto</em>' attribute.
	 * @see #isIsAuto()
	 * @generated
	 */
	void setIsAuto(boolean value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see rpg.RpgPackage#getNodeActivation_Level()
	 * @model required="true"
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link rpg.NodeActivation#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Costs</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.ActivationCost}.
	 * It is bidirectional and its opposite is '{@link rpg.ActivationCost#getNodeActivation <em>Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Costs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Costs</em>' containment reference list.
	 * @see rpg.RpgPackage#getNodeActivation_Costs()
	 * @see rpg.ActivationCost#getNodeActivation
	 * @model type="rpg.ActivationCost" opposite="nodeActivation" containment="true"
	 * @generated
	 */
	EList getCosts();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.PropagationRequirement}.
	 * It is bidirectional and its opposite is '{@link rpg.PropagationRequirement#getNodeActivation <em>Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see rpg.RpgPackage#getNodeActivation_Requirements()
	 * @see rpg.PropagationRequirement#getNodeActivation
	 * @model type="rpg.PropagationRequirement" opposite="nodeActivation" containment="true"
	 * @generated
	 */
	EList getRequirements();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rpg.Node#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' container reference.
	 * @see #setNode(Node)
	 * @see rpg.RpgPackage#getNodeActivation_Node()
	 * @see rpg.Node#getActivation
	 * @model opposite="activation" required="true" transient="false"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link rpg.NodeActivation#getNode <em>Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' container reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

} // NodeActivation
