package studentOrientation.util;

/**
 * Enum contains the values of the basic parameters set by the university.
 * 
 * UNIVERSITY_TUITION : University Tuition Fee
 * CONCESSION_SUBMISSION_VIA_CHECK : Submitting forms requires payment via
 * check, which makes tuition 3% cheaper.
 * 
 */
public enum RegistrationPreDefinedValues {
	UNIVERSITY_TUITION(2000), CONCESSION_SUBMISSION_VIA_CHECK(3);

	private double basePrice;

	/**
	 * @param basePriceIn preference
	 */
	RegistrationPreDefinedValues(double basePriceIn) {
		this.basePrice = basePriceIn;
	}

	/**
	 * @return RegistrationPreDefinedValues value
	 */
	public double getValues() {
		return basePrice;
	}
}
