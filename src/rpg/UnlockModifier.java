/**
 */
package rpg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unlock Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.UnlockModifier#getModifier <em>Modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getUnlockModifier()
 * @model
 * @generated
 */
public interface UnlockModifier extends UnlockTalent {
	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' reference.
	 * @see #setModifier(Modifier)
	 * @see rpg.RpgPackage#getUnlockModifier_Modifier()
	 * @model required="true"
	 * @generated
	 */
	Modifier getModifier();

	/**
	 * Sets the value of the '{@link rpg.UnlockModifier#getModifier <em>Modifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' reference.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(Modifier value);

} // UnlockModifier
