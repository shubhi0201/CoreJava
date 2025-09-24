package oppsDemo2;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 3, 2025
 * Time    : 4:45:33 PM
 * project : CoreJava

*/

import java.util.Scanner;

public class AirlineBooking extends Passenger {
	String flightName;
	String fromCity;
	String toCity;
	int seatNo;
	float ticketPrice;
	Scanner scanner = new Scanner(System.in);
	//generate constructor using fields
	public AirlineBooking(String name, int age, String passportNumber) {
		super(name, age, passportNumber);
		
		
	}
	 void bookTicket() {
			
			System.out.println("Enter Flight Name :");
			flightName = scanner.next();
			System.out.println("Enter From City :");
			fromCity = scanner.next();
			System.out.println("Enter To City :");
			toCity = scanner.next();
			System.out.println("Enter Seat No :");
			seatNo = scanner.nextInt();
			System.out.println("Enter Ticket Price :");
			ticketPrice = scanner.nextFloat();
		}
		
		void displayBookingDetails() {
			System.out.println("************* Booking Details ***********");
			System.out.println("Flight Name  :  " + flightName);
			System.out.println("From City    :  " + fromCity);
			System.out.println("To City      :  " + toCity);
			System.out.println("Seat No      :  " + seatNo);
			System.out.println("Ticket Price :  " + ticketPrice);
		}
		
	
	

}
