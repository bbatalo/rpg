/**
 */
package rpg.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import rpg.ActivationCost;
import rpg.Node;
import rpg.NodeActivation;
import rpg.PropagationRequirement;
import rpg.RpgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.NodeActivationImpl#isIsAuto <em>Is Auto</em>}</li>
 *   <li>{@link rpg.impl.NodeActivationImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link rpg.impl.NodeActivationImpl#getCosts <em>Costs</em>}</li>
 *   <li>{@link rpg.impl.NodeActivationImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link rpg.impl.NodeActivationImpl#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeActivationImpl extends MinimalEObjectImpl.Container implements NodeActivation {
	/**
	 * The default value of the '{@link #isIsAuto() <em>Is Auto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAuto()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUTO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAuto() <em>Is Auto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAuto()
	 * @generated
	 * @ordered
	 */
	protected boolean isAuto = IS_AUTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCosts() <em>Costs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCosts()
	 * @generated
	 * @ordered
	 */
	protected EList costs;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList requirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.NODE_ACTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAuto() {
		return isAuto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAuto(boolean newIsAuto) {
		boolean oldIsAuto = isAuto;
		isAuto = newIsAuto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.NODE_ACTIVATION__IS_AUTO, oldIsAuto, isAuto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.NODE_ACTIVATION__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCosts() {
		if (costs == null) {
			costs = new EObjectContainmentWithInverseEList(ActivationCost.class, this, RpgPackage.NODE_ACTIVATION__COSTS, RpgPackage.ACTIVATION_COST__NODE_ACTIVATION);
		}
		return costs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentWithInverseEList(PropagationRequirement.class, this, RpgPackage.NODE_ACTIVATION__REQUIREMENTS, RpgPackage.PROPAGATION_REQUIREMENT__NODE_ACTIVATION);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNode() {
		if (eContainerFeatureID() != RpgPackage.NODE_ACTIVATION__NODE) return null;
		return (Node)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(Node newNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNode, RpgPackage.NODE_ACTIVATION__NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Node newNode) {
		if (newNode != eInternalContainer() || (eContainerFeatureID() != RpgPackage.NODE_ACTIVATION__NODE && newNode != null)) {
			if (EcoreUtil.isAncestor(this, newNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNode != null)
				msgs = ((InternalEObject)newNode).eInverseAdd(this, RpgPackage.NODE__ACTIVATION, Node.class, msgs);
			msgs = basicSetNode(newNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.NODE_ACTIVATION__NODE, newNode, newNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RpgPackage.NODE_ACTIVATION__COSTS:
				return ((InternalEList)getCosts()).basicAdd(otherEnd, msgs);
			case RpgPackage.NODE_ACTIVATION__REQUIREMENTS:
				return ((InternalEList)getRequirements()).basicAdd(otherEnd, msgs);
			case RpgPackage.NODE_ACTIVATION__NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNode((Node)otherEnd, msgs);
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
			case RpgPackage.NODE_ACTIVATION__COSTS:
				return ((InternalEList)getCosts()).basicRemove(otherEnd, msgs);
			case RpgPackage.NODE_ACTIVATION__REQUIREMENTS:
				return ((InternalEList)getRequirements()).basicRemove(otherEnd, msgs);
			case RpgPackage.NODE_ACTIVATION__NODE:
				return basicSetNode(null, msgs);
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
			case RpgPackage.NODE_ACTIVATION__NODE:
				return eInternalContainer().eInverseRemove(this, RpgPackage.NODE__ACTIVATION, Node.class, msgs);
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
			case RpgPackage.NODE_ACTIVATION__IS_AUTO:
				return isIsAuto() ? Boolean.TRUE : Boolean.FALSE;
			case RpgPackage.NODE_ACTIVATION__LEVEL:
				return new Integer(getLevel());
			case RpgPackage.NODE_ACTIVATION__COSTS:
				return getCosts();
			case RpgPackage.NODE_ACTIVATION__REQUIREMENTS:
				return getRequirements();
			case RpgPackage.NODE_ACTIVATION__NODE:
				return getNode();
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
			case RpgPackage.NODE_ACTIVATION__IS_AUTO:
				setIsAuto(((Boolean)newValue).booleanValue());
				return;
			case RpgPackage.NODE_ACTIVATION__LEVEL:
				setLevel(((Integer)newValue).intValue());
				return;
			case RpgPackage.NODE_ACTIVATION__COSTS:
				getCosts().clear();
				getCosts().addAll((Collection)newValue);
				return;
			case RpgPackage.NODE_ACTIVATION__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection)newValue);
				return;
			case RpgPackage.NODE_ACTIVATION__NODE:
				setNode((Node)newValue);
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
			case RpgPackage.NODE_ACTIVATION__IS_AUTO:
				setIsAuto(IS_AUTO_EDEFAULT);
				return;
			case RpgPackage.NODE_ACTIVATION__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case RpgPackage.NODE_ACTIVATION__COSTS:
				getCosts().clear();
				return;
			case RpgPackage.NODE_ACTIVATION__REQUIREMENTS:
				getRequirements().clear();
				return;
			case RpgPackage.NODE_ACTIVATION__NODE:
				setNode((Node)null);
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
			case RpgPackage.NODE_ACTIVATION__IS_AUTO:
				return isAuto != IS_AUTO_EDEFAULT;
			case RpgPackage.NODE_ACTIVATION__LEVEL:
				return level != LEVEL_EDEFAULT;
			case RpgPackage.NODE_ACTIVATION__COSTS:
				return costs != null && !costs.isEmpty();
			case RpgPackage.NODE_ACTIVATION__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case RpgPackage.NODE_ACTIVATION__NODE:
				return getNode() != null;
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
		result.append(" (isAuto: ");
		result.append(isAuto);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //NodeActivationImpl
