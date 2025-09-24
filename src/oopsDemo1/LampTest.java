package oopsDemo1;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 3, 2025
 * Time    : 10:35:03 AM
 * project : CoreJava
 * Java Program to implement instance class & main class in a Single file


// stores the value for light
	  // true if light is on
	  // false if light is off
    
     

*/

class Lamp{
	boolean isOn;
	
    //method to turn On the lightvoid turnOn()
	void turnOn(){
		isOn = true;
		System.out.println("Light On? "+ isOn);
		
	}
	  //method to turn Off the light
	void turnOff() {
		isOn = false;
		System.out.println("Light On? "+ isOn);
	}
}
public class LampTest {
	public static void main (String[] args) {
		// create Lamp objects led & halogen
		Lamp led = new Lamp();
		Lamp halegen = new Lamp();
		//switch on led & halogen
		led.turnOn();
		halegen.turnOn();
		
		//switch off led & halogen
				led.turnOff();
				halegen.turnOff();		
	}

}


