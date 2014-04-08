/**
 */
package UserPerformance.impl;

import UserPerformance.Parameters;
import UserPerformance.UserPerformancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link UserPerformance.impl.ParametersImpl#getTimePassive <em>Time Passive</em>}</li>
 *   <li>{@link UserPerformance.impl.ParametersImpl#getTimeActive <em>Time Active</em>}</li>
 *   <li>{@link UserPerformance.impl.ParametersImpl#getTypingSpeed <em>Typing Speed</em>}</li>
 *   <li>{@link UserPerformance.impl.ParametersImpl#getNumberOfCharacters <em>Number Of Characters</em>}</li>
 *   <li>{@link UserPerformance.impl.ParametersImpl#getCountSavedEditing <em>Count Saved Editing</em>}</li>
 *   <li>{@link UserPerformance.impl.ParametersImpl#getNumberOfSwitches <em>Number Of Switches</em>}</li>
 *   <li>{@link UserPerformance.impl.ParametersImpl#getErrorsCount <em>Errors Count</em>}</li>
 *   <li>{@link UserPerformance.impl.ParametersImpl#getTimeToCorrectionErrors <em>Time To Correction Errors</em>}</li>
 *   <li>{@link UserPerformance.impl.ParametersImpl#getTypoCount <em>Typo Count</em>}</li>
 *   <li>{@link UserPerformance.impl.ParametersImpl#getCountSucsessefulLaunch <em>Count Sucsesseful Launch</em>}</li>
 *   <li>{@link UserPerformance.impl.ParametersImpl#getCountUnsucsessfulLaunch <em>Count Unsucsessful Launch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParametersImpl extends MinimalEObjectImpl.Container implements Parameters {
	/**
	 * The default value of the '{@link #getTimePassive() <em>Time Passive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePassive()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_PASSIVE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTimePassive() <em>Time Passive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePassive()
	 * @generated
	 * @ordered
	 */
	protected double timePassive = TIME_PASSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeActive() <em>Time Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeActive()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_ACTIVE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTimeActive() <em>Time Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeActive()
	 * @generated
	 * @ordered
	 */
	protected double timeActive = TIME_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypingSpeed() <em>Typing Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypingSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final double TYPING_SPEED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTypingSpeed() <em>Typing Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypingSpeed()
	 * @generated
	 * @ordered
	 */
	protected double typingSpeed = TYPING_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfCharacters() <em>Number Of Characters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCharacters()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_CHARACTERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfCharacters() <em>Number Of Characters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCharacters()
	 * @generated
	 * @ordered
	 */
	protected int numberOfCharacters = NUMBER_OF_CHARACTERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountSavedEditing() <em>Count Saved Editing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountSavedEditing()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_SAVED_EDITING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCountSavedEditing() <em>Count Saved Editing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountSavedEditing()
	 * @generated
	 * @ordered
	 */
	protected int countSavedEditing = COUNT_SAVED_EDITING_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfSwitches() <em>Number Of Switches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSwitches()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SWITCHES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfSwitches() <em>Number Of Switches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSwitches()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSwitches = NUMBER_OF_SWITCHES_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorsCount() <em>Errors Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorsCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ERRORS_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getErrorsCount() <em>Errors Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorsCount()
	 * @generated
	 * @ordered
	 */
	protected int errorsCount = ERRORS_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeToCorrectionErrors() <em>Time To Correction Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToCorrectionErrors()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_TO_CORRECTION_ERRORS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTimeToCorrectionErrors() <em>Time To Correction Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToCorrectionErrors()
	 * @generated
	 * @ordered
	 */
	protected double timeToCorrectionErrors = TIME_TO_CORRECTION_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypoCount() <em>Typo Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypoCount()
	 * @generated
	 * @ordered
	 */
	protected static final int TYPO_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTypoCount() <em>Typo Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypoCount()
	 * @generated
	 * @ordered
	 */
	protected int typoCount = TYPO_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountSucsessefulLaunch() <em>Count Sucsesseful Launch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountSucsessefulLaunch()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_SUCSESSEFUL_LAUNCH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCountSucsessefulLaunch() <em>Count Sucsesseful Launch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountSucsessefulLaunch()
	 * @generated
	 * @ordered
	 */
	protected int countSucsessefulLaunch = COUNT_SUCSESSEFUL_LAUNCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountUnsucsessfulLaunch() <em>Count Unsucsessful Launch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountUnsucsessfulLaunch()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_UNSUCSESSFUL_LAUNCH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCountUnsucsessfulLaunch() <em>Count Unsucsessful Launch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountUnsucsessfulLaunch()
	 * @generated
	 * @ordered
	 */
	protected int countUnsucsessfulLaunch = COUNT_UNSUCSESSFUL_LAUNCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserPerformancePackage.Literals.PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTimePassive() {
		return timePassive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimePassive(double newTimePassive) {
		double oldTimePassive = timePassive;
		timePassive = newTimePassive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.PARAMETERS__TIME_PASSIVE, oldTimePassive, timePassive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTimeActive() {
		return timeActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeActive(double newTimeActive) {
		double oldTimeActive = timeActive;
		timeActive = newTimeActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.PARAMETERS__TIME_ACTIVE, oldTimeActive, timeActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTypingSpeed() {
		return typingSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypingSpeed(double newTypingSpeed) {
		double oldTypingSpeed = typingSpeed;
		typingSpeed = newTypingSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.PARAMETERS__TYPING_SPEED, oldTypingSpeed, typingSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfCharacters() {
		return numberOfCharacters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfCharacters(int newNumberOfCharacters) {
		int oldNumberOfCharacters = numberOfCharacters;
		numberOfCharacters = newNumberOfCharacters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.PARAMETERS__NUMBER_OF_CHARACTERS, oldNumberOfCharacters, numberOfCharacters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCountSavedEditing() {
		return countSavedEditing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountSavedEditing(int newCountSavedEditing) {
		int oldCountSavedEditing = countSavedEditing;
		countSavedEditing = newCountSavedEditing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.PARAMETERS__COUNT_SAVED_EDITING, oldCountSavedEditing, countSavedEditing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfSwitches() {
		return numberOfSwitches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSwitches(int newNumberOfSwitches) {
		int oldNumberOfSwitches = numberOfSwitches;
		numberOfSwitches = newNumberOfSwitches;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.PARAMETERS__NUMBER_OF_SWITCHES, oldNumberOfSwitches, numberOfSwitches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getErrorsCount() {
		return errorsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorsCount(int newErrorsCount) {
		int oldErrorsCount = errorsCount;
		errorsCount = newErrorsCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.PARAMETERS__ERRORS_COUNT, oldErrorsCount, errorsCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTimeToCorrectionErrors() {
		return timeToCorrectionErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeToCorrectionErrors(double newTimeToCorrectionErrors) {
		double oldTimeToCorrectionErrors = timeToCorrectionErrors;
		timeToCorrectionErrors = newTimeToCorrectionErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.PARAMETERS__TIME_TO_CORRECTION_ERRORS, oldTimeToCorrectionErrors, timeToCorrectionErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTypoCount() {
		return typoCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypoCount(int newTypoCount) {
		int oldTypoCount = typoCount;
		typoCount = newTypoCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.PARAMETERS__TYPO_COUNT, oldTypoCount, typoCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCountSucsessefulLaunch() {
		return countSucsessefulLaunch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountSucsessefulLaunch(int newCountSucsessefulLaunch) {
		int oldCountSucsessefulLaunch = countSucsessefulLaunch;
		countSucsessefulLaunch = newCountSucsessefulLaunch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.PARAMETERS__COUNT_SUCSESSEFUL_LAUNCH, oldCountSucsessefulLaunch, countSucsessefulLaunch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCountUnsucsessfulLaunch() {
		return countUnsucsessfulLaunch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountUnsucsessfulLaunch(int newCountUnsucsessfulLaunch) {
		int oldCountUnsucsessfulLaunch = countUnsucsessfulLaunch;
		countUnsucsessfulLaunch = newCountUnsucsessfulLaunch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPerformancePackage.PARAMETERS__COUNT_UNSUCSESSFUL_LAUNCH, oldCountUnsucsessfulLaunch, countUnsucsessfulLaunch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UserPerformancePackage.PARAMETERS__TIME_PASSIVE:
				return getTimePassive();
			case UserPerformancePackage.PARAMETERS__TIME_ACTIVE:
				return getTimeActive();
			case UserPerformancePackage.PARAMETERS__TYPING_SPEED:
				return getTypingSpeed();
			case UserPerformancePackage.PARAMETERS__NUMBER_OF_CHARACTERS:
				return getNumberOfCharacters();
			case UserPerformancePackage.PARAMETERS__COUNT_SAVED_EDITING:
				return getCountSavedEditing();
			case UserPerformancePackage.PARAMETERS__NUMBER_OF_SWITCHES:
				return getNumberOfSwitches();
			case UserPerformancePackage.PARAMETERS__ERRORS_COUNT:
				return getErrorsCount();
			case UserPerformancePackage.PARAMETERS__TIME_TO_CORRECTION_ERRORS:
				return getTimeToCorrectionErrors();
			case UserPerformancePackage.PARAMETERS__TYPO_COUNT:
				return getTypoCount();
			case UserPerformancePackage.PARAMETERS__COUNT_SUCSESSEFUL_LAUNCH:
				return getCountSucsessefulLaunch();
			case UserPerformancePackage.PARAMETERS__COUNT_UNSUCSESSFUL_LAUNCH:
				return getCountUnsucsessfulLaunch();
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
			case UserPerformancePackage.PARAMETERS__TIME_PASSIVE:
				setTimePassive((Double)newValue);
				return;
			case UserPerformancePackage.PARAMETERS__TIME_ACTIVE:
				setTimeActive((Double)newValue);
				return;
			case UserPerformancePackage.PARAMETERS__TYPING_SPEED:
				setTypingSpeed((Double)newValue);
				return;
			case UserPerformancePackage.PARAMETERS__NUMBER_OF_CHARACTERS:
				setNumberOfCharacters((Integer)newValue);
				return;
			case UserPerformancePackage.PARAMETERS__COUNT_SAVED_EDITING:
				setCountSavedEditing((Integer)newValue);
				return;
			case UserPerformancePackage.PARAMETERS__NUMBER_OF_SWITCHES:
				setNumberOfSwitches((Integer)newValue);
				return;
			case UserPerformancePackage.PARAMETERS__ERRORS_COUNT:
				setErrorsCount((Integer)newValue);
				return;
			case UserPerformancePackage.PARAMETERS__TIME_TO_CORRECTION_ERRORS:
				setTimeToCorrectionErrors((Double)newValue);
				return;
			case UserPerformancePackage.PARAMETERS__TYPO_COUNT:
				setTypoCount((Integer)newValue);
				return;
			case UserPerformancePackage.PARAMETERS__COUNT_SUCSESSEFUL_LAUNCH:
				setCountSucsessefulLaunch((Integer)newValue);
				return;
			case UserPerformancePackage.PARAMETERS__COUNT_UNSUCSESSFUL_LAUNCH:
				setCountUnsucsessfulLaunch((Integer)newValue);
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
			case UserPerformancePackage.PARAMETERS__TIME_PASSIVE:
				setTimePassive(TIME_PASSIVE_EDEFAULT);
				return;
			case UserPerformancePackage.PARAMETERS__TIME_ACTIVE:
				setTimeActive(TIME_ACTIVE_EDEFAULT);
				return;
			case UserPerformancePackage.PARAMETERS__TYPING_SPEED:
				setTypingSpeed(TYPING_SPEED_EDEFAULT);
				return;
			case UserPerformancePackage.PARAMETERS__NUMBER_OF_CHARACTERS:
				setNumberOfCharacters(NUMBER_OF_CHARACTERS_EDEFAULT);
				return;
			case UserPerformancePackage.PARAMETERS__COUNT_SAVED_EDITING:
				setCountSavedEditing(COUNT_SAVED_EDITING_EDEFAULT);
				return;
			case UserPerformancePackage.PARAMETERS__NUMBER_OF_SWITCHES:
				setNumberOfSwitches(NUMBER_OF_SWITCHES_EDEFAULT);
				return;
			case UserPerformancePackage.PARAMETERS__ERRORS_COUNT:
				setErrorsCount(ERRORS_COUNT_EDEFAULT);
				return;
			case UserPerformancePackage.PARAMETERS__TIME_TO_CORRECTION_ERRORS:
				setTimeToCorrectionErrors(TIME_TO_CORRECTION_ERRORS_EDEFAULT);
				return;
			case UserPerformancePackage.PARAMETERS__TYPO_COUNT:
				setTypoCount(TYPO_COUNT_EDEFAULT);
				return;
			case UserPerformancePackage.PARAMETERS__COUNT_SUCSESSEFUL_LAUNCH:
				setCountSucsessefulLaunch(COUNT_SUCSESSEFUL_LAUNCH_EDEFAULT);
				return;
			case UserPerformancePackage.PARAMETERS__COUNT_UNSUCSESSFUL_LAUNCH:
				setCountUnsucsessfulLaunch(COUNT_UNSUCSESSFUL_LAUNCH_EDEFAULT);
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
			case UserPerformancePackage.PARAMETERS__TIME_PASSIVE:
				return timePassive != TIME_PASSIVE_EDEFAULT;
			case UserPerformancePackage.PARAMETERS__TIME_ACTIVE:
				return timeActive != TIME_ACTIVE_EDEFAULT;
			case UserPerformancePackage.PARAMETERS__TYPING_SPEED:
				return typingSpeed != TYPING_SPEED_EDEFAULT;
			case UserPerformancePackage.PARAMETERS__NUMBER_OF_CHARACTERS:
				return numberOfCharacters != NUMBER_OF_CHARACTERS_EDEFAULT;
			case UserPerformancePackage.PARAMETERS__COUNT_SAVED_EDITING:
				return countSavedEditing != COUNT_SAVED_EDITING_EDEFAULT;
			case UserPerformancePackage.PARAMETERS__NUMBER_OF_SWITCHES:
				return numberOfSwitches != NUMBER_OF_SWITCHES_EDEFAULT;
			case UserPerformancePackage.PARAMETERS__ERRORS_COUNT:
				return errorsCount != ERRORS_COUNT_EDEFAULT;
			case UserPerformancePackage.PARAMETERS__TIME_TO_CORRECTION_ERRORS:
				return timeToCorrectionErrors != TIME_TO_CORRECTION_ERRORS_EDEFAULT;
			case UserPerformancePackage.PARAMETERS__TYPO_COUNT:
				return typoCount != TYPO_COUNT_EDEFAULT;
			case UserPerformancePackage.PARAMETERS__COUNT_SUCSESSEFUL_LAUNCH:
				return countSucsessefulLaunch != COUNT_SUCSESSEFUL_LAUNCH_EDEFAULT;
			case UserPerformancePackage.PARAMETERS__COUNT_UNSUCSESSFUL_LAUNCH:
				return countUnsucsessfulLaunch != COUNT_UNSUCSESSFUL_LAUNCH_EDEFAULT;
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
		result.append(" (timePassive: ");
		result.append(timePassive);
		result.append(", timeActive: ");
		result.append(timeActive);
		result.append(", typingSpeed: ");
		result.append(typingSpeed);
		result.append(", numberOfCharacters: ");
		result.append(numberOfCharacters);
		result.append(", countSavedEditing: ");
		result.append(countSavedEditing);
		result.append(", numberOfSwitches: ");
		result.append(numberOfSwitches);
		result.append(", errorsCount: ");
		result.append(errorsCount);
		result.append(", timeToCorrectionErrors: ");
		result.append(timeToCorrectionErrors);
		result.append(", typoCount: ");
		result.append(typoCount);
		result.append(", CountSucsessefulLaunch: ");
		result.append(countSucsessefulLaunch);
		result.append(", CountUnsucsessfulLaunch: ");
		result.append(countUnsucsessfulLaunch);
		result.append(')');
		return result.toString();
	}

} //ParametersImpl
