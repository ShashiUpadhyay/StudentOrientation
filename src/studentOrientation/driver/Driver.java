package studentOrientation.driver;

import studentOrientation.orientationSchedule.orientationSchedule;
import studentOrientation.orientationSchedule.orientationScheduleInterface;
import studentOrientation.orientationWorkshop.OrientationWorkShop;
import studentOrientation.orientationWorkshop.OrientationWorkshopInterface;
import studentOrientation.results.Results;
import studentOrientation.util.BookStoreEnum;
import studentOrientation.util.CampusTourEnum;
import studentOrientation.util.DormEnum;
import studentOrientation.util.Logger;
import studentOrientation.util.RegistrationEnum;

/**
 * Sample Driver Class orientationSchedule Parameters Sequence order 1.Campus
 * Tour 2.Books Purchase 3.Dorm Registration 4.University Registration
 * 
 * Choices for each of them is below : 1. Campus Tour Preferences : a)
 * CampusTourEnum.ON_FOOT b) CampusTourEnum.BUS_RIDE
 * 
 * 2. Books Purchase Preferences : a) BookStoreEnum.UNIVERSITY_BOOK_STORE b)
 * BookStoreEnum.MANDO_BOOK_STORE
 * 
 * 3. Dorm Registration Preferences : a) DormEnum.PERSON b)
 * DormEnum.ONLINE_GAMING
 * 
 * 4. University Registration Preferences : a)
 * RegistrationEnum.FORM_SUBMISSION_TO_REGISTRAR b)
 * RegistrationEnum.ONLINE_VIA_COMPUTER_LAB
 * 
 */
public class Driver {

	public static void main(String[] args) {

		Logger.setDebugValue(Logger.DebugLevel.RESULTS);
		orientationScheduleInterface orientationschedule = new orientationSchedule(CampusTourEnum.BUS_RIDE,
				BookStoreEnum.UNIVERSITY_BOOK_STORE, DormEnum.PERSON, RegistrationEnum.ONLINE_VIA_COMPUTER_LAB);
		OrientationWorkshopInterface orientation_workshop = new OrientationWorkShop();
		orientation_workshop.construct(orientationschedule);
		Results.displayOutput(orientationschedule);
	}
}
