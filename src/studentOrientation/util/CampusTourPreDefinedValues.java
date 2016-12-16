package studentOrientation.util;

/**
 * Enum contains the values of the basic parameters set by the university.
 * 
 * BUS_RIDE_COST : bus-ride costs $2.00
 * ON_FOOT_COST : tour on-foot is $0.10
 * 
 */
public enum CampusTourPreDefinedValues{
	BUS_RIDE_COST(2.00), ON_FOOT_COST(0.10);
	
	private double basePrice;
	
	/**
	 * @param basePriceIn value
	 */
	CampusTourPreDefinedValues(double basePriceIn){
		this.basePrice = basePriceIn;
	}

	/**
	 * @return campusTourValue basePrice
	 */
	public double getValues() {
		return basePrice;
	}
}
