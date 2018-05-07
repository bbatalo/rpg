/**
 */
package rpg.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rpg.Ability;
import rpg.AbilityCost;
import rpg.AbilityType;
import rpg.ActivationCost;
import rpg.Branch;
import rpg.BranchType;
import rpg.CastType;
import rpg.ChangeType;
import rpg.CharacterClass;
import rpg.CharacterStatistic;
import rpg.Effect;
import rpg.EffectType;
import rpg.Modifier;
import rpg.Node;
import rpg.NodeActivation;
import rpg.NodeActivationBuy;
import rpg.NodeActivationPropagate;
import rpg.NodeType;
import rpg.RangeUnit;
import rpg.RpgFactory;
import rpg.RpgPackage;
import rpg.StatChange;
import rpg.StatType;
import rpg.Talent;
import rpg.TargetType;
import rpg.TickType;

import rpg.util.RpgValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RpgPackageImpl extends EPackageImpl implements RpgPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterStatisticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeActivationBuyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeActivationPropagateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationCostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass talentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abilityCostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum branchTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum castTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum abilityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum targetTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum effectTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum changeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tickTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see rpg.RpgPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RpgPackageImpl() {
		super(eNS_URI, RpgFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RpgPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RpgPackage init() {
		if (isInited) return (RpgPackage)EPackage.Registry.INSTANCE.getEPackage(RpgPackage.eNS_URI);

		// Obtain or create and register package
		RpgPackageImpl theRpgPackage = (RpgPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RpgPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RpgPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRpgPackage.createPackageContents();

		// Initialize created meta-data
		theRpgPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRpgPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RpgValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRpgPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RpgPackage.eNS_URI, theRpgPackage);
		return theRpgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPG() {
		return rpgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRPG_Name() {
		return (EAttribute)rpgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRPG_Lore() {
		return (EAttribute)rpgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPG_AllClasses() {
		return (EReference)rpgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPG_RangeUnits() {
		return (EReference)rpgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterClass() {
		return characterClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterClass_Name() {
		return (EAttribute)characterClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterClass_Lore() {
		return (EAttribute)characterClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacterClass_Statistics() {
		return (EReference)characterClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterClass_Description() {
		return (EAttribute)characterClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacterClass_ChildClasses() {
		return (EReference)characterClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacterClass_ParentClasses() {
		return (EReference)characterClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacterClass_Branches() {
		return (EReference)characterClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterStatistic() {
		return characterStatisticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterStatistic_Name() {
		return (EAttribute)characterStatisticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterStatistic_Lore() {
		return (EAttribute)characterStatisticEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterStatistic_Description() {
		return (EAttribute)characterStatisticEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterStatistic_Tooltip() {
		return (EAttribute)characterStatisticEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterStatistic_MinValue() {
		return (EAttribute)characterStatisticEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterStatistic_MaxValue() {
		return (EAttribute)characterStatisticEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterStatistic_StartLimitValue() {
		return (EAttribute)characterStatisticEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterStatistic_StatType() {
		return (EAttribute)characterStatisticEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterStatistic_IsTargetable() {
		return (EAttribute)characterStatisticEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranch() {
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranch_Name() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranch_Lore() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranch_Description() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranch_BranchType() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_StartNodes() {
		return (EReference)branchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranch_Tooltip() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranch_IsInheritable() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_Nodes() {
		return (EReference)branchEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Lore() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Tooltip() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Description() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_NodeType() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_ChildNodes() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_ParentNodes() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Activation() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_MinActivationLevel() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_MaxActivationLevel() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_ActivationLevel() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_IsActivated() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Abilities() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Talents() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeActivation() {
		return nodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeActivation_Text() {
		return (EAttribute)nodeActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeActivation_IsAuto() {
		return (EAttribute)nodeActivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeActivation_Level() {
		return (EAttribute)nodeActivationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeActivationBuy() {
		return nodeActivationBuyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeActivationBuy_Costs() {
		return (EReference)nodeActivationBuyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeActivationPropagate() {
		return nodeActivationPropagateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeActivationPropagate_FollowsActivationOf() {
		return (EReference)nodeActivationPropagateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeActivationPropagate_RequiredLevel() {
		return (EAttribute)nodeActivationPropagateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationCost() {
		return activationCostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivationCost_Consume() {
		return (EAttribute)activationCostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivationCost_Cost() {
		return (EAttribute)activationCostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationCost_Statistic() {
		return (EReference)activationCostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeUnit() {
		return rangeUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeUnit_Name() {
		return (EAttribute)rangeUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeUnit_Description() {
		return (EAttribute)rangeUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbility() {
		return abilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_Name() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_Lore() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_Tooltip() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_CastType() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_AbilityType() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_CastTime() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_Range() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbility_RangeUnit() {
		return (EReference)abilityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_OnLevel() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbility_Effects() {
		return (EReference)abilityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbility_Costs() {
		return (EReference)abilityEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffect() {
		return effectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Name() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Tooltip() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_EffectType() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_TargetType() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_OnLevel() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffect_Instantiate() {
		return (EReference)effectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffect_StatChange() {
		return (EReference)effectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatChange() {
		return statChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatChange_ChangeType() {
		return (EAttribute)statChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatChange_TickType() {
		return (EAttribute)statChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatChange_BaseValue() {
		return (EAttribute)statChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatChange_TickValue() {
		return (EAttribute)statChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatChange_ChangesStatistic() {
		return (EReference)statChangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatChange_Modifiers() {
		return (EReference)statChangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifier() {
		return modifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_ChangeType() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_Value() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_BasedOnModifier() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_PriorityOrder() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifier_BasedOn() {
		return (EReference)modifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_BasedOnValue() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTalent() {
		return talentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTalent_Name() {
		return (EAttribute)talentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTalent_Tooltip() {
		return (EAttribute)talentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTalent_Lore() {
		return (EAttribute)talentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTalent_Description() {
		return (EAttribute)talentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbilityCost() {
		return abilityCostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbilityCost_Consume() {
		return (EAttribute)abilityCostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbilityCost_Cost() {
		return (EAttribute)abilityCostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbilityCost_Statistic() {
		return (EReference)abilityCostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatType() {
		return statTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBranchType() {
		return branchTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNodeType() {
		return nodeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCastType() {
		return castTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAbilityType() {
		return abilityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTargetType() {
		return targetTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEffectType() {
		return effectTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChangeType() {
		return changeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTickType() {
		return tickTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RpgFactory getRpgFactory() {
		return (RpgFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rpgEClass = createEClass(RPG);
		createEAttribute(rpgEClass, RPG__NAME);
		createEAttribute(rpgEClass, RPG__LORE);
		createEReference(rpgEClass, RPG__ALL_CLASSES);
		createEReference(rpgEClass, RPG__RANGE_UNITS);

		characterClassEClass = createEClass(CHARACTER_CLASS);
		createEAttribute(characterClassEClass, CHARACTER_CLASS__NAME);
		createEAttribute(characterClassEClass, CHARACTER_CLASS__LORE);
		createEReference(characterClassEClass, CHARACTER_CLASS__STATISTICS);
		createEAttribute(characterClassEClass, CHARACTER_CLASS__DESCRIPTION);
		createEReference(characterClassEClass, CHARACTER_CLASS__CHILD_CLASSES);
		createEReference(characterClassEClass, CHARACTER_CLASS__PARENT_CLASSES);
		createEReference(characterClassEClass, CHARACTER_CLASS__BRANCHES);

		characterStatisticEClass = createEClass(CHARACTER_STATISTIC);
		createEAttribute(characterStatisticEClass, CHARACTER_STATISTIC__NAME);
		createEAttribute(characterStatisticEClass, CHARACTER_STATISTIC__LORE);
		createEAttribute(characterStatisticEClass, CHARACTER_STATISTIC__DESCRIPTION);
		createEAttribute(characterStatisticEClass, CHARACTER_STATISTIC__TOOLTIP);
		createEAttribute(characterStatisticEClass, CHARACTER_STATISTIC__MIN_VALUE);
		createEAttribute(characterStatisticEClass, CHARACTER_STATISTIC__MAX_VALUE);
		createEAttribute(characterStatisticEClass, CHARACTER_STATISTIC__START_LIMIT_VALUE);
		createEAttribute(characterStatisticEClass, CHARACTER_STATISTIC__STAT_TYPE);
		createEAttribute(characterStatisticEClass, CHARACTER_STATISTIC__IS_TARGETABLE);

		branchEClass = createEClass(BRANCH);
		createEAttribute(branchEClass, BRANCH__NAME);
		createEAttribute(branchEClass, BRANCH__LORE);
		createEAttribute(branchEClass, BRANCH__DESCRIPTION);
		createEAttribute(branchEClass, BRANCH__BRANCH_TYPE);
		createEReference(branchEClass, BRANCH__START_NODES);
		createEAttribute(branchEClass, BRANCH__TOOLTIP);
		createEAttribute(branchEClass, BRANCH__IS_INHERITABLE);
		createEReference(branchEClass, BRANCH__NODES);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
		createEAttribute(nodeEClass, NODE__LORE);
		createEAttribute(nodeEClass, NODE__TOOLTIP);
		createEAttribute(nodeEClass, NODE__DESCRIPTION);
		createEAttribute(nodeEClass, NODE__NODE_TYPE);
		createEReference(nodeEClass, NODE__CHILD_NODES);
		createEReference(nodeEClass, NODE__PARENT_NODES);
		createEReference(nodeEClass, NODE__ACTIVATION);
		createEAttribute(nodeEClass, NODE__MIN_ACTIVATION_LEVEL);
		createEAttribute(nodeEClass, NODE__MAX_ACTIVATION_LEVEL);
		createEAttribute(nodeEClass, NODE__ACTIVATION_LEVEL);
		createEAttribute(nodeEClass, NODE__IS_ACTIVATED);
		createEReference(nodeEClass, NODE__ABILITIES);
		createEReference(nodeEClass, NODE__TALENTS);

		nodeActivationEClass = createEClass(NODE_ACTIVATION);
		createEAttribute(nodeActivationEClass, NODE_ACTIVATION__TEXT);
		createEAttribute(nodeActivationEClass, NODE_ACTIVATION__IS_AUTO);
		createEAttribute(nodeActivationEClass, NODE_ACTIVATION__LEVEL);

		nodeActivationBuyEClass = createEClass(NODE_ACTIVATION_BUY);
		createEReference(nodeActivationBuyEClass, NODE_ACTIVATION_BUY__COSTS);

		nodeActivationPropagateEClass = createEClass(NODE_ACTIVATION_PROPAGATE);
		createEReference(nodeActivationPropagateEClass, NODE_ACTIVATION_PROPAGATE__FOLLOWS_ACTIVATION_OF);
		createEAttribute(nodeActivationPropagateEClass, NODE_ACTIVATION_PROPAGATE__REQUIRED_LEVEL);

		activationCostEClass = createEClass(ACTIVATION_COST);
		createEAttribute(activationCostEClass, ACTIVATION_COST__CONSUME);
		createEAttribute(activationCostEClass, ACTIVATION_COST__COST);
		createEReference(activationCostEClass, ACTIVATION_COST__STATISTIC);

		rangeUnitEClass = createEClass(RANGE_UNIT);
		createEAttribute(rangeUnitEClass, RANGE_UNIT__NAME);
		createEAttribute(rangeUnitEClass, RANGE_UNIT__DESCRIPTION);

		abilityEClass = createEClass(ABILITY);
		createEAttribute(abilityEClass, ABILITY__NAME);
		createEAttribute(abilityEClass, ABILITY__LORE);
		createEAttribute(abilityEClass, ABILITY__TOOLTIP);
		createEAttribute(abilityEClass, ABILITY__CAST_TYPE);
		createEAttribute(abilityEClass, ABILITY__ABILITY_TYPE);
		createEAttribute(abilityEClass, ABILITY__CAST_TIME);
		createEAttribute(abilityEClass, ABILITY__RANGE);
		createEReference(abilityEClass, ABILITY__RANGE_UNIT);
		createEAttribute(abilityEClass, ABILITY__ON_LEVEL);
		createEReference(abilityEClass, ABILITY__EFFECTS);
		createEReference(abilityEClass, ABILITY__COSTS);

		effectEClass = createEClass(EFFECT);
		createEAttribute(effectEClass, EFFECT__NAME);
		createEAttribute(effectEClass, EFFECT__TOOLTIP);
		createEAttribute(effectEClass, EFFECT__EFFECT_TYPE);
		createEAttribute(effectEClass, EFFECT__TARGET_TYPE);
		createEAttribute(effectEClass, EFFECT__ON_LEVEL);
		createEReference(effectEClass, EFFECT__INSTANTIATE);
		createEReference(effectEClass, EFFECT__STAT_CHANGE);

		statChangeEClass = createEClass(STAT_CHANGE);
		createEAttribute(statChangeEClass, STAT_CHANGE__CHANGE_TYPE);
		createEAttribute(statChangeEClass, STAT_CHANGE__TICK_TYPE);
		createEAttribute(statChangeEClass, STAT_CHANGE__BASE_VALUE);
		createEAttribute(statChangeEClass, STAT_CHANGE__TICK_VALUE);
		createEReference(statChangeEClass, STAT_CHANGE__CHANGES_STATISTIC);
		createEReference(statChangeEClass, STAT_CHANGE__MODIFIERS);

		modifierEClass = createEClass(MODIFIER);
		createEAttribute(modifierEClass, MODIFIER__CHANGE_TYPE);
		createEAttribute(modifierEClass, MODIFIER__VALUE);
		createEAttribute(modifierEClass, MODIFIER__BASED_ON_MODIFIER);
		createEAttribute(modifierEClass, MODIFIER__PRIORITY_ORDER);
		createEReference(modifierEClass, MODIFIER__BASED_ON);
		createEAttribute(modifierEClass, MODIFIER__BASED_ON_VALUE);

		talentEClass = createEClass(TALENT);
		createEAttribute(talentEClass, TALENT__NAME);
		createEAttribute(talentEClass, TALENT__TOOLTIP);
		createEAttribute(talentEClass, TALENT__LORE);
		createEAttribute(talentEClass, TALENT__DESCRIPTION);

		abilityCostEClass = createEClass(ABILITY_COST);
		createEAttribute(abilityCostEClass, ABILITY_COST__CONSUME);
		createEAttribute(abilityCostEClass, ABILITY_COST__COST);
		createEReference(abilityCostEClass, ABILITY_COST__STATISTIC);

		// Create enums
		statTypeEEnum = createEEnum(STAT_TYPE);
		branchTypeEEnum = createEEnum(BRANCH_TYPE);
		nodeTypeEEnum = createEEnum(NODE_TYPE);
		castTypeEEnum = createEEnum(CAST_TYPE);
		abilityTypeEEnum = createEEnum(ABILITY_TYPE);
		targetTypeEEnum = createEEnum(TARGET_TYPE);
		effectTypeEEnum = createEEnum(EFFECT_TYPE);
		changeTypeEEnum = createEEnum(CHANGE_TYPE);
		tickTypeEEnum = createEEnum(TICK_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		nodeActivationBuyEClass.getESuperTypes().add(this.getNodeActivation());
		nodeActivationPropagateEClass.getESuperTypes().add(this.getNodeActivation());

		// Initialize classes and features; add operations and parameters
		initEClass(rpgEClass, rpg.RPG.class, "RPG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRPG_Name(), ecorePackage.getEString(), "name", null, 1, 1, rpg.RPG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRPG_Lore(), ecorePackage.getEString(), "lore", null, 1, 1, rpg.RPG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPG_AllClasses(), this.getCharacterClass(), null, "allClasses", null, 1, -1, rpg.RPG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPG_RangeUnits(), this.getRangeUnit(), null, "rangeUnits", null, 1, -1, rpg.RPG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characterClassEClass, CharacterClass.class, "CharacterClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterClass_Name(), ecorePackage.getEString(), "name", null, 1, 1, CharacterClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterClass_Lore(), ecorePackage.getEString(), "lore", null, 0, 1, CharacterClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacterClass_Statistics(), this.getCharacterStatistic(), null, "statistics", null, 0, -1, CharacterClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterClass_Description(), ecorePackage.getEString(), "description", null, 1, 1, CharacterClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacterClass_ChildClasses(), this.getCharacterClass(), this.getCharacterClass_ParentClasses(), "childClasses", null, 0, -1, CharacterClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacterClass_ParentClasses(), this.getCharacterClass(), this.getCharacterClass_ChildClasses(), "parentClasses", null, 0, -1, CharacterClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacterClass_Branches(), this.getBranch(), null, "branches", null, 0, -1, CharacterClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characterStatisticEClass, CharacterStatistic.class, "CharacterStatistic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterStatistic_Name(), ecorePackage.getEString(), "name", null, 1, 1, CharacterStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterStatistic_Lore(), ecorePackage.getEString(), "lore", null, 0, 1, CharacterStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterStatistic_Description(), ecorePackage.getEString(), "description", null, 1, 1, CharacterStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterStatistic_Tooltip(), ecorePackage.getEString(), "tooltip", null, 1, 1, CharacterStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterStatistic_MinValue(), ecorePackage.getEDouble(), "minValue", "1", 1, 1, CharacterStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterStatistic_MaxValue(), ecorePackage.getEDouble(), "maxValue", "1", 1, 1, CharacterStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterStatistic_StartLimitValue(), ecorePackage.getEDouble(), "startLimitValue", "1", 1, 1, CharacterStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterStatistic_StatType(), this.getStatType(), "statType", "ASCENDING", 1, 1, CharacterStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterStatistic_IsTargetable(), ecorePackage.getEBoolean(), "isTargetable", "true", 1, 1, CharacterStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBranch_Name(), ecorePackage.getEString(), "name", null, 1, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Lore(), ecorePackage.getEString(), "lore", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Description(), ecorePackage.getEString(), "description", null, 1, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_BranchType(), this.getBranchType(), "branchType", null, 1, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranch_StartNodes(), this.getNode(), null, "startNodes", null, 1, -1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Tooltip(), ecorePackage.getEString(), "tooltip", null, 1, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_IsInheritable(), ecorePackage.getEBoolean(), "isInheritable", "true", 1, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranch_Nodes(), this.getNode(), null, "nodes", null, 1, -1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Lore(), ecorePackage.getEString(), "lore", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Tooltip(), ecorePackage.getEString(), "tooltip", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Description(), ecorePackage.getEString(), "description", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_NodeType(), this.getNodeType(), "nodeType", "STANDARD", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_ChildNodes(), this.getNode(), this.getNode_ParentNodes(), "childNodes", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_ParentNodes(), this.getNode(), this.getNode_ChildNodes(), "parentNodes", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Activation(), this.getNodeActivation(), null, "activation", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_MinActivationLevel(), ecorePackage.getEInt(), "minActivationLevel", "1", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_MaxActivationLevel(), ecorePackage.getEInt(), "maxActivationLevel", "1", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_ActivationLevel(), ecorePackage.getEInt(), "activationLevel", "0", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_IsActivated(), ecorePackage.getEBoolean(), "isActivated", "false", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Abilities(), this.getAbility(), null, "abilities", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Talents(), this.getTalent(), null, "talents", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeActivationEClass, NodeActivation.class, "NodeActivation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeActivation_Text(), ecorePackage.getEString(), "text", null, 1, 1, NodeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeActivation_IsAuto(), ecorePackage.getEBoolean(), "isAuto", null, 1, 1, NodeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeActivation_Level(), ecorePackage.getEInt(), "level", null, 1, 1, NodeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeActivationBuyEClass, NodeActivationBuy.class, "NodeActivationBuy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeActivationBuy_Costs(), this.getActivationCost(), null, "costs", null, 1, -1, NodeActivationBuy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeActivationPropagateEClass, NodeActivationPropagate.class, "NodeActivationPropagate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeActivationPropagate_FollowsActivationOf(), this.getNode(), null, "followsActivationOf", null, 1, 1, NodeActivationPropagate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeActivationPropagate_RequiredLevel(), ecorePackage.getEInt(), "requiredLevel", null, 1, 1, NodeActivationPropagate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activationCostEClass, ActivationCost.class, "ActivationCost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivationCost_Consume(), ecorePackage.getEBoolean(), "consume", "true", 1, 1, ActivationCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivationCost_Cost(), ecorePackage.getEDouble(), "cost", null, 1, 1, ActivationCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivationCost_Statistic(), this.getCharacterStatistic(), null, "statistic", null, 1, 1, ActivationCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeUnitEClass, RangeUnit.class, "RangeUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangeUnit_Name(), ecorePackage.getEString(), "name", null, 1, 1, RangeUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeUnit_Description(), ecorePackage.getEString(), "description", null, 1, 1, RangeUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abilityEClass, Ability.class, "Ability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbility_Name(), ecorePackage.getEString(), "name", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_Lore(), ecorePackage.getEString(), "lore", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_Tooltip(), ecorePackage.getEString(), "tooltip", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_CastType(), this.getCastType(), "castType", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_AbilityType(), this.getAbilityType(), "abilityType", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_CastTime(), ecorePackage.getEDouble(), "castTime", null, 0, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_Range(), ecorePackage.getEDouble(), "range", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbility_RangeUnit(), this.getRangeUnit(), null, "rangeUnit", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_OnLevel(), ecorePackage.getEInt(), "onLevel", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbility_Effects(), this.getEffect(), null, "effects", null, 1, -1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbility_Costs(), this.getAbilityCost(), null, "costs", null, 1, -1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(effectEClass, Effect.class, "Effect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEffect_Name(), ecorePackage.getEString(), "name", null, 1, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Tooltip(), ecorePackage.getEString(), "tooltip", null, 1, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_EffectType(), this.getEffectType(), "effectType", null, 1, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_TargetType(), this.getTargetType(), "targetType", null, 1, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_OnLevel(), ecorePackage.getEInt(), "onLevel", null, 1, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffect_Instantiate(), this.getCharacterClass(), null, "instantiate", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffect_StatChange(), this.getStatChange(), null, "statChange", null, 0, -1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statChangeEClass, StatChange.class, "StatChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatChange_ChangeType(), this.getChangeType(), "changeType", null, 1, 1, StatChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatChange_TickType(), this.getTickType(), "tickType", null, 1, 1, StatChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatChange_BaseValue(), ecorePackage.getEDouble(), "baseValue", null, 1, 1, StatChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatChange_TickValue(), ecorePackage.getEInt(), "tickValue", null, 1, 1, StatChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatChange_ChangesStatistic(), this.getCharacterStatistic(), null, "changesStatistic", null, 1, 1, StatChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatChange_Modifiers(), this.getModifier(), null, "modifiers", null, 0, -1, StatChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifierEClass, Modifier.class, "Modifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModifier_ChangeType(), this.getChangeType(), "changeType", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_BasedOnModifier(), this.getChangeType(), "basedOnModifier", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_PriorityOrder(), ecorePackage.getEInt(), "priorityOrder", null, 1, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifier_BasedOn(), this.getCharacterStatistic(), null, "basedOn", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_BasedOnValue(), ecorePackage.getEDouble(), "basedOnValue", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(talentEClass, Talent.class, "Talent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTalent_Name(), ecorePackage.getEString(), "name", null, 1, 1, Talent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTalent_Tooltip(), ecorePackage.getEString(), "tooltip", null, 1, 1, Talent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTalent_Lore(), ecorePackage.getEString(), "lore", null, 0, 1, Talent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTalent_Description(), ecorePackage.getEString(), "description", null, 1, 1, Talent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abilityCostEClass, AbilityCost.class, "AbilityCost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbilityCost_Consume(), ecorePackage.getEBoolean(), "consume", "true", 1, 1, AbilityCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbilityCost_Cost(), ecorePackage.getEDouble(), "cost", null, 0, 1, AbilityCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbilityCost_Statistic(), this.getCharacterStatistic(), null, "statistic", null, 1, 1, AbilityCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(statTypeEEnum, StatType.class, "StatType");
		addEEnumLiteral(statTypeEEnum, StatType.ASCENDING_LITERAL);
		addEEnumLiteral(statTypeEEnum, StatType.DESCENDING_LITERAL);

		initEEnum(branchTypeEEnum, BranchType.class, "BranchType");
		addEEnumLiteral(branchTypeEEnum, BranchType.TALENT_LITERAL);
		addEEnumLiteral(branchTypeEEnum, BranchType.ABILITY_LITERAL);

		initEEnum(nodeTypeEEnum, NodeType.class, "NodeType");
		addEEnumLiteral(nodeTypeEEnum, NodeType.STANDARD_LITERAL);
		addEEnumLiteral(nodeTypeEEnum, NodeType.ROOT_LITERAL);
		addEEnumLiteral(nodeTypeEEnum, NodeType.STANDALONE_LITERAL);

		initEEnum(castTypeEEnum, CastType.class, "CastType");
		addEEnumLiteral(castTypeEEnum, CastType.NO_CAST_LITERAL);
		addEEnumLiteral(castTypeEEnum, CastType.INSTANT_LITERAL);
		addEEnumLiteral(castTypeEEnum, CastType.CAST_LITERAL);
		addEEnumLiteral(castTypeEEnum, CastType.CHANNELED_LITERAL);

		initEEnum(abilityTypeEEnum, AbilityType.class, "AbilityType");
		addEEnumLiteral(abilityTypeEEnum, AbilityType.SINGLE_LITERAL);
		addEEnumLiteral(abilityTypeEEnum, AbilityType.AOE_LITERAL);

		initEEnum(targetTypeEEnum, TargetType.class, "TargetType");
		addEEnumLiteral(targetTypeEEnum, TargetType.SELF_LITERAL);
		addEEnumLiteral(targetTypeEEnum, TargetType.SINGLE_LITERAL);
		addEEnumLiteral(targetTypeEEnum, TargetType.MULTIPLE_LITERAL);

		initEEnum(effectTypeEEnum, EffectType.class, "EffectType");
		addEEnumLiteral(effectTypeEEnum, EffectType.PASSIVE_LITERAL);
		addEEnumLiteral(effectTypeEEnum, EffectType.ACTIVE_LITERAL);
		addEEnumLiteral(effectTypeEEnum, EffectType.INSTANTIATE_LITERAL);

		initEEnum(changeTypeEEnum, ChangeType.class, "ChangeType");
		addEEnumLiteral(changeTypeEEnum, ChangeType.ADD_LITERAL);
		addEEnumLiteral(changeTypeEEnum, ChangeType.SUBSTRACT_LITERAL);
		addEEnumLiteral(changeTypeEEnum, ChangeType.MULTIPLY_LITERAL);
		addEEnumLiteral(changeTypeEEnum, ChangeType.MOVE_LIMIT_LITERAL);

		initEEnum(tickTypeEEnum, TickType.class, "TickType");
		addEEnumLiteral(tickTypeEEnum, TickType.FLAT_LITERAL);
		addEEnumLiteral(tickTypeEEnum, TickType.PER_TICK_LITERAL);
		addEEnumLiteral(tickTypeEEnum, TickType.DELAYED_LITERAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore#/"
		   });																	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });		
		addAnnotation
		  (characterClassEClass, 
		   source, 
		   new String[] {
			 "constraints", "MeaningfulInheritance"
		   });			
		addAnnotation
		  (characterStatisticEClass, 
		   source, 
		   new String[] {
			 "constraints", "LimitBetweenMinAndMax"
		   });			
		addAnnotation
		  (branchEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidStartNodes ValidBranchTypeImplication"
		   });			
		addAnnotation
		  (nodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "RootNodeChildren RootNodeParents StandardNodeChildren StandardNodeParents StandaloneNodeConnections ActivationIntegrity MinimalNodeActivation MaximalNodeActivation UniqueNodeActivationLevels ProperNodeActivationLevels ProperAbilityLevels ProperEffectLevels"
		   });			
		addAnnotation
		  (nodeActivationPropagateEClass, 
		   source, 
		   new String[] {
			 "constraints", "ProperRequiredLevel"
		   });			
		addAnnotation
		  (activationCostEClass, 
		   source, 
		   new String[] {
			 "constraints", "ProperCost"
		   });			
		addAnnotation
		  (abilityEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidCastTime"
		   });			
		addAnnotation
		  (effectEClass, 
		   source, 
		   new String[] {
			 "constraints", "MeaningfulEffect"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";					
		addAnnotation
		  (characterClassEClass, 
		   source, 
		   new String[] {
			 "MeaningfulInheritance", "\n\t\t\tself.parentClasses->size() > 0 implies statistics->size() > 0 or branches->size() > 0",
			 "MeaningfulInheritance$message", "\'Child classes should have their own statistics or branches.\'"
		   });			
		addAnnotation
		  (characterStatisticEClass, 
		   source, 
		   new String[] {
			 "LimitBetweenMinAndMax", "\n\t\t\tstartLimitValue <= maxValue and startLimitValue >= minValue",
			 "LimitBetweenMinAndMax$message", "\'Value of startLimitValue must be between the values of minValue and maxValue.\'"
		   });			
		addAnnotation
		  (branchEClass, 
		   source, 
		   new String[] {
			 "ValidStartNodes", "\n\t\t\tself.startNodes->forAll(node | node.nodeType = NodeType::ROOT or node.nodeType = NodeType::STANDALONE)",
			 "ValidStartNodes$message", "\'Start nodes must have either ROOT or STANDALONE type\'",
			 "ValidBranchTypeImplication", "\n\t\t\tif self.branchType = BranchType::TALENT then\n\t\t\t\tself.nodes->forAll(node | node.talents->size() >= 0 and node.abilities->size() = 0)\n\t\t\telse \n\t\t\t\tself.nodes->forAll(node | node.talents->size() = 0 and node.abilities->size() >= 0)\n\t\t\tendif",
			 "ValidBranchTypeImplication$message", "\'Branch type dictates what the nodes can contain: abilities or talents.\'"
		   });			
		addAnnotation
		  (nodeEClass, 
		   source, 
		   new String[] {
			 "RootNodeChildren", "self.nodeType = NodeType::ROOT implies self.childNodes->forAll(node | node.nodeType = NodeType::STANDARD)",
			 "RootNodeChildren$message", "\'ROOT nodes can have only STANDARD nodes for children.\'",
			 "RootNodeParents", "self.nodeType = NodeType::ROOT implies self.parentNodes->size() = 0",
			 "RootNodeParents$message", "\'ROOT nodes can not have any parents.\'",
			 "StandardNodeChildren", "self.nodeType = NodeType::STANDARD implies self.childNodes->forAll(node | node.nodeType = NodeType::STANDARD)",
			 "StandardNodeChildren$message", "\'STANDARD nodes can have only STANDARD nodes for children.\'",
			 "StandardNodeParents", "self.nodeType = NodeType::STANDARD implies self.parentNodes->forAll(node | node.nodeType = NodeType::ROOT or node.nodeType = NodeType::STANDARD)",
			 "StandardNodeParents$message", "\'STANDARD nodes can have only ROOT or STANDARD nodes for parents.\'",
			 "StandaloneNodeConnections", "self.nodeType = NodeType::STANDALONE implies self.parentNodes->size() = 0 and self.childNodes->size() = 0",
			 "StandaloneNodeConnections$message", "\'STANDALONE nodes can not have parent or child nodes.\'",
			 "ActivationIntegrity", "self.isActivated = true implies self.activationLevel >= self.minActivationLevel and self.activationLevel <= self.maxActivationLevel",
			 "ActivationIntegrity$message", "\'Activated nodes must have activation level between minimum and maximum activation levels.\'",
			 "MinimalNodeActivation", "self.isActivated = false implies self.activation->size() = (self.maxActivationLevel - self.minActivationLevel + 1) and self.activationLevel < self.minActivationLevel",
			 "MinimalNodeActivation$message", "\'Non-activated nodes must have at least one node activation rule and have activation level below minimum.\'",
			 "MaximalNodeActivation", "self.isActivated = true implies self.activation->size() = (self.maxActivationLevel - self.activationLevel)",
			 "MaximalNodeActivation$message", "\'Activated nodes must have proper number of node activations.\'",
			 "UniqueNodeActivationLevels", "self.activation->forAll(n1: NodeActivation, n2: NodeActivation | n1 <> n2 implies n1.level <> n2.level)",
			 "UniqueNodeActivationLevels$message", "\'All node activations must have unique levels.\'",
			 "ProperNodeActivationLevels", "\n\t\tif self.isActivated = true then\n\t\t\tself.activation->forAll(n: NodeActivation | n.level > self.activationLevel and n.level <= self.maxActivationLevel)\n\t\telse\n\t\t\tself.activation->forAll(n: NodeActivation | n.level >= self.minActivationLevel and n.level <= self.maxActivationLevel)\n\t\tendif",
			 "ProperNodeActivationLevels$message", "\'All node activations must have levels between min and max activation levels.\'",
			 "ProperAbilityLevels", "self.abilities->forAll(a: Ability | a.onLevel >= self.minActivationLevel and a.onLevel <= self.maxActivationLevel)",
			 "ProperAbilityLevels$message", "\'All abilities must reference an appropriate node level.\'",
			 "ProperEffectLevels", "self.abilities->forAll(a: Ability | a.effects->forAll(e: Effect | e.onLevel >= self.minActivationLevel and e.onLevel <= self.maxActivationLevel))",
			 "ProperEffectLevels$message", "\'All ability effects must reference an appropriate node level.\'"
		   });			
		addAnnotation
		  (nodeActivationPropagateEClass, 
		   source, 
		   new String[] {
			 "ProperRequiredLevel", "self.requiredLevel >= self.followsActivationOf.minActivationLevel and self.requiredLevel <= self.followsActivationOf.maxActivationLevel",
			 "ProperRequiredLevel$message", "\'Required level must be between minimum and maximum possible values of the level.\'"
		   });			
		addAnnotation
		  (activationCostEClass, 
		   source, 
		   new String[] {
			 "ProperCost", "self.cost >= self.statistic.minValue and self.cost <= self.statistic.startLimitValue",
			 "ProperCost$message", "\'The cost must be between minimum and maximum values of the statistic.\'"
		   });			
		addAnnotation
		  (abilityEClass, 
		   source, 
		   new String[] {
			 "ValidCastTime", "\n\t\tif self.castType = CastType::NO_CAST or self.castType = CastType::INSTANT then\n\t\t\tself.castTime = 0.0\n\t\telse\n\t\t\tself.castTime > 0.0\n\t\tendif",
			 "ValidCastTime$message", "\'NO_CAST and INSTANT abilities have no cast time, the rest do.\'"
		   });			
		addAnnotation
		  (effectEClass, 
		   source, 
		   new String[] {
			 "MeaningfulEffect", "\n\t\tif self.effectType = EffectType::INSTANTIATE then\n\t\t\tself.instantiate->size() = 1\n\t\telse\n\t\t\tself.statChange->size() > 0\n\t\tendif",
			 "MeaningfulEffect$message", "\'An effect must either instantiate a class or change a stat.\'"
		   });
	}

} //RpgPackageImpl
