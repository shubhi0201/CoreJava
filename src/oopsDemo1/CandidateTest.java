package oopsDemo1;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 3, 2025
 * Time    : 12:17:06 PM
 * project : CoreJava

*/
public class CandidateTest {

	public static void main(String[] args) {
		
		//  invoke parametrized constructor
		
		Candidate cd1 = new Candidate(102,"John",6000.00f); // invoke parameteized constructor

		Candidate cd2 = new Candidate(103,"Doe",8000.00f);
		cd1.calculateDA();
		cd1.display();
		
		cd2.calculateDA();
		cd2.display();
		// TODO Auto-generated method stub

	}

}
