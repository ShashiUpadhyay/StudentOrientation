package studentOrientation.orientationSchedule.Registration;

import studentOrientation.util.RegistrationPreDefinedValues;

public class Registration_FormSubmissionRegistrar extends Registration {

	Registration_FormSubmissionRegistrar() {
		/*
		 * Submitting forms requires payment via check, which makes tuition 3%
		 * cheaper
		 */
		cost = (RegistrationPreDefinedValues.UNIVERSITY_TUITION.getValues()
				- (RegistrationPreDefinedValues.UNIVERSITY_TUITION.getValues()
						* RegistrationPreDefinedValues.CONCESSION_SUBMISSION_VIA_CHECK.getValues()) / 100);
		duration = 10;
		carbonFootPrintValue = 20;
		calories = 10;
		mode = "By submitting forms to the registrar's office";
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
