/**
 */
package rpg;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rpg.RpgPackage
 * @generated
 */
public interface RpgFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RpgFactory eINSTANCE = rpg.impl.RpgFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>RPG</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPG</em>'.
	 * @generated
	 */
	RPG createRPG();

	/**
	 * Returns a new object of class '<em>Character Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Class</em>'.
	 * @generated
	 */
	CharacterClass createCharacterClass();

	/**
	 * Returns a new object of class '<em>Character Statistic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Statistic</em>'.
	 * @generated
	 */
	CharacterStatistic createCharacterStatistic();

	/**
	 * Returns a new object of class '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Branch</em>'.
	 * @generated
	 */
	Branch createBranch();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Node Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Activation</em>'.
	 * @generated
	 */
	NodeActivation createNodeActivation();

	/**
	 * Returns a new object of class '<em>Activation Cost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activation Cost</em>'.
	 * @generated
	 */
	ActivationCost createActivationCost();

	/**
	 * Returns a new object of class '<em>Range Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Unit</em>'.
	 * @generated
	 */
	RangeUnit createRangeUnit();

	/**
	 * Returns a new object of class '<em>Ability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ability</em>'.
	 * @generated
	 */
	Ability createAbility();

	/**
	 * Returns a new object of class '<em>Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect</em>'.
	 * @generated
	 */
	Effect createEffect();

	/**
	 * Returns a new object of class '<em>Stat Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stat Change</em>'.
	 * @generated
	 */
	StatChange createStatChange();

	/**
	 * Returns a new object of class '<em>Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modifier</em>'.
	 * @generated
	 */
	Modifier createModifier();

	/**
	 * Returns a new object of class '<em>Propagation Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propagation Requirement</em>'.
	 * @generated
	 */
	PropagationRequirement createPropagationRequirement();

	/**
	 * Returns a new object of class '<em>Randomizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Randomizer</em>'.
	 * @generated
	 */
	Randomizer createRandomizer();

	/**
	 * Returns a new object of class '<em>Stat Talent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stat Talent</em>'.
	 * @generated
	 */
	StatTalent createStatTalent();

	/**
	 * Returns a new object of class '<em>Tick</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tick</em>'.
	 * @generated
	 */
	Tick createTick();

	/**
	 * Returns a new object of class '<em>Cooldown Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cooldown Change</em>'.
	 * @generated
	 */
	CooldownChange createCooldownChange();

	/**
	 * Returns a new object of class '<em>Unlock Ability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unlock Ability</em>'.
	 * @generated
	 */
	UnlockAbility createUnlockAbility();

	/**
	 * Returns a new object of class '<em>Unlock Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unlock Effect</em>'.
	 * @generated
	 */
	UnlockEffect createUnlockEffect();

	/**
	 * Returns a new object of class '<em>Unlock Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unlock Change</em>'.
	 * @generated
	 */
	UnlockChange createUnlockChange();

	/**
	 * Returns a new object of class '<em>Cooldown Talent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cooldown Talent</em>'.
	 * @generated
	 */
	CooldownTalent createCooldownTalent();

	/**
	 * Returns a new object of class '<em>Unlock Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unlock Modifier</em>'.
	 * @generated
	 */
	UnlockModifier createUnlockModifier();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RpgPackage getRpgPackage();

} //RpgFactory
