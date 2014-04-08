/**
 */
package UserPerformance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UserPerformance.Performance#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @see UserPerformance.UserPerformancePackage#getPerformance()
 * @model
 * @generated
 */
public interface Performance extends EObject {
	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference.
	 * @see #setUsers(User)
	 * @see UserPerformance.UserPerformancePackage#getPerformance_Users()
	 * @model containment="true"
	 * @generated
	 */
	User getUsers();

	/**
	 * Sets the value of the '{@link UserPerformance.Performance#getUsers <em>Users</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Users</em>' containment reference.
	 * @see #getUsers()
	 * @generated
	 */
	void setUsers(User value);

} // Performance
