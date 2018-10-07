/**
 */
package rpg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Randomizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.Randomizer#getValue <em>Value</em>}</li>
 *   <li>{@link rpg.Randomizer#getBasedOn <em>Based On</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getRandomizer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MeaningfulRandomizer ProperStatisticBase'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot MeaningfulRandomizer='\n\t\t\t(self.value > 0 implies self.basedOn = null) and \n\t\t\t(self.basedOn <> null implies self.value = 0)' MeaningfulRandomizer$message='\'Randomizer should have value greater than zero or be based on character statistic.\'' ProperStatisticBase='\n\t\t\tself.basedOn <> null implies\n\t\t\tself.basedOn.minValue >= 0 and self.basedOn.maxValue <= 100 and self.basedOn.maxValue = self.basedOn.startLimitValue' ProperStatisticBase$message='\'Referenced statistics should model chance, therefore values should be between 0 and 100.\''"
 * @generated
 */
public interface Randomizer extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see rpg.RpgPackage#getRandomizer_Value()
	 * @model default="0" required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link rpg.Randomizer#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

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
	 * @see rpg.RpgPackage#getRandomizer_BasedOn()
	 * @model
	 * @generated
	 */
	CharacterStatistic getBasedOn();

	/**
	 * Sets the value of the '{@link rpg.Randomizer#getBasedOn <em>Based On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Based On</em>' reference.
	 * @see #getBasedOn()
	 * @generated
	 */
	void setBasedOn(CharacterStatistic value);

} // Randomizer
