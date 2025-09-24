package oopsDemo1;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 3, 2025
 * Time    : 3:10:25 PM
 * project : CoreJava

*/
class Test{
	public void finalize() {
		System.out.println("Object Destroyed and Garbage Collected");
	}
}
public class DestructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test(); // initialize object -- invokes default constructor
		Test t2 = new Test();
		Test t3 = new Test();
		Test t4 = new Test();

		t1 = null; // deallocate memory - object destroyed explicitly
		t2 = null;
		t3 = null;
		System.gc();
		System.out.println("In main Method");
	}

}
