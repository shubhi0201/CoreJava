package oppsDemo2;

import oopsDemo1.Student;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 4, 2025
 * Time    : 11:55:41 AM
 * project : CoreJava

*/
public class AggregationDemo {

	public static void main(String[] args) {
		Address ad1 = new Address("Benglouru","karnataka","india",56664);
		Address ad2 = new Address("Benglouru","karnataka","india",56664);
	
		Student1 s1 = new Student1(101, "Ravi", ad1);
		Student1 s2 = new Student1(102, "Sita", ad2);
		
		
		s1.display();
		s2.display();
		// TODO Auto-generated method stub

	}

}
