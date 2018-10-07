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
import rpg.AbilityType;
import rpg.ActivationCost;
import rpg.Branch;
import rpg.BranchType;
import rpg.CastType;
import rpg.Change;
import rpg.ChangeType;
import rpg.ChangeValueType;
import rpg.CharacterClass;
import rpg.CharacterStatistic;
import rpg.CooldownChange;
import rpg.CooldownTalent;
import rpg.Effect;
import rpg.EffectType;
import rpg.Modifier;
import rpg.Node;
import rpg.NodeActivation;
import rpg.NodeType;
import rpg.PropagationRequirement;
import rpg.Randomizer;
import rpg.RangeUnit;
import rpg.RpgFactory;
import rpg.RpgPackage;
import rpg.StatChange;
import rpg.StatTalent;
import rpg.StatType;
import rpg.Talent;
import rpg.TargetType;
import rpg.Tick;
import rpg.TickType;
import rpg.UnlockAbility;
import rpg.UnlockChange;
import rpg.UnlockEffect;
import rpg.UnlockModifier;
import rpg.UnlockTalent;

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
	private EClass propagationRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statTalentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tickEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cooldownChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unlockTalentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unlockAbilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unlockEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unlockChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cooldownTalentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unlockModifierEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum changeValueTypeEEnum = null;

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
	public EAttribute getCharacterClass_IsPlayable() {
		return (EAttribute)characterClassEClass.getEStructuralFeatures().get(7);
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
	public EAttribute getBranch_Tooltip() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranch_IsInheritable() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_Nodes() {
		return (EReference)branchEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_CharacterClass() {
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
	public EReference getNode_Abilities() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Talents() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_IsLocked() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Branch() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(14);
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
	public EAttribute getNodeActivation_IsAuto() {
		return (EAttribute)nodeActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeActivation_Level() {
		return (EAttribute)nodeActivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeActivation_Costs() {
		return (EReference)nodeActivationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeActivation_Requirements() {
		return (EReference)nodeActivationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeActivation_Node() {
		return (EReference)nodeActivationEClass.getEStructuralFeatures().get(4);
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
	public EReference getActivationCost_NodeActivation() {
		return (EReference)activationCostEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getAbility_Cooldown() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_AbilityType() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_CastTime() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_Range() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbility_RangeUnit() {
		return (EReference)abilityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_OnLevel() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbility_Effects() {
		return (EReference)abilityEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbility_Node() {
		return (EReference)abilityEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_IsLocked() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(12);
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
	public EReference getEffect_Ability() {
		return (EReference)effectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffect_Randomizer() {
		return (EReference)effectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffect_Changes() {
		return (EReference)effectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_IsLocked() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(9);
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
	public EReference getStatChange_ChangesStatistic() {
		return (EReference)statChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatChange_Modifiers() {
		return (EReference)statChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatChange_Randomizer() {
		return (EReference)statChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatChange_Tick() {
		return (EReference)statChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatChange_StatTalent() {
		return (EReference)statChangeEClass.getEStructuralFeatures().get(4);
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
	public EReference getModifier_StatChange() {
		return (EReference)modifierEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifier_Randomizer() {
		return (EReference)modifierEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_OnLevel() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_Exclusive() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_TargetStatistic() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(10);
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
	public EReference getTalent_Node() {
		return (EReference)talentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTalent_OnLevel() {
		return (EAttribute)talentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagationRequirement() {
		return propagationRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropagationRequirement_RequiredLevel() {
		return (EAttribute)propagationRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagationRequirement_FollowsActivationOf() {
		return (EReference)propagationRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagationRequirement_NodeActivation() {
		return (EReference)propagationRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRandomizer() {
		return randomizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRandomizer_Value() {
		return (EAttribute)randomizerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRandomizer_BasedOn() {
		return (EReference)randomizerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatTalent() {
		return statTalentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatTalent_StatChanges() {
		return (EReference)statTalentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTick() {
		return tickEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTick_TickType() {
		return (EAttribute)tickEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTick_StatChange() {
		return (EReference)tickEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTick_Value() {
		return (EAttribute)tickEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTick_Duration() {
		return (EAttribute)tickEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCooldownChange() {
		return cooldownChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCooldownChange_Ability() {
		return (EReference)cooldownChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCooldownChange_Talent() {
		return (EReference)cooldownChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCooldownChange_CooldownTalent() {
		return (EReference)cooldownChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChange() {
		return changeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChange_BaseValue() {
		return (EAttribute)changeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChange_ChangeValueType() {
		return (EAttribute)changeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChange_ChangeType() {
		return (EAttribute)changeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChange_Effect() {
		return (EReference)changeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChange_IsLocked() {
		return (EAttribute)changeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnlockTalent() {
		return unlockTalentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnlockAbility() {
		return unlockAbilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnlockAbility_Ability() {
		return (EReference)unlockAbilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnlockEffect() {
		return unlockEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnlockEffect_Effect() {
		return (EReference)unlockEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnlockChange() {
		return unlockChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnlockChange_Change() {
		return (EReference)unlockChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCooldownTalent() {
		return cooldownTalentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCooldownTalent_CooldownChanges() {
		return (EReference)cooldownTalentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnlockModifier() {
		return unlockModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnlockModifier_Modifier() {
		return (EReference)unlockModifierEClass.getEStructuralFeatures().get(0);
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
	public EEnum getChangeValueType() {
		return changeValueTypeEEnum;
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
		createEAttribute(characterClassEClass, CHARACTER_CLASS__IS_PLAYABLE);

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
		createEAttribute(branchEClass, BRANCH__TOOLTIP);
		createEAttribute(branchEClass, BRANCH__IS_INHERITABLE);
		createEReference(branchEClass, BRANCH__NODES);
		createEReference(branchEClass, BRANCH__CHARACTER_CLASS);

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
		createEReference(nodeEClass, NODE__ABILITIES);
		createEReference(nodeEClass, NODE__TALENTS);
		createEAttribute(nodeEClass, NODE__IS_LOCKED);
		createEReference(nodeEClass, NODE__BRANCH);

		nodeActivationEClass = createEClass(NODE_ACTIVATION);
		createEAttribute(nodeActivationEClass, NODE_ACTIVATION__IS_AUTO);
		createEAttribute(nodeActivationEClass, NODE_ACTIVATION__LEVEL);
		createEReference(nodeActivationEClass, NODE_ACTIVATION__COSTS);
		createEReference(nodeActivationEClass, NODE_ACTIVATION__REQUIREMENTS);
		createEReference(nodeActivationEClass, NODE_ACTIVATION__NODE);

		activationCostEClass = createEClass(ACTIVATION_COST);
		createEAttribute(activationCostEClass, ACTIVATION_COST__CONSUME);
		createEAttribute(activationCostEClass, ACTIVATION_COST__COST);
		createEReference(activationCostEClass, ACTIVATION_COST__STATISTIC);
		createEReference(activationCostEClass, ACTIVATION_COST__NODE_ACTIVATION);

		rangeUnitEClass = createEClass(RANGE_UNIT);
		createEAttribute(rangeUnitEClass, RANGE_UNIT__NAME);
		createEAttribute(rangeUnitEClass, RANGE_UNIT__DESCRIPTION);

		abilityEClass = createEClass(ABILITY);
		createEAttribute(abilityEClass, ABILITY__NAME);
		createEAttribute(abilityEClass, ABILITY__LORE);
		createEAttribute(abilityEClass, ABILITY__TOOLTIP);
		createEAttribute(abilityEClass, ABILITY__CAST_TYPE);
		createEAttribute(abilityEClass, ABILITY__COOLDOWN);
		createEAttribute(abilityEClass, ABILITY__ABILITY_TYPE);
		createEAttribute(abilityEClass, ABILITY__CAST_TIME);
		createEAttribute(abilityEClass, ABILITY__RANGE);
		createEReference(abilityEClass, ABILITY__RANGE_UNIT);
		createEAttribute(abilityEClass, ABILITY__ON_LEVEL);
		createEReference(abilityEClass, ABILITY__EFFECTS);
		createEReference(abilityEClass, ABILITY__NODE);
		createEAttribute(abilityEClass, ABILITY__IS_LOCKED);

		effectEClass = createEClass(EFFECT);
		createEAttribute(effectEClass, EFFECT__NAME);
		createEAttribute(effectEClass, EFFECT__TOOLTIP);
		createEAttribute(effectEClass, EFFECT__EFFECT_TYPE);
		createEAttribute(effectEClass, EFFECT__TARGET_TYPE);
		createEAttribute(effectEClass, EFFECT__ON_LEVEL);
		createEReference(effectEClass, EFFECT__INSTANTIATE);
		createEReference(effectEClass, EFFECT__ABILITY);
		createEReference(effectEClass, EFFECT__RANDOMIZER);
		createEReference(effectEClass, EFFECT__CHANGES);
		createEAttribute(effectEClass, EFFECT__IS_LOCKED);

		statChangeEClass = createEClass(STAT_CHANGE);
		createEReference(statChangeEClass, STAT_CHANGE__CHANGES_STATISTIC);
		createEReference(statChangeEClass, STAT_CHANGE__MODIFIERS);
		createEReference(statChangeEClass, STAT_CHANGE__RANDOMIZER);
		createEReference(statChangeEClass, STAT_CHANGE__TICK);
		createEReference(statChangeEClass, STAT_CHANGE__STAT_TALENT);

		modifierEClass = createEClass(MODIFIER);
		createEAttribute(modifierEClass, MODIFIER__CHANGE_TYPE);
		createEAttribute(modifierEClass, MODIFIER__VALUE);
		createEAttribute(modifierEClass, MODIFIER__BASED_ON_MODIFIER);
		createEAttribute(modifierEClass, MODIFIER__PRIORITY_ORDER);
		createEReference(modifierEClass, MODIFIER__BASED_ON);
		createEAttribute(modifierEClass, MODIFIER__BASED_ON_VALUE);
		createEReference(modifierEClass, MODIFIER__STAT_CHANGE);
		createEReference(modifierEClass, MODIFIER__RANDOMIZER);
		createEAttribute(modifierEClass, MODIFIER__ON_LEVEL);
		createEAttribute(modifierEClass, MODIFIER__EXCLUSIVE);
		createEAttribute(modifierEClass, MODIFIER__TARGET_STATISTIC);

		talentEClass = createEClass(TALENT);
		createEAttribute(talentEClass, TALENT__NAME);
		createEAttribute(talentEClass, TALENT__TOOLTIP);
		createEAttribute(talentEClass, TALENT__LORE);
		createEAttribute(talentEClass, TALENT__DESCRIPTION);
		createEReference(talentEClass, TALENT__NODE);
		createEAttribute(talentEClass, TALENT__ON_LEVEL);

		propagationRequirementEClass = createEClass(PROPAGATION_REQUIREMENT);
		createEAttribute(propagationRequirementEClass, PROPAGATION_REQUIREMENT__REQUIRED_LEVEL);
		createEReference(propagationRequirementEClass, PROPAGATION_REQUIREMENT__FOLLOWS_ACTIVATION_OF);
		createEReference(propagationRequirementEClass, PROPAGATION_REQUIREMENT__NODE_ACTIVATION);

		randomizerEClass = createEClass(RANDOMIZER);
		createEAttribute(randomizerEClass, RANDOMIZER__VALUE);
		createEReference(randomizerEClass, RANDOMIZER__BASED_ON);

		statTalentEClass = createEClass(STAT_TALENT);
		createEReference(statTalentEClass, STAT_TALENT__STAT_CHANGES);

		tickEClass = createEClass(TICK);
		createEAttribute(tickEClass, TICK__TICK_TYPE);
		createEReference(tickEClass, TICK__STAT_CHANGE);
		createEAttribute(tickEClass, TICK__VALUE);
		createEAttribute(tickEClass, TICK__DURATION);

		cooldownChangeEClass = createEClass(COOLDOWN_CHANGE);
		createEReference(cooldownChangeEClass, COOLDOWN_CHANGE__ABILITY);
		createEReference(cooldownChangeEClass, COOLDOWN_CHANGE__TALENT);
		createEReference(cooldownChangeEClass, COOLDOWN_CHANGE__COOLDOWN_TALENT);

		changeEClass = createEClass(CHANGE);
		createEAttribute(changeEClass, CHANGE__BASE_VALUE);
		createEAttribute(changeEClass, CHANGE__CHANGE_VALUE_TYPE);
		createEAttribute(changeEClass, CHANGE__CHANGE_TYPE);
		createEReference(changeEClass, CHANGE__EFFECT);
		createEAttribute(changeEClass, CHANGE__IS_LOCKED);

		unlockTalentEClass = createEClass(UNLOCK_TALENT);

		unlockAbilityEClass = createEClass(UNLOCK_ABILITY);
		createEReference(unlockAbilityEClass, UNLOCK_ABILITY__ABILITY);

		unlockEffectEClass = createEClass(UNLOCK_EFFECT);
		createEReference(unlockEffectEClass, UNLOCK_EFFECT__EFFECT);

		unlockChangeEClass = createEClass(UNLOCK_CHANGE);
		createEReference(unlockChangeEClass, UNLOCK_CHANGE__CHANGE);

		cooldownTalentEClass = createEClass(COOLDOWN_TALENT);
		createEReference(cooldownTalentEClass, COOLDOWN_TALENT__COOLDOWN_CHANGES);

		unlockModifierEClass = createEClass(UNLOCK_MODIFIER);
		createEReference(unlockModifierEClass, UNLOCK_MODIFIER__MODIFIER);

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
		changeValueTypeEEnum = createEEnum(CHANGE_VALUE_TYPE);
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
		statChangeEClass.getESuperTypes().add(this.getChange());
		statTalentEClass.getESuperTypes().add(this.getTalent());
		cooldownChangeEClass.getESuperTypes().add(this.getChange());
		unlockTalentEClass.getESuperTypes().add(this.getTalent());
		unlockAbilityEClass.getESuperTypes().add(this.getUnlockTalent());
		unlockEffectEClass.getESuperTypes().add(this.getUnlockTalent());
		unlockChangeEClass.getESuperTypes().add(this.getUnlockTalent());
		cooldownTalentEClass.getESuperTypes().add(this.getTalent());
		unlockModifierEClass.getESuperTypes().add(this.getUnlockTalent());

		// Initialize classes and features; add operations and parameters
		initEClass(rpgEClass, rpg.RPG.class, "RPG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRPG_Name(), ecorePackage.getEString(), "name", "My Role-Playing Game", 1, 1, rpg.RPG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRPG_Lore(), ecorePackage.getEString(), "lore", "My lore", 1, 1, rpg.RPG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPG_AllClasses(), this.getCharacterClass(), null, "allClasses", null, 1, -1, rpg.RPG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPG_RangeUnits(), this.getRangeUnit(), null, "rangeUnits", null, 1, -1, rpg.RPG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characterClassEClass, CharacterClass.class, "CharacterClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterClass_Name(), ecorePackage.getEString(), "name", "My class", 1, 1, CharacterClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterClass_Lore(), ecorePackage.getEString(), "lore", null, 0, 1, CharacterClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacterClass_Statistics(), this.getCharacterStatistic(), null, "statistics", null, 0, -1, CharacterClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterClass_Description(), ecorePackage.getEString(), "description", "Placeholder description", 1, 1, CharacterClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacterClass_ChildClasses(), this.getCharacterClass(), this.getCharacterClass_ParentClasses(), "childClasses", null, 0, -1, CharacterClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacterClass_ParentClasses(), this.getCharacterClass(), this.getCharacterClass_ChildClasses(), "parentClasses", null, 0, -1, CharacterClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacterClass_Branches(), this.getBranch(), this.getBranch_CharacterClass(), "branches", null, 0, -1, CharacterClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterClass_IsPlayable(), ecorePackage.getEBoolean(), "isPlayable", "false", 1, 1, CharacterClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characterStatisticEClass, CharacterStatistic.class, "CharacterStatistic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterStatistic_Name(), ecorePackage.getEString(), "name", "My statistic", 1, 1, CharacterStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterStatistic_Lore(), ecorePackage.getEString(), "lore", null, 0, 1, CharacterStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterStatistic_Description(), ecorePackage.getEString(), "description", "Placeholder description", 1, 1, CharacterStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterStatistic_Tooltip(), ecorePackage.getEString(), "tooltip", "Placeholder tooltip", 1, 1, CharacterStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterStatistic_MinValue(), ecorePackage.getEDouble(), "minValue", "1", 1, 1, CharacterStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterStatistic_MaxValue(), ecorePackage.getEDouble(), "maxValue", "1", 1, 1, CharacterStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterStatistic_StartLimitValue(), ecorePackage.getEDouble(), "startLimitValue", "1", 1, 1, CharacterStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterStatistic_StatType(), this.getStatType(), "statType", "STAT", 1, 1, CharacterStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterStatistic_IsTargetable(), ecorePackage.getEBoolean(), "isTargetable", "true", 1, 1, CharacterStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBranch_Name(), ecorePackage.getEString(), "name", null, 1, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Lore(), ecorePackage.getEString(), "lore", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Description(), ecorePackage.getEString(), "description", null, 1, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_BranchType(), this.getBranchType(), "branchType", null, 1, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Tooltip(), ecorePackage.getEString(), "tooltip", null, 1, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_IsInheritable(), ecorePackage.getEBoolean(), "isInheritable", "true", 1, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranch_Nodes(), this.getNode(), this.getNode_Branch(), "nodes", null, 1, -1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranch_CharacterClass(), this.getCharacterClass(), this.getCharacterClass_Branches(), "characterClass", null, 1, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Lore(), ecorePackage.getEString(), "lore", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Tooltip(), ecorePackage.getEString(), "tooltip", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Description(), ecorePackage.getEString(), "description", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_NodeType(), this.getNodeType(), "nodeType", "STANDARD", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_ChildNodes(), this.getNode(), this.getNode_ParentNodes(), "childNodes", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_ParentNodes(), this.getNode(), this.getNode_ChildNodes(), "parentNodes", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Activation(), this.getNodeActivation(), this.getNodeActivation_Node(), "activation", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_MinActivationLevel(), ecorePackage.getEInt(), "minActivationLevel", "1", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_MaxActivationLevel(), ecorePackage.getEInt(), "maxActivationLevel", "1", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_ActivationLevel(), ecorePackage.getEInt(), "activationLevel", "0", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Abilities(), this.getAbility(), this.getAbility_Node(), "abilities", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Talents(), this.getTalent(), this.getTalent_Node(), "talents", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_IsLocked(), ecorePackage.getEBoolean(), "isLocked", "false", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Branch(), this.getBranch(), this.getBranch_Nodes(), "branch", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeActivationEClass, NodeActivation.class, "NodeActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeActivation_IsAuto(), ecorePackage.getEBoolean(), "isAuto", null, 1, 1, NodeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeActivation_Level(), ecorePackage.getEInt(), "level", null, 1, 1, NodeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeActivation_Costs(), this.getActivationCost(), this.getActivationCost_NodeActivation(), "costs", null, 0, -1, NodeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeActivation_Requirements(), this.getPropagationRequirement(), this.getPropagationRequirement_NodeActivation(), "requirements", null, 0, -1, NodeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeActivation_Node(), this.getNode(), this.getNode_Activation(), "node", null, 1, 1, NodeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activationCostEClass, ActivationCost.class, "ActivationCost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivationCost_Consume(), ecorePackage.getEBoolean(), "consume", "true", 1, 1, ActivationCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivationCost_Cost(), ecorePackage.getEDouble(), "cost", null, 1, 1, ActivationCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivationCost_Statistic(), this.getCharacterStatistic(), null, "statistic", null, 1, 1, ActivationCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivationCost_NodeActivation(), this.getNodeActivation(), this.getNodeActivation_Costs(), "nodeActivation", null, 1, 1, ActivationCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeUnitEClass, RangeUnit.class, "RangeUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangeUnit_Name(), ecorePackage.getEString(), "name", null, 1, 1, RangeUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeUnit_Description(), ecorePackage.getEString(), "description", null, 1, 1, RangeUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abilityEClass, Ability.class, "Ability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbility_Name(), ecorePackage.getEString(), "name", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_Lore(), ecorePackage.getEString(), "lore", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_Tooltip(), ecorePackage.getEString(), "tooltip", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_CastType(), this.getCastType(), "castType", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_Cooldown(), ecorePackage.getEDouble(), "cooldown", "0", 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_AbilityType(), this.getAbilityType(), "abilityType", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_CastTime(), ecorePackage.getEDouble(), "castTime", null, 0, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_Range(), ecorePackage.getEDouble(), "range", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbility_RangeUnit(), this.getRangeUnit(), null, "rangeUnit", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_OnLevel(), ecorePackage.getEInt(), "onLevel", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbility_Effects(), this.getEffect(), this.getEffect_Ability(), "effects", null, 1, -1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbility_Node(), this.getNode(), this.getNode_Abilities(), "node", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_IsLocked(), ecorePackage.getEBoolean(), "isLocked", "false", 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(effectEClass, Effect.class, "Effect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEffect_Name(), ecorePackage.getEString(), "name", null, 1, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Tooltip(), ecorePackage.getEString(), "tooltip", null, 1, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_EffectType(), this.getEffectType(), "effectType", null, 1, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_TargetType(), this.getTargetType(), "targetType", null, 1, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_OnLevel(), ecorePackage.getEInt(), "onLevel", null, 1, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffect_Instantiate(), this.getCharacterClass(), null, "instantiate", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffect_Ability(), this.getAbility(), this.getAbility_Effects(), "ability", null, 1, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffect_Randomizer(), this.getRandomizer(), null, "randomizer", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffect_Changes(), this.getChange(), this.getChange_Effect(), "changes", null, 0, -1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_IsLocked(), ecorePackage.getEBoolean(), "isLocked", "false", 1, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statChangeEClass, StatChange.class, "StatChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatChange_ChangesStatistic(), this.getCharacterStatistic(), null, "changesStatistic", null, 1, 1, StatChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatChange_Modifiers(), this.getModifier(), this.getModifier_StatChange(), "modifiers", null, 0, -1, StatChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatChange_Randomizer(), this.getRandomizer(), null, "randomizer", null, 0, 1, StatChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatChange_Tick(), this.getTick(), this.getTick_StatChange(), "tick", null, 0, 1, StatChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatChange_StatTalent(), this.getStatTalent(), this.getStatTalent_StatChanges(), "statTalent", null, 0, 1, StatChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifierEClass, Modifier.class, "Modifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModifier_ChangeType(), this.getChangeType(), "changeType", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_BasedOnModifier(), this.getChangeType(), "basedOnModifier", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_PriorityOrder(), ecorePackage.getEInt(), "priorityOrder", null, 1, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifier_BasedOn(), this.getCharacterStatistic(), null, "basedOn", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_BasedOnValue(), ecorePackage.getEDouble(), "basedOnValue", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifier_StatChange(), this.getStatChange(), this.getStatChange_Modifiers(), "statChange", null, 1, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifier_Randomizer(), this.getRandomizer(), null, "randomizer", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_OnLevel(), ecorePackage.getEInt(), "onLevel", "1", 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_Exclusive(), ecorePackage.getEBoolean(), "exclusive", "false", 1, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_TargetStatistic(), ecorePackage.getEBoolean(), "targetStatistic", "false", 1, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(talentEClass, Talent.class, "Talent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTalent_Name(), ecorePackage.getEString(), "name", null, 1, 1, Talent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTalent_Tooltip(), ecorePackage.getEString(), "tooltip", null, 1, 1, Talent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTalent_Lore(), ecorePackage.getEString(), "lore", null, 0, 1, Talent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTalent_Description(), ecorePackage.getEString(), "description", null, 1, 1, Talent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTalent_Node(), this.getNode(), this.getNode_Talents(), "node", null, 1, 1, Talent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTalent_OnLevel(), ecorePackage.getEInt(), "onLevel", null, 1, 1, Talent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propagationRequirementEClass, PropagationRequirement.class, "PropagationRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropagationRequirement_RequiredLevel(), ecorePackage.getEInt(), "requiredLevel", null, 1, 1, PropagationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropagationRequirement_FollowsActivationOf(), this.getNode(), null, "followsActivationOf", null, 1, 1, PropagationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropagationRequirement_NodeActivation(), this.getNodeActivation(), this.getNodeActivation_Requirements(), "nodeActivation", null, 1, 1, PropagationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(randomizerEClass, Randomizer.class, "Randomizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRandomizer_Value(), ecorePackage.getEDouble(), "value", "0", 1, 1, Randomizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRandomizer_BasedOn(), this.getCharacterStatistic(), null, "basedOn", null, 0, 1, Randomizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statTalentEClass, StatTalent.class, "StatTalent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatTalent_StatChanges(), this.getStatChange(), this.getStatChange_StatTalent(), "statChanges", null, 1, -1, StatTalent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tickEClass, Tick.class, "Tick", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTick_TickType(), this.getTickType(), "tickType", null, 1, 1, Tick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTick_StatChange(), this.getStatChange(), this.getStatChange_Tick(), "statChange", null, 1, 1, Tick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTick_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, Tick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTick_Duration(), ecorePackage.getEDouble(), "duration", null, 1, 1, Tick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cooldownChangeEClass, CooldownChange.class, "CooldownChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCooldownChange_Ability(), this.getAbility(), null, "ability", null, 0, 1, CooldownChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCooldownChange_Talent(), this.getTalent(), null, "talent", null, 0, 1, CooldownChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCooldownChange_CooldownTalent(), this.getCooldownTalent(), this.getCooldownTalent_CooldownChanges(), "cooldownTalent", null, 0, 1, CooldownChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeEClass, Change.class, "Change", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChange_BaseValue(), ecorePackage.getEDouble(), "baseValue", null, 1, 1, Change.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChange_ChangeValueType(), this.getChangeValueType(), "changeValueType", null, 1, 1, Change.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChange_ChangeType(), this.getChangeType(), "changeType", null, 1, 1, Change.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChange_Effect(), this.getEffect(), this.getEffect_Changes(), "effect", null, 0, 1, Change.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChange_IsLocked(), ecorePackage.getEBoolean(), "isLocked", "false", 1, 1, Change.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unlockTalentEClass, UnlockTalent.class, "UnlockTalent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unlockAbilityEClass, UnlockAbility.class, "UnlockAbility", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnlockAbility_Ability(), this.getAbility(), null, "ability", null, 1, 1, UnlockAbility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unlockEffectEClass, UnlockEffect.class, "UnlockEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnlockEffect_Effect(), this.getEffect(), null, "effect", null, 1, 1, UnlockEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unlockChangeEClass, UnlockChange.class, "UnlockChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnlockChange_Change(), this.getChange(), null, "change", null, 1, 1, UnlockChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cooldownTalentEClass, CooldownTalent.class, "CooldownTalent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCooldownTalent_CooldownChanges(), this.getCooldownChange(), this.getCooldownChange_CooldownTalent(), "cooldownChanges", null, 1, -1, CooldownTalent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unlockModifierEClass, UnlockModifier.class, "UnlockModifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnlockModifier_Modifier(), this.getModifier(), null, "modifier", null, 1, 1, UnlockModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(statTypeEEnum, StatType.class, "StatType");
		addEEnumLiteral(statTypeEEnum, StatType.STAT_LITERAL);
		addEEnumLiteral(statTypeEEnum, StatType.FUEL_LITERAL);

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
		addEEnumLiteral(changeTypeEEnum, ChangeType.MOVE_LIMIT_UP_LITERAL);
		addEEnumLiteral(changeTypeEEnum, ChangeType.MOVE_LIMIT_DOWN_LITERAL);
		addEEnumLiteral(changeTypeEEnum, ChangeType.SET_LIMIT_LITERAL);

		initEEnum(tickTypeEEnum, TickType.class, "TickType");
		addEEnumLiteral(tickTypeEEnum, TickType.PER_TICK_LITERAL);
		addEEnumLiteral(tickTypeEEnum, TickType.DELAYED_LITERAL);

		initEEnum(changeValueTypeEEnum, ChangeValueType.class, "ChangeValueType");
		addEEnumLiteral(changeValueTypeEEnum, ChangeValueType.VALUE_LITERAL);
		addEEnumLiteral(changeValueTypeEEnum, ChangeValueType.PERCENTAGE_LITERAL);

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
		  (rpgEClass, 
		   source, 
		   new String[] {
			 "constraints", "ClassyGame"
		   });			
		addAnnotation
		  (characterClassEClass, 
		   source, 
		   new String[] {
			 "constraints", "MeaningfulClass RecursiveInheritance"
		   });			
		addAnnotation
		  (characterStatisticEClass, 
		   source, 
		   new String[] {
			 "constraints", "LimitBetweenMinAndMax ValidMinMax"
		   });			
		addAnnotation
		  (branchEClass, 
		   source, 
		   new String[] {
			 "constraints", "ExistingRootNode"
		   });			
		addAnnotation
		  (nodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "RootNodeChildren StandardNodeChildren StandaloneNodeConnections SelfReference CircularReference ProperReference ActivationCondition ActivationIntegrity MinimalNodeActivation MaximalNodeActivation UniqueNodeActivationLevels ValidBranchTypeImplication"
		   });			
		addAnnotation
		  (nodeActivationEClass, 
		   source, 
		   new String[] {
			 "constraints", "ProperNodeActivationLevels MeaningfulActivationCondition"
		   });			
		addAnnotation
		  (activationCostEClass, 
		   source, 
		   new String[] {
			 "constraints", "ProperCost ProperCostReference"
		   });			
		addAnnotation
		  (abilityEClass, 
		   source, 
		   new String[] {
			 "constraints", "ProperAbilityLevels ValidCastTime"
		   });			
		addAnnotation
		  (effectEClass, 
		   source, 
		   new String[] {
			 "constraints", "ProperEffectLevels MeaningfulEffect InstantiateConstraint"
		   });			
		addAnnotation
		  (statChangeEClass, 
		   source, 
		   new String[] {
			 "constraints", "SelfEffectStatChange SelfTalentStatChange SingularModifierOrder"
		   });			
		addAnnotation
		  (modifierEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoMovingLimits"
		   });			
		addAnnotation
		  (propagationRequirementEClass, 
		   source, 
		   new String[] {
			 "constraints", "ProperRequiredLevel SelfReference ProperPropagationReference"
		   });			
		addAnnotation
		  (randomizerEClass, 
		   source, 
		   new String[] {
			 "constraints", "MeaningfulRandomizer ProperStatisticBase"
		   });			
		addAnnotation
		  (cooldownChangeEClass, 
		   source, 
		   new String[] {
			 "constraints", "MeaningfullCooldownChange ProperAbilityReference"
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
		  (rpgEClass, 
		   source, 
		   new String[] {
			 "ClassyGame", "\n\t\t\tself.allClasses->size() > 0",
			 "ClassyGame$message", "\'The game should contain at least one class\'"
		   });			
		addAnnotation
		  (characterClassEClass, 
		   source, 
		   new String[] {
			 "MeaningfulClass", "\n\t\t\tstatistics->size() > 0 or branches->size() > 0",
			 "MeaningfulClass$message", "\'A class should have at least one statistic or branch.\'",
			 "RecursiveInheritance", "\n\t\t\tself.parentClasses->forAll(parent | self._\'<>\'(parent))",
			 "RecursiveInheritance$message", "\'A class cannot inherit itself.\'"
		   });			
		addAnnotation
		  (characterStatisticEClass, 
		   source, 
		   new String[] {
			 "LimitBetweenMinAndMax", "\n\t\t\tstartLimitValue <= maxValue and startLimitValue >= minValue",
			 "LimitBetweenMinAndMax$message", "\'Value of startLimitValue must be between the values of minValue and maxValue.\'",
			 "ValidMinMax", "\n\t\t\tmaxValue >= minValue",
			 "ValidMinMax$message", "\'Value of max must be equal to or greater than value of min.\'"
		   });			
		addAnnotation
		  (branchEClass, 
		   source, 
		   new String[] {
			 "ExistingRootNode", "\n\t\t\tself.nodes->exists(nodeType = NodeType::ROOT or nodeType = NodeType::STANDALONE)",
			 "ExistingRootNode$message", "\'Branch must have at least one ROOT or STANDALONE node.\'"
		   });			
		addAnnotation
		  (nodeEClass, 
		   source, 
		   new String[] {
			 "RootNodeChildren", "\n\t\t\tself.nodeType = NodeType::ROOT implies \n\t\t\t(self.childNodes->forAll(node | node.nodeType = NodeType::STANDARD) and self.parentNodes->size() = 0)",
			 "RootNodeChildren$message", "\'ROOT nodes can have only STANDARD nodes for children and can not have any parents.\'",
			 "StandardNodeChildren", "\n\t\t\tself.nodeType = NodeType::STANDARD implies \n\t\t\t(self.childNodes->forAll(node | node.nodeType = NodeType::STANDARD) and\n\t\t\tself.parentNodes->forAll(node | node.nodeType = NodeType::ROOT or node.nodeType = NodeType::STANDARD))",
			 "StandardNodeChildren$message", "\'STANDARD nodes can have only STANDARD nodes for children and ROOT or STANDARD nodes for parents\'",
			 "StandaloneNodeConnections", "\n\t\t\tself.nodeType = NodeType::STANDALONE implies self.parentNodes->size() = 0 and self.childNodes->size() = 0",
			 "StandaloneNodeConnections$message", "\'STANDALONE nodes cannot have parent or child nodes.\'",
			 "SelfReference", "\n\t\t\tself.childNodes->forAll(node | node <> self) and self.parentNodes->forAll(node | node <> self)",
			 "SelfReference$message", "\'Nodes cannot reference themselves as either parent or child. \'",
			 "CircularReference", "\n\t\t\tself->closure(childNodes)->excludes(self) and self->closure(parentNodes)->excludes(self)",
			 "CircularReference$message", "\'Nodes cannot form circular references to themselves through parent and child relationships.\'",
			 "ProperReference", "\n\t\t\tself.childNodes->forAll(node | self.branch.nodes->includes(node)) and self.parentNodes->forAll(node | self.branch.nodes->includes(node))",
			 "ProperReference$message", "\'Nodes can only reference nodes within the same Branch.\'",
			 "ActivationCondition", "\n\t\t\tself.nodeType = NodeType::STANDARD implies \n\t\t\t(self.activationLevel >= self.minActivationLevel implies self.parentNodes->exists(parentNode | parentNode.activationLevel >= parentNode.minActivationLevel))",
			 "ActivationCondition$message", "\'Before a node can be activated, at least one parent must be activated.\'",
			 "ActivationIntegrity", "\n\t\t\tself.activationLevel <= self.maxActivationLevel",
			 "ActivationIntegrity$message", "\'Activation level must be cannot exceed maximum activation levels.\'",
			 "MinimalNodeActivation", "\n\t\t\tself.activationLevel < self.minActivationLevel implies \n\t\t\tself.activation->size() = (self.maxActivationLevel - self.minActivationLevel + 1) and self.activationLevel < self.minActivationLevel",
			 "MinimalNodeActivation$message", "\'Non-activated nodes must have at least one node activation rule and have activation level below minimum.\'",
			 "MaximalNodeActivation", "\n\t\t\tself.activationLevel >= self.minActivationLevel implies self.activation->size() = (self.maxActivationLevel - self.activationLevel)",
			 "MaximalNodeActivation$message", "\'Activated nodes must have proper number of node activations.\'",
			 "UniqueNodeActivationLevels", "\n\t\t\tself.activation->forAll(n1: NodeActivation, n2: NodeActivation | n1 <> n2 implies n1.level <> n2.level)",
			 "UniqueNodeActivationLevels$message", "\'All node activations must have unique levels.\'",
			 "ValidBranchTypeImplication", "\n\t\t\tif self.branch.branchType = BranchType::TALENT then\n\t\t\t\tself.talents->size() > 0 and self.abilities->size() = 0\n\t\t\telse \n\t\t\t\tself.talents->size() = 0 and self.abilities->size() > 0\n\t\t\tendif",
			 "ValidBranchTypeImplication$message", "\'Branch type dictates what the nodes can contain: abilities or talents.\'"
		   });			
		addAnnotation
		  (nodeActivationEClass, 
		   source, 
		   new String[] {
			 "ProperNodeActivationLevels", "\n\t\t\tif self.node.activationLevel >= self.node.minActivationLevel then\n\t\t\t\tself.level > self.node.activationLevel and self.level <= self.node.maxActivationLevel\n\t\t\telse\n\t\t\t\tself.level >= self.node.minActivationLevel and self.level <= self.node.maxActivationLevel\n\t\t\tendif",
			 "ProperNodeActivationLevels$message", "\'All node activations must have levels between min and max activation levels.\'",
			 "MeaningfulActivationCondition", "\n\t\t\tself.costs->size() > 0 or self.requirements->size() > 0",
			 "MeaningfulActivationCondition$message", "\'Node activation should have at least one cost or propagation requirement.\'"
		   });			
		addAnnotation
		  (activationCostEClass, 
		   source, 
		   new String[] {
			 "ProperCost", "\n\t\t\tself.cost >= self.statistic.minValue and self.cost <= self.statistic.startLimitValue",
			 "ProperCost$message", "\'The cost must be between minimum and maximum values of the statistic.\'",
			 "ProperCostReference", "\n\t\t\tself.nodeActivation.node.branch.characterClass.statistics->includes(self.statistic) or\n\t\t\tself.nodeActivation.node.branch.characterClass->closure(parentClasses)->exists(charClass | charClass.statistics->includes(self.statistic))",
			 "ProperCostReference$message", "\'Referenced statistic must be in host clas or parent class, recursively.\'"
		   });			
		addAnnotation
		  (abilityEClass, 
		   source, 
		   new String[] {
			 "ProperAbilityLevels", "\n\t\t\tself.onLevel >= self.node.minActivationLevel and self.onLevel <= self.node.maxActivationLevel",
			 "ProperAbilityLevels$message", "\'All abilities must reference an appropriate node level.\'",
			 "ValidCastTime", "\n\t\tif self.castType = CastType::NO_CAST or self.castType = CastType::INSTANT then\n\t\t\tself.castTime = 0.0\n\t\telse\n\t\t\tself.castTime > 0.0\n\t\tendif",
			 "ValidCastTime$message", "\'NO_CAST and INSTANT abilities have no cast time, the rest do.\'"
		   });			
		addAnnotation
		  (effectEClass, 
		   source, 
		   new String[] {
			 "ProperEffectLevels", "\n\t\t\tself.onLevel >= self.ability.node.minActivationLevel and self.onLevel <= self.ability.node.maxActivationLevel",
			 "ProperEffectLevels$message", "\'Effects must reference an appropriate node level.\'",
			 "MeaningfulEffect", "\n\t\t\tif self.effectType = EffectType::INSTANTIATE then\n\t\t\t\tself.instantiate->size() = 1\n\t\t\telse\n\t\t\t\tself.changes->size() > 0\n\t\t\tendif",
			 "MeaningfulEffect$message", "\'An effect must either instantiate a class or change a stat.\'",
			 "InstantiateConstraint", "\n\t\t\tself.effectType = EffectType::INSTANTIATE implies self.targetType = TargetType::SELF",
			 "InstantiateConstraint$message", "\'Instantiate effects can only target SELF.\'"
		   });			
		addAnnotation
		  (statChangeEClass, 
		   source, 
		   new String[] {
			 "SelfEffectStatChange", "\n\t\t\tself.effect.targetType = TargetType::SELF and self.effect <> null implies \n\t\t\t(self.effect.ability.node.branch.characterClass.statistics->includes(self.changesStatistic)\n\t\t\tor self.effect.ability.node.branch.characterClass->closure(parentClasses)->exists(charClass | charClass.statistics->includes(self.changesStatistic)))",
			 "SelfEffectStatChange$message", "\'If StatChange is a part of SELF Effect, it can reference only statistics in host or parent classes.\'",
			 "SelfTalentStatChange", "\n\t\t\tself.statTalent <> null implies \n\t\t\t(self.statTalent.node.branch.characterClass.statistics->includes(self.changesStatistic)\n\t\t\tor self.statTalent.node.branch.characterClass->closure(parentClasses)->exists(charClass | charClass.statistics->includes(self.changesStatistic)))",
			 "SelfTalentStatChange$message", "\'If StatChange is a part of StatTalent, it can reference only statistics in host or parent classes.\'",
			 "SingularModifierOrder", "\n\t\t\tself.modifiers->forAll(m1, m2 | m1 <> m2 implies m1.priorityOrder <> m2.priorityOrder)",
			 "SingularModifierOrder$message", "\'Each modifier has to have a unique priority order.\'"
		   });			
		addAnnotation
		  (modifierEClass, 
		   source, 
		   new String[] {
			 "NoMovingLimits", "\n\t\t\tself.changeType <> ChangeType::MOVE_LIMIT_UP and self.changeType <> ChangeType::MOVE_LIMIT_DOWN and self.changeType <> ChangeType::SET_LIMIT",
			 "NoMovingLimits$message", "\'A modifier cannot move a statistic limit.\'"
		   });			
		addAnnotation
		  (propagationRequirementEClass, 
		   source, 
		   new String[] {
			 "ProperRequiredLevel", "\n\t\t\tself.requiredLevel >= self.followsActivationOf.minActivationLevel and self.requiredLevel <= self.followsActivationOf.maxActivationLevel",
			 "ProperRequiredLevel$message", "\'Required level must be between minimum and maximum possible values of the level.\'",
			 "SelfReference", "\n\t\t\tself.nodeActivation.node <> self.followsActivationOf",
			 "SelfReference$message", "\'Cannot reference host Node.\'",
			 "ProperPropagationReference", "\n\t\t\tself.nodeActivation.node.branch.characterClass.branches->collect(nodes)->includes(self.followsActivationOf) or\n\t\t\tself.nodeActivation.node.branch.characterClass->closure(parentClasses)->exists(charClass | charClass.branches->collect(nodes)->includes(self.followsActivationOf))",
			 "ProperPropagationReference$message", "\'Referenced Node must be within host class or parent classes, recursively.\'"
		   });			
		addAnnotation
		  (randomizerEClass, 
		   source, 
		   new String[] {
			 "MeaningfulRandomizer", "\n\t\t\t(self.value > 0 implies self.basedOn = null) and \n\t\t\t(self.basedOn <> null implies self.value = 0)",
			 "MeaningfulRandomizer$message", "\'Randomizer should have value greater than zero or be based on character statistic.\'",
			 "ProperStatisticBase", "\n\t\t\tself.basedOn <> null implies\n\t\t\tself.basedOn.minValue >= 0 and self.basedOn.maxValue <= 100 and self.basedOn.maxValue = self.basedOn.startLimitValue",
			 "ProperStatisticBase$message", "\'Referenced statistics should model chance, therefore values should be between 0 and 100.\'"
		   });			
		addAnnotation
		  (cooldownChangeEClass, 
		   source, 
		   new String[] {
			 "MeaningfullCooldownChange", "\n\t\t\tself.talent <> null or self.ability <> null and\n\t\t\t(self.talent <> null implies self.ability = null) and\n\t\t\t(self.ability <> null implies self.talent = null)",
			 "MeaningfullCooldownChange$message", "\'A CooldownChange should reference either talent or ability.\'",
			 "ProperAbilityReference", "\n\t\t\t--TODO: should be tested\n\t\t\tself.effect.ability.node.branch.characterClass.branches->collect(nodes)->collect(abilities)->includes(self.ability) or\n\t\t\tself.effect.ability.node.branch.characterClass->closure(parentClasses)->exists(charClass | charClass.branches->collect(nodes)->collect(abilities->includes(self.ability)))",
			 "ProperAbilityReference$message", "\'Can only reference abilities of host or parent class.\'"
		   });
	}

} //RpgPackageImpl
