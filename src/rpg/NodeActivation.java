/**
 */
package rpg;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.NodeActivation#getText <em>Text</em>}</li>
 *   <li>{@link rpg.NodeActivation#isIsAuto <em>Is Auto</em>}</li>
 *   <li>{@link rpg.NodeActivation#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getNodeActivation()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface NodeActivation extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see rpg.RpgPackage#getNodeActivation_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link rpg.NodeActivation#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Is Auto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Auto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Auto</em>' attribute.
	 * @see #setIsAuto(boolean)
	 * @see rpg.RpgPackage#getNodeActivation_IsAuto()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsAuto();

	/**
	 * Sets the value of the '{@link rpg.NodeActivation#isIsAuto <em>Is Auto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Auto</em>' attribute.
	 * @see #isIsAuto()
	 * @generated
	 */
	void setIsAuto(boolean value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see rpg.RpgPackage#getNodeActivation_Level()
	 * @model required="true"
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link rpg.NodeActivation#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

} // NodeActivation
