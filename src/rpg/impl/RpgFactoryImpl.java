/**
 */
package rpg.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rpg.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RpgFactoryImpl extends EFactoryImpl implements RpgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RpgFactory init() {
		try {
			RpgFactory theRpgFactory = (RpgFactory)EPackage.Registry.INSTANCE.getEFactory(RpgPackage.eNS_URI);
			if (theRpgFactory != null) {
				return theRpgFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RpgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RpgFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RpgPackage.RPG: return (EObject)createRPG();
			case RpgPackage.CHARACTER_CLASS: return (EObject)createCharacterClass();
			case RpgPackage.CHARACTER_STATISTIC: return (EObject)createCharacterStatistic();
			case RpgPackage.BRANCH: return (EObject)createBranch();
			case RpgPackage.NODE: return (EObject)createNode();
			case RpgPackage.NODE_ACTIVATION_BUY: return (EObject)createNodeActivationBuy();
			case RpgPackage.NODE_ACTIVATION_PROPAGATE: return (EObject)createNodeActivationPropagate();
			case RpgPackage.ACTIVATION_COST: return (EObject)createActivationCost();
			case RpgPackage.RANGE_UNIT: return (EObject)createRangeUnit();
			case RpgPackage.ABILITY: return (EObject)createAbility();
			case RpgPackage.EFFECT: return (EObject)createEffect();
			case RpgPackage.STAT_CHANGE: return (EObject)createStatChange();
			case RpgPackage.MODIFIER: return (EObject)createModifier();
			case RpgPackage.TALENT: return (EObject)createTalent();
			case RpgPackage.ABILITY_COST: return (EObject)createAbilityCost();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RpgPackage.STAT_TYPE:
				return createStatTypeFromString(eDataType, initialValue);
			case RpgPackage.BRANCH_TYPE:
				return createBranchTypeFromString(eDataType, initialValue);
			case RpgPackage.NODE_TYPE:
				return createNodeTypeFromString(eDataType, initialValue);
			case RpgPackage.CAST_TYPE:
				return createCastTypeFromString(eDataType, initialValue);
			case RpgPackage.ABILITY_TYPE:
				return createAbilityTypeFromString(eDataType, initialValue);
			case RpgPackage.TARGET_TYPE:
				return createTargetTypeFromString(eDataType, initialValue);
			case RpgPackage.EFFECT_TYPE:
				return createEffectTypeFromString(eDataType, initialValue);
			case RpgPackage.CHANGE_TYPE:
				return createChangeTypeFromString(eDataType, initialValue);
			case RpgPackage.TICK_TYPE:
				return createTickTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RpgPackage.STAT_TYPE:
				return convertStatTypeToString(eDataType, instanceValue);
			case RpgPackage.BRANCH_TYPE:
				return convertBranchTypeToString(eDataType, instanceValue);
			case RpgPackage.NODE_TYPE:
				return convertNodeTypeToString(eDataType, instanceValue);
			case RpgPackage.CAST_TYPE:
				return convertCastTypeToString(eDataType, instanceValue);
			case RpgPackage.ABILITY_TYPE:
				return convertAbilityTypeToString(eDataType, instanceValue);
			case RpgPackage.TARGET_TYPE:
				return convertTargetTypeToString(eDataType, instanceValue);
			case RpgPackage.EFFECT_TYPE:
				return convertEffectTypeToString(eDataType, instanceValue);
			case RpgPackage.CHANGE_TYPE:
				return convertChangeTypeToString(eDataType, instanceValue);
			case RpgPackage.TICK_TYPE:
				return convertTickTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPG createRPG() {
		RPGImpl rpg = new RPGImpl();
		return rpg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterClass createCharacterClass() {
		CharacterClassImpl characterClass = new CharacterClassImpl();
		return characterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterStatistic createCharacterStatistic() {
		CharacterStatisticImpl characterStatistic = new CharacterStatisticImpl();
		return characterStatistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch createBranch() {
		BranchImpl branch = new BranchImpl();
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeActivationBuy createNodeActivationBuy() {
		NodeActivationBuyImpl nodeActivationBuy = new NodeActivationBuyImpl();
		return nodeActivationBuy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeActivationPropagate createNodeActivationPropagate() {
		NodeActivationPropagateImpl nodeActivationPropagate = new NodeActivationPropagateImpl();
		return nodeActivationPropagate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationCost createActivationCost() {
		ActivationCostImpl activationCost = new ActivationCostImpl();
		return activationCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeUnit createRangeUnit() {
		RangeUnitImpl rangeUnit = new RangeUnitImpl();
		return rangeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ability createAbility() {
		AbilityImpl ability = new AbilityImpl();
		return ability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Effect createEffect() {
		EffectImpl effect = new EffectImpl();
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatChange createStatChange() {
		StatChangeImpl statChange = new StatChangeImpl();
		return statChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modifier createModifier() {
		ModifierImpl modifier = new ModifierImpl();
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Talent createTalent() {
		TalentImpl talent = new TalentImpl();
		return talent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbilityCost createAbilityCost() {
		AbilityCostImpl abilityCost = new AbilityCostImpl();
		return abilityCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatType createStatTypeFromString(EDataType eDataType, String initialValue) {
		StatType result = StatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchType createBranchTypeFromString(EDataType eDataType, String initialValue) {
		BranchType result = BranchType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBranchTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue) {
		NodeType result = NodeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CastType createCastTypeFromString(EDataType eDataType, String initialValue) {
		CastType result = CastType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCastTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbilityType createAbilityTypeFromString(EDataType eDataType, String initialValue) {
		AbilityType result = AbilityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbilityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetType createTargetTypeFromString(EDataType eDataType, String initialValue) {
		TargetType result = TargetType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectType createEffectTypeFromString(EDataType eDataType, String initialValue) {
		EffectType result = EffectType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEffectTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeType createChangeTypeFromString(EDataType eDataType, String initialValue) {
		ChangeType result = ChangeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TickType createTickTypeFromString(EDataType eDataType, String initialValue) {
		TickType result = TickType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTickTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RpgPackage getRpgPackage() {
		return (RpgPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static RpgPackage getPackage() {
		return RpgPackage.eINSTANCE;
	}

} //RpgFactoryImpl
