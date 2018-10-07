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

import rpg.Node;
import rpg.NodeActivation;
import rpg.PropagationRequirement;
import rpg.RpgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagation Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.PropagationRequirementImpl#getRequiredLevel <em>Required Level</em>}</li>
 *   <li>{@link rpg.impl.PropagationRequirementImpl#getFollowsActivationOf <em>Follows Activation Of</em>}</li>
 *   <li>{@link rpg.impl.PropagationRequirementImpl#getNodeActivation <em>Node Activation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropagationRequirementImpl extends MinimalEObjectImpl.Container implements PropagationRequirement {
	/**
	 * The default value of the '{@link #getRequiredLevel() <em>Required Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUIRED_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequiredLevel() <em>Required Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredLevel()
	 * @generated
	 * @ordered
	 */
	protected int requiredLevel = REQUIRED_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFollowsActivationOf() <em>Follows Activation Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowsActivationOf()
	 * @generated
	 * @ordered
	 */
	protected Node followsActivationOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagationRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.PROPAGATION_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRequiredLevel() {
		return requiredLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredLevel(int newRequiredLevel) {
		int oldRequiredLevel = requiredLevel;
		requiredLevel = newRequiredLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.PROPAGATION_REQUIREMENT__REQUIRED_LEVEL, oldRequiredLevel, requiredLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFollowsActivationOf() {
		if (followsActivationOf != null && followsActivationOf.eIsProxy()) {
			InternalEObject oldFollowsActivationOf = (InternalEObject)followsActivationOf;
			followsActivationOf = (Node)eResolveProxy(oldFollowsActivationOf);
			if (followsActivationOf != oldFollowsActivationOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RpgPackage.PROPAGATION_REQUIREMENT__FOLLOWS_ACTIVATION_OF, oldFollowsActivationOf, followsActivationOf));
			}
		}
		return followsActivationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetFollowsActivationOf() {
		return followsActivationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFollowsActivationOf(Node newFollowsActivationOf) {
		Node oldFollowsActivationOf = followsActivationOf;
		followsActivationOf = newFollowsActivationOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.PROPAGATION_REQUIREMENT__FOLLOWS_ACTIVATION_OF, oldFollowsActivationOf, followsActivationOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeActivation getNodeActivation() {
		if (eContainerFeatureID() != RpgPackage.PROPAGATION_REQUIREMENT__NODE_ACTIVATION) return null;
		return (NodeActivation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeActivation(NodeActivation newNodeActivation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNodeActivation, RpgPackage.PROPAGATION_REQUIREMENT__NODE_ACTIVATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeActivation(NodeActivation newNodeActivation) {
		if (newNodeActivation != eInternalContainer() || (eContainerFeatureID() != RpgPackage.PROPAGATION_REQUIREMENT__NODE_ACTIVATION && newNodeActivation != null)) {
			if (EcoreUtil.isAncestor(this, newNodeActivation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNodeActivation != null)
				msgs = ((InternalEObject)newNodeActivation).eInverseAdd(this, RpgPackage.NODE_ACTIVATION__REQUIREMENTS, NodeActivation.class, msgs);
			msgs = basicSetNodeActivation(newNodeActivation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.PROPAGATION_REQUIREMENT__NODE_ACTIVATION, newNodeActivation, newNodeActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RpgPackage.PROPAGATION_REQUIREMENT__NODE_ACTIVATION:
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
			case RpgPackage.PROPAGATION_REQUIREMENT__NODE_ACTIVATION:
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
			case RpgPackage.PROPAGATION_REQUIREMENT__NODE_ACTIVATION:
				return eInternalContainer().eInverseRemove(this, RpgPackage.NODE_ACTIVATION__REQUIREMENTS, NodeActivation.class, msgs);
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
			case RpgPackage.PROPAGATION_REQUIREMENT__REQUIRED_LEVEL:
				return new Integer(getRequiredLevel());
			case RpgPackage.PROPAGATION_REQUIREMENT__FOLLOWS_ACTIVATION_OF:
				if (resolve) return getFollowsActivationOf();
				return basicGetFollowsActivationOf();
			case RpgPackage.PROPAGATION_REQUIREMENT__NODE_ACTIVATION:
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
			case RpgPackage.PROPAGATION_REQUIREMENT__REQUIRED_LEVEL:
				setRequiredLevel(((Integer)newValue).intValue());
				return;
			case RpgPackage.PROPAGATION_REQUIREMENT__FOLLOWS_ACTIVATION_OF:
				setFollowsActivationOf((Node)newValue);
				return;
			case RpgPackage.PROPAGATION_REQUIREMENT__NODE_ACTIVATION:
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
			case RpgPackage.PROPAGATION_REQUIREMENT__REQUIRED_LEVEL:
				setRequiredLevel(REQUIRED_LEVEL_EDEFAULT);
				return;
			case RpgPackage.PROPAGATION_REQUIREMENT__FOLLOWS_ACTIVATION_OF:
				setFollowsActivationOf((Node)null);
				return;
			case RpgPackage.PROPAGATION_REQUIREMENT__NODE_ACTIVATION:
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
			case RpgPackage.PROPAGATION_REQUIREMENT__REQUIRED_LEVEL:
				return requiredLevel != REQUIRED_LEVEL_EDEFAULT;
			case RpgPackage.PROPAGATION_REQUIREMENT__FOLLOWS_ACTIVATION_OF:
				return followsActivationOf != null;
			case RpgPackage.PROPAGATION_REQUIREMENT__NODE_ACTIVATION:
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
		result.append(" (requiredLevel: ");
		result.append(requiredLevel);
		result.append(')');
		return result.toString();
	}

} //PropagationRequirementImpl
