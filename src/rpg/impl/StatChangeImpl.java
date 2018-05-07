/**
 */
package rpg.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import rpg.ChangeType;
import rpg.CharacterStatistic;
import rpg.RpgPackage;
import rpg.StatChange;
import rpg.TickType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stat Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.StatChangeImpl#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link rpg.impl.StatChangeImpl#getTickType <em>Tick Type</em>}</li>
 *   <li>{@link rpg.impl.StatChangeImpl#getBaseValue <em>Base Value</em>}</li>
 *   <li>{@link rpg.impl.StatChangeImpl#getTickValue <em>Tick Value</em>}</li>
 *   <li>{@link rpg.impl.StatChangeImpl#getChangesStatistic <em>Changes Statistic</em>}</li>
 *   <li>{@link rpg.impl.StatChangeImpl#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatChangeImpl extends CDOObjectImpl implements StatChange {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.STAT_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeType getChangeType() {
		return (ChangeType)eGet(RpgPackage.Literals.STAT_CHANGE__CHANGE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeType(ChangeType newChangeType) {
		eSet(RpgPackage.Literals.STAT_CHANGE__CHANGE_TYPE, newChangeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TickType getTickType() {
		return (TickType)eGet(RpgPackage.Literals.STAT_CHANGE__TICK_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTickType(TickType newTickType) {
		eSet(RpgPackage.Literals.STAT_CHANGE__TICK_TYPE, newTickType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBaseValue() {
		return ((Double)eGet(RpgPackage.Literals.STAT_CHANGE__BASE_VALUE, true)).doubleValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseValue(double newBaseValue) {
		eSet(RpgPackage.Literals.STAT_CHANGE__BASE_VALUE, new Double(newBaseValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTickValue() {
		return ((Integer)eGet(RpgPackage.Literals.STAT_CHANGE__TICK_VALUE, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTickValue(int newTickValue) {
		eSet(RpgPackage.Literals.STAT_CHANGE__TICK_VALUE, new Integer(newTickValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterStatistic getChangesStatistic() {
		return (CharacterStatistic)eGet(RpgPackage.Literals.STAT_CHANGE__CHANGES_STATISTIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangesStatistic(CharacterStatistic newChangesStatistic) {
		eSet(RpgPackage.Literals.STAT_CHANGE__CHANGES_STATISTIC, newChangesStatistic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getModifiers() {
		return (EList)eGet(RpgPackage.Literals.STAT_CHANGE__MODIFIERS, true);
	}

} //StatChangeImpl
