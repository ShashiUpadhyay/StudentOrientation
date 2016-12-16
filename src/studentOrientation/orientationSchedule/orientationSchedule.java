package studentOrientation.orientationSchedule;

import studentOrientation.validation.InputValidation;
import studentOrientation.orientationSchedule.BuyingBooks.BookPurchaseVerification;
import studentOrientation.orientationSchedule.BuyingBooks.BookStore;
import studentOrientation.orientationSchedule.BuyingBooks.BookStoreFactory;
import studentOrientation.orientationSchedule.CampusTour.CampusTour;
import studentOrientation.orientationSchedule.CampusTour.CampusTourFactory;
import studentOrientation.orientationSchedule.CampusTour.CampusTourVerification;
import studentOrientation.orientationSchedule.DormSelection.DormSelection;
import studentOrientation.orientationSchedule.DormSelection.DormSelectionFactory;
import studentOrientation.orientationSchedule.DormSelection.DormSelectionVerification;
import studentOrientation.orientationSchedule.Registration.Registration;
import studentOrientation.orientationSchedule.Registration.RegistrationFactory;
import studentOrientation.orientationSchedule.Registration.RegistrationVerification;
import studentOrientation.util.BookStoreEnum;
import studentOrientation.util.CampusTourEnum;
import studentOrientation.util.DormEnum;
import studentOrientation.util.Logger;
import studentOrientation.util.RegistrationEnum;

/**
 * @author shashiupadhyay
 *
 */
public class orientationSchedule implements orientationScheduleInterface {

	private BookStore bookstore;
	private CampusTour campustour;
	private DormSelection dormselection;
	private Registration registration;

	private double total_cost_spent;
	private double total_duration;
	private double total_carbonFootPrintValue;
	private double total_calories;

	private CampusTourEnum campustourenum;
	private BookStoreEnum bookstoreenum;
	private DormEnum dormenum;
	private RegistrationEnum registrationenum;

	private CampusTourFactory campusfactory;
	private CampusTourVerification campustourparamaters;
	private BookStoreFactory booksfactory;
	private BookPurchaseVerification bookspurchasesource;
	private DormSelectionFactory dormselectionfactory;
	private DormSelectionVerification dormselectionsource;
	private RegistrationFactory registrationfactory;
	private RegistrationVerification registrationsource;

	public orientationSchedule() {

	}

	/**
	 * @param campustourypeIn
	 *            choice for campus tour
	 * @param bookstorepreferenceIn
	 *            choice for books Store
	 * @param dormenumIn
	 *            choice for dorm selection
	 * @param registrationIn
	 *            choice for registration
	 */
	public orientationSchedule(CampusTourEnum campustourypeIn, BookStoreEnum bookstorepreferenceIn, DormEnum dormenumIn,
			RegistrationEnum registrationIn) {
		try {
			if (InputValidation.validateInputs(campustourypeIn, bookstorepreferenceIn, dormenumIn, registrationIn)) {
				this.campustourenum = campustourypeIn;
				this.bookstoreenum = bookstorepreferenceIn;
				this.dormenum = dormenumIn;
				this.registrationenum = registrationIn;
			}
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-1);
		} finally {

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see studentOrientation.orientationSchedule.orientationScheduleInterface#
	 * performBookPurchase()
	 */
	@Override
	public void performBookPurchase() {
		// TODO Auto-generated method stub
		this.booksfactory = new BookStoreFactory();
		this.bookspurchasesource = new BookPurchaseVerification(this.booksfactory);
		this.bookstore = bookspurchasesource.calculateEstimates(this.bookstoreenum);
		// Logger.writeMessage(bookstore.toString(), Logger.DebugLevel.RESULTS);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see studentOrientation.orientationSchedule.orientationScheduleInterface#
	 * performCampusTour()
	 */
	@Override
	public void performCampusTour() {
		// TODO Auto-generated method stub
		this.campusfactory = new CampusTourFactory();
		this.campustourparamaters = new CampusTourVerification(this.campusfactory);
		this.campustour = campustourparamaters.calculateEstimates(this.campustourenum);
		// Logger.writeMessage(campustour.toString(),
		// Logger.DebugLevel.RESULTS);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see studentOrientation.orientationSchedule.orientationScheduleInterface#
	 * performDormSelection()
	 */
	@Override
	public void performDormSelection() {
		// TODO Auto-generated method stub
		this.dormselectionfactory = new DormSelectionFactory();
		this.dormselectionsource = new DormSelectionVerification(this.dormselectionfactory);
		this.dormselection = dormselectionsource.calculateEstimates(this.dormenum);
		// Logger.writeMessage(this.dormselection.toString(),
		// Logger.DebugLevel.RESULTS);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see studentOrientation.orientationSchedule.orientationScheduleInterface#
	 * performRegistration()
	 */
	@Override
	public void performRegistration() {
		// TODO Auto-generated method stub
		this.registrationfactory = new RegistrationFactory();
		this.registrationsource = new RegistrationVerification(this.registrationfactory);
		this.registration = registrationsource.calculateEstimates(this.registrationenum);
		// Logger.writeMessage(this.registration.toString(),
		// Logger.DebugLevel.RESULTS);
	}

	/**
	 * 
	 */
	public void calculateTotalValues() {
		this.setTotal_Cost_Spent(bookstore.calculateCostSpent() + campustour.calculateCostSpent()
				+ dormselection.calculateCostSpent() + registration.calculateCostSpent());

		this.setTotal_Duration(bookstore.calculateDuration() + campustour.calculateDuration()
				+ dormselection.calculateDuration() + registration.calculateDuration());

		this.setTotal_CarbonFootPrintValue(bookstore.calculateCarbonFootPrint() + campustour.calculateCarbonFootPrint()
				+ dormselection.calculateCarbonFootPrint() + registration.calculateCarbonFootPrint());

		this.setTotal_Calories(bookstore.calculateEffortInCalories() + campustour.calculateEffortInCalories()
				+ dormselection.calculateEffortInCalories() + registration.calculateEffortInCalories());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		calculateTotalValues();
		StringBuffer display = new StringBuffer();
		display.append("\n");
		display.append("********************************************************************\n");
		display.append("************************Consolidate Report**************************\n");
		display.append("********************************************************************\n");
		display.append("" + 
				  "Total Cost spent           		=\t" + (this.getTotal_Cost_Spent()) + " $ \n"
				+ "Total Duration spent       		=\t" + (this.getTotal_Duration()) + " Minutes \n"
				+ "Total CarbonFootPrintValue 		=\t" + (this.getTotal_CarbonFootPrintValue()) + " tonnes of CO2 \n"
				+ "Total Effort in total_calories   \t=\t" + (this.getTotal_Calories()) + " Calories \n");
		display.append("********************************************************************\n");
		return display.toString();
	}

	/**
	 * @return the bookstore
	 */
	public BookStore getBookstore() {
		return bookstore;
	}

	/**
	 * @return the campustour
	 */
	public CampusTour getCampustour() {
		return campustour;
	}

	/**
	 * @return the dormselection
	 */
	public DormSelection getDormselection() {
		return dormselection;
	}

	/**
	 * @return the registration
	 */
	public Registration getRegistration() {
		return registration;
	}

	/**
	 * @return the total_cost_spent
	 */
	public double getTotal_Cost_Spent() {
		return total_cost_spent;
	}

	/**
	 * @param total_cost_spent
	 *            the total_cost_spent to set
	 */
	private void setTotal_Cost_Spent(double total_cost_spent) {
		this.total_cost_spent = total_cost_spent;
	}

	/**
	 * @return the total_duration
	 */
	public double getTotal_Duration() {
		return total_duration;
	}

	/**
	 * @param total_duration
	 *            the total_duration to set
	 */
	private void setTotal_Duration(double total_duration) {
		this.total_duration = total_duration;
	}

	/**
	 * @return the total_carbonFootPrintValue
	 */
	public double getTotal_CarbonFootPrintValue() {
		return total_carbonFootPrintValue;
	}

	/**
	 * @param total_carbonFootPrintValue
	 *            the total_carbonFootPrintValue to set
	 */
	private void setTotal_CarbonFootPrintValue(double total_carbonFootPrintValue) {
		this.total_carbonFootPrintValue = total_carbonFootPrintValue;
	}

	/**
	 * @return the total_calories
	 */
	public double getTotal_Calories() {
		return total_calories;
	}

	/**
	 * @param total_calories
	 *            the total_calories to set
	 */
	private void setTotal_Calories(double total_calories) {
		this.total_calories = total_calories;
	}

	/**
	 * @return the campustourenum
	 */
	public CampusTourEnum getCampustourenum() {
		return campustourenum;
	}

	/**
	 * @return the bookstoreenum
	 */
	public BookStoreEnum getBookstoreenum() {
		return bookstoreenum;
	}

	/**
	 * @return the dormenum
	 */
	public DormEnum getDormenum() {
		return dormenum;
	}

	/**
	 * @return the registrationenum
	 */
	public RegistrationEnum getRegistrationenum() {
		return registrationenum;
	}

	/**
	 * @return the campusfactory
	 */
	public CampusTourFactory getCampusfactory() {
		return campusfactory;
	}

	/**
	 * @return the campustourparamaters
	 */
	public CampusTourVerification getCampustourparamaters() {
		return campustourparamaters;
	}

	/**
	 * @return the booksfactory
	 */
	public BookStoreFactory getBooksfactory() {
		return booksfactory;
	}

	/**
	 * @return the bookspurchasesource
	 */
	public BookPurchaseVerification getBookspurchasesource() {
		return bookspurchasesource;
	}

	/**
	 * @return the dormselectionfactory
	 */
	public DormSelectionFactory getDormselectionfactory() {
		return dormselectionfactory;
	}

	/**
	 * @return the dormselectionsource
	 */
	public DormSelectionVerification getDormselectionsource() {
		return dormselectionsource;
	}

	/**
	 * @return the registrationfactory
	 */
	public RegistrationFactory getRegistrationfactory() {
		return registrationfactory;
	}

	/**
	 * @return the registrationsource
	 */
	public RegistrationVerification getRegistrationsource() {
		return registrationsource;
	}

}
