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
	 * Returns a new object of class '<em>Node Activation Buy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Activation Buy</em>'.
	 * @generated
	 */
	NodeActivationBuy createNodeActivationBuy();

	/**
	 * Returns a new object of class '<em>Node Activation Propagate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Activation Propagate</em>'.
	 * @generated
	 */
	NodeActivationPropagate createNodeActivationPropagate();

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
	 * Returns a new object of class '<em>Talent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Talent</em>'.
	 * @generated
	 */
	Talent createTalent();

	/**
	 * Returns a new object of class '<em>Ability Cost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ability Cost</em>'.
	 * @generated
	 */
	AbilityCost createAbilityCost();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RpgPackage getRpgPackage();

} //RpgFactory
