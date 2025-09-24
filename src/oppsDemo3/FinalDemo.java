package oppsDemo3;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 5, 2025
 * Time    : 11:54:57 AM
 * project : CoreJava

*/

/*
Final Variable - Variable’s content cannot be modified
Final Method - A final method cannot be overridden. 
Final Class - Cannot extend a Final class

*/
final class Hello{
	
	final void display() {
		System.out.println("This iTs final MEthod");
	}
}
//class world extends Hello{ // final clsas cannot be extended0
//	// final method cannot be overridden
//	final void display() {
//		System.out.println("This iTs final MEthod");
//	}
//}
public class FinalDemo {

	public static void main(String[] args) {
		
		final int Age= 20;
		final float PI = 3.142f;
		
		//age =56 // complilation error --- final keyword cannnit be change
		// TODO Auto-generated method stub

	}

}
