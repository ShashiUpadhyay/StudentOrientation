package studentOrientation.orientationSchedule.CampusTour;

import studentOrientation.util.CampusTourPreDefinedValues;

public class BusRideCampusTour extends CampusTour {
	public BusRideCampusTour() {
		/**
		 * The bus-ride costs $2.00
		 */
		cost = CampusTourPreDefinedValues.BUS_RIDE_COST.getValues();
		duration = 36;
		carbonFootPrintValue = 66;
		calories = 43;
		mode = "Via Bus Ride";
	}

	@Override
	public int calculateDuration() {
		return duration;
	}

	@Override
	public double calculateEffortInCalories() {
		return calories;
	}

	@Override
	public double calculateCarbonFootPrint() {
		return carbonFootPrintValue;
	}

	@Override
	public double calculateCostSpent() {
		return cost;
	}
}
