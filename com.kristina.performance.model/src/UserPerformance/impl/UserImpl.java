/**
 */
package UserPerformance.impl;

import UserPerformance.Interval;
import UserPerformance.Parameters;
import UserPerformance.Task;
import UserPerformance.User;
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
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link UserPerformance.impl.UserImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link UserPerformance.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link UserPerformance.impl.UserImpl#isStatus <em>Status</em>}</li>
 *   <li>{@link UserPerformance.impl.UserImpl#getDateStart <em>Date Start</em>}</li>
 *   <li>{@link UserPerformance.impl.UserImpl#getDateEnd <em>Date End</em>}</li>
 *   <li>{@link UserPerformance.impl.UserImpl#getCurrentDate <em>Current Date</em>}</li>
 *   <li>{@link UserPerformance.impl.UserImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link UserPerformance.impl.UserImpl#getIntervals <em>Intervals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

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
	 * The default value of the '{@link #isStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean status = STATUS_EDEFAULT;

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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected Parameters parameters;

	/**
	 * The cached value of the '{@link #getIntervals() <em>Intervals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervals()
	 * @generated
	 * @ordered
	 */
	protected EList<Interval> intervals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserPerformancePackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, UserPerformancePackage.USER__TASKS);
		}
		return tasks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.USER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(boolean newStatus) {
		boolean oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.USER__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.USER__DATE_START, oldDateStart, dateStart));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.USER__DATE_END, oldDateEnd, dateEnd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.USER__CURRENT_DATE, oldCurrentDate, currentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interval> getIntervals() {
		if (intervals == null) {
			intervals = new EObjectContainmentEList<Interval>(Interval.class, this, UserPerformancePackage.USER__INTERVALS);
		}
		return intervals;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UserPerformancePackage.USER__PARAMETERS, oldParameters, newParameters);
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
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UserPerformancePackage.USER__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UserPerformancePackage.USER__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.USER__PARAMETERS, newParameters, newParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UserPerformancePackage.USER__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case UserPerformancePackage.USER__PARAMETERS:
				return basicSetParameters(null, msgs);
			case UserPerformancePackage.USER__INTERVALS:
				return ((InternalEList<?>)getIntervals()).basicRemove(otherEnd, msgs);
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
			case UserPerformancePackage.USER__TASKS:
				return getTasks();
			case UserPerformancePackage.USER__NAME:
				return getName();
			case UserPerformancePackage.USER__STATUS:
				return isStatus();
			case UserPerformancePackage.USER__DATE_START:
				return getDateStart();
			case UserPerformancePackage.USER__DATE_END:
				return getDateEnd();
			case UserPerformancePackage.USER__CURRENT_DATE:
				return getCurrentDate();
			case UserPerformancePackage.USER__PARAMETERS:
				return getParameters();
			case UserPerformancePackage.USER__INTERVALS:
				return getIntervals();
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
			case UserPerformancePackage.USER__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case UserPerformancePackage.USER__NAME:
				setName((String)newValue);
				return;
			case UserPerformancePackage.USER__STATUS:
				setStatus((Boolean)newValue);
				return;
			case UserPerformancePackage.USER__DATE_START:
				setDateStart((Date)newValue);
				return;
			case UserPerformancePackage.USER__DATE_END:
				setDateEnd((Date)newValue);
				return;
			case UserPerformancePackage.USER__CURRENT_DATE:
				setCurrentDate((Date)newValue);
				return;
			case UserPerformancePackage.USER__PARAMETERS:
				setParameters((Parameters)newValue);
				return;
			case UserPerformancePackage.USER__INTERVALS:
				getIntervals().clear();
				getIntervals().addAll((Collection<? extends Interval>)newValue);
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
			case UserPerformancePackage.USER__TASKS:
				getTasks().clear();
				return;
			case UserPerformancePackage.USER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UserPerformancePackage.USER__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case UserPerformancePackage.USER__DATE_START:
				setDateStart(DATE_START_EDEFAULT);
				return;
			case UserPerformancePackage.USER__DATE_END:
				setDateEnd(DATE_END_EDEFAULT);
				return;
			case UserPerformancePackage.USER__CURRENT_DATE:
				setCurrentDate(CURRENT_DATE_EDEFAULT);
				return;
			case UserPerformancePackage.USER__PARAMETERS:
				setParameters((Parameters)null);
				return;
			case UserPerformancePackage.USER__INTERVALS:
				getIntervals().clear();
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
			case UserPerformancePackage.USER__TASKS:
				return tasks != null && !tasks.isEmpty();
			case UserPerformancePackage.USER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UserPerformancePackage.USER__STATUS:
				return status != STATUS_EDEFAULT;
			case UserPerformancePackage.USER__DATE_START:
				return DATE_START_EDEFAULT == null ? dateStart != null : !DATE_START_EDEFAULT.equals(dateStart);
			case UserPerformancePackage.USER__DATE_END:
				return DATE_END_EDEFAULT == null ? dateEnd != null : !DATE_END_EDEFAULT.equals(dateEnd);
			case UserPerformancePackage.USER__CURRENT_DATE:
				return CURRENT_DATE_EDEFAULT == null ? currentDate != null : !CURRENT_DATE_EDEFAULT.equals(currentDate);
			case UserPerformancePackage.USER__PARAMETERS:
				return parameters != null;
			case UserPerformancePackage.USER__INTERVALS:
				return intervals != null && !intervals.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //UserImpl
