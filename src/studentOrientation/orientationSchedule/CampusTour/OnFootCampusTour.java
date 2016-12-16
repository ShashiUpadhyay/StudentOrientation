package studentOrientation.orientationSchedule.CampusTour;

import studentOrientation.util.CampusTourPreDefinedValues;

public class OnFootCampusTour extends CampusTour {
	public OnFootCampusTour() {
		/**
		 * the tour on-foot is $0.10
		 */
		cost = CampusTourPreDefinedValues.ON_FOOT_COST.getValues();
		duration = 26;
		carbonFootPrintValue = 36;
		calories = 13;
		mode = "On Foot";
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
