/**
 */
package UserPerformance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see UserPerformance.UserPerformanceFactory
 * @model kind="package"
 * @generated
 */
public interface UserPerformancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UserPerformance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com/kristina/performance/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.kristina.performance.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UserPerformancePackage eINSTANCE = UserPerformance.impl.UserPerformancePackageImpl.init();

	/**
	 * The meta object id for the '{@link UserPerformance.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserPerformance.impl.UserImpl
	 * @see UserPerformance.impl.UserPerformancePackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TASKS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Date Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DATE_START = 2;

	/**
	 * The feature id for the '<em><b>Date End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DATE_END = 3;

	/**
	 * The feature id for the '<em><b>Current Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CURRENT_DATE = 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PARAMETERS = 5;

	/**
	 * The feature id for the '<em><b>Intervals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__INTERVALS = 6;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UserPerformance.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserPerformance.impl.TaskImpl
	 * @see UserPerformance.impl.UserPerformancePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Date Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DATE_START = 2;

	/**
	 * The feature id for the '<em><b>Date End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DATE_END = 3;

	/**
	 * The feature id for the '<em><b>Current Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CURRENT_DATE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Subtasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SUBTASKS = 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARAMETERS = 7;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UserPerformance.impl.ParametersImpl <em>Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserPerformance.impl.ParametersImpl
	 * @see UserPerformance.impl.UserPerformancePackageImpl#getParameters()
	 * @generated
	 */
	int PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Time Passive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__TIME_PASSIVE = 0;

	/**
	 * The feature id for the '<em><b>Time Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__TIME_ACTIVE = 1;

	/**
	 * The feature id for the '<em><b>Typing Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__TYPING_SPEED = 2;

	/**
	 * The feature id for the '<em><b>Number Of Characters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__NUMBER_OF_CHARACTERS = 3;

	/**
	 * The feature id for the '<em><b>Count Saved Editing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__COUNT_SAVED_EDITING = 4;

	/**
	 * The feature id for the '<em><b>Number Of Switches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__NUMBER_OF_SWITCHES = 5;

	/**
	 * The feature id for the '<em><b>Errors Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__ERRORS_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Time To Correction Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__TIME_TO_CORRECTION_ERRORS = 7;

	/**
	 * The feature id for the '<em><b>Typo Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__TYPO_COUNT = 8;

	/**
	 * The number of structural features of the '<em>Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UserPerformance.impl.IntervalImpl <em>Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserPerformance.impl.IntervalImpl
	 * @see UserPerformance.impl.UserPerformancePackageImpl#getInterval()
	 * @generated
	 */
	int INTERVAL = 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__END = 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Name Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__NAME_TASK = 3;

	/**
	 * The number of structural features of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UserPerformance.impl.PerformanceImpl <em>Performance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserPerformance.impl.PerformanceImpl
	 * @see UserPerformance.impl.UserPerformancePackageImpl#getPerformance()
	 * @generated
	 */
	int PERFORMANCE = 4;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__USERS = 0;

	/**
	 * The number of structural features of the '<em>Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link UserPerformance.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see UserPerformance.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the containment reference list '{@link UserPerformance.User#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see UserPerformance.User#getTasks()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Tasks();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UserPerformance.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.User#getDateStart <em>Date Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Start</em>'.
	 * @see UserPerformance.User#getDateStart()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_DateStart();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.User#getDateEnd <em>Date End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date End</em>'.
	 * @see UserPerformance.User#getDateEnd()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_DateEnd();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.User#getCurrentDate <em>Current Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Date</em>'.
	 * @see UserPerformance.User#getCurrentDate()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_CurrentDate();

	/**
	 * Returns the meta object for the containment reference list '{@link UserPerformance.User#getIntervals <em>Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intervals</em>'.
	 * @see UserPerformance.User#getIntervals()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Intervals();

	/**
	 * Returns the meta object for the containment reference '{@link UserPerformance.User#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see UserPerformance.User#getParameters()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Parameters();

	/**
	 * Returns the meta object for class '{@link UserPerformance.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see UserPerformance.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UserPerformance.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.Task#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see UserPerformance.Task#getStatus()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Status();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.Task#getDateStart <em>Date Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Start</em>'.
	 * @see UserPerformance.Task#getDateStart()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_DateStart();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.Task#getDateEnd <em>Date End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date End</em>'.
	 * @see UserPerformance.Task#getDateEnd()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_DateEnd();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.Task#getCurrentDate <em>Current Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Date</em>'.
	 * @see UserPerformance.Task#getCurrentDate()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_CurrentDate();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see UserPerformance.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link UserPerformance.Task#getSubtasks <em>Subtasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtasks</em>'.
	 * @see UserPerformance.Task#getSubtasks()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Subtasks();

	/**
	 * Returns the meta object for the containment reference '{@link UserPerformance.Task#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see UserPerformance.Task#getParameters()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Parameters();

	/**
	 * Returns the meta object for class '{@link UserPerformance.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters</em>'.
	 * @see UserPerformance.Parameters
	 * @generated
	 */
	EClass getParameters();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.Parameters#getTimePassive <em>Time Passive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Passive</em>'.
	 * @see UserPerformance.Parameters#getTimePassive()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_TimePassive();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.Parameters#getTimeActive <em>Time Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Active</em>'.
	 * @see UserPerformance.Parameters#getTimeActive()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_TimeActive();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.Parameters#getTypingSpeed <em>Typing Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typing Speed</em>'.
	 * @see UserPerformance.Parameters#getTypingSpeed()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_TypingSpeed();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.Parameters#getNumberOfCharacters <em>Number Of Characters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Characters</em>'.
	 * @see UserPerformance.Parameters#getNumberOfCharacters()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_NumberOfCharacters();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.Parameters#getCountSavedEditing <em>Count Saved Editing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count Saved Editing</em>'.
	 * @see UserPerformance.Parameters#getCountSavedEditing()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_CountSavedEditing();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.Parameters#getNumberOfSwitches <em>Number Of Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Switches</em>'.
	 * @see UserPerformance.Parameters#getNumberOfSwitches()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_NumberOfSwitches();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.Parameters#getErrorsCount <em>Errors Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Errors Count</em>'.
	 * @see UserPerformance.Parameters#getErrorsCount()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_ErrorsCount();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.Parameters#getTimeToCorrectionErrors <em>Time To Correction Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time To Correction Errors</em>'.
	 * @see UserPerformance.Parameters#getTimeToCorrectionErrors()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_TimeToCorrectionErrors();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.Parameters#getTypoCount <em>Typo Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typo Count</em>'.
	 * @see UserPerformance.Parameters#getTypoCount()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_TypoCount();

	/**
	 * Returns the meta object for class '{@link UserPerformance.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval</em>'.
	 * @see UserPerformance.Interval
	 * @generated
	 */
	EClass getInterval();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.Interval#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see UserPerformance.Interval#getStart()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_Start();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.Interval#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see UserPerformance.Interval#getEnd()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_End();

	/**
	 * Returns the meta object for the containment reference '{@link UserPerformance.Interval#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see UserPerformance.Interval#getParameter()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link UserPerformance.Interval#getNameTask <em>Name Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Task</em>'.
	 * @see UserPerformance.Interval#getNameTask()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_NameTask();

	/**
	 * Returns the meta object for class '{@link UserPerformance.Performance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance</em>'.
	 * @see UserPerformance.Performance
	 * @generated
	 */
	EClass getPerformance();

	/**
	 * Returns the meta object for the containment reference '{@link UserPerformance.Performance#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Users</em>'.
	 * @see UserPerformance.Performance#getUsers()
	 * @see #getPerformance()
	 * @generated
	 */
	EReference getPerformance_Users();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UserPerformanceFactory getUserPerformanceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link UserPerformance.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserPerformance.impl.UserImpl
		 * @see UserPerformance.impl.UserPerformancePackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__TASKS = eINSTANCE.getUser_Tasks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Date Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__DATE_START = eINSTANCE.getUser_DateStart();

		/**
		 * The meta object literal for the '<em><b>Date End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__DATE_END = eINSTANCE.getUser_DateEnd();

		/**
		 * The meta object literal for the '<em><b>Current Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__CURRENT_DATE = eINSTANCE.getUser_CurrentDate();

		/**
		 * The meta object literal for the '<em><b>Intervals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__INTERVALS = eINSTANCE.getUser_Intervals();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__PARAMETERS = eINSTANCE.getUser_Parameters();

		/**
		 * The meta object literal for the '{@link UserPerformance.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserPerformance.impl.TaskImpl
		 * @see UserPerformance.impl.UserPerformancePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__STATUS = eINSTANCE.getTask_Status();

		/**
		 * The meta object literal for the '<em><b>Date Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DATE_START = eINSTANCE.getTask_DateStart();

		/**
		 * The meta object literal for the '<em><b>Date End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DATE_END = eINSTANCE.getTask_DateEnd();

		/**
		 * The meta object literal for the '<em><b>Current Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__CURRENT_DATE = eINSTANCE.getTask_CurrentDate();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '<em><b>Subtasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__SUBTASKS = eINSTANCE.getTask_Subtasks();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PARAMETERS = eINSTANCE.getTask_Parameters();

		/**
		 * The meta object literal for the '{@link UserPerformance.impl.ParametersImpl <em>Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserPerformance.impl.ParametersImpl
		 * @see UserPerformance.impl.UserPerformancePackageImpl#getParameters()
		 * @generated
		 */
		EClass PARAMETERS = eINSTANCE.getParameters();

		/**
		 * The meta object literal for the '<em><b>Time Passive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__TIME_PASSIVE = eINSTANCE.getParameters_TimePassive();

		/**
		 * The meta object literal for the '<em><b>Time Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__TIME_ACTIVE = eINSTANCE.getParameters_TimeActive();

		/**
		 * The meta object literal for the '<em><b>Typing Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__TYPING_SPEED = eINSTANCE.getParameters_TypingSpeed();

		/**
		 * The meta object literal for the '<em><b>Number Of Characters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__NUMBER_OF_CHARACTERS = eINSTANCE.getParameters_NumberOfCharacters();

		/**
		 * The meta object literal for the '<em><b>Count Saved Editing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__COUNT_SAVED_EDITING = eINSTANCE.getParameters_CountSavedEditing();

		/**
		 * The meta object literal for the '<em><b>Number Of Switches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__NUMBER_OF_SWITCHES = eINSTANCE.getParameters_NumberOfSwitches();

		/**
		 * The meta object literal for the '<em><b>Errors Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__ERRORS_COUNT = eINSTANCE.getParameters_ErrorsCount();

		/**
		 * The meta object literal for the '<em><b>Time To Correction Errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__TIME_TO_CORRECTION_ERRORS = eINSTANCE.getParameters_TimeToCorrectionErrors();

		/**
		 * The meta object literal for the '<em><b>Typo Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__TYPO_COUNT = eINSTANCE.getParameters_TypoCount();

		/**
		 * The meta object literal for the '{@link UserPerformance.impl.IntervalImpl <em>Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserPerformance.impl.IntervalImpl
		 * @see UserPerformance.impl.UserPerformancePackageImpl#getInterval()
		 * @generated
		 */
		EClass INTERVAL = eINSTANCE.getInterval();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__START = eINSTANCE.getInterval_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__END = eINSTANCE.getInterval_End();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL__PARAMETER = eINSTANCE.getInterval_Parameter();

		/**
		 * The meta object literal for the '<em><b>Name Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__NAME_TASK = eINSTANCE.getInterval_NameTask();

		/**
		 * The meta object literal for the '{@link UserPerformance.impl.PerformanceImpl <em>Performance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserPerformance.impl.PerformanceImpl
		 * @see UserPerformance.impl.UserPerformancePackageImpl#getPerformance()
		 * @generated
		 */
		EClass PERFORMANCE = eINSTANCE.getPerformance();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE__USERS = eINSTANCE.getPerformance_Users();

	}

} //UserPerformancePackage
