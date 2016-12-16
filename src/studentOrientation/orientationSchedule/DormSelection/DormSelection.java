package studentOrientation.orientationSchedule.DormSelection;

import studentOrientation.activityVerifiers.CarbonFootPrintInterface;
import studentOrientation.activityVerifiers.CostInterface;
import studentOrientation.activityVerifiers.DurationInterface;
import studentOrientation.activityVerifiers.EffortInterface;

public abstract class DormSelection implements DurationInterface, CostInterface, CarbonFootPrintInterface, EffortInterface {
	
	String mode;
	double cost;
	int duration;
	double carbonFootPrintValue;
	double calories;

	public String getMode() {
		return mode;
	}

	@Override
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("\n");
		display.append("Dorm Selection \n");
		display.append("Mode                  =\t" + getMode() + " \n");
		display.append("Cost                  =\t" + calculateCostSpent() + " $\n");
		display.append("Duration              =\t" + calculateDuration() + " Minutes\n");
		display.append("CarbonFootPrintValue  =\t" + calculateCarbonFootPrint() + " Tonnes of CO2 \n");
		display.append("Effort                =\t" + calculateEffortInCalories() + " Calories\n");
		display.append("--------------------------------------------------------------\n\n");
		return display.toString();
	}
}
