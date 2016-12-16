package studentOrientation.orientationSchedule.Registration;

import studentOrientation.util.RegistrationPreDefinedValues;

public class Registration_Online extends Registration {

	Registration_Online() {
		cost = RegistrationPreDefinedValues.UNIVERSITY_TUITION.getValues();
		duration = 36;
		carbonFootPrintValue = 66;
		calories = 43;
		mode = "By accessing the registration system using computers from a specific computer-lab in the Engineering building.";
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
