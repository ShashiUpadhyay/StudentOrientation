package studentOrientation.orientationSchedule;

/**
 * orientation checklist consists of taking a campus tour, buying books,
 * selecting a dorm, registering for courses
 * 
 * 
 * all students have some flexibility in how and when they go about completing
 * each activity
 *
 */
public interface orientationScheduleInterface {

	public void performCampusTour();

	public void performBookPurchase();

	public void performDormSelection();

	public void performRegistration();

}