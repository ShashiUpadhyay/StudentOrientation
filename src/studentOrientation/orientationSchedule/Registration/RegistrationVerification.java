package studentOrientation.orientationSchedule.Registration;

import studentOrientation.util.RegistrationEnum;

public class RegistrationVerification {
	RegistrationFactory registrationfactory;
	 
	/**
	 * @param registrationfactoryIn reference of registration factory 
	 */
	public RegistrationVerification(RegistrationFactory registrationfactoryIn) { 
		this.registrationfactory = registrationfactoryIn;
	}
 
	/**
	 * @param registrationIn choice for the registration
	 * @return Registration reference of registration completion
	 */
	public Registration calculateEstimates(RegistrationEnum registrationIn) {
		Registration registration;
		registration = registrationfactory.submissionWay(registrationIn);
		
		registration.calculateDuration();
		registration.calculateCostSpent();
		registration.calculateEffortInCalories();
		registration.calculateCarbonFootPrint();
		
		return registration;
	}
}
