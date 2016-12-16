package studentOrientation.orientationSchedule.CampusTour;

import studentOrientation.util.CampusTourEnum;

public class CampusTourFactory {

	/**
	 * @param campustourtypeIn choice for the campus tour
	 * @return CampusTour object of campustourtypeIn type
	 */
	public CampusTour modeOfTour(CampusTourEnum campustourtypeIn) {
		CampusTour campusTour = null;

		try {
			if (campustourtypeIn == CampusTourEnum.ON_FOOT) {
				campusTour = new OnFootCampusTour();
			} else if  (campustourtypeIn == CampusTourEnum.BUS_RIDE) {
				campusTour = new BusRideCampusTour();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new IllegalArgumentException();
		}finally{
			
		}
		return campusTour;
	}
}
