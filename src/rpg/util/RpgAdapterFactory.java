/**
 */
package rpg.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rpg.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rpg.RpgPackage
 * @generated
 */
public class RpgAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RpgPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RpgAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RpgPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RpgSwitch modelSwitch =
		new RpgSwitch() {
			public Object caseRPG(RPG object) {
				return createRPGAdapter();
			}
			public Object caseCharacterClass(CharacterClass object) {
				return createCharacterClassAdapter();
			}
			public Object caseCharacterStatistic(CharacterStatistic object) {
				return createCharacterStatisticAdapter();
			}
			public Object caseBranch(Branch object) {
				return createBranchAdapter();
			}
			public Object caseNode(Node object) {
				return createNodeAdapter();
			}
			public Object caseNodeActivation(NodeActivation object) {
				return createNodeActivationAdapter();
			}
			public Object caseActivationCost(ActivationCost object) {
				return createActivationCostAdapter();
			}
			public Object caseRangeUnit(RangeUnit object) {
				return createRangeUnitAdapter();
			}
			public Object caseAbility(Ability object) {
				return createAbilityAdapter();
			}
			public Object caseEffect(Effect object) {
				return createEffectAdapter();
			}
			public Object caseStatChange(StatChange object) {
				return createStatChangeAdapter();
			}
			public Object caseModifier(Modifier object) {
				return createModifierAdapter();
			}
			public Object caseTalent(Talent object) {
				return createTalentAdapter();
			}
			public Object casePropagationRequirement(PropagationRequirement object) {
				return createPropagationRequirementAdapter();
			}
			public Object caseRandomizer(Randomizer object) {
				return createRandomizerAdapter();
			}
			public Object caseStatTalent(StatTalent object) {
				return createStatTalentAdapter();
			}
			public Object caseTick(Tick object) {
				return createTickAdapter();
			}
			public Object caseCooldownChange(CooldownChange object) {
				return createCooldownChangeAdapter();
			}
			public Object caseChange(Change object) {
				return createChangeAdapter();
			}
			public Object caseUnlockTalent(UnlockTalent object) {
				return createUnlockTalentAdapter();
			}
			public Object caseUnlockAbility(UnlockAbility object) {
				return createUnlockAbilityAdapter();
			}
			public Object caseUnlockEffect(UnlockEffect object) {
				return createUnlockEffectAdapter();
			}
			public Object caseUnlockChange(UnlockChange object) {
				return createUnlockChangeAdapter();
			}
			public Object caseCooldownTalent(CooldownTalent object) {
				return createCooldownTalentAdapter();
			}
			public Object caseUnlockModifier(UnlockModifier object) {
				return createUnlockModifierAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link rpg.RPG <em>RPG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.RPG
	 * @generated
	 */
	public Adapter createRPGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.CharacterClass <em>Character Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.CharacterClass
	 * @generated
	 */
	public Adapter createCharacterClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.CharacterStatistic <em>Character Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.CharacterStatistic
	 * @generated
	 */
	public Adapter createCharacterStatisticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.Branch
	 * @generated
	 */
	public Adapter createBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.NodeActivation <em>Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.NodeActivation
	 * @generated
	 */
	public Adapter createNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.ActivationCost <em>Activation Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.ActivationCost
	 * @generated
	 */
	public Adapter createActivationCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.RangeUnit <em>Range Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.RangeUnit
	 * @generated
	 */
	public Adapter createRangeUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.Ability <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.Ability
	 * @generated
	 */
	public Adapter createAbilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.Effect
	 * @generated
	 */
	public Adapter createEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.StatChange <em>Stat Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.StatChange
	 * @generated
	 */
	public Adapter createStatChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.Modifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.Modifier
	 * @generated
	 */
	public Adapter createModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.Talent <em>Talent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.Talent
	 * @generated
	 */
	public Adapter createTalentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.PropagationRequirement <em>Propagation Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.PropagationRequirement
	 * @generated
	 */
	public Adapter createPropagationRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.Randomizer <em>Randomizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.Randomizer
	 * @generated
	 */
	public Adapter createRandomizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.StatTalent <em>Stat Talent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.StatTalent
	 * @generated
	 */
	public Adapter createStatTalentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.Tick <em>Tick</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.Tick
	 * @generated
	 */
	public Adapter createTickAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.CooldownChange <em>Cooldown Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.CooldownChange
	 * @generated
	 */
	public Adapter createCooldownChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.Change <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.Change
	 * @generated
	 */
	public Adapter createChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.UnlockTalent <em>Unlock Talent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.UnlockTalent
	 * @generated
	 */
	public Adapter createUnlockTalentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.UnlockAbility <em>Unlock Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.UnlockAbility
	 * @generated
	 */
	public Adapter createUnlockAbilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.UnlockEffect <em>Unlock Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.UnlockEffect
	 * @generated
	 */
	public Adapter createUnlockEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.UnlockChange <em>Unlock Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.UnlockChange
	 * @generated
	 */
	public Adapter createUnlockChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.CooldownTalent <em>Cooldown Talent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.CooldownTalent
	 * @generated
	 */
	public Adapter createCooldownTalentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.UnlockModifier <em>Unlock Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.UnlockModifier
	 * @generated
	 */
	public Adapter createUnlockModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RpgAdapterFactory
