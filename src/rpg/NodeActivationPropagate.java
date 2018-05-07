/**
 */
package rpg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Activation Propagate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.NodeActivationPropagate#getFollowsActivationOf <em>Follows Activation Of</em>}</li>
 *   <li>{@link rpg.NodeActivationPropagate#getRequiredLevel <em>Required Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getNodeActivationPropagate()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProperRequiredLevel'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProperRequiredLevel='self.requiredLevel >= self.followsActivationOf.minActivationLevel and self.requiredLevel <= self.followsActivationOf.maxActivationLevel' ProperRequiredLevel$message='\'Required level must be between minimum and maximum possible values of the level.\''"
 * @generated
 */
public interface NodeActivationPropagate extends NodeActivation {
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
	 * @see rpg.RpgPackage#getNodeActivationPropagate_FollowsActivationOf()
	 * @model required="true"
	 * @generated
	 */
	Node getFollowsActivationOf();

	/**
	 * Sets the value of the '{@link rpg.NodeActivationPropagate#getFollowsActivationOf <em>Follows Activation Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Follows Activation Of</em>' reference.
	 * @see #getFollowsActivationOf()
	 * @generated
	 */
	void setFollowsActivationOf(Node value);

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
	 * @see rpg.RpgPackage#getNodeActivationPropagate_RequiredLevel()
	 * @model required="true"
	 * @generated
	 */
	int getRequiredLevel();

	/**
	 * Sets the value of the '{@link rpg.NodeActivationPropagate#getRequiredLevel <em>Required Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Level</em>' attribute.
	 * @see #getRequiredLevel()
	 * @generated
	 */
	void setRequiredLevel(int value);

} // NodeActivationPropagate
