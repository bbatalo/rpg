/**
 */
package rpg.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import rpg.ChangeType;
import rpg.CharacterStatistic;
import rpg.Modifier;
import rpg.RpgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.ModifierImpl#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link rpg.impl.ModifierImpl#getValue <em>Value</em>}</li>
 *   <li>{@link rpg.impl.ModifierImpl#getBasedOnModifier <em>Based On Modifier</em>}</li>
 *   <li>{@link rpg.impl.ModifierImpl#getPriorityOrder <em>Priority Order</em>}</li>
 *   <li>{@link rpg.impl.ModifierImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link rpg.impl.ModifierImpl#getBasedOnValue <em>Based On Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModifierImpl extends CDOObjectImpl implements Modifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.MODIFIER;
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
		return (ChangeType)eGet(RpgPackage.Literals.MODIFIER__CHANGE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeType(ChangeType newChangeType) {
		eSet(RpgPackage.Literals.MODIFIER__CHANGE_TYPE, newChangeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return ((Double)eGet(RpgPackage.Literals.MODIFIER__VALUE, true)).doubleValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		eSet(RpgPackage.Literals.MODIFIER__VALUE, new Double(newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeType getBasedOnModifier() {
		return (ChangeType)eGet(RpgPackage.Literals.MODIFIER__BASED_ON_MODIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasedOnModifier(ChangeType newBasedOnModifier) {
		eSet(RpgPackage.Literals.MODIFIER__BASED_ON_MODIFIER, newBasedOnModifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriorityOrder() {
		return ((Integer)eGet(RpgPackage.Literals.MODIFIER__PRIORITY_ORDER, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorityOrder(int newPriorityOrder) {
		eSet(RpgPackage.Literals.MODIFIER__PRIORITY_ORDER, new Integer(newPriorityOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterStatistic getBasedOn() {
		return (CharacterStatistic)eGet(RpgPackage.Literals.MODIFIER__BASED_ON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasedOn(CharacterStatistic newBasedOn) {
		eSet(RpgPackage.Literals.MODIFIER__BASED_ON, newBasedOn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBasedOnValue() {
		return ((Double)eGet(RpgPackage.Literals.MODIFIER__BASED_ON_VALUE, true)).doubleValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasedOnValue(double newBasedOnValue) {
		eSet(RpgPackage.Literals.MODIFIER__BASED_ON_VALUE, new Double(newBasedOnValue));
	}

} //ModifierImpl
