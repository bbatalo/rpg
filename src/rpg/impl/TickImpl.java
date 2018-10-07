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

import rpg.RpgPackage;
import rpg.StatChange;
import rpg.Tick;
import rpg.TickType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.TickImpl#getTickType <em>Tick Type</em>}</li>
 *   <li>{@link rpg.impl.TickImpl#getStatChange <em>Stat Change</em>}</li>
 *   <li>{@link rpg.impl.TickImpl#getValue <em>Value</em>}</li>
 *   <li>{@link rpg.impl.TickImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TickImpl extends MinimalEObjectImpl.Container implements Tick {
	/**
	 * The default value of the '{@link #getTickType() <em>Tick Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickType()
	 * @generated
	 * @ordered
	 */
	protected static final TickType TICK_TYPE_EDEFAULT = TickType.PER_TICK_LITERAL;

	/**
	 * The cached value of the '{@link #getTickType() <em>Tick Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickType()
	 * @generated
	 * @ordered
	 */
	protected TickType tickType = TICK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected double duration = DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TickImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.TICK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TickType getTickType() {
		return tickType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTickType(TickType newTickType) {
		TickType oldTickType = tickType;
		tickType = newTickType == null ? TICK_TYPE_EDEFAULT : newTickType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.TICK__TICK_TYPE, oldTickType, tickType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatChange getStatChange() {
		if (eContainerFeatureID() != RpgPackage.TICK__STAT_CHANGE) return null;
		return (StatChange)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatChange(StatChange newStatChange, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStatChange, RpgPackage.TICK__STAT_CHANGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatChange(StatChange newStatChange) {
		if (newStatChange != eInternalContainer() || (eContainerFeatureID() != RpgPackage.TICK__STAT_CHANGE && newStatChange != null)) {
			if (EcoreUtil.isAncestor(this, newStatChange))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStatChange != null)
				msgs = ((InternalEObject)newStatChange).eInverseAdd(this, RpgPackage.STAT_CHANGE__TICK, StatChange.class, msgs);
			msgs = basicSetStatChange(newStatChange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.TICK__STAT_CHANGE, newStatChange, newStatChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.TICK__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(double newDuration) {
		double oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RpgPackage.TICK__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RpgPackage.TICK__STAT_CHANGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStatChange((StatChange)otherEnd, msgs);
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
			case RpgPackage.TICK__STAT_CHANGE:
				return basicSetStatChange(null, msgs);
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
			case RpgPackage.TICK__STAT_CHANGE:
				return eInternalContainer().eInverseRemove(this, RpgPackage.STAT_CHANGE__TICK, StatChange.class, msgs);
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
			case RpgPackage.TICK__TICK_TYPE:
				return getTickType();
			case RpgPackage.TICK__STAT_CHANGE:
				return getStatChange();
			case RpgPackage.TICK__VALUE:
				return new Double(getValue());
			case RpgPackage.TICK__DURATION:
				return new Double(getDuration());
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
			case RpgPackage.TICK__TICK_TYPE:
				setTickType((TickType)newValue);
				return;
			case RpgPackage.TICK__STAT_CHANGE:
				setStatChange((StatChange)newValue);
				return;
			case RpgPackage.TICK__VALUE:
				setValue(((Double)newValue).doubleValue());
				return;
			case RpgPackage.TICK__DURATION:
				setDuration(((Double)newValue).doubleValue());
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
			case RpgPackage.TICK__TICK_TYPE:
				setTickType(TICK_TYPE_EDEFAULT);
				return;
			case RpgPackage.TICK__STAT_CHANGE:
				setStatChange((StatChange)null);
				return;
			case RpgPackage.TICK__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case RpgPackage.TICK__DURATION:
				setDuration(DURATION_EDEFAULT);
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
			case RpgPackage.TICK__TICK_TYPE:
				return tickType != TICK_TYPE_EDEFAULT;
			case RpgPackage.TICK__STAT_CHANGE:
				return getStatChange() != null;
			case RpgPackage.TICK__VALUE:
				return value != VALUE_EDEFAULT;
			case RpgPackage.TICK__DURATION:
				return duration != DURATION_EDEFAULT;
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
		result.append(" (tickType: ");
		result.append(tickType);
		result.append(", value: ");
		result.append(value);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //TickImpl
