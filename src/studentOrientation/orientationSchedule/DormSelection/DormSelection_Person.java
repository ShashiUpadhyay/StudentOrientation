package studentOrientation.orientationSchedule.DormSelection;

import studentOrientation.util.DormSelectionPreDefinedValues;

public class DormSelection_Person extends DormSelection{
	
	DormSelection_Person(){
		cost = DormSelectionPreDefinedValues.DORM_FEES.getValues();
		duration = 10;
		carbonFootPrintValue = 20;
		calories = 10;
		mode = "By standing in a long queue outside the dorms administrator's office for your turn";
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
