package oppsDemo3;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 5, 2025
 * Time    : 4:14:05 PM
 * project : CoreJava

*/
public class AirCargoConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Using constructor 1
        CargoShipment shipment1 = new CargoShipment("CARGO101", "New York", null);

        // Using constructor 2
        CargoShipment shipment2 = new CargoShipment("CARGO102", "Alice", "Bob", 120.5, null);

        // Using constructor 3
        CargoShipment shipment3 = new CargoShipment("CARGO103", "Delta Logistics", "Tech Corp", 500.0, "London", "Electronics");

        // Display all shipments
        shipment1.showShipmentDetails();
        shipment2.showShipmentDetails();
        shipment3.showShipmentDetails();
	}

}
