/**
 */
package rpg.impl;

import org.eclipse.emf.ecore.EClass;

import rpg.Node;
import rpg.NodeActivationPropagate;
import rpg.RpgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Activation Propagate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.NodeActivationPropagateImpl#getFollowsActivationOf <em>Follows Activation Of</em>}</li>
 *   <li>{@link rpg.impl.NodeActivationPropagateImpl#getRequiredLevel <em>Required Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeActivationPropagateImpl extends NodeActivationImpl implements NodeActivationPropagate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeActivationPropagateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.NODE_ACTIVATION_PROPAGATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFollowsActivationOf() {
		return (Node)eGet(RpgPackage.Literals.NODE_ACTIVATION_PROPAGATE__FOLLOWS_ACTIVATION_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFollowsActivationOf(Node newFollowsActivationOf) {
		eSet(RpgPackage.Literals.NODE_ACTIVATION_PROPAGATE__FOLLOWS_ACTIVATION_OF, newFollowsActivationOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRequiredLevel() {
		return ((Integer)eGet(RpgPackage.Literals.NODE_ACTIVATION_PROPAGATE__REQUIRED_LEVEL, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredLevel(int newRequiredLevel) {
		eSet(RpgPackage.Literals.NODE_ACTIVATION_PROPAGATE__REQUIRED_LEVEL, new Integer(newRequiredLevel));
	}

} //NodeActivationPropagateImpl
