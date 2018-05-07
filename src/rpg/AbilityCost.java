/**
 */
package rpg;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ability Cost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.AbilityCost#isConsume <em>Consume</em>}</li>
 *   <li>{@link rpg.AbilityCost#getCost <em>Cost</em>}</li>
 *   <li>{@link rpg.AbilityCost#getStatistic <em>Statistic</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getAbilityCost()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface AbilityCost extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Consume</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consume</em>' attribute.
	 * @see #setConsume(boolean)
	 * @see rpg.RpgPackage#getAbilityCost_Consume()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isConsume();

	/**
	 * Sets the value of the '{@link rpg.AbilityCost#isConsume <em>Consume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consume</em>' attribute.
	 * @see #isConsume()
	 * @generated
	 */
	void setConsume(boolean value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see rpg.RpgPackage#getAbilityCost_Cost()
	 * @model
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link rpg.AbilityCost#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Statistic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statistic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statistic</em>' reference.
	 * @see #setStatistic(CharacterStatistic)
	 * @see rpg.RpgPackage#getAbilityCost_Statistic()
	 * @model required="true"
	 * @generated
	 */
	CharacterStatistic getStatistic();

	/**
	 * Sets the value of the '{@link rpg.AbilityCost#getStatistic <em>Statistic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistic</em>' reference.
	 * @see #getStatistic()
	 * @generated
	 */
	void setStatistic(CharacterStatistic value);

} // AbilityCost
