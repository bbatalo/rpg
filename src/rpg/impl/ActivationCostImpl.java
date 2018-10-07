/**
 */
package rpg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import rpg.ActivationCost;
import rpg.CharacterStatistic;
import rpg.NodeActivation;
import rpg.RpgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activation Cost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.ActivationCostImpl#isConsume <em>Consume</em>}</li>
 *   <li>{@link rpg.impl.ActivationCostImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link rpg.impl.ActivationCostImpl#getStatistic <em>Statistic</em>}</li>
 *   <li>{@link rpg.impl.ActivationCostImpl#getNodeActivation <em>Node Activation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivationCostImpl extends MinimalEObjectImpl.Container implements ActivationCost {
	/**
	 * The default value of the '{@link #isConsume() <em>Consume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConsume()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSUME_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isConsume() <em>Consume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConsume()
	 * @generated
	 * @ordered
	 */
	protected boolean consume = CONSUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatistic() <em>Statistic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatistic()
	 * @generated
	 * @ordered
	 */
	protected CharacterStatistic statistic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivationCostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.ACTIVATION_COST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsume() {
		return consume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsume(boolean newConsume) {
		boolean oldConsume = consume;
		consume = newConsume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.ACTIVATION_COST__CONSUME, oldConsume, consume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost) {
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.ACTIVATION_COST__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterStatistic getStatistic() {
		if (statistic != null && statistic.eIsProxy()) {
			InternalEObject oldStatistic = (InternalEObject)statistic;
			statistic = (CharacterStatistic)eResolveProxy(oldStatistic);
			if (statistic != oldStatistic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RpgPackage.ACTIVATION_COST__STATISTIC, oldStatistic, statistic));
			}
		}
		return statistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterStatistic basicGetStatistic() {
		return statistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatistic(CharacterStatistic newStatistic) {
		CharacterStatistic oldStatistic = statistic;
		statistic = newStatistic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.ACTIVATION_COST__STATISTIC, oldStatistic, statistic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeActivation getNodeActivation() {
		if (eContainerFeatureID() != RpgPackage.ACTIVATION_COST__NODE_ACTIVATION) return null;
		return (NodeActivation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeActivation(NodeActivation newNodeActivation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNodeActivation, RpgPackage.ACTIVATION_COST__NODE_ACTIVATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeActivation(NodeActivation newNodeActivation) {
		if (newNodeActivation != eInternalContainer() || (eContainerFeatureID() != RpgPackage.ACTIVATION_COST__NODE_ACTIVATION && newNodeActivation != null)) {
			if (EcoreUtil.isAncestor(this, newNodeActivation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNodeActivation != null)
				msgs = ((InternalEObject)newNodeActivation).eInverseAdd(this, RpgPackage.NODE_ACTIVATION__COSTS, NodeActivation.class, msgs);
			msgs = basicSetNodeActivation(newNodeActivation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.ACTIVATION_COST__NODE_ACTIVATION, newNodeActivation, newNodeActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RpgPackage.ACTIVATION_COST__NODE_ACTIVATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNodeActivation((NodeActivation)otherEnd, msgs);
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
			case RpgPackage.ACTIVATION_COST__NODE_ACTIVATION:
				return basicSetNodeActivation(null, msgs);
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
			case RpgPackage.ACTIVATION_COST__NODE_ACTIVATION:
				return eInternalContainer().eInverseRemove(this, RpgPackage.NODE_ACTIVATION__COSTS, NodeActivation.class, msgs);
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
			case RpgPackage.ACTIVATION_COST__CONSUME:
				return isConsume() ? Boolean.TRUE : Boolean.FALSE;
			case RpgPackage.ACTIVATION_COST__COST:
				return new Double(getCost());
			case RpgPackage.ACTIVATION_COST__STATISTIC:
				if (resolve) return getStatistic();
				return basicGetStatistic();
			case RpgPackage.ACTIVATION_COST__NODE_ACTIVATION:
				return getNodeActivation();
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
			case RpgPackage.ACTIVATION_COST__CONSUME:
				setConsume(((Boolean)newValue).booleanValue());
				return;
			case RpgPackage.ACTIVATION_COST__COST:
				setCost(((Double)newValue).doubleValue());
				return;
			case RpgPackage.ACTIVATION_COST__STATISTIC:
				setStatistic((CharacterStatistic)newValue);
				return;
			case RpgPackage.ACTIVATION_COST__NODE_ACTIVATION:
				setNodeActivation((NodeActivation)newValue);
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
			case RpgPackage.ACTIVATION_COST__CONSUME:
				setConsume(CONSUME_EDEFAULT);
				return;
			case RpgPackage.ACTIVATION_COST__COST:
				setCost(COST_EDEFAULT);
				return;
			case RpgPackage.ACTIVATION_COST__STATISTIC:
				setStatistic((CharacterStatistic)null);
				return;
			case RpgPackage.ACTIVATION_COST__NODE_ACTIVATION:
				setNodeActivation((NodeActivation)null);
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
			case RpgPackage.ACTIVATION_COST__CONSUME:
				return consume != CONSUME_EDEFAULT;
			case RpgPackage.ACTIVATION_COST__COST:
				return cost != COST_EDEFAULT;
			case RpgPackage.ACTIVATION_COST__STATISTIC:
				return statistic != null;
			case RpgPackage.ACTIVATION_COST__NODE_ACTIVATION:
				return getNodeActivation() != null;
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
		result.append(" (consume: ");
		result.append(consume);
		result.append(", cost: ");
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //ActivationCostImpl
