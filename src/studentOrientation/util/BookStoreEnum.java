package studentOrientation.util;

/**
 * Enum contains the preferences
 * for Books purchase
 * 
 * Can purchase from UNIVERSITY BOOK STORE or MANDO BOOK STORE
 * 
 * Books Purchase Preferences : 
 * 						a) BookStoreEnum.UNIVERSITY_BOOK_STORE   
 * 						b) BookStoreEnum.MANDO_BOOK_STORE		
 *
 */
public enum BookStoreEnum {
	UNIVERSITY_BOOK_STORE(1), 
	MANDO_BOOK_STORE(2), ;

	private int buyingBooksPreference;

	/**
	 * @param buyingBooksPreferenceIn purchase preferences
	 */
	BookStoreEnum(int buyingBooksPreferenceIn) {
		this.buyingBooksPreference = buyingBooksPreferenceIn;
	}

	/**
	 * @return the buyingBooksPreference
	 */
	public int getValues() {
		return buyingBooksPreference;
	}

}
