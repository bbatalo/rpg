/**
 */
package rpg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rpg.RpgFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RpgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rpg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "rpg";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rpg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RpgPackage eINSTANCE = rpg.impl.RpgPackageImpl.init();

	/**
	 * The meta object id for the '{@link rpg.impl.RPGImpl <em>RPG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.impl.RPGImpl
	 * @see rpg.impl.RpgPackageImpl#getRPG()
	 * @generated
	 */
	int RPG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPG__LORE = 1;

	/**
	 * The feature id for the '<em><b>All Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPG__ALL_CLASSES = 2;

	/**
	 * The feature id for the '<em><b>Range Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPG__RANGE_UNITS = 3;

	/**
	 * The number of structural features of the '<em>RPG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPG_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link rpg.impl.CharacterClassImpl <em>Character Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.impl.CharacterClassImpl
	 * @see rpg.impl.RpgPackageImpl#getCharacterClass()
	 * @generated
	 */
	int CHARACTER_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_CLASS__LORE = 1;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_CLASS__STATISTICS = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_CLASS__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Child Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_CLASS__CHILD_CLASSES = 4;

	/**
	 * The feature id for the '<em><b>Parent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_CLASS__PARENT_CLASSES = 5;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_CLASS__BRANCHES = 6;

	/**
	 * The number of structural features of the '<em>Character Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_CLASS_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link rpg.impl.CharacterStatisticImpl <em>Character Statistic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.impl.CharacterStatisticImpl
	 * @see rpg.impl.RpgPackageImpl#getCharacterStatistic()
	 * @generated
	 */
	int CHARACTER_STATISTIC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STATISTIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STATISTIC__LORE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STATISTIC__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STATISTIC__TOOLTIP = 3;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STATISTIC__MIN_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STATISTIC__MAX_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Start Limit Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STATISTIC__START_LIMIT_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Stat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STATISTIC__STAT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Is Targetable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STATISTIC__IS_TARGETABLE = 8;

	/**
	 * The number of structural features of the '<em>Character Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STATISTIC_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link rpg.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.impl.BranchImpl
	 * @see rpg.impl.RpgPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__LORE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Branch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__BRANCH_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Start Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__START_NODES = 4;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__TOOLTIP = 5;

	/**
	 * The feature id for the '<em><b>Is Inheritable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__IS_INHERITABLE = 6;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NODES = 7;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link rpg.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.impl.NodeImpl
	 * @see rpg.impl.RpgPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LORE = 1;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TOOLTIP = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Child Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHILD_NODES = 5;

	/**
	 * The feature id for the '<em><b>Parent Nodes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARENT_NODES = 6;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ACTIVATION = 7;

	/**
	 * The feature id for the '<em><b>Min Activation Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MIN_ACTIVATION_LEVEL = 8;

	/**
	 * The feature id for the '<em><b>Max Activation Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MAX_ACTIVATION_LEVEL = 9;

	/**
	 * The feature id for the '<em><b>Activation Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ACTIVATION_LEVEL = 10;

	/**
	 * The feature id for the '<em><b>Is Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IS_ACTIVATED = 11;

	/**
	 * The feature id for the '<em><b>Abilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ABILITIES = 12;

	/**
	 * The feature id for the '<em><b>Talents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TALENTS = 13;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link rpg.impl.NodeActivationImpl <em>Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.impl.NodeActivationImpl
	 * @see rpg.impl.RpgPackageImpl#getNodeActivation()
	 * @generated
	 */
	int NODE_ACTIVATION = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACTIVATION__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Is Auto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACTIVATION__IS_AUTO = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACTIVATION__LEVEL = 2;

	/**
	 * The number of structural features of the '<em>Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACTIVATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link rpg.impl.NodeActivationBuyImpl <em>Node Activation Buy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.impl.NodeActivationBuyImpl
	 * @see rpg.impl.RpgPackageImpl#getNodeActivationBuy()
	 * @generated
	 */
	int NODE_ACTIVATION_BUY = 6;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACTIVATION_BUY__TEXT = NODE_ACTIVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Is Auto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACTIVATION_BUY__IS_AUTO = NODE_ACTIVATION__IS_AUTO;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACTIVATION_BUY__LEVEL = NODE_ACTIVATION__LEVEL;

	/**
	 * The feature id for the '<em><b>Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACTIVATION_BUY__COSTS = NODE_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Activation Buy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACTIVATION_BUY_FEATURE_COUNT = NODE_ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rpg.impl.NodeActivationPropagateImpl <em>Node Activation Propagate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.impl.NodeActivationPropagateImpl
	 * @see rpg.impl.RpgPackageImpl#getNodeActivationPropagate()
	 * @generated
	 */
	int NODE_ACTIVATION_PROPAGATE = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACTIVATION_PROPAGATE__TEXT = NODE_ACTIVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Is Auto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACTIVATION_PROPAGATE__IS_AUTO = NODE_ACTIVATION__IS_AUTO;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACTIVATION_PROPAGATE__LEVEL = NODE_ACTIVATION__LEVEL;

	/**
	 * The feature id for the '<em><b>Follows Activation Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACTIVATION_PROPAGATE__FOLLOWS_ACTIVATION_OF = NODE_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACTIVATION_PROPAGATE__REQUIRED_LEVEL = NODE_ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Activation Propagate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACTIVATION_PROPAGATE_FEATURE_COUNT = NODE_ACTIVATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rpg.impl.ActivationCostImpl <em>Activation Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.impl.ActivationCostImpl
	 * @see rpg.impl.RpgPackageImpl#getActivationCost()
	 * @generated
	 */
	int ACTIVATION_COST = 8;

	/**
	 * The feature id for the '<em><b>Consume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_COST__CONSUME = 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_COST__COST = 1;

	/**
	 * The feature id for the '<em><b>Statistic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_COST__STATISTIC = 2;

	/**
	 * The number of structural features of the '<em>Activation Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_COST_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link rpg.impl.RangeUnitImpl <em>Range Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.impl.RangeUnitImpl
	 * @see rpg.impl.RpgPackageImpl#getRangeUnit()
	 * @generated
	 */
	int RANGE_UNIT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_UNIT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_UNIT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Range Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_UNIT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link rpg.impl.AbilityImpl <em>Ability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.impl.AbilityImpl
	 * @see rpg.impl.RpgPackageImpl#getAbility()
	 * @generated
	 */
	int ABILITY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__LORE = 1;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__TOOLTIP = 2;

	/**
	 * The feature id for the '<em><b>Cast Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__CAST_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Ability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__ABILITY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Cast Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__CAST_TIME = 5;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__RANGE = 6;

	/**
	 * The feature id for the '<em><b>Range Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__RANGE_UNIT = 7;

	/**
	 * The feature id for the '<em><b>On Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__ON_LEVEL = 8;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__EFFECTS = 9;

	/**
	 * The feature id for the '<em><b>Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__COSTS = 10;

	/**
	 * The number of structural features of the '<em>Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link rpg.impl.EffectImpl <em>Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.impl.EffectImpl
	 * @see rpg.impl.RpgPackageImpl#getEffect()
	 * @generated
	 */
	int EFFECT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__TOOLTIP = 1;

	/**
	 * The feature id for the '<em><b>Effect Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__EFFECT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__TARGET_TYPE = 3;

	/**
	 * The feature id for the '<em><b>On Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__ON_LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Instantiate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__INSTANTIATE = 5;

	/**
	 * The feature id for the '<em><b>Stat Change</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__STAT_CHANGE = 6;

	/**
	 * The number of structural features of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link rpg.impl.StatChangeImpl <em>Stat Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.impl.StatChangeImpl
	 * @see rpg.impl.RpgPackageImpl#getStatChange()
	 * @generated
	 */
	int STAT_CHANGE = 12;

	/**
	 * The feature id for the '<em><b>Change Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_CHANGE__CHANGE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Tick Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_CHANGE__TICK_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Base Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_CHANGE__BASE_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Tick Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_CHANGE__TICK_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Changes Statistic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_CHANGE__CHANGES_STATISTIC = 4;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_CHANGE__MODIFIERS = 5;

	/**
	 * The number of structural features of the '<em>Stat Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_CHANGE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link rpg.impl.ModifierImpl <em>Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.impl.ModifierImpl
	 * @see rpg.impl.RpgPackageImpl#getModifier()
	 * @generated
	 */
	int MODIFIER = 13;

	/**
	 * The feature id for the '<em><b>Change Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__CHANGE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Based On Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__BASED_ON_MODIFIER = 2;

	/**
	 * The feature id for the '<em><b>Priority Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__PRIORITY_ORDER = 3;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__BASED_ON = 4;

	/**
	 * The feature id for the '<em><b>Based On Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__BASED_ON_VALUE = 5;

	/**
	 * The number of structural features of the '<em>Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link rpg.impl.TalentImpl <em>Talent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.impl.TalentImpl
	 * @see rpg.impl.RpgPackageImpl#getTalent()
	 * @generated
	 */
	int TALENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALENT__TOOLTIP = 1;

	/**
	 * The feature id for the '<em><b>Lore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALENT__LORE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALENT__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Talent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link rpg.impl.AbilityCostImpl <em>Ability Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.impl.AbilityCostImpl
	 * @see rpg.impl.RpgPackageImpl#getAbilityCost()
	 * @generated
	 */
	int ABILITY_COST = 15;

	/**
	 * The feature id for the '<em><b>Consume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_COST__CONSUME = 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_COST__COST = 1;

	/**
	 * The feature id for the '<em><b>Statistic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_COST__STATISTIC = 2;

	/**
	 * The number of structural features of the '<em>Ability Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_COST_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link rpg.StatType <em>Stat Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.StatType
	 * @see rpg.impl.RpgPackageImpl#getStatType()
	 * @generated
	 */
	int STAT_TYPE = 16;

	/**
	 * The meta object id for the '{@link rpg.BranchType <em>Branch Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.BranchType
	 * @see rpg.impl.RpgPackageImpl#getBranchType()
	 * @generated
	 */
	int BRANCH_TYPE = 17;

	/**
	 * The meta object id for the '{@link rpg.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.NodeType
	 * @see rpg.impl.RpgPackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 18;

	/**
	 * The meta object id for the '{@link rpg.CastType <em>Cast Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.CastType
	 * @see rpg.impl.RpgPackageImpl#getCastType()
	 * @generated
	 */
	int CAST_TYPE = 19;

	/**
	 * The meta object id for the '{@link rpg.AbilityType <em>Ability Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.AbilityType
	 * @see rpg.impl.RpgPackageImpl#getAbilityType()
	 * @generated
	 */
	int ABILITY_TYPE = 20;

	/**
	 * The meta object id for the '{@link rpg.TargetType <em>Target Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.TargetType
	 * @see rpg.impl.RpgPackageImpl#getTargetType()
	 * @generated
	 */
	int TARGET_TYPE = 21;

	/**
	 * The meta object id for the '{@link rpg.EffectType <em>Effect Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.EffectType
	 * @see rpg.impl.RpgPackageImpl#getEffectType()
	 * @generated
	 */
	int EFFECT_TYPE = 22;

	/**
	 * The meta object id for the '{@link rpg.ChangeType <em>Change Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.ChangeType
	 * @see rpg.impl.RpgPackageImpl#getChangeType()
	 * @generated
	 */
	int CHANGE_TYPE = 23;

	/**
	 * The meta object id for the '{@link rpg.TickType <em>Tick Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rpg.TickType
	 * @see rpg.impl.RpgPackageImpl#getTickType()
	 * @generated
	 */
	int TICK_TYPE = 24;


	/**
	 * Returns the meta object for class '{@link rpg.RPG <em>RPG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPG</em>'.
	 * @see rpg.RPG
	 * @generated
	 */
	EClass getRPG();

	/**
	 * Returns the meta object for the attribute '{@link rpg.RPG#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rpg.RPG#getName()
	 * @see #getRPG()
	 * @generated
	 */
	EAttribute getRPG_Name();

	/**
	 * Returns the meta object for the attribute '{@link rpg.RPG#getLore <em>Lore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lore</em>'.
	 * @see rpg.RPG#getLore()
	 * @see #getRPG()
	 * @generated
	 */
	EAttribute getRPG_Lore();

	/**
	 * Returns the meta object for the containment reference list '{@link rpg.RPG#getAllClasses <em>All Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Classes</em>'.
	 * @see rpg.RPG#getAllClasses()
	 * @see #getRPG()
	 * @generated
	 */
	EReference getRPG_AllClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link rpg.RPG#getRangeUnits <em>Range Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Range Units</em>'.
	 * @see rpg.RPG#getRangeUnits()
	 * @see #getRPG()
	 * @generated
	 */
	EReference getRPG_RangeUnits();

	/**
	 * Returns the meta object for class '{@link rpg.CharacterClass <em>Character Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Class</em>'.
	 * @see rpg.CharacterClass
	 * @generated
	 */
	EClass getCharacterClass();

	/**
	 * Returns the meta object for the attribute '{@link rpg.CharacterClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rpg.CharacterClass#getName()
	 * @see #getCharacterClass()
	 * @generated
	 */
	EAttribute getCharacterClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link rpg.CharacterClass#getLore <em>Lore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lore</em>'.
	 * @see rpg.CharacterClass#getLore()
	 * @see #getCharacterClass()
	 * @generated
	 */
	EAttribute getCharacterClass_Lore();

	/**
	 * Returns the meta object for the containment reference list '{@link rpg.CharacterClass#getStatistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statistics</em>'.
	 * @see rpg.CharacterClass#getStatistics()
	 * @see #getCharacterClass()
	 * @generated
	 */
	EReference getCharacterClass_Statistics();

	/**
	 * Returns the meta object for the attribute '{@link rpg.CharacterClass#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rpg.CharacterClass#getDescription()
	 * @see #getCharacterClass()
	 * @generated
	 */
	EAttribute getCharacterClass_Description();

	/**
	 * Returns the meta object for the reference list '{@link rpg.CharacterClass#getChildClasses <em>Child Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Classes</em>'.
	 * @see rpg.CharacterClass#getChildClasses()
	 * @see #getCharacterClass()
	 * @generated
	 */
	EReference getCharacterClass_ChildClasses();

	/**
	 * Returns the meta object for the reference list '{@link rpg.CharacterClass#getParentClasses <em>Parent Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Classes</em>'.
	 * @see rpg.CharacterClass#getParentClasses()
	 * @see #getCharacterClass()
	 * @generated
	 */
	EReference getCharacterClass_ParentClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link rpg.CharacterClass#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see rpg.CharacterClass#getBranches()
	 * @see #getCharacterClass()
	 * @generated
	 */
	EReference getCharacterClass_Branches();

	/**
	 * Returns the meta object for class '{@link rpg.CharacterStatistic <em>Character Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Statistic</em>'.
	 * @see rpg.CharacterStatistic
	 * @generated
	 */
	EClass getCharacterStatistic();

	/**
	 * Returns the meta object for the attribute '{@link rpg.CharacterStatistic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rpg.CharacterStatistic#getName()
	 * @see #getCharacterStatistic()
	 * @generated
	 */
	EAttribute getCharacterStatistic_Name();

	/**
	 * Returns the meta object for the attribute '{@link rpg.CharacterStatistic#getLore <em>Lore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lore</em>'.
	 * @see rpg.CharacterStatistic#getLore()
	 * @see #getCharacterStatistic()
	 * @generated
	 */
	EAttribute getCharacterStatistic_Lore();

	/**
	 * Returns the meta object for the attribute '{@link rpg.CharacterStatistic#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rpg.CharacterStatistic#getDescription()
	 * @see #getCharacterStatistic()
	 * @generated
	 */
	EAttribute getCharacterStatistic_Description();

	/**
	 * Returns the meta object for the attribute '{@link rpg.CharacterStatistic#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see rpg.CharacterStatistic#getTooltip()
	 * @see #getCharacterStatistic()
	 * @generated
	 */
	EAttribute getCharacterStatistic_Tooltip();

	/**
	 * Returns the meta object for the attribute '{@link rpg.CharacterStatistic#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see rpg.CharacterStatistic#getMinValue()
	 * @see #getCharacterStatistic()
	 * @generated
	 */
	EAttribute getCharacterStatistic_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link rpg.CharacterStatistic#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see rpg.CharacterStatistic#getMaxValue()
	 * @see #getCharacterStatistic()
	 * @generated
	 */
	EAttribute getCharacterStatistic_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link rpg.CharacterStatistic#getStartLimitValue <em>Start Limit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Limit Value</em>'.
	 * @see rpg.CharacterStatistic#getStartLimitValue()
	 * @see #getCharacterStatistic()
	 * @generated
	 */
	EAttribute getCharacterStatistic_StartLimitValue();

	/**
	 * Returns the meta object for the attribute '{@link rpg.CharacterStatistic#getStatType <em>Stat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stat Type</em>'.
	 * @see rpg.CharacterStatistic#getStatType()
	 * @see #getCharacterStatistic()
	 * @generated
	 */
	EAttribute getCharacterStatistic_StatType();

	/**
	 * Returns the meta object for the attribute '{@link rpg.CharacterStatistic#isIsTargetable <em>Is Targetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Targetable</em>'.
	 * @see rpg.CharacterStatistic#isIsTargetable()
	 * @see #getCharacterStatistic()
	 * @generated
	 */
	EAttribute getCharacterStatistic_IsTargetable();

	/**
	 * Returns the meta object for class '{@link rpg.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see rpg.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Branch#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rpg.Branch#getName()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Name();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Branch#getLore <em>Lore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lore</em>'.
	 * @see rpg.Branch#getLore()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Lore();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Branch#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rpg.Branch#getDescription()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Description();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Branch#getBranchType <em>Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch Type</em>'.
	 * @see rpg.Branch#getBranchType()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_BranchType();

	/**
	 * Returns the meta object for the reference list '{@link rpg.Branch#getStartNodes <em>Start Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Start Nodes</em>'.
	 * @see rpg.Branch#getStartNodes()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_StartNodes();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Branch#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see rpg.Branch#getTooltip()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Tooltip();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Branch#isIsInheritable <em>Is Inheritable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Inheritable</em>'.
	 * @see rpg.Branch#isIsInheritable()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_IsInheritable();

	/**
	 * Returns the meta object for the containment reference list '{@link rpg.Branch#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see rpg.Branch#getNodes()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Nodes();

	/**
	 * Returns the meta object for class '{@link rpg.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see rpg.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rpg.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Node#getLore <em>Lore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lore</em>'.
	 * @see rpg.Node#getLore()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Lore();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Node#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see rpg.Node#getTooltip()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Tooltip();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Node#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rpg.Node#getDescription()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Description();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Node#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type</em>'.
	 * @see rpg.Node#getNodeType()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_NodeType();

	/**
	 * Returns the meta object for the reference list '{@link rpg.Node#getChildNodes <em>Child Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Nodes</em>'.
	 * @see rpg.Node#getChildNodes()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ChildNodes();

	/**
	 * Returns the meta object for the reference '{@link rpg.Node#getParentNodes <em>Parent Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Nodes</em>'.
	 * @see rpg.Node#getParentNodes()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ParentNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link rpg.Node#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activation</em>'.
	 * @see rpg.Node#getActivation()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Activation();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Node#getMinActivationLevel <em>Min Activation Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Activation Level</em>'.
	 * @see rpg.Node#getMinActivationLevel()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_MinActivationLevel();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Node#getMaxActivationLevel <em>Max Activation Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Activation Level</em>'.
	 * @see rpg.Node#getMaxActivationLevel()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_MaxActivationLevel();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Node#getActivationLevel <em>Activation Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Level</em>'.
	 * @see rpg.Node#getActivationLevel()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_ActivationLevel();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Node#isIsActivated <em>Is Activated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Activated</em>'.
	 * @see rpg.Node#isIsActivated()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_IsActivated();

	/**
	 * Returns the meta object for the containment reference list '{@link rpg.Node#getAbilities <em>Abilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abilities</em>'.
	 * @see rpg.Node#getAbilities()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Abilities();

	/**
	 * Returns the meta object for the containment reference '{@link rpg.Node#getTalents <em>Talents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Talents</em>'.
	 * @see rpg.Node#getTalents()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Talents();

	/**
	 * Returns the meta object for class '{@link rpg.NodeActivation <em>Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Activation</em>'.
	 * @see rpg.NodeActivation
	 * @generated
	 */
	EClass getNodeActivation();

	/**
	 * Returns the meta object for the attribute '{@link rpg.NodeActivation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see rpg.NodeActivation#getText()
	 * @see #getNodeActivation()
	 * @generated
	 */
	EAttribute getNodeActivation_Text();

	/**
	 * Returns the meta object for the attribute '{@link rpg.NodeActivation#isIsAuto <em>Is Auto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Auto</em>'.
	 * @see rpg.NodeActivation#isIsAuto()
	 * @see #getNodeActivation()
	 * @generated
	 */
	EAttribute getNodeActivation_IsAuto();

	/**
	 * Returns the meta object for the attribute '{@link rpg.NodeActivation#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see rpg.NodeActivation#getLevel()
	 * @see #getNodeActivation()
	 * @generated
	 */
	EAttribute getNodeActivation_Level();

	/**
	 * Returns the meta object for class '{@link rpg.NodeActivationBuy <em>Node Activation Buy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Activation Buy</em>'.
	 * @see rpg.NodeActivationBuy
	 * @generated
	 */
	EClass getNodeActivationBuy();

	/**
	 * Returns the meta object for the containment reference list '{@link rpg.NodeActivationBuy#getCosts <em>Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Costs</em>'.
	 * @see rpg.NodeActivationBuy#getCosts()
	 * @see #getNodeActivationBuy()
	 * @generated
	 */
	EReference getNodeActivationBuy_Costs();

	/**
	 * Returns the meta object for class '{@link rpg.NodeActivationPropagate <em>Node Activation Propagate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Activation Propagate</em>'.
	 * @see rpg.NodeActivationPropagate
	 * @generated
	 */
	EClass getNodeActivationPropagate();

	/**
	 * Returns the meta object for the reference '{@link rpg.NodeActivationPropagate#getFollowsActivationOf <em>Follows Activation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Follows Activation Of</em>'.
	 * @see rpg.NodeActivationPropagate#getFollowsActivationOf()
	 * @see #getNodeActivationPropagate()
	 * @generated
	 */
	EReference getNodeActivationPropagate_FollowsActivationOf();

	/**
	 * Returns the meta object for the attribute '{@link rpg.NodeActivationPropagate#getRequiredLevel <em>Required Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Level</em>'.
	 * @see rpg.NodeActivationPropagate#getRequiredLevel()
	 * @see #getNodeActivationPropagate()
	 * @generated
	 */
	EAttribute getNodeActivationPropagate_RequiredLevel();

	/**
	 * Returns the meta object for class '{@link rpg.ActivationCost <em>Activation Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Cost</em>'.
	 * @see rpg.ActivationCost
	 * @generated
	 */
	EClass getActivationCost();

	/**
	 * Returns the meta object for the attribute '{@link rpg.ActivationCost#isConsume <em>Consume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consume</em>'.
	 * @see rpg.ActivationCost#isConsume()
	 * @see #getActivationCost()
	 * @generated
	 */
	EAttribute getActivationCost_Consume();

	/**
	 * Returns the meta object for the attribute '{@link rpg.ActivationCost#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see rpg.ActivationCost#getCost()
	 * @see #getActivationCost()
	 * @generated
	 */
	EAttribute getActivationCost_Cost();

	/**
	 * Returns the meta object for the reference '{@link rpg.ActivationCost#getStatistic <em>Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statistic</em>'.
	 * @see rpg.ActivationCost#getStatistic()
	 * @see #getActivationCost()
	 * @generated
	 */
	EReference getActivationCost_Statistic();

	/**
	 * Returns the meta object for class '{@link rpg.RangeUnit <em>Range Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Unit</em>'.
	 * @see rpg.RangeUnit
	 * @generated
	 */
	EClass getRangeUnit();

	/**
	 * Returns the meta object for the attribute '{@link rpg.RangeUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rpg.RangeUnit#getName()
	 * @see #getRangeUnit()
	 * @generated
	 */
	EAttribute getRangeUnit_Name();

	/**
	 * Returns the meta object for the attribute '{@link rpg.RangeUnit#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rpg.RangeUnit#getDescription()
	 * @see #getRangeUnit()
	 * @generated
	 */
	EAttribute getRangeUnit_Description();

	/**
	 * Returns the meta object for class '{@link rpg.Ability <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ability</em>'.
	 * @see rpg.Ability
	 * @generated
	 */
	EClass getAbility();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Ability#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rpg.Ability#getName()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_Name();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Ability#getLore <em>Lore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lore</em>'.
	 * @see rpg.Ability#getLore()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_Lore();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Ability#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see rpg.Ability#getTooltip()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_Tooltip();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Ability#getCastType <em>Cast Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cast Type</em>'.
	 * @see rpg.Ability#getCastType()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_CastType();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Ability#getAbilityType <em>Ability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ability Type</em>'.
	 * @see rpg.Ability#getAbilityType()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_AbilityType();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Ability#getCastTime <em>Cast Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cast Time</em>'.
	 * @see rpg.Ability#getCastTime()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_CastTime();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Ability#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see rpg.Ability#getRange()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_Range();

	/**
	 * Returns the meta object for the reference '{@link rpg.Ability#getRangeUnit <em>Range Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range Unit</em>'.
	 * @see rpg.Ability#getRangeUnit()
	 * @see #getAbility()
	 * @generated
	 */
	EReference getAbility_RangeUnit();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Ability#getOnLevel <em>On Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Level</em>'.
	 * @see rpg.Ability#getOnLevel()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_OnLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link rpg.Ability#getEffects <em>Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effects</em>'.
	 * @see rpg.Ability#getEffects()
	 * @see #getAbility()
	 * @generated
	 */
	EReference getAbility_Effects();

	/**
	 * Returns the meta object for the containment reference list '{@link rpg.Ability#getCosts <em>Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Costs</em>'.
	 * @see rpg.Ability#getCosts()
	 * @see #getAbility()
	 * @generated
	 */
	EReference getAbility_Costs();

	/**
	 * Returns the meta object for class '{@link rpg.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect</em>'.
	 * @see rpg.Effect
	 * @generated
	 */
	EClass getEffect();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Effect#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rpg.Effect#getName()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Name();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Effect#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see rpg.Effect#getTooltip()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Tooltip();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Effect#getEffectType <em>Effect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect Type</em>'.
	 * @see rpg.Effect#getEffectType()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_EffectType();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Effect#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Type</em>'.
	 * @see rpg.Effect#getTargetType()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_TargetType();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Effect#getOnLevel <em>On Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Level</em>'.
	 * @see rpg.Effect#getOnLevel()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_OnLevel();

	/**
	 * Returns the meta object for the reference '{@link rpg.Effect#getInstantiate <em>Instantiate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiate</em>'.
	 * @see rpg.Effect#getInstantiate()
	 * @see #getEffect()
	 * @generated
	 */
	EReference getEffect_Instantiate();

	/**
	 * Returns the meta object for the containment reference list '{@link rpg.Effect#getStatChange <em>Stat Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stat Change</em>'.
	 * @see rpg.Effect#getStatChange()
	 * @see #getEffect()
	 * @generated
	 */
	EReference getEffect_StatChange();

	/**
	 * Returns the meta object for class '{@link rpg.StatChange <em>Stat Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stat Change</em>'.
	 * @see rpg.StatChange
	 * @generated
	 */
	EClass getStatChange();

	/**
	 * Returns the meta object for the attribute '{@link rpg.StatChange#getChangeType <em>Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Type</em>'.
	 * @see rpg.StatChange#getChangeType()
	 * @see #getStatChange()
	 * @generated
	 */
	EAttribute getStatChange_ChangeType();

	/**
	 * Returns the meta object for the attribute '{@link rpg.StatChange#getTickType <em>Tick Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tick Type</em>'.
	 * @see rpg.StatChange#getTickType()
	 * @see #getStatChange()
	 * @generated
	 */
	EAttribute getStatChange_TickType();

	/**
	 * Returns the meta object for the attribute '{@link rpg.StatChange#getBaseValue <em>Base Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Value</em>'.
	 * @see rpg.StatChange#getBaseValue()
	 * @see #getStatChange()
	 * @generated
	 */
	EAttribute getStatChange_BaseValue();

	/**
	 * Returns the meta object for the attribute '{@link rpg.StatChange#getTickValue <em>Tick Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tick Value</em>'.
	 * @see rpg.StatChange#getTickValue()
	 * @see #getStatChange()
	 * @generated
	 */
	EAttribute getStatChange_TickValue();

	/**
	 * Returns the meta object for the reference '{@link rpg.StatChange#getChangesStatistic <em>Changes Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Changes Statistic</em>'.
	 * @see rpg.StatChange#getChangesStatistic()
	 * @see #getStatChange()
	 * @generated
	 */
	EReference getStatChange_ChangesStatistic();

	/**
	 * Returns the meta object for the containment reference list '{@link rpg.StatChange#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifiers</em>'.
	 * @see rpg.StatChange#getModifiers()
	 * @see #getStatChange()
	 * @generated
	 */
	EReference getStatChange_Modifiers();

	/**
	 * Returns the meta object for class '{@link rpg.Modifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier</em>'.
	 * @see rpg.Modifier
	 * @generated
	 */
	EClass getModifier();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Modifier#getChangeType <em>Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Type</em>'.
	 * @see rpg.Modifier#getChangeType()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_ChangeType();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Modifier#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see rpg.Modifier#getValue()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Value();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Modifier#getBasedOnModifier <em>Based On Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Based On Modifier</em>'.
	 * @see rpg.Modifier#getBasedOnModifier()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_BasedOnModifier();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Modifier#getPriorityOrder <em>Priority Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority Order</em>'.
	 * @see rpg.Modifier#getPriorityOrder()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_PriorityOrder();

	/**
	 * Returns the meta object for the reference '{@link rpg.Modifier#getBasedOn <em>Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Based On</em>'.
	 * @see rpg.Modifier#getBasedOn()
	 * @see #getModifier()
	 * @generated
	 */
	EReference getModifier_BasedOn();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Modifier#getBasedOnValue <em>Based On Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Based On Value</em>'.
	 * @see rpg.Modifier#getBasedOnValue()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_BasedOnValue();

	/**
	 * Returns the meta object for class '{@link rpg.Talent <em>Talent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Talent</em>'.
	 * @see rpg.Talent
	 * @generated
	 */
	EClass getTalent();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Talent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rpg.Talent#getName()
	 * @see #getTalent()
	 * @generated
	 */
	EAttribute getTalent_Name();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Talent#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see rpg.Talent#getTooltip()
	 * @see #getTalent()
	 * @generated
	 */
	EAttribute getTalent_Tooltip();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Talent#getLore <em>Lore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lore</em>'.
	 * @see rpg.Talent#getLore()
	 * @see #getTalent()
	 * @generated
	 */
	EAttribute getTalent_Lore();

	/**
	 * Returns the meta object for the attribute '{@link rpg.Talent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rpg.Talent#getDescription()
	 * @see #getTalent()
	 * @generated
	 */
	EAttribute getTalent_Description();

	/**
	 * Returns the meta object for class '{@link rpg.AbilityCost <em>Ability Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ability Cost</em>'.
	 * @see rpg.AbilityCost
	 * @generated
	 */
	EClass getAbilityCost();

	/**
	 * Returns the meta object for the attribute '{@link rpg.AbilityCost#isConsume <em>Consume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consume</em>'.
	 * @see rpg.AbilityCost#isConsume()
	 * @see #getAbilityCost()
	 * @generated
	 */
	EAttribute getAbilityCost_Consume();

	/**
	 * Returns the meta object for the attribute '{@link rpg.AbilityCost#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see rpg.AbilityCost#getCost()
	 * @see #getAbilityCost()
	 * @generated
	 */
	EAttribute getAbilityCost_Cost();

	/**
	 * Returns the meta object for the reference '{@link rpg.AbilityCost#getStatistic <em>Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statistic</em>'.
	 * @see rpg.AbilityCost#getStatistic()
	 * @see #getAbilityCost()
	 * @generated
	 */
	EReference getAbilityCost_Statistic();

	/**
	 * Returns the meta object for enum '{@link rpg.StatType <em>Stat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stat Type</em>'.
	 * @see rpg.StatType
	 * @generated
	 */
	EEnum getStatType();

	/**
	 * Returns the meta object for enum '{@link rpg.BranchType <em>Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Branch Type</em>'.
	 * @see rpg.BranchType
	 * @generated
	 */
	EEnum getBranchType();

	/**
	 * Returns the meta object for enum '{@link rpg.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type</em>'.
	 * @see rpg.NodeType
	 * @generated
	 */
	EEnum getNodeType();

	/**
	 * Returns the meta object for enum '{@link rpg.CastType <em>Cast Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cast Type</em>'.
	 * @see rpg.CastType
	 * @generated
	 */
	EEnum getCastType();

	/**
	 * Returns the meta object for enum '{@link rpg.AbilityType <em>Ability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ability Type</em>'.
	 * @see rpg.AbilityType
	 * @generated
	 */
	EEnum getAbilityType();

	/**
	 * Returns the meta object for enum '{@link rpg.TargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Target Type</em>'.
	 * @see rpg.TargetType
	 * @generated
	 */
	EEnum getTargetType();

	/**
	 * Returns the meta object for enum '{@link rpg.EffectType <em>Effect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Effect Type</em>'.
	 * @see rpg.EffectType
	 * @generated
	 */
	EEnum getEffectType();

	/**
	 * Returns the meta object for enum '{@link rpg.ChangeType <em>Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Change Type</em>'.
	 * @see rpg.ChangeType
	 * @generated
	 */
	EEnum getChangeType();

	/**
	 * Returns the meta object for enum '{@link rpg.TickType <em>Tick Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tick Type</em>'.
	 * @see rpg.TickType
	 * @generated
	 */
	EEnum getTickType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RpgFactory getRpgFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rpg.impl.RPGImpl <em>RPG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.impl.RPGImpl
		 * @see rpg.impl.RpgPackageImpl#getRPG()
		 * @generated
		 */
		EClass RPG = eINSTANCE.getRPG();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RPG__NAME = eINSTANCE.getRPG_Name();

		/**
		 * The meta object literal for the '<em><b>Lore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RPG__LORE = eINSTANCE.getRPG_Lore();

		/**
		 * The meta object literal for the '<em><b>All Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPG__ALL_CLASSES = eINSTANCE.getRPG_AllClasses();

		/**
		 * The meta object literal for the '<em><b>Range Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPG__RANGE_UNITS = eINSTANCE.getRPG_RangeUnits();

		/**
		 * The meta object literal for the '{@link rpg.impl.CharacterClassImpl <em>Character Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.impl.CharacterClassImpl
		 * @see rpg.impl.RpgPackageImpl#getCharacterClass()
		 * @generated
		 */
		EClass CHARACTER_CLASS = eINSTANCE.getCharacterClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_CLASS__NAME = eINSTANCE.getCharacterClass_Name();

		/**
		 * The meta object literal for the '<em><b>Lore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_CLASS__LORE = eINSTANCE.getCharacterClass_Lore();

		/**
		 * The meta object literal for the '<em><b>Statistics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTER_CLASS__STATISTICS = eINSTANCE.getCharacterClass_Statistics();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_CLASS__DESCRIPTION = eINSTANCE.getCharacterClass_Description();

		/**
		 * The meta object literal for the '<em><b>Child Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTER_CLASS__CHILD_CLASSES = eINSTANCE.getCharacterClass_ChildClasses();

		/**
		 * The meta object literal for the '<em><b>Parent Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTER_CLASS__PARENT_CLASSES = eINSTANCE.getCharacterClass_ParentClasses();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTER_CLASS__BRANCHES = eINSTANCE.getCharacterClass_Branches();

		/**
		 * The meta object literal for the '{@link rpg.impl.CharacterStatisticImpl <em>Character Statistic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.impl.CharacterStatisticImpl
		 * @see rpg.impl.RpgPackageImpl#getCharacterStatistic()
		 * @generated
		 */
		EClass CHARACTER_STATISTIC = eINSTANCE.getCharacterStatistic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_STATISTIC__NAME = eINSTANCE.getCharacterStatistic_Name();

		/**
		 * The meta object literal for the '<em><b>Lore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_STATISTIC__LORE = eINSTANCE.getCharacterStatistic_Lore();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_STATISTIC__DESCRIPTION = eINSTANCE.getCharacterStatistic_Description();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_STATISTIC__TOOLTIP = eINSTANCE.getCharacterStatistic_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_STATISTIC__MIN_VALUE = eINSTANCE.getCharacterStatistic_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_STATISTIC__MAX_VALUE = eINSTANCE.getCharacterStatistic_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Start Limit Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_STATISTIC__START_LIMIT_VALUE = eINSTANCE.getCharacterStatistic_StartLimitValue();

		/**
		 * The meta object literal for the '<em><b>Stat Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_STATISTIC__STAT_TYPE = eINSTANCE.getCharacterStatistic_StatType();

		/**
		 * The meta object literal for the '<em><b>Is Targetable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_STATISTIC__IS_TARGETABLE = eINSTANCE.getCharacterStatistic_IsTargetable();

		/**
		 * The meta object literal for the '{@link rpg.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.impl.BranchImpl
		 * @see rpg.impl.RpgPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__NAME = eINSTANCE.getBranch_Name();

		/**
		 * The meta object literal for the '<em><b>Lore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__LORE = eINSTANCE.getBranch_Lore();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__DESCRIPTION = eINSTANCE.getBranch_Description();

		/**
		 * The meta object literal for the '<em><b>Branch Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__BRANCH_TYPE = eINSTANCE.getBranch_BranchType();

		/**
		 * The meta object literal for the '<em><b>Start Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__START_NODES = eINSTANCE.getBranch_StartNodes();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__TOOLTIP = eINSTANCE.getBranch_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Is Inheritable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__IS_INHERITABLE = eINSTANCE.getBranch_IsInheritable();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__NODES = eINSTANCE.getBranch_Nodes();

		/**
		 * The meta object literal for the '{@link rpg.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.impl.NodeImpl
		 * @see rpg.impl.RpgPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Lore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__LORE = eINSTANCE.getNode_Lore();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__TOOLTIP = eINSTANCE.getNode_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__DESCRIPTION = eINSTANCE.getNode_Description();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NODE_TYPE = eINSTANCE.getNode_NodeType();

		/**
		 * The meta object literal for the '<em><b>Child Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CHILD_NODES = eINSTANCE.getNode_ChildNodes();

		/**
		 * The meta object literal for the '<em><b>Parent Nodes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PARENT_NODES = eINSTANCE.getNode_ParentNodes();

		/**
		 * The meta object literal for the '<em><b>Activation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ACTIVATION = eINSTANCE.getNode_Activation();

		/**
		 * The meta object literal for the '<em><b>Min Activation Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__MIN_ACTIVATION_LEVEL = eINSTANCE.getNode_MinActivationLevel();

		/**
		 * The meta object literal for the '<em><b>Max Activation Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__MAX_ACTIVATION_LEVEL = eINSTANCE.getNode_MaxActivationLevel();

		/**
		 * The meta object literal for the '<em><b>Activation Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ACTIVATION_LEVEL = eINSTANCE.getNode_ActivationLevel();

		/**
		 * The meta object literal for the '<em><b>Is Activated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__IS_ACTIVATED = eINSTANCE.getNode_IsActivated();

		/**
		 * The meta object literal for the '<em><b>Abilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ABILITIES = eINSTANCE.getNode_Abilities();

		/**
		 * The meta object literal for the '<em><b>Talents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__TALENTS = eINSTANCE.getNode_Talents();

		/**
		 * The meta object literal for the '{@link rpg.impl.NodeActivationImpl <em>Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.impl.NodeActivationImpl
		 * @see rpg.impl.RpgPackageImpl#getNodeActivation()
		 * @generated
		 */
		EClass NODE_ACTIVATION = eINSTANCE.getNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ACTIVATION__TEXT = eINSTANCE.getNodeActivation_Text();

		/**
		 * The meta object literal for the '<em><b>Is Auto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ACTIVATION__IS_AUTO = eINSTANCE.getNodeActivation_IsAuto();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ACTIVATION__LEVEL = eINSTANCE.getNodeActivation_Level();

		/**
		 * The meta object literal for the '{@link rpg.impl.NodeActivationBuyImpl <em>Node Activation Buy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.impl.NodeActivationBuyImpl
		 * @see rpg.impl.RpgPackageImpl#getNodeActivationBuy()
		 * @generated
		 */
		EClass NODE_ACTIVATION_BUY = eINSTANCE.getNodeActivationBuy();

		/**
		 * The meta object literal for the '<em><b>Costs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ACTIVATION_BUY__COSTS = eINSTANCE.getNodeActivationBuy_Costs();

		/**
		 * The meta object literal for the '{@link rpg.impl.NodeActivationPropagateImpl <em>Node Activation Propagate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.impl.NodeActivationPropagateImpl
		 * @see rpg.impl.RpgPackageImpl#getNodeActivationPropagate()
		 * @generated
		 */
		EClass NODE_ACTIVATION_PROPAGATE = eINSTANCE.getNodeActivationPropagate();

		/**
		 * The meta object literal for the '<em><b>Follows Activation Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ACTIVATION_PROPAGATE__FOLLOWS_ACTIVATION_OF = eINSTANCE.getNodeActivationPropagate_FollowsActivationOf();

		/**
		 * The meta object literal for the '<em><b>Required Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ACTIVATION_PROPAGATE__REQUIRED_LEVEL = eINSTANCE.getNodeActivationPropagate_RequiredLevel();

		/**
		 * The meta object literal for the '{@link rpg.impl.ActivationCostImpl <em>Activation Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.impl.ActivationCostImpl
		 * @see rpg.impl.RpgPackageImpl#getActivationCost()
		 * @generated
		 */
		EClass ACTIVATION_COST = eINSTANCE.getActivationCost();

		/**
		 * The meta object literal for the '<em><b>Consume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_COST__CONSUME = eINSTANCE.getActivationCost_Consume();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_COST__COST = eINSTANCE.getActivationCost_Cost();

		/**
		 * The meta object literal for the '<em><b>Statistic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION_COST__STATISTIC = eINSTANCE.getActivationCost_Statistic();

		/**
		 * The meta object literal for the '{@link rpg.impl.RangeUnitImpl <em>Range Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.impl.RangeUnitImpl
		 * @see rpg.impl.RpgPackageImpl#getRangeUnit()
		 * @generated
		 */
		EClass RANGE_UNIT = eINSTANCE.getRangeUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_UNIT__NAME = eINSTANCE.getRangeUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_UNIT__DESCRIPTION = eINSTANCE.getRangeUnit_Description();

		/**
		 * The meta object literal for the '{@link rpg.impl.AbilityImpl <em>Ability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.impl.AbilityImpl
		 * @see rpg.impl.RpgPackageImpl#getAbility()
		 * @generated
		 */
		EClass ABILITY = eINSTANCE.getAbility();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__NAME = eINSTANCE.getAbility_Name();

		/**
		 * The meta object literal for the '<em><b>Lore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__LORE = eINSTANCE.getAbility_Lore();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__TOOLTIP = eINSTANCE.getAbility_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Cast Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__CAST_TYPE = eINSTANCE.getAbility_CastType();

		/**
		 * The meta object literal for the '<em><b>Ability Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__ABILITY_TYPE = eINSTANCE.getAbility_AbilityType();

		/**
		 * The meta object literal for the '<em><b>Cast Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__CAST_TIME = eINSTANCE.getAbility_CastTime();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__RANGE = eINSTANCE.getAbility_Range();

		/**
		 * The meta object literal for the '<em><b>Range Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABILITY__RANGE_UNIT = eINSTANCE.getAbility_RangeUnit();

		/**
		 * The meta object literal for the '<em><b>On Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__ON_LEVEL = eINSTANCE.getAbility_OnLevel();

		/**
		 * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABILITY__EFFECTS = eINSTANCE.getAbility_Effects();

		/**
		 * The meta object literal for the '<em><b>Costs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABILITY__COSTS = eINSTANCE.getAbility_Costs();

		/**
		 * The meta object literal for the '{@link rpg.impl.EffectImpl <em>Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.impl.EffectImpl
		 * @see rpg.impl.RpgPackageImpl#getEffect()
		 * @generated
		 */
		EClass EFFECT = eINSTANCE.getEffect();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__NAME = eINSTANCE.getEffect_Name();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__TOOLTIP = eINSTANCE.getEffect_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Effect Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__EFFECT_TYPE = eINSTANCE.getEffect_EffectType();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__TARGET_TYPE = eINSTANCE.getEffect_TargetType();

		/**
		 * The meta object literal for the '<em><b>On Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__ON_LEVEL = eINSTANCE.getEffect_OnLevel();

		/**
		 * The meta object literal for the '<em><b>Instantiate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT__INSTANTIATE = eINSTANCE.getEffect_Instantiate();

		/**
		 * The meta object literal for the '<em><b>Stat Change</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT__STAT_CHANGE = eINSTANCE.getEffect_StatChange();

		/**
		 * The meta object literal for the '{@link rpg.impl.StatChangeImpl <em>Stat Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.impl.StatChangeImpl
		 * @see rpg.impl.RpgPackageImpl#getStatChange()
		 * @generated
		 */
		EClass STAT_CHANGE = eINSTANCE.getStatChange();

		/**
		 * The meta object literal for the '<em><b>Change Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAT_CHANGE__CHANGE_TYPE = eINSTANCE.getStatChange_ChangeType();

		/**
		 * The meta object literal for the '<em><b>Tick Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAT_CHANGE__TICK_TYPE = eINSTANCE.getStatChange_TickType();

		/**
		 * The meta object literal for the '<em><b>Base Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAT_CHANGE__BASE_VALUE = eINSTANCE.getStatChange_BaseValue();

		/**
		 * The meta object literal for the '<em><b>Tick Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAT_CHANGE__TICK_VALUE = eINSTANCE.getStatChange_TickValue();

		/**
		 * The meta object literal for the '<em><b>Changes Statistic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAT_CHANGE__CHANGES_STATISTIC = eINSTANCE.getStatChange_ChangesStatistic();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAT_CHANGE__MODIFIERS = eINSTANCE.getStatChange_Modifiers();

		/**
		 * The meta object literal for the '{@link rpg.impl.ModifierImpl <em>Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.impl.ModifierImpl
		 * @see rpg.impl.RpgPackageImpl#getModifier()
		 * @generated
		 */
		EClass MODIFIER = eINSTANCE.getModifier();

		/**
		 * The meta object literal for the '<em><b>Change Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER__CHANGE_TYPE = eINSTANCE.getModifier_ChangeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER__VALUE = eINSTANCE.getModifier_Value();

		/**
		 * The meta object literal for the '<em><b>Based On Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER__BASED_ON_MODIFIER = eINSTANCE.getModifier_BasedOnModifier();

		/**
		 * The meta object literal for the '<em><b>Priority Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER__PRIORITY_ORDER = eINSTANCE.getModifier_PriorityOrder();

		/**
		 * The meta object literal for the '<em><b>Based On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER__BASED_ON = eINSTANCE.getModifier_BasedOn();

		/**
		 * The meta object literal for the '<em><b>Based On Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER__BASED_ON_VALUE = eINSTANCE.getModifier_BasedOnValue();

		/**
		 * The meta object literal for the '{@link rpg.impl.TalentImpl <em>Talent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.impl.TalentImpl
		 * @see rpg.impl.RpgPackageImpl#getTalent()
		 * @generated
		 */
		EClass TALENT = eINSTANCE.getTalent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TALENT__NAME = eINSTANCE.getTalent_Name();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TALENT__TOOLTIP = eINSTANCE.getTalent_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Lore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TALENT__LORE = eINSTANCE.getTalent_Lore();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TALENT__DESCRIPTION = eINSTANCE.getTalent_Description();

		/**
		 * The meta object literal for the '{@link rpg.impl.AbilityCostImpl <em>Ability Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.impl.AbilityCostImpl
		 * @see rpg.impl.RpgPackageImpl#getAbilityCost()
		 * @generated
		 */
		EClass ABILITY_COST = eINSTANCE.getAbilityCost();

		/**
		 * The meta object literal for the '<em><b>Consume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY_COST__CONSUME = eINSTANCE.getAbilityCost_Consume();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY_COST__COST = eINSTANCE.getAbilityCost_Cost();

		/**
		 * The meta object literal for the '<em><b>Statistic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABILITY_COST__STATISTIC = eINSTANCE.getAbilityCost_Statistic();

		/**
		 * The meta object literal for the '{@link rpg.StatType <em>Stat Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.StatType
		 * @see rpg.impl.RpgPackageImpl#getStatType()
		 * @generated
		 */
		EEnum STAT_TYPE = eINSTANCE.getStatType();

		/**
		 * The meta object literal for the '{@link rpg.BranchType <em>Branch Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.BranchType
		 * @see rpg.impl.RpgPackageImpl#getBranchType()
		 * @generated
		 */
		EEnum BRANCH_TYPE = eINSTANCE.getBranchType();

		/**
		 * The meta object literal for the '{@link rpg.NodeType <em>Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.NodeType
		 * @see rpg.impl.RpgPackageImpl#getNodeType()
		 * @generated
		 */
		EEnum NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '{@link rpg.CastType <em>Cast Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.CastType
		 * @see rpg.impl.RpgPackageImpl#getCastType()
		 * @generated
		 */
		EEnum CAST_TYPE = eINSTANCE.getCastType();

		/**
		 * The meta object literal for the '{@link rpg.AbilityType <em>Ability Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.AbilityType
		 * @see rpg.impl.RpgPackageImpl#getAbilityType()
		 * @generated
		 */
		EEnum ABILITY_TYPE = eINSTANCE.getAbilityType();

		/**
		 * The meta object literal for the '{@link rpg.TargetType <em>Target Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.TargetType
		 * @see rpg.impl.RpgPackageImpl#getTargetType()
		 * @generated
		 */
		EEnum TARGET_TYPE = eINSTANCE.getTargetType();

		/**
		 * The meta object literal for the '{@link rpg.EffectType <em>Effect Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.EffectType
		 * @see rpg.impl.RpgPackageImpl#getEffectType()
		 * @generated
		 */
		EEnum EFFECT_TYPE = eINSTANCE.getEffectType();

		/**
		 * The meta object literal for the '{@link rpg.ChangeType <em>Change Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.ChangeType
		 * @see rpg.impl.RpgPackageImpl#getChangeType()
		 * @generated
		 */
		EEnum CHANGE_TYPE = eINSTANCE.getChangeType();

		/**
		 * The meta object literal for the '{@link rpg.TickType <em>Tick Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rpg.TickType
		 * @see rpg.impl.RpgPackageImpl#getTickType()
		 * @generated
		 */
		EEnum TICK_TYPE = eINSTANCE.getTickType();

	}

} //RpgPackage
