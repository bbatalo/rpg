/**
 */
package rpg;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character Statistic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.CharacterStatistic#getName <em>Name</em>}</li>
 *   <li>{@link rpg.CharacterStatistic#getLore <em>Lore</em>}</li>
 *   <li>{@link rpg.CharacterStatistic#getDescription <em>Description</em>}</li>
 *   <li>{@link rpg.CharacterStatistic#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link rpg.CharacterStatistic#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link rpg.CharacterStatistic#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link rpg.CharacterStatistic#getStartLimitValue <em>Start Limit Value</em>}</li>
 *   <li>{@link rpg.CharacterStatistic#getStatType <em>Stat Type</em>}</li>
 *   <li>{@link rpg.CharacterStatistic#isIsTargetable <em>Is Targetable</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getCharacterStatistic()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LimitBetweenMinAndMax'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot LimitBetweenMinAndMax='\n\t\t\tstartLimitValue <= maxValue and startLimitValue >= minValue' LimitBetweenMinAndMax$message='\'Value of startLimitValue must be between the values of minValue and maxValue.\''"
 * @extends CDOObject
 * @generated
 */
public interface CharacterStatistic extends CDOObject {
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
	 * @see rpg.RpgPackage#getCharacterStatistic_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rpg.CharacterStatistic#getName <em>Name</em>}' attribute.
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
	 * @see rpg.RpgPackage#getCharacterStatistic_Lore()
	 * @model
	 * @generated
	 */
	String getLore();

	/**
	 * Sets the value of the '{@link rpg.CharacterStatistic#getLore <em>Lore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lore</em>' attribute.
	 * @see #getLore()
	 * @generated
	 */
	void setLore(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see rpg.RpgPackage#getCharacterStatistic_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link rpg.CharacterStatistic#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see rpg.RpgPackage#getCharacterStatistic_Tooltip()
	 * @model required="true"
	 * @generated
	 */
	String getTooltip();

	/**
	 * Sets the value of the '{@link rpg.CharacterStatistic#getTooltip <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip</em>' attribute.
	 * @see #getTooltip()
	 * @generated
	 */
	void setTooltip(String value);

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(double)
	 * @see rpg.RpgPackage#getCharacterStatistic_MinValue()
	 * @model default="1" required="true"
	 * @generated
	 */
	double getMinValue();

	/**
	 * Sets the value of the '{@link rpg.CharacterStatistic#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(double value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(double)
	 * @see rpg.RpgPackage#getCharacterStatistic_MaxValue()
	 * @model default="1" required="true"
	 * @generated
	 */
	double getMaxValue();

	/**
	 * Sets the value of the '{@link rpg.CharacterStatistic#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(double value);

	/**
	 * Returns the value of the '<em><b>Start Limit Value</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Limit Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Limit Value</em>' attribute.
	 * @see #setStartLimitValue(double)
	 * @see rpg.RpgPackage#getCharacterStatistic_StartLimitValue()
	 * @model default="1" required="true"
	 * @generated
	 */
	double getStartLimitValue();

	/**
	 * Sets the value of the '{@link rpg.CharacterStatistic#getStartLimitValue <em>Start Limit Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Limit Value</em>' attribute.
	 * @see #getStartLimitValue()
	 * @generated
	 */
	void setStartLimitValue(double value);

	/**
	 * Returns the value of the '<em><b>Stat Type</b></em>' attribute.
	 * The default value is <code>"ASCENDING"</code>.
	 * The literals are from the enumeration {@link rpg.StatType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stat Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stat Type</em>' attribute.
	 * @see rpg.StatType
	 * @see #setStatType(StatType)
	 * @see rpg.RpgPackage#getCharacterStatistic_StatType()
	 * @model default="ASCENDING" required="true"
	 * @generated
	 */
	StatType getStatType();

	/**
	 * Sets the value of the '{@link rpg.CharacterStatistic#getStatType <em>Stat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stat Type</em>' attribute.
	 * @see rpg.StatType
	 * @see #getStatType()
	 * @generated
	 */
	void setStatType(StatType value);

	/**
	 * Returns the value of the '<em><b>Is Targetable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Targetable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Targetable</em>' attribute.
	 * @see #setIsTargetable(boolean)
	 * @see rpg.RpgPackage#getCharacterStatistic_IsTargetable()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsTargetable();

	/**
	 * Sets the value of the '{@link rpg.CharacterStatistic#isIsTargetable <em>Is Targetable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Targetable</em>' attribute.
	 * @see #isIsTargetable()
	 * @generated
	 */
	void setIsTargetable(boolean value);

} // CharacterStatistic
