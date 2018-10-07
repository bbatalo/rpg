/**
 */
package rpg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cooldown Talent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.CooldownTalent#getCooldownChanges <em>Cooldown Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getCooldownTalent()
 * @model
 * @generated
 */
public interface CooldownTalent extends Talent {
	/**
	 * Returns the value of the '<em><b>Cooldown Changes</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.CooldownChange}.
	 * It is bidirectional and its opposite is '{@link rpg.CooldownChange#getCooldownTalent <em>Cooldown Talent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cooldown Changes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cooldown Changes</em>' containment reference list.
	 * @see rpg.RpgPackage#getCooldownTalent_CooldownChanges()
	 * @see rpg.CooldownChange#getCooldownTalent
	 * @model type="rpg.CooldownChange" opposite="cooldownTalent" containment="true" required="true"
	 * @generated
	 */
	EList getCooldownChanges();

} // CooldownTalent
