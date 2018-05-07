/**
 */
package rpg.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import rpg.Branch;
import rpg.BranchType;
import rpg.RpgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.BranchImpl#getName <em>Name</em>}</li>
 *   <li>{@link rpg.impl.BranchImpl#getLore <em>Lore</em>}</li>
 *   <li>{@link rpg.impl.BranchImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rpg.impl.BranchImpl#getBranchType <em>Branch Type</em>}</li>
 *   <li>{@link rpg.impl.BranchImpl#getStartNodes <em>Start Nodes</em>}</li>
 *   <li>{@link rpg.impl.BranchImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link rpg.impl.BranchImpl#isIsInheritable <em>Is Inheritable</em>}</li>
 *   <li>{@link rpg.impl.BranchImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchImpl extends CDOObjectImpl implements Branch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(RpgPackage.Literals.BRANCH__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(RpgPackage.Literals.BRANCH__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLore() {
		return (String)eGet(RpgPackage.Literals.BRANCH__LORE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLore(String newLore) {
		eSet(RpgPackage.Literals.BRANCH__LORE, newLore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(RpgPackage.Literals.BRANCH__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(RpgPackage.Literals.BRANCH__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchType getBranchType() {
		return (BranchType)eGet(RpgPackage.Literals.BRANCH__BRANCH_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranchType(BranchType newBranchType) {
		eSet(RpgPackage.Literals.BRANCH__BRANCH_TYPE, newBranchType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStartNodes() {
		return (EList)eGet(RpgPackage.Literals.BRANCH__START_NODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTooltip() {
		return (String)eGet(RpgPackage.Literals.BRANCH__TOOLTIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTooltip(String newTooltip) {
		eSet(RpgPackage.Literals.BRANCH__TOOLTIP, newTooltip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInheritable() {
		return ((Boolean)eGet(RpgPackage.Literals.BRANCH__IS_INHERITABLE, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInheritable(boolean newIsInheritable) {
		eSet(RpgPackage.Literals.BRANCH__IS_INHERITABLE, new Boolean(newIsInheritable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNodes() {
		return (EList)eGet(RpgPackage.Literals.BRANCH__NODES, true);
	}

} //BranchImpl
