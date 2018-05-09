/**
 */
package rpg;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rpg.Branch#getName <em>Name</em>}</li>
 *   <li>{@link rpg.Branch#getLore <em>Lore</em>}</li>
 *   <li>{@link rpg.Branch#getDescription <em>Description</em>}</li>
 *   <li>{@link rpg.Branch#getBranchType <em>Branch Type</em>}</li>
 *   <li>{@link rpg.Branch#getStartNodes <em>Start Nodes</em>}</li>
 *   <li>{@link rpg.Branch#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link rpg.Branch#isIsInheritable <em>Is Inheritable</em>}</li>
 *   <li>{@link rpg.Branch#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see rpg.RpgPackage#getBranch()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidStartNodes ValidBranchTypeImplication'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ValidStartNodes='\n\t\t\tself.startNodes->forAll(node | node.nodeType = NodeType::ROOT or node.nodeType = NodeType::STANDALONE)' ValidStartNodes$message='\'Start nodes must have either ROOT or STANDALONE type\'' ValidBranchTypeImplication='\n\t\t\tif self.branchType = BranchType::TALENT then\n\t\t\t\tself.nodes->forAll(node | node.talents->size() >= 0 and node.abilities->size() = 0)\n\t\t\telse \n\t\t\t\tself.nodes->forAll(node | node.talents->size() = 0 and node.abilities->size() >= 0)\n\t\t\tendif' ValidBranchTypeImplication$message='\'Branch type dictates what the nodes can contain: abilities or talents.\''"
 * @extends CDOObject
 * @generated
 */
public interface Branch extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rpg.RpgPackage#getBranch_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rpg.Branch#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lore</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lore</em>' attribute.
	 * @see #setLore(String)
	 * @see rpg.RpgPackage#getBranch_Lore()
	 * @model
	 * @generated
	 */
	String getLore();

	/**
	 * Sets the value of the '{@link rpg.Branch#getLore <em>Lore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lore</em>' attribute.
	 * @see #getLore()
	 * @generated
	 */
	void setLore(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see rpg.RpgPackage#getBranch_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link rpg.Branch#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Branch Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rpg.BranchType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Type</em>' attribute.
	 * @see rpg.BranchType
	 * @see #setBranchType(BranchType)
	 * @see rpg.RpgPackage#getBranch_BranchType()
	 * @model required="true"
	 * @generated
	 */
	BranchType getBranchType();

	/**
	 * Sets the value of the '{@link rpg.Branch#getBranchType <em>Branch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Type</em>' attribute.
	 * @see rpg.BranchType
	 * @see #getBranchType()
	 * @generated
	 */
	void setBranchType(BranchType value);

	/**
	 * Returns the value of the '<em><b>Start Nodes</b></em>' reference list.
	 * The list contents are of type {@link rpg.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Nodes</em>' reference list.
	 * @see rpg.RpgPackage#getBranch_StartNodes()
	 * @model type="rpg.Node"
	 * @generated
	 */
	EList getStartNodes();

	/**
	 * Returns the value of the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tooltip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tooltip</em>' attribute.
	 * @see #setTooltip(String)
	 * @see rpg.RpgPackage#getBranch_Tooltip()
	 * @model required="true"
	 * @generated
	 */
	String getTooltip();

	/**
	 * Sets the value of the '{@link rpg.Branch#getTooltip <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip</em>' attribute.
	 * @see #getTooltip()
	 * @generated
	 */
	void setTooltip(String value);

	/**
	 * Returns the value of the '<em><b>Is Inheritable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Inheritable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Inheritable</em>' attribute.
	 * @see #setIsInheritable(boolean)
	 * @see rpg.RpgPackage#getBranch_IsInheritable()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsInheritable();

	/**
	 * Sets the value of the '{@link rpg.Branch#isIsInheritable <em>Is Inheritable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Inheritable</em>' attribute.
	 * @see #isIsInheritable()
	 * @generated
	 */
	void setIsInheritable(boolean value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link rpg.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see rpg.RpgPackage#getBranch_Nodes()
	 * @model type="rpg.Node" containment="true" required="true"
	 * @generated
	 */
	EList getNodes();

} // Branch
