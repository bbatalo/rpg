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
			public Object caseNodeActivationBuy(NodeActivationBuy object) {
				return createNodeActivationBuyAdapter();
			}
			public Object caseNodeActivationPropagate(NodeActivationPropagate object) {
				return createNodeActivationPropagateAdapter();
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
			public Object caseAbilityCost(AbilityCost object) {
				return createAbilityCostAdapter();
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
	 * Creates a new adapter for an object of class '{@link rpg.NodeActivationBuy <em>Node Activation Buy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.NodeActivationBuy
	 * @generated
	 */
	public Adapter createNodeActivationBuyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rpg.NodeActivationPropagate <em>Node Activation Propagate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.NodeActivationPropagate
	 * @generated
	 */
	public Adapter createNodeActivationPropagateAdapter() {
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
	 * Creates a new adapter for an object of class '{@link rpg.AbilityCost <em>Ability Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rpg.AbilityCost
	 * @generated
	 */
	public Adapter createAbilityCostAdapter() {
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
