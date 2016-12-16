package studentOrientation.orientationSchedule.BuyingBooks;

import studentOrientation.util.BookStoreEnum;

public class BookStoreFactory {

	/**
	 * @param bookstoretypeIn reference choice for Book store
	 * @return object of bookstoretypeIn type
	 */
	public BookStore sourceOfPurchase(BookStoreEnum bookstoretypeIn) {
		BookStore bookstore = null;

		try {
			if (bookstoretypeIn == BookStoreEnum.MANDO_BOOK_STORE) {
				bookstore = new MandoBookStore();
			} else if  (bookstoretypeIn == BookStoreEnum.UNIVERSITY_BOOK_STORE) {
				bookstore = new UniversityBookStore();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new IllegalArgumentException();
		}finally{
			
		}
		return bookstore;
	}
}
