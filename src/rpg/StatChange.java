/**
 */
package rpg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stat Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.StatChange#getChangesStatistic <em>Changes Statistic</em>}</li>
 *   <li>{@link rpg.StatChange#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link rpg.StatChange#getRandomizer <em>Randomizer</em>}</li>
 *   <li>{@link rpg.StatChange#getTick <em>Tick</em>}</li>
 *   <li>{@link rpg.StatChange#getStatTalent <em>Stat Talent</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getStatChange()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SelfEffectStatChange SelfTalentStatChange SingularModifierOrder'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SelfEffectStatChange='\n\t\t\tself.effect.targetType = TargetType::SELF and self.effect <> null implies \n\t\t\t(self.effect.ability.node.branch.characterClass.statistics->includes(self.changesStatistic)\n\t\t\tor self.effect.ability.node.branch.characterClass->closure(parentClasses)->exists(charClass | charClass.statistics->includes(self.changesStatistic)))' SelfEffectStatChange$message='\'If StatChange is a part of SELF Effect, it can reference only statistics in host or parent classes.\'' SelfTalentStatChange='\n\t\t\tself.statTalent <> null implies \n\t\t\t(self.statTalent.node.branch.characterClass.statistics->includes(self.changesStatistic)\n\t\t\tor self.statTalent.node.branch.characterClass->closure(parentClasses)->exists(charClass | charClass.statistics->includes(self.changesStatistic)))' SelfTalentStatChange$message='\'If StatChange is a part of StatTalent, it can reference only statistics in host or parent classes.\'' SingularModifierOrder='\n\t\t\tself.modifiers->forAll(m1, m2 | m1 <> m2 implies m1.priorityOrder <> m2.priorityOrder)' SingularModifierOrder$message='\'Each modifier has to have a unique priority order.\''"
 * @generated
 */
public interface StatChange extends Change {
	/**
	 * Returns the value of the '<em><b>Changes Statistic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changes Statistic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changes Statistic</em>' reference.
	 * @see #setChangesStatistic(CharacterStatistic)
	 * @see rpg.RpgPackage#getStatChange_ChangesStatistic()
	 * @model required="true"
	 * @generated
	 */
	CharacterStatistic getChangesStatistic();

	/**
	 * Sets the value of the '{@link rpg.StatChange#getChangesStatistic <em>Changes Statistic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changes Statistic</em>' reference.
	 * @see #getChangesStatistic()
	 * @generated
	 */
	void setChangesStatistic(CharacterStatistic value);

	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.Modifier}.
	 * It is bidirectional and its opposite is '{@link rpg.Modifier#getStatChange <em>Stat Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' containment reference list.
	 * @see rpg.RpgPackage#getStatChange_Modifiers()
	 * @see rpg.Modifier#getStatChange
	 * @model type="rpg.Modifier" opposite="statChange" containment="true"
	 * @generated
	 */
	EList getModifiers();

	/**
	 * Returns the value of the '<em><b>Randomizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Randomizer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Randomizer</em>' containment reference.
	 * @see #setRandomizer(Randomizer)
	 * @see rpg.RpgPackage#getStatChange_Randomizer()
	 * @model containment="true"
	 * @generated
	 */
	Randomizer getRandomizer();

	/**
	 * Sets the value of the '{@link rpg.StatChange#getRandomizer <em>Randomizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Randomizer</em>' containment reference.
	 * @see #getRandomizer()
	 * @generated
	 */
	void setRandomizer(Randomizer value);

	/**
	 * Returns the value of the '<em><b>Tick</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link rpg.Tick#getStatChange <em>Stat Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tick</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tick</em>' containment reference.
	 * @see #setTick(Tick)
	 * @see rpg.RpgPackage#getStatChange_Tick()
	 * @see rpg.Tick#getStatChange
	 * @model opposite="statChange" containment="true"
	 * @generated
	 */
	Tick getTick();

	/**
	 * Sets the value of the '{@link rpg.StatChange#getTick <em>Tick</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tick</em>' containment reference.
	 * @see #getTick()
	 * @generated
	 */
	void setTick(Tick value);

	/**
	 * Returns the value of the '<em><b>Stat Talent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rpg.StatTalent#getStatChanges <em>Stat Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stat Talent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stat Talent</em>' container reference.
	 * @see #setStatTalent(StatTalent)
	 * @see rpg.RpgPackage#getStatChange_StatTalent()
	 * @see rpg.StatTalent#getStatChanges
	 * @model opposite="statChanges" transient="false"
	 * @generated
	 */
	StatTalent getStatTalent();

	/**
	 * Sets the value of the '{@link rpg.StatChange#getStatTalent <em>Stat Talent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stat Talent</em>' container reference.
	 * @see #getStatTalent()
	 * @generated
	 */
	void setStatTalent(StatTalent value);

} // StatChange
