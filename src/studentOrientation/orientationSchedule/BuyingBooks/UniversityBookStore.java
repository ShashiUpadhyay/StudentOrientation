package studentOrientation.orientationSchedule.BuyingBooks;

import studentOrientation.util.BookStorePreDefinedValues;

public class UniversityBookStore extends BookStore {

	UniversityBookStore() {
		/*
		 * university book sale at base price
		 */
		cost = BookStorePreDefinedValues.BOOKS_BASE_PRICE.getValues();
		duration = 36;
		carbonFootPrintValue = 66;
		calories = 43;
		mode = "Selected Book Store : University Book Store";
	}

	@Override
	public int calculateDuration() {
		return duration;
	}

	@Override
	public double calculateEffortInCalories() {
		return calories;
	}

	@Override
	public double calculateCarbonFootPrint() {
		return carbonFootPrintValue;
	}

	@Override
	public double calculateCostSpent() {
		return cost;
	}
}
