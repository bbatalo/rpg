/**
 */
package rpg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unlock Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.UnlockEffect#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getUnlockEffect()
 * @model
 * @generated
 */
public interface UnlockEffect extends UnlockTalent {
	/**
	 * Returns the value of the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' reference.
	 * @see #setEffect(Effect)
	 * @see rpg.RpgPackage#getUnlockEffect_Effect()
	 * @model required="true"
	 * @generated
	 */
	Effect getEffect();

	/**
	 * Sets the value of the '{@link rpg.UnlockEffect#getEffect <em>Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(Effect value);

} // UnlockEffect
