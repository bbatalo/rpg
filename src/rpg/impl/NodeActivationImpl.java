/**
 */
package rpg.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import rpg.NodeActivation;
import rpg.RpgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rpg.impl.NodeActivationImpl#getText <em>Text</em>}</li>
 *   <li>{@link rpg.impl.NodeActivationImpl#isIsAuto <em>Is Auto</em>}</li>
 *   <li>{@link rpg.impl.NodeActivationImpl#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NodeActivationImpl extends CDOObjectImpl implements NodeActivation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RpgPackage.Literals.NODE_ACTIVATION;
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
	public String getText() {
		return (String)eGet(RpgPackage.Literals.NODE_ACTIVATION__TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		eSet(RpgPackage.Literals.NODE_ACTIVATION__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAuto() {
		return ((Boolean)eGet(RpgPackage.Literals.NODE_ACTIVATION__IS_AUTO, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAuto(boolean newIsAuto) {
		eSet(RpgPackage.Literals.NODE_ACTIVATION__IS_AUTO, new Boolean(newIsAuto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		return ((Integer)eGet(RpgPackage.Literals.NODE_ACTIVATION__LEVEL, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(int newLevel) {
		eSet(RpgPackage.Literals.NODE_ACTIVATION__LEVEL, new Integer(newLevel));
	}

} //NodeActivationImpl
