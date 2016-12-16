package studentOrientation.orientationSchedule.DormSelection;

import studentOrientation.util.DormEnum;

public class DormSelectionVerification {
	DormSelectionFactory dormfactory;
	 
	/**
	 * @param dormselectionfactoryIn user choice
	 * 
	 */
	public DormSelectionVerification(DormSelectionFactory dormselectionfactoryIn) { 
		this.dormfactory = dormselectionfactoryIn;
	}
 
	/**
	 * @param dormselectionIn user choice
	 * @return DormSelection reference type
	 */
	public DormSelection calculateEstimates(DormEnum dormselectionIn) {
		DormSelection dormeselection;
		dormeselection = dormfactory.submissionWay(dormselectionIn);
		
		dormeselection.calculateDuration();
		dormeselection.calculateCostSpent();
		dormeselection.calculateEffortInCalories();
		dormeselection.calculateCarbonFootPrint();
		return dormeselection;
	}
}
