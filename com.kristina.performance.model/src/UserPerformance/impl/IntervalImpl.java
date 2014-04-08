/**
 */
package UserPerformance.impl;

import UserPerformance.Interval;
import UserPerformance.Parameters;
import UserPerformance.UserPerformancePackage;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link UserPerformance.impl.IntervalImpl#getStart <em>Start</em>}</li>
 *   <li>{@link UserPerformance.impl.IntervalImpl#getEnd <em>End</em>}</li>
 *   <li>{@link UserPerformance.impl.IntervalImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link UserPerformance.impl.IntervalImpl#getNameTask <em>Name Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntervalImpl extends MinimalEObjectImpl.Container implements Interval {
	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Date start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Date end = END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameters parameter;

	/**
	 * The default value of the '{@link #getNameTask() <em>Name Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTask()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_TASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameTask() <em>Name Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTask()
	 * @generated
	 * @ordered
	 */
	protected String nameTask = NAME_TASK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserPerformancePackage.Literals.INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		Date oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.INTERVAL__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		Date oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.INTERVAL__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(Parameters newParameter, NotificationChain msgs) {
		Parameters oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UserPerformancePackage.INTERVAL__PARAMETER, oldParameter, newParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameters newParameter) {
		if (newParameter != parameter) {
			NotificationChain msgs = null;
			if (parameter != null)
				msgs = ((InternalEObject)parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UserPerformancePackage.INTERVAL__PARAMETER, null, msgs);
			if (newParameter != null)
				msgs = ((InternalEObject)newParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UserPerformancePackage.INTERVAL__PARAMETER, null, msgs);
			msgs = basicSetParameter(newParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.INTERVAL__PARAMETER, newParameter, newParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameTask() {
		return nameTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameTask(String newNameTask) {
		String oldNameTask = nameTask;
		nameTask = newNameTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.INTERVAL__NAME_TASK, oldNameTask, nameTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UserPerformancePackage.INTERVAL__PARAMETER:
				return basicSetParameter(null, msgs);
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
			case UserPerformancePackage.INTERVAL__START:
				return getStart();
			case UserPerformancePackage.INTERVAL__END:
				return getEnd();
			case UserPerformancePackage.INTERVAL__PARAMETER:
				return getParameter();
			case UserPerformancePackage.INTERVAL__NAME_TASK:
				return getNameTask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UserPerformancePackage.INTERVAL__START:
				setStart((Date)newValue);
				return;
			case UserPerformancePackage.INTERVAL__END:
				setEnd((Date)newValue);
				return;
			case UserPerformancePackage.INTERVAL__PARAMETER:
				setParameter((Parameters)newValue);
				return;
			case UserPerformancePackage.INTERVAL__NAME_TASK:
				setNameTask((String)newValue);
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
			case UserPerformancePackage.INTERVAL__START:
				setStart(START_EDEFAULT);
				return;
			case UserPerformancePackage.INTERVAL__END:
				setEnd(END_EDEFAULT);
				return;
			case UserPerformancePackage.INTERVAL__PARAMETER:
				setParameter((Parameters)null);
				return;
			case UserPerformancePackage.INTERVAL__NAME_TASK:
				setNameTask(NAME_TASK_EDEFAULT);
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
			case UserPerformancePackage.INTERVAL__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case UserPerformancePackage.INTERVAL__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case UserPerformancePackage.INTERVAL__PARAMETER:
				return parameter != null;
			case UserPerformancePackage.INTERVAL__NAME_TASK:
				return NAME_TASK_EDEFAULT == null ? nameTask != null : !NAME_TASK_EDEFAULT.equals(nameTask);
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
		result.append(" (start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", nameTask: ");
		result.append(nameTask);
		result.append(')');
		return result.toString();
	}

} //IntervalImpl
