/**
 */
package rpg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stat Talent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.StatTalent#getStatChanges <em>Stat Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getStatTalent()
 * @model
 * @generated
 */
public interface StatTalent extends Talent {
	/**
	 * Returns the value of the '<em><b>Stat Changes</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.StatChange}.
	 * It is bidirectional and its opposite is '{@link rpg.StatChange#getStatTalent <em>Stat Talent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stat Changes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stat Changes</em>' containment reference list.
	 * @see rpg.RpgPackage#getStatTalent_StatChanges()
	 * @see rpg.StatChange#getStatTalent
	 * @model type="rpg.StatChange" opposite="statTalent" containment="true" required="true"
	 * @generated
	 */
	EList getStatChanges();

} // StatTalent
