package studentOrientation.orientationSchedule.BuyingBooks;

import studentOrientation.activityVerifiers.CarbonFootPrintInterface;
import studentOrientation.activityVerifiers.CostInterface;
import studentOrientation.activityVerifiers.DurationInterface;
import studentOrientation.activityVerifiers.EffortInterface;

/**
 * bookstores to choose from: University Book Store, Mando Boooks. The price
 * difference is within 5% in these book stores.
 *
 */
public abstract class BookStore implements DurationInterface, CostInterface, CarbonFootPrintInterface, EffortInterface {

	String mode;
	double cost;
	int duration;
	double carbonFootPrintValue;
	double calories;

	String getMode() {
		return mode;
	}

	@Override
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("\n");
		display.append("Book Purchase \n");
		display.append("Mode                  =\t" + getMode() + " \n");
		display.append("Cost                  =\t" + calculateCostSpent() + " $\n");
		display.append("Duration              =\t" + calculateDuration() + " Minutes\n");
		display.append("CarbonFootPrintValue  =\t" + calculateCarbonFootPrint() + " Tonnes of CO2 \n");
		display.append("Effort                =\t" + calculateEffortInCalories() + " Calories\n");
		display.append("--------------------------------------------------------------\n");
		return display.toString();
	}


}
