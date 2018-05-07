/**
 */
package rpg;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link rpg.Ability#getAbilityType <em>Ability Type</em>}</li>
 *   <li>{@link rpg.Ability#getCastTime <em>Cast Time</em>}</li>
 *   <li>{@link rpg.Ability#getRange <em>Range</em>}</li>
 *   <li>{@link rpg.Ability#getRangeUnit <em>Range Unit</em>}</li>
 *   <li>{@link rpg.Ability#getOnLevel <em>On Level</em>}</li>
 *   <li>{@link rpg.Ability#getEffects <em>Effects</em>}</li>
 *   <li>{@link rpg.Ability#getCosts <em>Costs</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getAbility()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidCastTime'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ValidCastTime='\n\t\tif self.castType = CastType::NO_CAST or self.castType = CastType::INSTANT then\n\t\t\tself.castTime = 0.0\n\t\telse\n\t\t\tself.castTime > 0.0\n\t\tendif' ValidCastTime$message='\'NO_CAST and INSTANT abilities have no cast time, the rest do.\''"
 * @extends CDOObject
 * @generated
 */
public interface Ability extends CDOObject {
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effects</em>' containment reference list.
	 * @see rpg.RpgPackage#getAbility_Effects()
	 * @model type="rpg.Effect" containment="true" required="true"
	 * @generated
	 */
	EList getEffects();

	/**
	 * Returns the value of the '<em><b>Costs</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.AbilityCost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Costs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Costs</em>' containment reference list.
	 * @see rpg.RpgPackage#getAbility_Costs()
	 * @model type="rpg.AbilityCost" containment="true" required="true"
	 * @generated
	 */
	EList getCosts();

} // Ability
