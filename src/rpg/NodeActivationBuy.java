/**
 */
package rpg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Activation Buy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.NodeActivationBuy#getCosts <em>Costs</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getNodeActivationBuy()
 * @model
 * @generated
 */
public interface NodeActivationBuy extends NodeActivation {
	/**
	 * Returns the value of the '<em><b>Costs</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.ActivationCost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Costs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Costs</em>' containment reference list.
	 * @see rpg.RpgPackage#getNodeActivationBuy_Costs()
	 * @model type="rpg.ActivationCost" containment="true" required="true"
	 * @generated
	 */
	EList getCosts();

} // NodeActivationBuy
