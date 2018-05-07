/**
 */
package rpg;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stat Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.StatChange#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link rpg.StatChange#getTickType <em>Tick Type</em>}</li>
 *   <li>{@link rpg.StatChange#getBaseValue <em>Base Value</em>}</li>
 *   <li>{@link rpg.StatChange#getTickValue <em>Tick Value</em>}</li>
 *   <li>{@link rpg.StatChange#getChangesStatistic <em>Changes Statistic</em>}</li>
 *   <li>{@link rpg.StatChange#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getStatChange()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface StatChange extends CDOObject {
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
	 * @see rpg.RpgPackage#getStatChange_ChangeType()
	 * @model required="true"
	 * @generated
	 */
	ChangeType getChangeType();

	/**
	 * Sets the value of the '{@link rpg.StatChange#getChangeType <em>Change Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Type</em>' attribute.
	 * @see rpg.ChangeType
	 * @see #getChangeType()
	 * @generated
	 */
	void setChangeType(ChangeType value);

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
	 * @see rpg.RpgPackage#getStatChange_TickType()
	 * @model required="true"
	 * @generated
	 */
	TickType getTickType();

	/**
	 * Sets the value of the '{@link rpg.StatChange#getTickType <em>Tick Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tick Type</em>' attribute.
	 * @see rpg.TickType
	 * @see #getTickType()
	 * @generated
	 */
	void setTickType(TickType value);

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
	 * @see rpg.RpgPackage#getStatChange_BaseValue()
	 * @model required="true"
	 * @generated
	 */
	double getBaseValue();

	/**
	 * Sets the value of the '{@link rpg.StatChange#getBaseValue <em>Base Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Value</em>' attribute.
	 * @see #getBaseValue()
	 * @generated
	 */
	void setBaseValue(double value);

	/**
	 * Returns the value of the '<em><b>Tick Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tick Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tick Value</em>' attribute.
	 * @see #setTickValue(int)
	 * @see rpg.RpgPackage#getStatChange_TickValue()
	 * @model required="true"
	 * @generated
	 */
	int getTickValue();

	/**
	 * Sets the value of the '{@link rpg.StatChange#getTickValue <em>Tick Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tick Value</em>' attribute.
	 * @see #getTickValue()
	 * @generated
	 */
	void setTickValue(int value);

	/**
	 * Returns the value of the '<em><b>Changes Statistic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changes Statistic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changes Statistic</em>' reference.
	 * @see #setChangesStatistic(CharacterStatistic)
	 * @see rpg.RpgPackage#getStatChange_ChangesStatistic()
	 * @model required="true"
	 * @generated
	 */
	CharacterStatistic getChangesStatistic();

	/**
	 * Sets the value of the '{@link rpg.StatChange#getChangesStatistic <em>Changes Statistic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changes Statistic</em>' reference.
	 * @see #getChangesStatistic()
	 * @generated
	 */
	void setChangesStatistic(CharacterStatistic value);

	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.Modifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' containment reference list.
	 * @see rpg.RpgPackage#getStatChange_Modifiers()
	 * @model type="rpg.Modifier" containment="true"
	 * @generated
	 */
	EList getModifiers();

} // StatChange
