/**
 */
package rpg;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activation Cost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.ActivationCost#isConsume <em>Consume</em>}</li>
 *   <li>{@link rpg.ActivationCost#getCost <em>Cost</em>}</li>
 *   <li>{@link rpg.ActivationCost#getStatistic <em>Statistic</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getActivationCost()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProperCost'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProperCost='self.cost >= self.statistic.minValue and self.cost <= self.statistic.startLimitValue' ProperCost$message='\'The cost must be between minimum and maximum values of the statistic.\''"
 * @extends CDOObject
 * @generated
 */
public interface ActivationCost extends CDOObject {
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
	 * @see rpg.RpgPackage#getActivationCost_Consume()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isConsume();

	/**
	 * Sets the value of the '{@link rpg.ActivationCost#isConsume <em>Consume</em>}' attribute.
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
	 * @see rpg.RpgPackage#getActivationCost_Cost()
	 * @model required="true"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link rpg.ActivationCost#getCost <em>Cost</em>}' attribute.
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
	 * @see rpg.RpgPackage#getActivationCost_Statistic()
	 * @model required="true"
	 * @generated
	 */
	CharacterStatistic getStatistic();

	/**
	 * Sets the value of the '{@link rpg.ActivationCost#getStatistic <em>Statistic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistic</em>' reference.
	 * @see #getStatistic()
	 * @generated
	 */
	void setStatistic(CharacterStatistic value);

} // ActivationCost
