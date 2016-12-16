package studentOrientation.orientationSchedule.CampusTour;

import studentOrientation.util.CampusTourEnum;

public class CampusTourVerification {
	CampusTourFactory factory;
 
	/**
	 * @param factory current reference of CampusTourFactory
	 */
	public CampusTourVerification(CampusTourFactory factory) { 
		this.factory = factory;
	}
 
	/**
	 * @param campustourtypeIn campus tour choice
	 * @return CampusTour activities
	 */
	public CampusTour calculateEstimates(CampusTourEnum campustourtypeIn) {
		CampusTour campusTour;
 
		campusTour = factory.modeOfTour(campustourtypeIn);
		
		campusTour.calculateDuration();
		campusTour.calculateCostSpent();
		campusTour.calculateEffortInCalories();
		campusTour.calculateCarbonFootPrint();
		return campusTour;
	}

}
