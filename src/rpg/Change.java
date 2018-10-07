/**
 */
package rpg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.Change#getBaseValue <em>Base Value</em>}</li>
 *   <li>{@link rpg.Change#getChangeValueType <em>Change Value Type</em>}</li>
 *   <li>{@link rpg.Change#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link rpg.Change#getEffect <em>Effect</em>}</li>
 *   <li>{@link rpg.Change#isIsLocked <em>Is Locked</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getChange()
 * @model abstract="true"
 * @generated
 */
public interface Change extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Value</em>' attribute.
	 * @see #setBaseValue(double)
	 * @see rpg.RpgPackage#getChange_BaseValue()
	 * @model required="true"
	 * @generated
	 */
	double getBaseValue();

	/**
	 * Sets the value of the '{@link rpg.Change#getBaseValue <em>Base Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Value</em>' attribute.
	 * @see #getBaseValue()
	 * @generated
	 */
	void setBaseValue(double value);

	/**
	 * Returns the value of the '<em><b>Change Value Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rpg.ChangeValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Value Type</em>' attribute.
	 * @see rpg.ChangeValueType
	 * @see #setChangeValueType(ChangeValueType)
	 * @see rpg.RpgPackage#getChange_ChangeValueType()
	 * @model required="true"
	 * @generated
	 */
	ChangeValueType getChangeValueType();

	/**
	 * Sets the value of the '{@link rpg.Change#getChangeValueType <em>Change Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Value Type</em>' attribute.
	 * @see rpg.ChangeValueType
	 * @see #getChangeValueType()
	 * @generated
	 */
	void setChangeValueType(ChangeValueType value);

	/**
	 * Returns the value of the '<em><b>Change Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rpg.ChangeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Type</em>' attribute.
	 * @see rpg.ChangeType
	 * @see #setChangeType(ChangeType)
	 * @see rpg.RpgPackage#getChange_ChangeType()
	 * @model required="true"
	 * @generated
	 */
	ChangeType getChangeType();

	/**
	 * Sets the value of the '{@link rpg.Change#getChangeType <em>Change Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Type</em>' attribute.
	 * @see rpg.ChangeType
	 * @see #getChangeType()
	 * @generated
	 */
	void setChangeType(ChangeType value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rpg.Effect#getChanges <em>Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' container reference.
	 * @see #setEffect(Effect)
	 * @see rpg.RpgPackage#getChange_Effect()
	 * @see rpg.Effect#getChanges
	 * @model opposite="changes" transient="false"
	 * @generated
	 */
	Effect getEffect();

	/**
	 * Sets the value of the '{@link rpg.Change#getEffect <em>Effect</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' container reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(Effect value);

	/**
	 * Returns the value of the '<em><b>Is Locked</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Locked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Locked</em>' attribute.
	 * @see #setIsLocked(boolean)
	 * @see rpg.RpgPackage#getChange_IsLocked()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsLocked();

	/**
	 * Sets the value of the '{@link rpg.Change#isIsLocked <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Locked</em>' attribute.
	 * @see #isIsLocked()
	 * @generated
	 */
	void setIsLocked(boolean value);

} // Change
