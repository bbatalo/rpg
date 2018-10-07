/**
 */
package rpg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.Effect#getName <em>Name</em>}</li>
 *   <li>{@link rpg.Effect#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link rpg.Effect#getEffectType <em>Effect Type</em>}</li>
 *   <li>{@link rpg.Effect#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link rpg.Effect#getOnLevel <em>On Level</em>}</li>
 *   <li>{@link rpg.Effect#getInstantiate <em>Instantiate</em>}</li>
 *   <li>{@link rpg.Effect#getAbility <em>Ability</em>}</li>
 *   <li>{@link rpg.Effect#getRandomizer <em>Randomizer</em>}</li>
 *   <li>{@link rpg.Effect#getChanges <em>Changes</em>}</li>
 *   <li>{@link rpg.Effect#isIsLocked <em>Is Locked</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getEffect()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProperEffectLevels MeaningfulEffect InstantiateConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProperEffectLevels='\n\t\t\tself.onLevel >= self.ability.node.minActivationLevel and self.onLevel <= self.ability.node.maxActivationLevel' ProperEffectLevels$message='\'Effects must reference an appropriate node level.\'' MeaningfulEffect='\n\t\t\tif self.effectType = EffectType::INSTANTIATE then\n\t\t\t\tself.instantiate->size() = 1\n\t\t\telse\n\t\t\t\tself.changes->size() > 0\n\t\t\tendif' MeaningfulEffect$message='\'An effect must either instantiate a class or change a stat.\'' InstantiateConstraint='\n\t\t\tself.effectType = EffectType::INSTANTIATE implies self.targetType = TargetType::SELF' InstantiateConstraint$message='\'Instantiate effects can only target SELF.\''"
 * @generated
 */
public interface Effect extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rpg.RpgPackage#getEffect_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rpg.Effect#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tooltip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tooltip</em>' attribute.
	 * @see #setTooltip(String)
	 * @see rpg.RpgPackage#getEffect_Tooltip()
	 * @model required="true"
	 * @generated
	 */
	String getTooltip();

	/**
	 * Sets the value of the '{@link rpg.Effect#getTooltip <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip</em>' attribute.
	 * @see #getTooltip()
	 * @generated
	 */
	void setTooltip(String value);

	/**
	 * Returns the value of the '<em><b>Effect Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rpg.EffectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect Type</em>' attribute.
	 * @see rpg.EffectType
	 * @see #setEffectType(EffectType)
	 * @see rpg.RpgPackage#getEffect_EffectType()
	 * @model required="true"
	 * @generated
	 */
	EffectType getEffectType();

	/**
	 * Sets the value of the '{@link rpg.Effect#getEffectType <em>Effect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect Type</em>' attribute.
	 * @see rpg.EffectType
	 * @see #getEffectType()
	 * @generated
	 */
	void setEffectType(EffectType value);

	/**
	 * Returns the value of the '<em><b>Target Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rpg.TargetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Type</em>' attribute.
	 * @see rpg.TargetType
	 * @see #setTargetType(TargetType)
	 * @see rpg.RpgPackage#getEffect_TargetType()
	 * @model required="true"
	 * @generated
	 */
	TargetType getTargetType();

	/**
	 * Sets the value of the '{@link rpg.Effect#getTargetType <em>Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Type</em>' attribute.
	 * @see rpg.TargetType
	 * @see #getTargetType()
	 * @generated
	 */
	void setTargetType(TargetType value);

	/**
	 * Returns the value of the '<em><b>On Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Level</em>' attribute.
	 * @see #setOnLevel(int)
	 * @see rpg.RpgPackage#getEffect_OnLevel()
	 * @model required="true"
	 * @generated
	 */
	int getOnLevel();

	/**
	 * Sets the value of the '{@link rpg.Effect#getOnLevel <em>On Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Level</em>' attribute.
	 * @see #getOnLevel()
	 * @generated
	 */
	void setOnLevel(int value);

	/**
	 * Returns the value of the '<em><b>Instantiate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiate</em>' reference.
	 * @see #setInstantiate(CharacterClass)
	 * @see rpg.RpgPackage#getEffect_Instantiate()
	 * @model
	 * @generated
	 */
	CharacterClass getInstantiate();

	/**
	 * Sets the value of the '{@link rpg.Effect#getInstantiate <em>Instantiate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiate</em>' reference.
	 * @see #getInstantiate()
	 * @generated
	 */
	void setInstantiate(CharacterClass value);

	/**
	 * Returns the value of the '<em><b>Ability</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rpg.Ability#getEffects <em>Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ability</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ability</em>' container reference.
	 * @see #setAbility(Ability)
	 * @see rpg.RpgPackage#getEffect_Ability()
	 * @see rpg.Ability#getEffects
	 * @model opposite="effects" required="true" transient="false"
	 * @generated
	 */
	Ability getAbility();

	/**
	 * Sets the value of the '{@link rpg.Effect#getAbility <em>Ability</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ability</em>' container reference.
	 * @see #getAbility()
	 * @generated
	 */
	void setAbility(Ability value);

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
	 * @see rpg.RpgPackage#getEffect_Randomizer()
	 * @model containment="true"
	 * @generated
	 */
	Randomizer getRandomizer();

	/**
	 * Sets the value of the '{@link rpg.Effect#getRandomizer <em>Randomizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Randomizer</em>' containment reference.
	 * @see #getRandomizer()
	 * @generated
	 */
	void setRandomizer(Randomizer value);

	/**
	 * Returns the value of the '<em><b>Changes</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.Change}.
	 * It is bidirectional and its opposite is '{@link rpg.Change#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changes</em>' containment reference list.
	 * @see rpg.RpgPackage#getEffect_Changes()
	 * @see rpg.Change#getEffect
	 * @model type="rpg.Change" opposite="effect" containment="true"
	 * @generated
	 */
	EList getChanges();

	/**
	 * Returns the value of the '<em><b>Is Locked</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Locked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Locked</em>' attribute.
	 * @see #setIsLocked(boolean)
	 * @see rpg.RpgPackage#getEffect_IsLocked()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsLocked();

	/**
	 * Sets the value of the '{@link rpg.Effect#isIsLocked <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Locked</em>' attribute.
	 * @see #isIsLocked()
	 * @generated
	 */
	void setIsLocked(boolean value);

} // Effect
