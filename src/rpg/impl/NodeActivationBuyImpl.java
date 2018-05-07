/**
 */
package rpg.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rpg.NodeActivationBuy;
import rpg.RpgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Activation Buy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.NodeActivationBuyImpl#getCosts <em>Costs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeActivationBuyImpl extends NodeActivationImpl implements NodeActivationBuy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeActivationBuyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.NODE_ACTIVATION_BUY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCosts() {
		return (EList)eGet(RpgPackage.Literals.NODE_ACTIVATION_BUY__COSTS, true);
	}

} //NodeActivationBuyImpl
