package studentOrientation.orientationSchedule.BuyingBooks;

import studentOrientation.util.BookStoreEnum;

public class BookPurchaseVerification {
	BookStoreFactory booksfactory;

	
	public BookPurchaseVerification(BookStoreFactory booksfactoryIn) {
		this.booksfactory = booksfactoryIn;
	}

	/**
	 * @param bookstoresourceIn BookStore choice
	 * @return BookStore BookStore reference
	 */
	public BookStore calculateEstimates(BookStoreEnum bookstoresourceIn) {
		BookStore bookstore;
		bookstore = booksfactory.sourceOfPurchase(bookstoresourceIn);

		bookstore.calculateDuration();
		bookstore.calculateCostSpent();
		bookstore.calculateEffortInCalories();
		bookstore.calculateCarbonFootPrint();

		return bookstore;
	}
}
