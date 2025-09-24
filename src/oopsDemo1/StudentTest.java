package oopsDemo1;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 2, 2025
 * Time    : 4:25:32 PM
 * project : CoreJava

*/
public class StudentTest {
// java program to impliment oops
	public static void main(String[] args) {
		// create  a object of student
		Student s1 = new Student();
		Student s2 = new Student();
		//invoke method of student class of using dot operator
		s1.input();
		float tot = s1.calculate();
		s1.display();
		System.out.println("Total Displayed from main: "+ tot);
		
		
		//invoke method of student class using dot operator
		s2.input();
		float tot1 = s2.calculate();
		s2.display();
		System.out.println("Total Displayed from main: "+ tot1);
		
	
		// TODO Auto-generated method stub

	}

}
