/**
 */
package rpg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unlock Ability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.UnlockAbility#getAbility <em>Ability</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getUnlockAbility()
 * @model
 * @generated
 */
public interface UnlockAbility extends UnlockTalent {
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
	 * @see rpg.RpgPackage#getUnlockAbility_Ability()
	 * @model required="true"
	 * @generated
	 */
	Ability getAbility();

	/**
	 * Sets the value of the '{@link rpg.UnlockAbility#getAbility <em>Ability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ability</em>' reference.
	 * @see #getAbility()
	 * @generated
	 */
	void setAbility(Ability value);

} // UnlockAbility
