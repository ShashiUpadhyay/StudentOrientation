package studentOrientation.orientationSchedule.DormSelection;

import studentOrientation.util.DormSelectionPreDefinedValues;

public class DormSelection_Online extends DormSelection {

	DormSelection_Online() {
		/*
		 *  online option has a 2% surcharge
		 */
		cost = DormSelectionPreDefinedValues.DORM_FEES.getValues()
				+ (DormSelectionPreDefinedValues.DORM_FEES.getValues()
						* DormSelectionPreDefinedValues.DORM_ONLINE_SURCHARGE.getValues()) / 100;
		duration = 36;
		carbonFootPrintValue = 66;
		calories = 43;
		mode = "Through an online gaming contest that assigns dorms based on your game performance";
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
