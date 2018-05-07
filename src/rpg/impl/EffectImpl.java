/**
 */
package rpg.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import rpg.CharacterClass;
import rpg.Effect;
import rpg.EffectType;
import rpg.RpgPackage;
import rpg.TargetType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.EffectImpl#getName <em>Name</em>}</li>
 *   <li>{@link rpg.impl.EffectImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link rpg.impl.EffectImpl#getEffectType <em>Effect Type</em>}</li>
 *   <li>{@link rpg.impl.EffectImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link rpg.impl.EffectImpl#getOnLevel <em>On Level</em>}</li>
 *   <li>{@link rpg.impl.EffectImpl#getInstantiate <em>Instantiate</em>}</li>
 *   <li>{@link rpg.impl.EffectImpl#getStatChange <em>Stat Change</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EffectImpl extends CDOObjectImpl implements Effect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.EFFECT;
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
	public String getName() {
		return (String)eGet(RpgPackage.Literals.EFFECT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(RpgPackage.Literals.EFFECT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTooltip() {
		return (String)eGet(RpgPackage.Literals.EFFECT__TOOLTIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTooltip(String newTooltip) {
		eSet(RpgPackage.Literals.EFFECT__TOOLTIP, newTooltip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectType getEffectType() {
		return (EffectType)eGet(RpgPackage.Literals.EFFECT__EFFECT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectType(EffectType newEffectType) {
		eSet(RpgPackage.Literals.EFFECT__EFFECT_TYPE, newEffectType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetType getTargetType() {
		return (TargetType)eGet(RpgPackage.Literals.EFFECT__TARGET_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetType(TargetType newTargetType) {
		eSet(RpgPackage.Literals.EFFECT__TARGET_TYPE, newTargetType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOnLevel() {
		return ((Integer)eGet(RpgPackage.Literals.EFFECT__ON_LEVEL, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnLevel(int newOnLevel) {
		eSet(RpgPackage.Literals.EFFECT__ON_LEVEL, new Integer(newOnLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterClass getInstantiate() {
		return (CharacterClass)eGet(RpgPackage.Literals.EFFECT__INSTANTIATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiate(CharacterClass newInstantiate) {
		eSet(RpgPackage.Literals.EFFECT__INSTANTIATE, newInstantiate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStatChange() {
		return (EList)eGet(RpgPackage.Literals.EFFECT__STAT_CHANGE, true);
	}

} //EffectImpl
