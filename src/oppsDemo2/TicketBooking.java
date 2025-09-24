package oppsDemo2;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 4, 2025
 * Time    : 12:37:18 PM
 * project : CoreJava
 * TicketBooking class (Has-A Payment using Composition)

*/
public class TicketBooking {
	private String bookingId;
    private String passengerName;
    private String flightNumber;
    private String destination;
    private Payment payment;   // Composition → Strong Has-A Relationship
    
    
    
    
    
     public TicketBooking(String bookingId, String passengerName, String flightNumber, String destination, String PaymentId , double amount , String mode ) {
		this.bookingId = bookingId;
		this.passengerName = passengerName;
		this.flightNumber = flightNumber;
		this.destination = destination;
		
		// Composition → Payement is created WITH Booking
		this.payment = new Payment(PaymentId, amount, mode);
	}

	 public void displayBooking() {
	        System.out.println("\n===== Booking Details =====");
	        System.out.println("Booking ID: " + bookingId);
	        System.out.println("Passenger: " + passengerName);
	        System.out.println("Flight Number: " + flightNumber);
	        System.out.println("Destination: " + destination);
	        payment.displayPayment(); // Delegation
	    }

	    public String getBookingId() {
	        return bookingId;
	    }
}
