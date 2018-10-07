/**
 */
package rpg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.Ability#getName <em>Name</em>}</li>
 *   <li>{@link rpg.Ability#getLore <em>Lore</em>}</li>
 *   <li>{@link rpg.Ability#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link rpg.Ability#getCastType <em>Cast Type</em>}</li>
 *   <li>{@link rpg.Ability#getCooldown <em>Cooldown</em>}</li>
 *   <li>{@link rpg.Ability#getAbilityType <em>Ability Type</em>}</li>
 *   <li>{@link rpg.Ability#getCastTime <em>Cast Time</em>}</li>
 *   <li>{@link rpg.Ability#getRange <em>Range</em>}</li>
 *   <li>{@link rpg.Ability#getRangeUnit <em>Range Unit</em>}</li>
 *   <li>{@link rpg.Ability#getOnLevel <em>On Level</em>}</li>
 *   <li>{@link rpg.Ability#getEffects <em>Effects</em>}</li>
 *   <li>{@link rpg.Ability#getNode <em>Node</em>}</li>
 *   <li>{@link rpg.Ability#isIsLocked <em>Is Locked</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getAbility()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProperAbilityLevels ValidCastTime'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProperAbilityLevels='\n\t\t\tself.onLevel >= self.node.minActivationLevel and self.onLevel <= self.node.maxActivationLevel' ProperAbilityLevels$message='\'All abilities must reference an appropriate node level.\'' ValidCastTime='\n\t\tif self.castType = CastType::NO_CAST or self.castType = CastType::INSTANT then\n\t\t\tself.castTime = 0.0\n\t\telse\n\t\t\tself.castTime > 0.0\n\t\tendif' ValidCastTime$message='\'NO_CAST and INSTANT abilities have no cast time, the rest do.\''"
 * @generated
 */
public interface Ability extends EObject {
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
	 * @see rpg.RpgPackage#getAbility_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rpg.Ability#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lore</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lore</em>' attribute.
	 * @see #setLore(String)
	 * @see rpg.RpgPackage#getAbility_Lore()
	 * @model required="true"
	 * @generated
	 */
	String getLore();

	/**
	 * Sets the value of the '{@link rpg.Ability#getLore <em>Lore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lore</em>' attribute.
	 * @see #getLore()
	 * @generated
	 */
	void setLore(String value);

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
	 * @see rpg.RpgPackage#getAbility_Tooltip()
	 * @model required="true"
	 * @generated
	 */
	String getTooltip();

	/**
	 * Sets the value of the '{@link rpg.Ability#getTooltip <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip</em>' attribute.
	 * @see #getTooltip()
	 * @generated
	 */
	void setTooltip(String value);

	/**
	 * Returns the value of the '<em><b>Cast Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rpg.CastType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cast Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cast Type</em>' attribute.
	 * @see rpg.CastType
	 * @see #setCastType(CastType)
	 * @see rpg.RpgPackage#getAbility_CastType()
	 * @model required="true"
	 * @generated
	 */
	CastType getCastType();

	/**
	 * Sets the value of the '{@link rpg.Ability#getCastType <em>Cast Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cast Type</em>' attribute.
	 * @see rpg.CastType
	 * @see #getCastType()
	 * @generated
	 */
	void setCastType(CastType value);

	/**
	 * Returns the value of the '<em><b>Cooldown</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cooldown</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cooldown</em>' attribute.
	 * @see #setCooldown(double)
	 * @see rpg.RpgPackage#getAbility_Cooldown()
	 * @model default="0" required="true"
	 * @generated
	 */
	double getCooldown();

	/**
	 * Sets the value of the '{@link rpg.Ability#getCooldown <em>Cooldown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooldown</em>' attribute.
	 * @see #getCooldown()
	 * @generated
	 */
	void setCooldown(double value);

	/**
	 * Returns the value of the '<em><b>Ability Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rpg.AbilityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ability Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ability Type</em>' attribute.
	 * @see rpg.AbilityType
	 * @see #setAbilityType(AbilityType)
	 * @see rpg.RpgPackage#getAbility_AbilityType()
	 * @model required="true"
	 * @generated
	 */
	AbilityType getAbilityType();

	/**
	 * Sets the value of the '{@link rpg.Ability#getAbilityType <em>Ability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ability Type</em>' attribute.
	 * @see rpg.AbilityType
	 * @see #getAbilityType()
	 * @generated
	 */
	void setAbilityType(AbilityType value);

	/**
	 * Returns the value of the '<em><b>Cast Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cast Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cast Time</em>' attribute.
	 * @see #setCastTime(double)
	 * @see rpg.RpgPackage#getAbility_CastTime()
	 * @model
	 * @generated
	 */
	double getCastTime();

	/**
	 * Sets the value of the '{@link rpg.Ability#getCastTime <em>Cast Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cast Time</em>' attribute.
	 * @see #getCastTime()
	 * @generated
	 */
	void setCastTime(double value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(double)
	 * @see rpg.RpgPackage#getAbility_Range()
	 * @model required="true"
	 * @generated
	 */
	double getRange();

	/**
	 * Sets the value of the '{@link rpg.Ability#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(double value);

	/**
	 * Returns the value of the '<em><b>Range Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Unit</em>' reference.
	 * @see #setRangeUnit(RangeUnit)
	 * @see rpg.RpgPackage#getAbility_RangeUnit()
	 * @model required="true"
	 * @generated
	 */
	RangeUnit getRangeUnit();

	/**
	 * Sets the value of the '{@link rpg.Ability#getRangeUnit <em>Range Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Unit</em>' reference.
	 * @see #getRangeUnit()
	 * @generated
	 */
	void setRangeUnit(RangeUnit value);

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
	 * @see rpg.RpgPackage#getAbility_OnLevel()
	 * @model required="true"
	 * @generated
	 */
	int getOnLevel();

	/**
	 * Sets the value of the '{@link rpg.Ability#getOnLevel <em>On Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Level</em>' attribute.
	 * @see #getOnLevel()
	 * @generated
	 */
	void setOnLevel(int value);

	/**
	 * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.Effect}.
	 * It is bidirectional and its opposite is '{@link rpg.Effect#getAbility <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effects</em>' containment reference list.
	 * @see rpg.RpgPackage#getAbility_Effects()
	 * @see rpg.Effect#getAbility
	 * @model type="rpg.Effect" opposite="ability" containment="true" required="true"
	 * @generated
	 */
	EList getEffects();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rpg.Node#getAbilities <em>Abilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' container reference.
	 * @see #setNode(Node)
	 * @see rpg.RpgPackage#getAbility_Node()
	 * @see rpg.Node#getAbilities
	 * @model opposite="abilities" required="true" transient="false"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link rpg.Ability#getNode <em>Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' container reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

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
	 * @see rpg.RpgPackage#getAbility_IsLocked()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsLocked();

	/**
	 * Sets the value of the '{@link rpg.Ability#isIsLocked <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Locked</em>' attribute.
	 * @see #isIsLocked()
	 * @generated
	 */
	void setIsLocked(boolean value);

} // Ability
