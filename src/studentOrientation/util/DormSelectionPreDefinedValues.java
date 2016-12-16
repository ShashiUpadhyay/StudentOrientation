package studentOrientation.util;

/**
 * Enum contains the values of the basic parameters set by the university.
 * 
 * DORM_FEES : Dorm Fee
 * DORM_ONLINE_SURCHARGE :  online option has a 2% surcharge.
 * 
 */
public enum DormSelectionPreDefinedValues{
	
	DORM_FEES(230), DORM_ONLINE_SURCHARGE(2);
	
	private double basePrice;
	
	/**
	 * @param basePriceIn preference
	 */
	DormSelectionPreDefinedValues(double basePriceIn){
		this.basePrice = basePriceIn;
	}

	/**
	 * @return dormSelectionPreference value
	 */
	public double getValues() {
		return basePrice;
	}
}
