/**
 */
package rpg.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import rpg.AbilityCost;
import rpg.CharacterStatistic;
import rpg.RpgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ability Cost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.AbilityCostImpl#isConsume <em>Consume</em>}</li>
 *   <li>{@link rpg.impl.AbilityCostImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link rpg.impl.AbilityCostImpl#getStatistic <em>Statistic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbilityCostImpl extends CDOObjectImpl implements AbilityCost {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbilityCostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.ABILITY_COST;
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
	public boolean isConsume() {
		return ((Boolean)eGet(RpgPackage.Literals.ABILITY_COST__CONSUME, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsume(boolean newConsume) {
		eSet(RpgPackage.Literals.ABILITY_COST__CONSUME, new Boolean(newConsume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost() {
		return ((Double)eGet(RpgPackage.Literals.ABILITY_COST__COST, true)).doubleValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost) {
		eSet(RpgPackage.Literals.ABILITY_COST__COST, new Double(newCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterStatistic getStatistic() {
		return (CharacterStatistic)eGet(RpgPackage.Literals.ABILITY_COST__STATISTIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatistic(CharacterStatistic newStatistic) {
		eSet(RpgPackage.Literals.ABILITY_COST__STATISTIC, newStatistic);
	}

} //AbilityCostImpl
