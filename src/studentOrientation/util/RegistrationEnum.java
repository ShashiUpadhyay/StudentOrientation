package studentOrientation.util;

/**
 * Enum contains the preferences
 * for University registration
 * 
 * University Registration Preferences : 
 * 						a) RegistrationEnum.PERSON 
 * 						b) RegistrationEnum.ONLINE_VIA_COMPUTER_LAB
 *
 */
public enum RegistrationEnum {
	FORM_SUBMISSION_TO_REGISTRAR(1), 
	ONLINE_VIA_COMPUTER_LAB(2);

	private int registrationPreference;

	/**
	 * @param registrationPreferenceIn preference
	 */
	RegistrationEnum(int registrationPreferenceIn) {
		this.registrationPreference = registrationPreferenceIn;
	}

	/**
	 * @return registrationPreference value
	 */
	public int getValues() {
		return registrationPreference;
	}
}
