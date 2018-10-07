/**
 */
package rpg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cooldown Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.CooldownChange#getAbility <em>Ability</em>}</li>
 *   <li>{@link rpg.CooldownChange#getTalent <em>Talent</em>}</li>
 *   <li>{@link rpg.CooldownChange#getCooldownTalent <em>Cooldown Talent</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getCooldownChange()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MeaningfullCooldownChange ProperAbilityReference'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot MeaningfullCooldownChange='\n\t\t\tself.talent <> null or self.ability <> null and\n\t\t\t(self.talent <> null implies self.ability = null) and\n\t\t\t(self.ability <> null implies self.talent = null)' MeaningfullCooldownChange$message='\'A CooldownChange should reference either talent or ability.\'' ProperAbilityReference='\n\t\t\t--TODO: should be tested\n\t\t\tself.effect.ability.node.branch.characterClass.branches->collect(nodes)->collect(abilities)->includes(self.ability) or\n\t\t\tself.effect.ability.node.branch.characterClass->closure(parentClasses)->exists(charClass | charClass.branches->collect(nodes)->collect(abilities->includes(self.ability)))' ProperAbilityReference$message='\'Can only reference abilities of host or parent class.\''"
 * @generated
 */
public interface CooldownChange extends Change {
	/**
	 * Returns the value of the '<em><b>Ability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ability</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ability</em>' reference.
	 * @see #setAbility(Ability)
	 * @see rpg.RpgPackage#getCooldownChange_Ability()
	 * @model
	 * @generated
	 */
	Ability getAbility();

	/**
	 * Sets the value of the '{@link rpg.CooldownChange#getAbility <em>Ability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ability</em>' reference.
	 * @see #getAbility()
	 * @generated
	 */
	void setAbility(Ability value);

	/**
	 * Returns the value of the '<em><b>Talent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Talent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Talent</em>' reference.
	 * @see #setTalent(Talent)
	 * @see rpg.RpgPackage#getCooldownChange_Talent()
	 * @model
	 * @generated
	 */
	Talent getTalent();

	/**
	 * Sets the value of the '{@link rpg.CooldownChange#getTalent <em>Talent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Talent</em>' reference.
	 * @see #getTalent()
	 * @generated
	 */
	void setTalent(Talent value);

	/**
	 * Returns the value of the '<em><b>Cooldown Talent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rpg.CooldownTalent#getCooldownChanges <em>Cooldown Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cooldown Talent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cooldown Talent</em>' container reference.
	 * @see #setCooldownTalent(CooldownTalent)
	 * @see rpg.RpgPackage#getCooldownChange_CooldownTalent()
	 * @see rpg.CooldownTalent#getCooldownChanges
	 * @model opposite="cooldownChanges" transient="false"
	 * @generated
	 */
	CooldownTalent getCooldownTalent();

	/**
	 * Sets the value of the '{@link rpg.CooldownChange#getCooldownTalent <em>Cooldown Talent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooldown Talent</em>' container reference.
	 * @see #getCooldownTalent()
	 * @generated
	 */
	void setCooldownTalent(CooldownTalent value);

} // CooldownChange
