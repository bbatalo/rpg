/**
 */
package rpg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.Modifier#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link rpg.Modifier#getValue <em>Value</em>}</li>
 *   <li>{@link rpg.Modifier#getBasedOnModifier <em>Based On Modifier</em>}</li>
 *   <li>{@link rpg.Modifier#getPriorityOrder <em>Priority Order</em>}</li>
 *   <li>{@link rpg.Modifier#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link rpg.Modifier#getBasedOnValue <em>Based On Value</em>}</li>
 *   <li>{@link rpg.Modifier#getStatChange <em>Stat Change</em>}</li>
 *   <li>{@link rpg.Modifier#getRandomizer <em>Randomizer</em>}</li>
 *   <li>{@link rpg.Modifier#getOnLevel <em>On Level</em>}</li>
 *   <li>{@link rpg.Modifier#isExclusive <em>Exclusive</em>}</li>
 *   <li>{@link rpg.Modifier#isTargetStatistic <em>Target Statistic</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getModifier()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoMovingLimits'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NoMovingLimits='\n\t\t\tself.changeType <> ChangeType::MOVE_LIMIT_UP and self.changeType <> ChangeType::MOVE_LIMIT_DOWN and self.changeType <> ChangeType::SET_LIMIT' NoMovingLimits$message='\'A modifier cannot move a statistic limit.\''"
 * @generated
 */
public interface Modifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Change Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rpg.ChangeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Type</em>' attribute.
	 * @see rpg.ChangeType
	 * @see #setChangeType(ChangeType)
	 * @see rpg.RpgPackage#getModifier_ChangeType()
	 * @model
	 * @generated
	 */
	ChangeType getChangeType();

	/**
	 * Sets the value of the '{@link rpg.Modifier#getChangeType <em>Change Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Type</em>' attribute.
	 * @see rpg.ChangeType
	 * @see #getChangeType()
	 * @generated
	 */
	void setChangeType(ChangeType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see rpg.RpgPackage#getModifier_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link rpg.Modifier#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Based On Modifier</b></em>' attribute.
	 * The literals are from the enumeration {@link rpg.ChangeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based On Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On Modifier</em>' attribute.
	 * @see rpg.ChangeType
	 * @see #setBasedOnModifier(ChangeType)
	 * @see rpg.RpgPackage#getModifier_BasedOnModifier()
	 * @model
	 * @generated
	 */
	ChangeType getBasedOnModifier();

	/**
	 * Sets the value of the '{@link rpg.Modifier#getBasedOnModifier <em>Based On Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Based On Modifier</em>' attribute.
	 * @see rpg.ChangeType
	 * @see #getBasedOnModifier()
	 * @generated
	 */
	void setBasedOnModifier(ChangeType value);

	/**
	 * Returns the value of the '<em><b>Priority Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Order</em>' attribute.
	 * @see #setPriorityOrder(int)
	 * @see rpg.RpgPackage#getModifier_PriorityOrder()
	 * @model required="true"
	 * @generated
	 */
	int getPriorityOrder();

	/**
	 * Sets the value of the '{@link rpg.Modifier#getPriorityOrder <em>Priority Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Order</em>' attribute.
	 * @see #getPriorityOrder()
	 * @generated
	 */
	void setPriorityOrder(int value);

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On</em>' reference.
	 * @see #setBasedOn(CharacterStatistic)
	 * @see rpg.RpgPackage#getModifier_BasedOn()
	 * @model
	 * @generated
	 */
	CharacterStatistic getBasedOn();

	/**
	 * Sets the value of the '{@link rpg.Modifier#getBasedOn <em>Based On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Based On</em>' reference.
	 * @see #getBasedOn()
	 * @generated
	 */
	void setBasedOn(CharacterStatistic value);

	/**
	 * Returns the value of the '<em><b>Based On Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based On Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On Value</em>' attribute.
	 * @see #setBasedOnValue(double)
	 * @see rpg.RpgPackage#getModifier_BasedOnValue()
	 * @model
	 * @generated
	 */
	double getBasedOnValue();

	/**
	 * Sets the value of the '{@link rpg.Modifier#getBasedOnValue <em>Based On Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Based On Value</em>' attribute.
	 * @see #getBasedOnValue()
	 * @generated
	 */
	void setBasedOnValue(double value);

	/**
	 * Returns the value of the '<em><b>Stat Change</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rpg.StatChange#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stat Change</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stat Change</em>' container reference.
	 * @see #setStatChange(StatChange)
	 * @see rpg.RpgPackage#getModifier_StatChange()
	 * @see rpg.StatChange#getModifiers
	 * @model opposite="modifiers" required="true" transient="false"
	 * @generated
	 */
	StatChange getStatChange();

	/**
	 * Sets the value of the '{@link rpg.Modifier#getStatChange <em>Stat Change</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stat Change</em>' container reference.
	 * @see #getStatChange()
	 * @generated
	 */
	void setStatChange(StatChange value);

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
	 * @see rpg.RpgPackage#getModifier_Randomizer()
	 * @model containment="true"
	 * @generated
	 */
	Randomizer getRandomizer();

	/**
	 * Sets the value of the '{@link rpg.Modifier#getRandomizer <em>Randomizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Randomizer</em>' containment reference.
	 * @see #getRandomizer()
	 * @generated
	 */
	void setRandomizer(Randomizer value);

	/**
	 * Returns the value of the '<em><b>On Level</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Level</em>' attribute.
	 * @see #setOnLevel(int)
	 * @see rpg.RpgPackage#getModifier_OnLevel()
	 * @model default="1"
	 * @generated
	 */
	int getOnLevel();

	/**
	 * Sets the value of the '{@link rpg.Modifier#getOnLevel <em>On Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Level</em>' attribute.
	 * @see #getOnLevel()
	 * @generated
	 */
	void setOnLevel(int value);

	/**
	 * Returns the value of the '<em><b>Exclusive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive</em>' attribute.
	 * @see #setExclusive(boolean)
	 * @see rpg.RpgPackage#getModifier_Exclusive()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isExclusive();

	/**
	 * Sets the value of the '{@link rpg.Modifier#isExclusive <em>Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive</em>' attribute.
	 * @see #isExclusive()
	 * @generated
	 */
	void setExclusive(boolean value);

	/**
	 * Returns the value of the '<em><b>Target Statistic</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Statistic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Statistic</em>' attribute.
	 * @see #setTargetStatistic(boolean)
	 * @see rpg.RpgPackage#getModifier_TargetStatistic()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isTargetStatistic();

	/**
	 * Sets the value of the '{@link rpg.Modifier#isTargetStatistic <em>Target Statistic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Statistic</em>' attribute.
	 * @see #isTargetStatistic()
	 * @generated
	 */
	void setTargetStatistic(boolean value);

} // Modifier
