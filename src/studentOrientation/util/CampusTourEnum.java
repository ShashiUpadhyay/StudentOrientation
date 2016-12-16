package studentOrientation.util;

/**
 * Enum contains the preferences
 * for Campus Tour
 * 
 * Tour ON FOOT or by BUS RIDE
 * 
 * Campus Tour Preferences Values: 
 * 						a) CampusTourEnum.ON_FOOT  
 * 						b) CampusTourEnum.BUS_RIDE 
 *
 */
public enum CampusTourEnum {
	BUS_RIDE(1), 
	ON_FOOT(2);

	private int campusTourValue;

	/**
	 * @param campusTourValuesIn preference
	 */
	CampusTourEnum(int campusTourValuesIn) {
		this.campusTourValue = campusTourValuesIn;
	}

	/**
	 * @return campusTourValue Preference
	 */
	public int getValues() {
		return campusTourValue;
	}
}
