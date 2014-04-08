/**
 */
package UserPerformance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UserPerformance.Parameters#getTimePassive <em>Time Passive</em>}</li>
 *   <li>{@link UserPerformance.Parameters#getTimeActive <em>Time Active</em>}</li>
 *   <li>{@link UserPerformance.Parameters#getTypingSpeed <em>Typing Speed</em>}</li>
 *   <li>{@link UserPerformance.Parameters#getNumberOfCharacters <em>Number Of Characters</em>}</li>
 *   <li>{@link UserPerformance.Parameters#getCountSavedEditing <em>Count Saved Editing</em>}</li>
 *   <li>{@link UserPerformance.Parameters#getNumberOfSwitches <em>Number Of Switches</em>}</li>
 *   <li>{@link UserPerformance.Parameters#getErrorsCount <em>Errors Count</em>}</li>
 *   <li>{@link UserPerformance.Parameters#getTimeToCorrectionErrors <em>Time To Correction Errors</em>}</li>
 *   <li>{@link UserPerformance.Parameters#getTypoCount <em>Typo Count</em>}</li>
 *   <li>{@link UserPerformance.Parameters#getCountSucsessefulLaunch <em>Count Sucsesseful Launch</em>}</li>
 *   <li>{@link UserPerformance.Parameters#getCountUnsucsessfulLaunch <em>Count Unsucsessful Launch</em>}</li>
 * </ul>
 * </p>
 *
 * @see UserPerformance.UserPerformancePackage#getParameters()
 * @model
 * @generated
 */
public interface Parameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Passive</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Passive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Passive</em>' attribute.
	 * @see #setTimePassive(double)
	 * @see UserPerformance.UserPerformancePackage#getParameters_TimePassive()
	 * @model default="0"
	 * @generated
	 */
	double getTimePassive();

	/**
	 * Sets the value of the '{@link UserPerformance.Parameters#getTimePassive <em>Time Passive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Passive</em>' attribute.
	 * @see #getTimePassive()
	 * @generated
	 */
	void setTimePassive(double value);

	/**
	 * Returns the value of the '<em><b>Time Active</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Active</em>' attribute.
	 * @see #setTimeActive(double)
	 * @see UserPerformance.UserPerformancePackage#getParameters_TimeActive()
	 * @model default="0"
	 * @generated
	 */
	double getTimeActive();

	/**
	 * Sets the value of the '{@link UserPerformance.Parameters#getTimeActive <em>Time Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Active</em>' attribute.
	 * @see #getTimeActive()
	 * @generated
	 */
	void setTimeActive(double value);

	/**
	 * Returns the value of the '<em><b>Typing Speed</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typing Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typing Speed</em>' attribute.
	 * @see #setTypingSpeed(double)
	 * @see UserPerformance.UserPerformancePackage#getParameters_TypingSpeed()
	 * @model default="0"
	 * @generated
	 */
	double getTypingSpeed();

	/**
	 * Sets the value of the '{@link UserPerformance.Parameters#getTypingSpeed <em>Typing Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typing Speed</em>' attribute.
	 * @see #getTypingSpeed()
	 * @generated
	 */
	void setTypingSpeed(double value);

	/**
	 * Returns the value of the '<em><b>Number Of Characters</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Characters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Characters</em>' attribute.
	 * @see #setNumberOfCharacters(int)
	 * @see UserPerformance.UserPerformancePackage#getParameters_NumberOfCharacters()
	 * @model default="0"
	 * @generated
	 */
	int getNumberOfCharacters();

	/**
	 * Sets the value of the '{@link UserPerformance.Parameters#getNumberOfCharacters <em>Number Of Characters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Characters</em>' attribute.
	 * @see #getNumberOfCharacters()
	 * @generated
	 */
	void setNumberOfCharacters(int value);

	/**
	 * Returns the value of the '<em><b>Count Saved Editing</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Saved Editing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Saved Editing</em>' attribute.
	 * @see #setCountSavedEditing(int)
	 * @see UserPerformance.UserPerformancePackage#getParameters_CountSavedEditing()
	 * @model default="0"
	 * @generated
	 */
	int getCountSavedEditing();

	/**
	 * Sets the value of the '{@link UserPerformance.Parameters#getCountSavedEditing <em>Count Saved Editing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Saved Editing</em>' attribute.
	 * @see #getCountSavedEditing()
	 * @generated
	 */
	void setCountSavedEditing(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Switches</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Switches</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Switches</em>' attribute.
	 * @see #setNumberOfSwitches(int)
	 * @see UserPerformance.UserPerformancePackage#getParameters_NumberOfSwitches()
	 * @model default="0"
	 * @generated
	 */
	int getNumberOfSwitches();

	/**
	 * Sets the value of the '{@link UserPerformance.Parameters#getNumberOfSwitches <em>Number Of Switches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Switches</em>' attribute.
	 * @see #getNumberOfSwitches()
	 * @generated
	 */
	void setNumberOfSwitches(int value);

	/**
	 * Returns the value of the '<em><b>Errors Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Errors Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors Count</em>' attribute.
	 * @see #setErrorsCount(int)
	 * @see UserPerformance.UserPerformancePackage#getParameters_ErrorsCount()
	 * @model default="0"
	 * @generated
	 */
	int getErrorsCount();

	/**
	 * Sets the value of the '{@link UserPerformance.Parameters#getErrorsCount <em>Errors Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Errors Count</em>' attribute.
	 * @see #getErrorsCount()
	 * @generated
	 */
	void setErrorsCount(int value);

	/**
	 * Returns the value of the '<em><b>Time To Correction Errors</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time To Correction Errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time To Correction Errors</em>' attribute.
	 * @see #setTimeToCorrectionErrors(double)
	 * @see UserPerformance.UserPerformancePackage#getParameters_TimeToCorrectionErrors()
	 * @model default="0"
	 * @generated
	 */
	double getTimeToCorrectionErrors();

	/**
	 * Sets the value of the '{@link UserPerformance.Parameters#getTimeToCorrectionErrors <em>Time To Correction Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time To Correction Errors</em>' attribute.
	 * @see #getTimeToCorrectionErrors()
	 * @generated
	 */
	void setTimeToCorrectionErrors(double value);

	/**
	 * Returns the value of the '<em><b>Typo Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typo Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typo Count</em>' attribute.
	 * @see #setTypoCount(int)
	 * @see UserPerformance.UserPerformancePackage#getParameters_TypoCount()
	 * @model default="0"
	 * @generated
	 */
	int getTypoCount();

	/**
	 * Sets the value of the '{@link UserPerformance.Parameters#getTypoCount <em>Typo Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typo Count</em>' attribute.
	 * @see #getTypoCount()
	 * @generated
	 */
	void setTypoCount(int value);

	/**
	 * Returns the value of the '<em><b>Count Sucsesseful Launch</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Sucsesseful Launch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Sucsesseful Launch</em>' attribute.
	 * @see #setCountSucsessefulLaunch(int)
	 * @see UserPerformance.UserPerformancePackage#getParameters_CountSucsessefulLaunch()
	 * @model default="0"
	 * @generated
	 */
	int getCountSucsessefulLaunch();

	/**
	 * Sets the value of the '{@link UserPerformance.Parameters#getCountSucsessefulLaunch <em>Count Sucsesseful Launch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Sucsesseful Launch</em>' attribute.
	 * @see #getCountSucsessefulLaunch()
	 * @generated
	 */
	void setCountSucsessefulLaunch(int value);

	/**
	 * Returns the value of the '<em><b>Count Unsucsessful Launch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Unsucsessful Launch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Unsucsessful Launch</em>' attribute.
	 * @see #setCountUnsucsessfulLaunch(int)
	 * @see UserPerformance.UserPerformancePackage#getParameters_CountUnsucsessfulLaunch()
	 * @model
	 * @generated
	 */
	int getCountUnsucsessfulLaunch();

	/**
	 * Sets the value of the '{@link UserPerformance.Parameters#getCountUnsucsessfulLaunch <em>Count Unsucsessful Launch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Unsucsessful Launch</em>' attribute.
	 * @see #getCountUnsucsessfulLaunch()
	 * @generated
	 */
	void setCountUnsucsessfulLaunch(int value);

} // Parameters
