/**
 */
package rpg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unlock Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.UnlockChange#getChange <em>Change</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getUnlockChange()
 * @model
 * @generated
 */
public interface UnlockChange extends UnlockTalent {
	/**
	 * Returns the value of the '<em><b>Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change</em>' reference.
	 * @see #setChange(Change)
	 * @see rpg.RpgPackage#getUnlockChange_Change()
	 * @model required="true"
	 * @generated
	 */
	Change getChange();

	/**
	 * Sets the value of the '{@link rpg.UnlockChange#getChange <em>Change</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change</em>' reference.
	 * @see #getChange()
	 * @generated
	 */
	void setChange(Change value);

} // UnlockChange
