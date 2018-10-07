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

import rpg.Change;
import rpg.ChangeType;
import rpg.ChangeValueType;
import rpg.Effect;
import rpg.RpgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.ChangeImpl#getBaseValue <em>Base Value</em>}</li>
 *   <li>{@link rpg.impl.ChangeImpl#getChangeValueType <em>Change Value Type</em>}</li>
 *   <li>{@link rpg.impl.ChangeImpl#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link rpg.impl.ChangeImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link rpg.impl.ChangeImpl#isIsLocked <em>Is Locked</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ChangeImpl extends MinimalEObjectImpl.Container implements Change {
	/**
	 * The default value of the '{@link #getBaseValue() <em>Base Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseValue()
	 * @generated
	 * @ordered
	 */
	protected static final double BASE_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBaseValue() <em>Base Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseValue()
	 * @generated
	 * @ordered
	 */
	protected double baseValue = BASE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeValueType() <em>Change Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeValueType()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeValueType CHANGE_VALUE_TYPE_EDEFAULT = ChangeValueType.VALUE_LITERAL;

	/**
	 * The cached value of the '{@link #getChangeValueType() <em>Change Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeValueType()
	 * @generated
	 * @ordered
	 */
	protected ChangeValueType changeValueType = CHANGE_VALUE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeType() <em>Change Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeType()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeType CHANGE_TYPE_EDEFAULT = ChangeType.ADD_LITERAL;

	/**
	 * The cached value of the '{@link #getChangeType() <em>Change Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeType()
	 * @generated
	 * @ordered
	 */
	protected ChangeType changeType = CHANGE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsLocked() <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLocked() <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocked()
	 * @generated
	 * @ordered
	 */
	protected boolean isLocked = IS_LOCKED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBaseValue() {
		return baseValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseValue(double newBaseValue) {
		double oldBaseValue = baseValue;
		baseValue = newBaseValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.CHANGE__BASE_VALUE, oldBaseValue, baseValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeValueType getChangeValueType() {
		return changeValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeValueType(ChangeValueType newChangeValueType) {
		ChangeValueType oldChangeValueType = changeValueType;
		changeValueType = newChangeValueType == null ? CHANGE_VALUE_TYPE_EDEFAULT : newChangeValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.CHANGE__CHANGE_VALUE_TYPE, oldChangeValueType, changeValueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeType getChangeType() {
		return changeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeType(ChangeType newChangeType) {
		ChangeType oldChangeType = changeType;
		changeType = newChangeType == null ? CHANGE_TYPE_EDEFAULT : newChangeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.CHANGE__CHANGE_TYPE, oldChangeType, changeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Effect getEffect() {
		if (eContainerFeatureID() != RpgPackage.CHANGE__EFFECT) return null;
		return (Effect)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffect(Effect newEffect, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEffect, RpgPackage.CHANGE__EFFECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(Effect newEffect) {
		if (newEffect != eInternalContainer() || (eContainerFeatureID() != RpgPackage.CHANGE__EFFECT && newEffect != null)) {
			if (EcoreUtil.isAncestor(this, newEffect))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEffect != null)
				msgs = ((InternalEObject)newEffect).eInverseAdd(this, RpgPackage.EFFECT__CHANGES, Effect.class, msgs);
			msgs = basicSetEffect(newEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.CHANGE__EFFECT, newEffect, newEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLocked() {
		return isLocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLocked(boolean newIsLocked) {
		boolean oldIsLocked = isLocked;
		isLocked = newIsLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.CHANGE__IS_LOCKED, oldIsLocked, isLocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RpgPackage.CHANGE__EFFECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEffect((Effect)otherEnd, msgs);
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
			case RpgPackage.CHANGE__EFFECT:
				return basicSetEffect(null, msgs);
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
			case RpgPackage.CHANGE__EFFECT:
				return eInternalContainer().eInverseRemove(this, RpgPackage.EFFECT__CHANGES, Effect.class, msgs);
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
			case RpgPackage.CHANGE__BASE_VALUE:
				return new Double(getBaseValue());
			case RpgPackage.CHANGE__CHANGE_VALUE_TYPE:
				return getChangeValueType();
			case RpgPackage.CHANGE__CHANGE_TYPE:
				return getChangeType();
			case RpgPackage.CHANGE__EFFECT:
				return getEffect();
			case RpgPackage.CHANGE__IS_LOCKED:
				return isIsLocked() ? Boolean.TRUE : Boolean.FALSE;
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
			case RpgPackage.CHANGE__BASE_VALUE:
				setBaseValue(((Double)newValue).doubleValue());
				return;
			case RpgPackage.CHANGE__CHANGE_VALUE_TYPE:
				setChangeValueType((ChangeValueType)newValue);
				return;
			case RpgPackage.CHANGE__CHANGE_TYPE:
				setChangeType((ChangeType)newValue);
				return;
			case RpgPackage.CHANGE__EFFECT:
				setEffect((Effect)newValue);
				return;
			case RpgPackage.CHANGE__IS_LOCKED:
				setIsLocked(((Boolean)newValue).booleanValue());
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
			case RpgPackage.CHANGE__BASE_VALUE:
				setBaseValue(BASE_VALUE_EDEFAULT);
				return;
			case RpgPackage.CHANGE__CHANGE_VALUE_TYPE:
				setChangeValueType(CHANGE_VALUE_TYPE_EDEFAULT);
				return;
			case RpgPackage.CHANGE__CHANGE_TYPE:
				setChangeType(CHANGE_TYPE_EDEFAULT);
				return;
			case RpgPackage.CHANGE__EFFECT:
				setEffect((Effect)null);
				return;
			case RpgPackage.CHANGE__IS_LOCKED:
				setIsLocked(IS_LOCKED_EDEFAULT);
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
			case RpgPackage.CHANGE__BASE_VALUE:
				return baseValue != BASE_VALUE_EDEFAULT;
			case RpgPackage.CHANGE__CHANGE_VALUE_TYPE:
				return changeValueType != CHANGE_VALUE_TYPE_EDEFAULT;
			case RpgPackage.CHANGE__CHANGE_TYPE:
				return changeType != CHANGE_TYPE_EDEFAULT;
			case RpgPackage.CHANGE__EFFECT:
				return getEffect() != null;
			case RpgPackage.CHANGE__IS_LOCKED:
				return isLocked != IS_LOCKED_EDEFAULT;
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
		result.append(" (baseValue: ");
		result.append(baseValue);
		result.append(", changeValueType: ");
		result.append(changeValueType);
		result.append(", changeType: ");
		result.append(changeType);
		result.append(", isLocked: ");
		result.append(isLocked);
		result.append(')');
		return result.toString();
	}

} //ChangeImpl
