package studentOrientation.orientationSchedule.Registration;

import studentOrientation.util.RegistrationEnum;

public class RegistrationFactory {

	/**
	 * @param registrationIn registration choice
	 * @return Registration object of specific registration
	 */
	public Registration submissionWay(RegistrationEnum registrationIn) {
		Registration registrationselection = null;

		try {
			if (registrationIn == RegistrationEnum.FORM_SUBMISSION_TO_REGISTRAR) {
				registrationselection = new Registration_FormSubmissionRegistrar();
			} else if (registrationIn == RegistrationEnum.ONLINE_VIA_COMPUTER_LAB) {
				registrationselection = new Registration_Online();
			} 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new IllegalArgumentException();
		}finally{
			
		}
		return registrationselection;
	}
}
