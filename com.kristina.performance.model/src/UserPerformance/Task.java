/**
 */
package UserPerformance;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UserPerformance.Task#getName <em>Name</em>}</li>
 *   <li>{@link UserPerformance.Task#getStatus <em>Status</em>}</li>
 *   <li>{@link UserPerformance.Task#getDateStart <em>Date Start</em>}</li>
 *   <li>{@link UserPerformance.Task#getDateEnd <em>Date End</em>}</li>
 *   <li>{@link UserPerformance.Task#getCurrentDate <em>Current Date</em>}</li>
 *   <li>{@link UserPerformance.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link UserPerformance.Task#getSubtasks <em>Subtasks</em>}</li>
 *   <li>{@link UserPerformance.Task#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see UserPerformance.UserPerformancePackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
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
	 * @see UserPerformance.UserPerformancePackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UserPerformance.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see UserPerformance.UserPerformancePackage#getTask_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link UserPerformance.Task#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Date Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Start</em>' attribute.
	 * @see #setDateStart(Date)
	 * @see UserPerformance.UserPerformancePackage#getTask_DateStart()
	 * @model
	 * @generated
	 */
	Date getDateStart();

	/**
	 * Sets the value of the '{@link UserPerformance.Task#getDateStart <em>Date Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Start</em>' attribute.
	 * @see #getDateStart()
	 * @generated
	 */
	void setDateStart(Date value);

	/**
	 * Returns the value of the '<em><b>Date End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date End</em>' attribute.
	 * @see #setDateEnd(Date)
	 * @see UserPerformance.UserPerformancePackage#getTask_DateEnd()
	 * @model
	 * @generated
	 */
	Date getDateEnd();

	/**
	 * Sets the value of the '{@link UserPerformance.Task#getDateEnd <em>Date End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date End</em>' attribute.
	 * @see #getDateEnd()
	 * @generated
	 */
	void setDateEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Current Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Date</em>' attribute.
	 * @see #setCurrentDate(Date)
	 * @see UserPerformance.UserPerformancePackage#getTask_CurrentDate()
	 * @model
	 * @generated
	 */
	Date getCurrentDate();

	/**
	 * Sets the value of the '{@link UserPerformance.Task#getCurrentDate <em>Current Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Date</em>' attribute.
	 * @see #getCurrentDate()
	 * @generated
	 */
	void setCurrentDate(Date value);

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
	 * @see UserPerformance.UserPerformancePackage#getTask_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link UserPerformance.Task#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Subtasks</b></em>' containment reference list.
	 * The list contents are of type {@link UserPerformance.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtasks</em>' containment reference list.
	 * @see UserPerformance.UserPerformancePackage#getTask_Subtasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getSubtasks();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(Parameters)
	 * @see UserPerformance.UserPerformancePackage#getTask_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	Parameters getParameters();

	/**
	 * Sets the value of the '{@link UserPerformance.Task#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(Parameters value);

} // Task
