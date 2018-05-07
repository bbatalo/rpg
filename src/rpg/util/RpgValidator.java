/**
 */
package rpg.util;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;
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
			case RpgPackage.NODE_ACTIVATION_BUY:
				return validateNodeActivationBuy((NodeActivationBuy)value, diagnostics, context);
			case RpgPackage.NODE_ACTIVATION_PROPAGATE:
				return validateNodeActivationPropagate((NodeActivationPropagate)value, diagnostics, context);
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
			case RpgPackage.ABILITY_COST:
				return validateAbilityCost((AbilityCost)value, diagnostics, context);
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
		return validate_EveryDefaultConstraint((EObject)rpg, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterClass(CharacterClass characterClass, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms((EObject)characterClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)characterClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)characterClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)characterClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)characterClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharacterClass_MeaningfulInheritance(characterClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MeaningfulInheritance constraint of '<em>Character Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterClass_MeaningfulInheritance(CharacterClass characterClass, DiagnosticChain diagnostics, Map context) {
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "MeaningfulInheritance", getObjectLabel(characterClass, context) }),
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
		boolean result = validate_EveryMultiplicityConforms((EObject)characterStatistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)characterStatistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)characterStatistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)characterStatistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)characterStatistic, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharacterStatistic_LimitBetweenMinAndMax(characterStatistic, diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch(Branch branch, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms((EObject)branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)branch, diagnostics, context);
		if (result || diagnostics != null) result &= validateBranch_ValidStartNodes(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validateBranch_ValidBranchTypeImplication(branch, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidStartNodes constraint of '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch_ValidStartNodes(Branch branch, DiagnosticChain diagnostics, Map context) {
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ValidStartNodes", getObjectLabel(branch, context) }),
						 new Object[] { branch }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ValidBranchTypeImplication constraint of '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch_ValidBranchTypeImplication(Branch branch, DiagnosticChain diagnostics, Map context) {
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ValidBranchTypeImplication", getObjectLabel(branch, context) }),
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
		boolean result = validate_EveryMultiplicityConforms((EObject)node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_RootNodeChildren(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_RootNodeParents(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_StandardNodeChildren(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_StandardNodeParents(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_StandaloneNodeConnections(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_ActivationIntegrity(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_MinimalNodeActivation(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_MaximalNodeActivation(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueNodeActivationLevels(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_ProperNodeActivationLevels(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_ProperAbilityLevels(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_ProperEffectLevels(node, diagnostics, context);
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
	 * Validates the RootNodeParents constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_RootNodeParents(Node node, DiagnosticChain diagnostics, Map context) {
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "RootNodeParents", getObjectLabel(node, context) }),
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
	 * Validates the StandardNodeParents constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_StandardNodeParents(Node node, DiagnosticChain diagnostics, Map context) {
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "StandardNodeParents", getObjectLabel(node, context) }),
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
	 * Validates the ProperNodeActivationLevels constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_ProperNodeActivationLevels(Node node, DiagnosticChain diagnostics, Map context) {
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperNodeActivationLevels", getObjectLabel(node, context) }),
						 new Object[] { node }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ProperAbilityLevels constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_ProperAbilityLevels(Node node, DiagnosticChain diagnostics, Map context) {
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperAbilityLevels", getObjectLabel(node, context) }),
						 new Object[] { node }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ProperEffectLevels constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_ProperEffectLevels(Node node, DiagnosticChain diagnostics, Map context) {
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperEffectLevels", getObjectLabel(node, context) }),
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
		return validate_EveryDefaultConstraint((EObject)nodeActivation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeActivationBuy(NodeActivationBuy nodeActivationBuy, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)nodeActivationBuy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeActivationPropagate(NodeActivationPropagate nodeActivationPropagate, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms((EObject)nodeActivationPropagate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)nodeActivationPropagate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)nodeActivationPropagate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)nodeActivationPropagate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)nodeActivationPropagate, diagnostics, context);
		if (result || diagnostics != null) result &= validateNodeActivationPropagate_ProperRequiredLevel(nodeActivationPropagate, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProperRequiredLevel constraint of '<em>Node Activation Propagate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeActivationPropagate_ProperRequiredLevel(NodeActivationPropagate nodeActivationPropagate, DiagnosticChain diagnostics, Map context) {
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
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "ProperRequiredLevel", getObjectLabel(nodeActivationPropagate, context) }),
						 new Object[] { nodeActivationPropagate }));
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
		boolean result = validate_EveryMultiplicityConforms((EObject)activationCost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)activationCost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)activationCost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)activationCost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)activationCost, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivationCost_ProperCost(activationCost, diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeUnit(RangeUnit rangeUnit, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)rangeUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbility(Ability ability, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms((EObject)ability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)ability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)ability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)ability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)ability, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbility_ValidCastTime(ability, diagnostics, context);
		return result;
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
		boolean result = validate_EveryMultiplicityConforms((EObject)effect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)effect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)effect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)effect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)effect, diagnostics, context);
		if (result || diagnostics != null) result &= validateEffect_MeaningfulEffect(effect, diagnostics, context);
		return result;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatChange(StatChange statChange, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)statChange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModifier(Modifier modifier, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)modifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTalent(Talent talent, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)talent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbilityCost(AbilityCost abilityCost, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)abilityCost, diagnostics, context);
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

} //RpgValidator
