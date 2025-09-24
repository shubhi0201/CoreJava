package oppsDemo2;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 3, 2025
 * Time    : 4:54:42 PM
 * project : CoreJava

*/
public class SingleInheritanceAirline {

	public static void main(String[] args) {
		AirlineBooking booking1 = new AirlineBooking("James Gosling", 32, "FDG54155");
		booking1.bookTicket();
		booking1.displayPassengerDetails();
		booking1.displayBookingDetails();
		
		
		AirlineBooking booking2 = new AirlineBooking("James Gosling", 32, "FDG54155");
		booking2.bookTicket();
		booking2.displayPassengerDetails();
		booking2.displayBookingDetails();
		// TODO Auto-generated method stub

	}

}
