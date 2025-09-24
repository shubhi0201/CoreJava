package oopsDemo1;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 3, 2025
 * Time    : 12:51:25 PM
 * project : CoreJava

 */
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time(2,59,59);
		Time t2 = new Time(3,59,59);
		System.out.println("first time is " );
		t1.display();
		System.out.println("first time is " );
		t2.display();
Time t3 = t1.add(t2);
System.out.println("total time is ");
t3.display();
	}


}
