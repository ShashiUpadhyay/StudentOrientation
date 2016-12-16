package studentOrientation.util;

/**
 * Enum contains the values of the basic parameters set by the university.
 * 
 * BOOKS_BASE_PRICE : Book base prices are $200
 * 
 */
public enum BookStorePreDefinedValues {
	BOOKS_BASE_PRICE(200), PRICE_DIFFERENCE(5);

	private int basePrice;

	/**
	 * @param basePriceIn BOOKS_BASE_PRICE preferences
	 */
	BookStorePreDefinedValues(int basePriceIn) {
		this.basePrice = basePriceIn;
	}

	/**
	 * @return the basePrice Preference
	 */
	public int getValues() {
		return basePrice;
	}
}
