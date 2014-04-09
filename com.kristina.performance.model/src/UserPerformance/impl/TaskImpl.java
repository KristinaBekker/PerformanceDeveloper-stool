/**
 */
package UserPerformance.impl;

import UserPerformance.Parameters;
import UserPerformance.Task;
import UserPerformance.UserPerformancePackage;
import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link UserPerformance.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link UserPerformance.impl.TaskImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link UserPerformance.impl.TaskImpl#getDateStart <em>Date Start</em>}</li>
 *   <li>{@link UserPerformance.impl.TaskImpl#getDateEnd <em>Date End</em>}</li>
 *   <li>{@link UserPerformance.impl.TaskImpl#getCurrentDate <em>Current Date</em>}</li>
 *   <li>{@link UserPerformance.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link UserPerformance.impl.TaskImpl#getSubtasks <em>Subtasks</em>}</li>
 *   <li>{@link UserPerformance.impl.TaskImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateStart() <em>Date Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateStart() <em>Date Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateStart()
	 * @generated
	 * @ordered
	 */
	protected Date dateStart = DATE_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateEnd() <em>Date End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateEnd() <em>Date End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEnd()
	 * @generated
	 * @ordered
	 */
	protected Date dateEnd = DATE_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentDate() <em>Current Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CURRENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentDate() <em>Current Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDate()
	 * @generated
	 * @ordered
	 */
	protected Date currentDate = CURRENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubtasks() <em>Subtasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> subtasks;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected Parameters parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserPerformancePackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.TASK__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateStart() {
		return dateStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateStart(Date newDateStart) {
		Date oldDateStart = dateStart;
		dateStart = newDateStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.TASK__DATE_START, oldDateStart, dateStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateEnd() {
		return dateEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateEnd(Date newDateEnd) {
		Date oldDateEnd = dateEnd;
		dateEnd = newDateEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.TASK__DATE_END, oldDateEnd, dateEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCurrentDate() {
		return currentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentDate(Date newCurrentDate) {
		Date oldCurrentDate = currentDate;
		currentDate = newCurrentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.TASK__CURRENT_DATE, oldCurrentDate, currentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.TASK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getSubtasks() {
		if (subtasks == null) {
			subtasks = new EObjectContainmentEList<Task>(Task.class, this, UserPerformancePackage.TASK__SUBTASKS);
		}
		return subtasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(Parameters newParameters, NotificationChain msgs) {
		Parameters oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UserPerformancePackage.TASK__PARAMETERS, oldParameters, newParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(Parameters newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UserPerformancePackage.TASK__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UserPerformancePackage.TASK__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.TASK__PARAMETERS, newParameters, newParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UserPerformancePackage.TASK__SUBTASKS:
				return ((InternalEList<?>)getSubtasks()).basicRemove(otherEnd, msgs);
			case UserPerformancePackage.TASK__PARAMETERS:
				return basicSetParameters(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UserPerformancePackage.TASK__NAME:
				return getName();
			case UserPerformancePackage.TASK__STATUS:
				return getStatus();
			case UserPerformancePackage.TASK__DATE_START:
				return getDateStart();
			case UserPerformancePackage.TASK__DATE_END:
				return getDateEnd();
			case UserPerformancePackage.TASK__CURRENT_DATE:
				return getCurrentDate();
			case UserPerformancePackage.TASK__DESCRIPTION:
				return getDescription();
			case UserPerformancePackage.TASK__SUBTASKS:
				return getSubtasks();
			case UserPerformancePackage.TASK__PARAMETERS:
				return getParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UserPerformancePackage.TASK__NAME:
				setName((String)newValue);
				return;
			case UserPerformancePackage.TASK__STATUS:
				setStatus((String)newValue);
				return;
			case UserPerformancePackage.TASK__DATE_START:
				setDateStart((Date)newValue);
				return;
			case UserPerformancePackage.TASK__DATE_END:
				setDateEnd((Date)newValue);
				return;
			case UserPerformancePackage.TASK__CURRENT_DATE:
				setCurrentDate((Date)newValue);
				return;
			case UserPerformancePackage.TASK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case UserPerformancePackage.TASK__SUBTASKS:
				getSubtasks().clear();
				getSubtasks().addAll((Collection<? extends Task>)newValue);
				return;
			case UserPerformancePackage.TASK__PARAMETERS:
				setParameters((Parameters)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UserPerformancePackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UserPerformancePackage.TASK__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case UserPerformancePackage.TASK__DATE_START:
				setDateStart(DATE_START_EDEFAULT);
				return;
			case UserPerformancePackage.TASK__DATE_END:
				setDateEnd(DATE_END_EDEFAULT);
				return;
			case UserPerformancePackage.TASK__CURRENT_DATE:
				setCurrentDate(CURRENT_DATE_EDEFAULT);
				return;
			case UserPerformancePackage.TASK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case UserPerformancePackage.TASK__SUBTASKS:
				getSubtasks().clear();
				return;
			case UserPerformancePackage.TASK__PARAMETERS:
				setParameters((Parameters)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UserPerformancePackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UserPerformancePackage.TASK__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case UserPerformancePackage.TASK__DATE_START:
				return DATE_START_EDEFAULT == null ? dateStart != null : !DATE_START_EDEFAULT.equals(dateStart);
			case UserPerformancePackage.TASK__DATE_END:
				return DATE_END_EDEFAULT == null ? dateEnd != null : !DATE_END_EDEFAULT.equals(dateEnd);
			case UserPerformancePackage.TASK__CURRENT_DATE:
				return CURRENT_DATE_EDEFAULT == null ? currentDate != null : !CURRENT_DATE_EDEFAULT.equals(currentDate);
			case UserPerformancePackage.TASK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case UserPerformancePackage.TASK__SUBTASKS:
				return subtasks != null && !subtasks.isEmpty();
			case UserPerformancePackage.TASK__PARAMETERS:
				return parameters != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", status: ");
		result.append(status);
		result.append(", dateStart: ");
		result.append(dateStart);
		result.append(", dateEnd: ");
		result.append(dateEnd);
		result.append(", currentDate: ");
		result.append(currentDate);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
