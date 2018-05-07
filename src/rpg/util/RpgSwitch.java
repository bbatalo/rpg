/**
 */
package rpg.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import rpg.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see rpg.RpgPackage
 * @generated
 */
public class RpgSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RpgPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RpgSwitch() {
		if (modelPackage == null) {
			modelPackage = RpgPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RpgPackage.RPG: {
				RPG rpg = (RPG)theEObject;
				Object result = caseRPG(rpg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RpgPackage.CHARACTER_CLASS: {
				CharacterClass characterClass = (CharacterClass)theEObject;
				Object result = caseCharacterClass(characterClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RpgPackage.CHARACTER_STATISTIC: {
				CharacterStatistic characterStatistic = (CharacterStatistic)theEObject;
				Object result = caseCharacterStatistic(characterStatistic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RpgPackage.BRANCH: {
				Branch branch = (Branch)theEObject;
				Object result = caseBranch(branch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RpgPackage.NODE: {
				Node node = (Node)theEObject;
				Object result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RpgPackage.NODE_ACTIVATION: {
				NodeActivation nodeActivation = (NodeActivation)theEObject;
				Object result = caseNodeActivation(nodeActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RpgPackage.NODE_ACTIVATION_BUY: {
				NodeActivationBuy nodeActivationBuy = (NodeActivationBuy)theEObject;
				Object result = caseNodeActivationBuy(nodeActivationBuy);
				if (result == null) result = caseNodeActivation(nodeActivationBuy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RpgPackage.NODE_ACTIVATION_PROPAGATE: {
				NodeActivationPropagate nodeActivationPropagate = (NodeActivationPropagate)theEObject;
				Object result = caseNodeActivationPropagate(nodeActivationPropagate);
				if (result == null) result = caseNodeActivation(nodeActivationPropagate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RpgPackage.ACTIVATION_COST: {
				ActivationCost activationCost = (ActivationCost)theEObject;
				Object result = caseActivationCost(activationCost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RpgPackage.RANGE_UNIT: {
				RangeUnit rangeUnit = (RangeUnit)theEObject;
				Object result = caseRangeUnit(rangeUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RpgPackage.ABILITY: {
				Ability ability = (Ability)theEObject;
				Object result = caseAbility(ability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RpgPackage.EFFECT: {
				Effect effect = (Effect)theEObject;
				Object result = caseEffect(effect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RpgPackage.STAT_CHANGE: {
				StatChange statChange = (StatChange)theEObject;
				Object result = caseStatChange(statChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RpgPackage.MODIFIER: {
				Modifier modifier = (Modifier)theEObject;
				Object result = caseModifier(modifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RpgPackage.TALENT: {
				Talent talent = (Talent)theEObject;
				Object result = caseTalent(talent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RpgPackage.ABILITY_COST: {
				AbilityCost abilityCost = (AbilityCost)theEObject;
				Object result = caseAbilityCost(abilityCost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRPG(RPG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCharacterClass(CharacterClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Statistic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Statistic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCharacterStatistic(CharacterStatistic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBranch(Branch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNodeActivation(NodeActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Activation Buy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Activation Buy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNodeActivationBuy(NodeActivationBuy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Activation Propagate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Activation Propagate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNodeActivationPropagate(NodeActivationPropagate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activation Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivationCost(ActivationCost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRangeUnit(RangeUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbility(Ability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEffect(Effect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stat Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stat Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStatChange(StatChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModifier(Modifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Talent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Talent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTalent(Talent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ability Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ability Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbilityCost(AbilityCost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //RpgSwitch
