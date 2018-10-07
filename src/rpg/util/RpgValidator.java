/**
 */
package rpg.util;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import rpg.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see rpg.RpgPackage
 * @generated
 */
public class RpgValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RpgValidator INSTANCE = new RpgValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "rpg";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RpgValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return RpgPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case RpgPackage.RPG:
				return validateRPG((RPG)value, diagnostics, context);
			case RpgPackage.CHARACTER_CLASS:
				return validateCharacterClass((CharacterClass)value, diagnostics, context);
			case RpgPackage.CHARACTER_STATISTIC:
				return validateCharacterStatistic((CharacterStatistic)value, diagnostics, context);
			case RpgPackage.BRANCH:
				return validateBranch((Branch)value, diagnostics, context);
			case RpgPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case RpgPackage.NODE_ACTIVATION:
				return validateNodeActivation((NodeActivation)value, diagnostics, context);
			case RpgPackage.ACTIVATION_COST:
				return validateActivationCost((ActivationCost)value, diagnostics, context);
			case RpgPackage.RANGE_UNIT:
				return validateRangeUnit((RangeUnit)value, diagnostics, context);
			case RpgPackage.ABILITY:
				return validateAbility((Ability)value, diagnostics, context);
			case RpgPackage.EFFECT:
				return validateEffect((Effect)value, diagnostics, context);
			case RpgPackage.STAT_CHANGE:
				return validateStatChange((StatChange)value, diagnostics, context);
			case RpgPackage.MODIFIER:
				return validateModifier((Modifier)value, diagnostics, context);
			case RpgPackage.TALENT:
				return validateTalent((Talent)value, diagnostics, context);
			case RpgPackage.PROPAGATION_REQUIREMENT:
				return validatePropagationRequirement((PropagationRequirement)value, diagnostics, context);
			case RpgPackage.RANDOMIZER:
				return validateRandomizer((Randomizer)value, diagnostics, context);
			case RpgPackage.STAT_TALENT:
				return validateStatTalent((StatTalent)value, diagnostics, context);
			case RpgPackage.TICK:
				return validateTick((Tick)value, diagnostics, context);
			case RpgPackage.COOLDOWN_CHANGE:
				return validateCooldownChange((CooldownChange)value, diagnostics, context);
			case RpgPackage.CHANGE:
				return validateChange((Change)value, diagnostics, context);
			case RpgPackage.UNLOCK_TALENT:
				return validateUnlockTalent((UnlockTalent)value, diagnostics, context);
			case RpgPackage.UNLOCK_ABILITY:
				return validateUnlockAbility((UnlockAbility)value, diagnostics, context);
			case RpgPackage.UNLOCK_EFFECT:
				return validateUnlockEffect((UnlockEffect)value, diagnostics, context);
			case RpgPackage.UNLOCK_CHANGE:
				return validateUnlockChange((UnlockChange)value, diagnostics, context);
			case RpgPackage.COOLDOWN_TALENT:
				return validateCooldownTalent((CooldownTalent)value, diagnostics, context);
			case RpgPackage.UNLOCK_MODIFIER:
				return validateUnlockModifier((UnlockModifier)value, diagnostics, context);
			case RpgPackage.STAT_TYPE:
				return validateStatType((StatType)value, diagnostics, context);
			case RpgPackage.BRANCH_TYPE:
				return validateBranchType((BranchType)value, diagnostics, context);
			case RpgPackage.NODE_TYPE:
				return validateNodeType((NodeType)value, diagnostics, context);
			case RpgPackage.CAST_TYPE:
				return validateCastType((CastType)value, diagnostics, context);
			case RpgPackage.ABILITY_TYPE:
				return validateAbilityType((AbilityType)value, diagnostics, context);
			case RpgPackage.TARGET_TYPE:
				return validateTargetType((TargetType)value, diagnostics, context);
			case RpgPackage.EFFECT_TYPE:
				return validateEffectType((EffectType)value, diagnostics, context);
			case RpgPackage.CHANGE_TYPE:
				return validateChangeType((ChangeType)value, diagnostics, context);
			case RpgPackage.TICK_TYPE:
				return validateTickType((TickType)value, diagnostics, context);
			case RpgPackage.CHANGE_VALUE_TYPE:
				return validateChangeValueType((ChangeValueType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRPG(RPG rpg, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(rpg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rpg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rpg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rpg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rpg, diagnostics, context);
		if (result || diagnostics != null) result &= validateRPG_ClassyGame(rpg, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ClassyGame constraint of '<em>RPG</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRPG_ClassyGame(RPG rpg, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ClassyGame", getObjectLabel(rpg, context) }),
						 new Object[] { rpg }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterClass(CharacterClass characterClass, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(characterClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(characterClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(characterClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(characterClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(characterClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharacterClass_MeaningfulClass(characterClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharacterClass_RecursiveInheritance(characterClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MeaningfulClass constraint of '<em>Character Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterClass_MeaningfulClass(CharacterClass characterClass, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "MeaningfulClass", getObjectLabel(characterClass, context) }),
						 new Object[] { characterClass }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the RecursiveInheritance constraint of '<em>Character Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterClass_RecursiveInheritance(CharacterClass characterClass, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "RecursiveInheritance", getObjectLabel(characterClass, context) }),
						 new Object[] { characterClass }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterStatistic(CharacterStatistic characterStatistic, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(characterStatistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(characterStatistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(characterStatistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(characterStatistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(characterStatistic, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharacterStatistic_LimitBetweenMinAndMax(characterStatistic, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharacterStatistic_ValidMinMax(characterStatistic, diagnostics, context);
		return result;
	}

	/**
	 * Validates the LimitBetweenMinAndMax constraint of '<em>Character Statistic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterStatistic_LimitBetweenMinAndMax(CharacterStatistic characterStatistic, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "LimitBetweenMinAndMax", getObjectLabel(characterStatistic, context) }),
						 new Object[] { characterStatistic }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ValidMinMax constraint of '<em>Character Statistic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterStatistic_ValidMinMax(CharacterStatistic characterStatistic, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ValidMinMax", getObjectLabel(characterStatistic, context) }),
						 new Object[] { characterStatistic }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch(Branch branch, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validateBranch_ExistingRootNode(branch, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ExistingRootNode constraint of '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch_ExistingRootNode(Branch branch, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ExistingRootNode", getObjectLabel(branch, context) }),
						 new Object[] { branch }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_RootNodeChildren(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_StandardNodeChildren(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_StandaloneNodeConnections(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_SelfReference(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_CircularReference(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_ProperReference(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_ActivationCondition(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_ActivationIntegrity(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_MinimalNodeActivation(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_MaximalNodeActivation(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueNodeActivationLevels(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_ValidBranchTypeImplication(node, diagnostics, context);
		return result;
	}

	/**
	 * Validates the RootNodeChildren constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_RootNodeChildren(Node node, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "RootNodeChildren", getObjectLabel(node, context) }),
						 new Object[] { node }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the StandardNodeChildren constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_StandardNodeChildren(Node node, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "StandardNodeChildren", getObjectLabel(node, context) }),
						 new Object[] { node }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the StandaloneNodeConnections constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_StandaloneNodeConnections(Node node, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "StandaloneNodeConnections", getObjectLabel(node, context) }),
						 new Object[] { node }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SelfReference constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_SelfReference(Node node, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "SelfReference", getObjectLabel(node, context) }),
						 new Object[] { node }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the CircularReference constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_CircularReference(Node node, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "CircularReference", getObjectLabel(node, context) }),
						 new Object[] { node }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ProperReference constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_ProperReference(Node node, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperReference", getObjectLabel(node, context) }),
						 new Object[] { node }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ActivationCondition constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_ActivationCondition(Node node, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ActivationCondition", getObjectLabel(node, context) }),
						 new Object[] { node }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ActivationIntegrity constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_ActivationIntegrity(Node node, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ActivationIntegrity", getObjectLabel(node, context) }),
						 new Object[] { node }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the MinimalNodeActivation constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_MinimalNodeActivation(Node node, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "MinimalNodeActivation", getObjectLabel(node, context) }),
						 new Object[] { node }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the MaximalNodeActivation constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_MaximalNodeActivation(Node node, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "MaximalNodeActivation", getObjectLabel(node, context) }),
						 new Object[] { node }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueNodeActivationLevels constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_UniqueNodeActivationLevels(Node node, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "UniqueNodeActivationLevels", getObjectLabel(node, context) }),
						 new Object[] { node }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ValidBranchTypeImplication constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_ValidBranchTypeImplication(Node node, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ValidBranchTypeImplication", getObjectLabel(node, context) }),
						 new Object[] { node }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeActivation(NodeActivation nodeActivation, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(nodeActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nodeActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nodeActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nodeActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nodeActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNodeActivation_ProperNodeActivationLevels(nodeActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNodeActivation_MeaningfulActivationCondition(nodeActivation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProperNodeActivationLevels constraint of '<em>Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeActivation_ProperNodeActivationLevels(NodeActivation nodeActivation, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperNodeActivationLevels", getObjectLabel(nodeActivation, context) }),
						 new Object[] { nodeActivation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the MeaningfulActivationCondition constraint of '<em>Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeActivation_MeaningfulActivationCondition(NodeActivation nodeActivation, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "MeaningfulActivationCondition", getObjectLabel(nodeActivation, context) }),
						 new Object[] { nodeActivation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivationCost(ActivationCost activationCost, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(activationCost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activationCost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activationCost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activationCost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activationCost, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivationCost_ProperCost(activationCost, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivationCost_ProperCostReference(activationCost, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProperCost constraint of '<em>Activation Cost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivationCost_ProperCost(ActivationCost activationCost, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperCost", getObjectLabel(activationCost, context) }),
						 new Object[] { activationCost }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ProperCostReference constraint of '<em>Activation Cost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivationCost_ProperCostReference(ActivationCost activationCost, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperCostReference", getObjectLabel(activationCost, context) }),
						 new Object[] { activationCost }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeUnit(RangeUnit rangeUnit, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(rangeUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbility(Ability ability, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(ability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ability, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbility_ProperAbilityLevels(ability, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbility_ValidCastTime(ability, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProperAbilityLevels constraint of '<em>Ability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbility_ProperAbilityLevels(Ability ability, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperAbilityLevels", getObjectLabel(ability, context) }),
						 new Object[] { ability }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ValidCastTime constraint of '<em>Ability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbility_ValidCastTime(Ability ability, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ValidCastTime", getObjectLabel(ability, context) }),
						 new Object[] { ability }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEffect(Effect effect, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(effect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(effect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(effect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(effect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(effect, diagnostics, context);
		if (result || diagnostics != null) result &= validateEffect_ProperEffectLevels(effect, diagnostics, context);
		if (result || diagnostics != null) result &= validateEffect_MeaningfulEffect(effect, diagnostics, context);
		if (result || diagnostics != null) result &= validateEffect_InstantiateConstraint(effect, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProperEffectLevels constraint of '<em>Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEffect_ProperEffectLevels(Effect effect, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperEffectLevels", getObjectLabel(effect, context) }),
						 new Object[] { effect }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the MeaningfulEffect constraint of '<em>Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEffect_MeaningfulEffect(Effect effect, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "MeaningfulEffect", getObjectLabel(effect, context) }),
						 new Object[] { effect }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the InstantiateConstraint constraint of '<em>Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEffect_InstantiateConstraint(Effect effect, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "InstantiateConstraint", getObjectLabel(effect, context) }),
						 new Object[] { effect }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatChange(StatChange statChange, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(statChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(statChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(statChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(statChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(statChange, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatChange_SelfEffectStatChange(statChange, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatChange_SelfTalentStatChange(statChange, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatChange_SingularModifierOrder(statChange, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SelfEffectStatChange constraint of '<em>Stat Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatChange_SelfEffectStatChange(StatChange statChange, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "SelfEffectStatChange", getObjectLabel(statChange, context) }),
						 new Object[] { statChange }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SelfTalentStatChange constraint of '<em>Stat Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatChange_SelfTalentStatChange(StatChange statChange, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "SelfTalentStatChange", getObjectLabel(statChange, context) }),
						 new Object[] { statChange }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SingularModifierOrder constraint of '<em>Stat Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatChange_SingularModifierOrder(StatChange statChange, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "SingularModifierOrder", getObjectLabel(statChange, context) }),
						 new Object[] { statChange }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModifier(Modifier modifier, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(modifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateModifier_NoMovingLimits(modifier, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NoMovingLimits constraint of '<em>Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModifier_NoMovingLimits(Modifier modifier, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "NoMovingLimits", getObjectLabel(modifier, context) }),
						 new Object[] { modifier }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTalent(Talent talent, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(talent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropagationRequirement(PropagationRequirement propagationRequirement, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(propagationRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(propagationRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(propagationRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(propagationRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(propagationRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropagationRequirement_ProperRequiredLevel(propagationRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropagationRequirement_SelfReference(propagationRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropagationRequirement_ProperPropagationReference(propagationRequirement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProperRequiredLevel constraint of '<em>Propagation Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropagationRequirement_ProperRequiredLevel(PropagationRequirement propagationRequirement, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperRequiredLevel", getObjectLabel(propagationRequirement, context) }),
						 new Object[] { propagationRequirement }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SelfReference constraint of '<em>Propagation Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropagationRequirement_SelfReference(PropagationRequirement propagationRequirement, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "SelfReference", getObjectLabel(propagationRequirement, context) }),
						 new Object[] { propagationRequirement }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ProperPropagationReference constraint of '<em>Propagation Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropagationRequirement_ProperPropagationReference(PropagationRequirement propagationRequirement, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperPropagationReference", getObjectLabel(propagationRequirement, context) }),
						 new Object[] { propagationRequirement }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRandomizer(Randomizer randomizer, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(randomizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(randomizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(randomizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(randomizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(randomizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateRandomizer_MeaningfulRandomizer(randomizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateRandomizer_ProperStatisticBase(randomizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MeaningfulRandomizer constraint of '<em>Randomizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRandomizer_MeaningfulRandomizer(Randomizer randomizer, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "MeaningfulRandomizer", getObjectLabel(randomizer, context) }),
						 new Object[] { randomizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ProperStatisticBase constraint of '<em>Randomizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRandomizer_ProperStatisticBase(Randomizer randomizer, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperStatisticBase", getObjectLabel(randomizer, context) }),
						 new Object[] { randomizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatTalent(StatTalent statTalent, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(statTalent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTick(Tick tick, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tick, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCooldownChange(CooldownChange cooldownChange, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(cooldownChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cooldownChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cooldownChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cooldownChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cooldownChange, diagnostics, context);
		if (result || diagnostics != null) result &= validateCooldownChange_MeaningfullCooldownChange(cooldownChange, diagnostics, context);
		if (result || diagnostics != null) result &= validateCooldownChange_ProperAbilityReference(cooldownChange, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MeaningfullCooldownChange constraint of '<em>Cooldown Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCooldownChange_MeaningfullCooldownChange(CooldownChange cooldownChange, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "MeaningfullCooldownChange", getObjectLabel(cooldownChange, context) }),
						 new Object[] { cooldownChange }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ProperAbilityReference constraint of '<em>Cooldown Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCooldownChange_ProperAbilityReference(CooldownChange cooldownChange, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperAbilityReference", getObjectLabel(cooldownChange, context) }),
						 new Object[] { cooldownChange }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChange(Change change, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(change, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlockTalent(UnlockTalent unlockTalent, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(unlockTalent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlockAbility(UnlockAbility unlockAbility, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(unlockAbility, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlockEffect(UnlockEffect unlockEffect, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(unlockEffect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlockChange(UnlockChange unlockChange, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(unlockChange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCooldownTalent(CooldownTalent cooldownTalent, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(cooldownTalent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlockModifier(UnlockModifier unlockModifier, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(unlockModifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatType(StatType statType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranchType(BranchType branchType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeType(NodeType nodeType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCastType(CastType castType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbilityType(AbilityType abilityType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetType(TargetType targetType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEffectType(EffectType effectType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeType(ChangeType changeType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTickType(TickType tickType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeValueType(ChangeValueType changeValueType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

} //RpgValidator
