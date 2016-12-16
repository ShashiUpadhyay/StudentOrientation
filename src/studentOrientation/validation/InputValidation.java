package studentOrientation.validation;

import java.util.EnumSet;

import studentOrientation.util.BookStoreEnum;
import studentOrientation.util.CampusTourEnum;
import studentOrientation.util.DormEnum;
import studentOrientation.util.RegistrationEnum;

public class InputValidation {

	/**
	 * @param campustourpreferenceIn choice for campus tour
	 * @param bookstorepreferenceIn choice for books Store
	 * @param dormenumIn choice for dorm selection
	 * @param registrationIn choice for registration
	 * @return boolean validity status
	 */
	public static boolean validateInputs(CampusTourEnum campustourpreferenceIn, BookStoreEnum bookstorepreferenceIn,
			DormEnum dormenumIn, RegistrationEnum registrationIn) {
		if (!EnumSet.allOf(CampusTourEnum.class).contains(campustourpreferenceIn)) {
			throw new IllegalArgumentException("ErrorEnum : " + ErrorEnum.INVALID_ENTRY.toString());
		}
		if (!EnumSet.allOf(BookStoreEnum.class).contains(bookstorepreferenceIn)) {
			throw new IllegalArgumentException("ErrorEnum : " + ErrorEnum.INVALID_ENTRY.toString());
		}
		if (!EnumSet.allOf(DormEnum.class).contains(dormenumIn)) {
			throw new IllegalArgumentException("ErrorEnum : " + ErrorEnum.INVALID_ENTRY.toString());
		}
		if (!EnumSet.allOf(RegistrationEnum.class).contains(registrationIn)) {
			throw new IllegalArgumentException("ErrorEnum : " + ErrorEnum.INVALID_ENTRY.toString());
		}
		return true;
	}

}
