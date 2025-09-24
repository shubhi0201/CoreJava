package oopsDemo1;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 3, 2025
 * Time    : 10:45:25 AM
 * project : CoreJava

*/
public class Bicycle {
	int gear;
	void applyBrake() {
		System.out.println("Applying Breaks...........");
		
	}
	public void startBycycling() {
		gear = gear+1;
		System.out.println("Cycle is on Gear No. "+ gear);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle sportsBicycles = new Bicycle();
		sportsBicycles.startBycycling();
		sportsBicycles.startBycycling();
		sportsBicycles.startBycycling();
		sportsBicycles.startBycycling();                                     
		sportsBicycles.applyBrake();
	}

}
