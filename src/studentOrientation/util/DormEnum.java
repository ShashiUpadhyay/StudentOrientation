package studentOrientation.util;

/**
 * Enum contains the preferences
 * for Dorm registration
 * 
 * Dorm Registration can be done personally or via online
 * 
 * Dorm Registration Preferences : 
 * 						a) DormEnum.PERSON 
 * 						b) DormEnum.ONLINE_GAMING
 *
 */
public enum DormEnum{
	PERSON(1), 
	ONLINE_GAMING(2);

	private int dormSelectionPreference;

	/**
	 * @param dormSelectionPreferenceIn preference
	 */
	DormEnum(int dormSelectionPreferenceIn) {
		this.dormSelectionPreference = dormSelectionPreferenceIn;
	}

	/**
	 * @return dormSelectionPreference value
	 */
	public int getValues() {
		return dormSelectionPreference;
	}
}
