/**
 */
package rpg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.Tick#getTickType <em>Tick Type</em>}</li>
 *   <li>{@link rpg.Tick#getStatChange <em>Stat Change</em>}</li>
 *   <li>{@link rpg.Tick#getValue <em>Value</em>}</li>
 *   <li>{@link rpg.Tick#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getTick()
 * @model
 * @generated
 */
public interface Tick extends EObject {
	/**
	 * Returns the value of the '<em><b>Tick Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rpg.TickType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tick Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tick Type</em>' attribute.
	 * @see rpg.TickType
	 * @see #setTickType(TickType)
	 * @see rpg.RpgPackage#getTick_TickType()
	 * @model required="true"
	 * @generated
	 */
	TickType getTickType();

	/**
	 * Sets the value of the '{@link rpg.Tick#getTickType <em>Tick Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tick Type</em>' attribute.
	 * @see rpg.TickType
	 * @see #getTickType()
	 * @generated
	 */
	void setTickType(TickType value);

	/**
	 * Returns the value of the '<em><b>Stat Change</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rpg.StatChange#getTick <em>Tick</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stat Change</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stat Change</em>' container reference.
	 * @see #setStatChange(StatChange)
	 * @see rpg.RpgPackage#getTick_StatChange()
	 * @see rpg.StatChange#getTick
	 * @model opposite="tick" required="true" transient="false"
	 * @generated
	 */
	StatChange getStatChange();

	/**
	 * Sets the value of the '{@link rpg.Tick#getStatChange <em>Stat Change</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stat Change</em>' container reference.
	 * @see #getStatChange()
	 * @generated
	 */
	void setStatChange(StatChange value);

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
	 * @see rpg.RpgPackage#getTick_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link rpg.Tick#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(double)
	 * @see rpg.RpgPackage#getTick_Duration()
	 * @model required="true"
	 * @generated
	 */
	double getDuration();

	/**
	 * Sets the value of the '{@link rpg.Tick#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);

} // Tick
