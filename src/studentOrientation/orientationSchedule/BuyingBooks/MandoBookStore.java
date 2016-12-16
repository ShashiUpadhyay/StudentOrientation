package studentOrientation.orientationSchedule.BuyingBooks;

import studentOrientation.util.BookStorePreDefinedValues;

public class MandoBookStore extends BookStore {

	MandoBookStore() {
		cost = BookStorePreDefinedValues.BOOKS_BASE_PRICE.getValues()
				+ (BookStorePreDefinedValues.BOOKS_BASE_PRICE.getValues()
						* BookStorePreDefinedValues.PRICE_DIFFERENCE.getValues()) / 100;
		duration = 10;
		carbonFootPrintValue = 20;
		calories = 10;
		mode = "Selected Book Store : Mando Book Store";
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
