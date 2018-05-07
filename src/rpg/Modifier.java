/**
 */
package rpg;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.Modifier#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link rpg.Modifier#getValue <em>Value</em>}</li>
 *   <li>{@link rpg.Modifier#getBasedOnModifier <em>Based On Modifier</em>}</li>
 *   <li>{@link rpg.Modifier#getPriorityOrder <em>Priority Order</em>}</li>
 *   <li>{@link rpg.Modifier#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link rpg.Modifier#getBasedOnValue <em>Based On Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getModifier()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Modifier extends CDOObject {
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
	 * @see rpg.RpgPackage#getModifier_ChangeType()
	 * @model
	 * @generated
	 */
	ChangeType getChangeType();

	/**
	 * Sets the value of the '{@link rpg.Modifier#getChangeType <em>Change Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Type</em>' attribute.
	 * @see rpg.ChangeType
	 * @see #getChangeType()
	 * @generated
	 */
	void setChangeType(ChangeType value);

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
	 * @see rpg.RpgPackage#getModifier_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link rpg.Modifier#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Based On Modifier</b></em>' attribute.
	 * The literals are from the enumeration {@link rpg.ChangeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based On Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On Modifier</em>' attribute.
	 * @see rpg.ChangeType
	 * @see #setBasedOnModifier(ChangeType)
	 * @see rpg.RpgPackage#getModifier_BasedOnModifier()
	 * @model
	 * @generated
	 */
	ChangeType getBasedOnModifier();

	/**
	 * Sets the value of the '{@link rpg.Modifier#getBasedOnModifier <em>Based On Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Based On Modifier</em>' attribute.
	 * @see rpg.ChangeType
	 * @see #getBasedOnModifier()
	 * @generated
	 */
	void setBasedOnModifier(ChangeType value);

	/**
	 * Returns the value of the '<em><b>Priority Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Order</em>' attribute.
	 * @see #setPriorityOrder(int)
	 * @see rpg.RpgPackage#getModifier_PriorityOrder()
	 * @model required="true"
	 * @generated
	 */
	int getPriorityOrder();

	/**
	 * Sets the value of the '{@link rpg.Modifier#getPriorityOrder <em>Priority Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Order</em>' attribute.
	 * @see #getPriorityOrder()
	 * @generated
	 */
	void setPriorityOrder(int value);

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
	 * @see rpg.RpgPackage#getModifier_BasedOn()
	 * @model
	 * @generated
	 */
	CharacterStatistic getBasedOn();

	/**
	 * Sets the value of the '{@link rpg.Modifier#getBasedOn <em>Based On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Based On</em>' reference.
	 * @see #getBasedOn()
	 * @generated
	 */
	void setBasedOn(CharacterStatistic value);

	/**
	 * Returns the value of the '<em><b>Based On Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based On Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On Value</em>' attribute.
	 * @see #setBasedOnValue(double)
	 * @see rpg.RpgPackage#getModifier_BasedOnValue()
	 * @model
	 * @generated
	 */
	double getBasedOnValue();

	/**
	 * Sets the value of the '{@link rpg.Modifier#getBasedOnValue <em>Based On Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Based On Value</em>' attribute.
	 * @see #getBasedOnValue()
	 * @generated
	 */
	void setBasedOnValue(double value);

} // Modifier
