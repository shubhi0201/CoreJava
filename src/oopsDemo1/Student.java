package oopsDemo1;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 2, 2025
 * Time    : 4:11:28 PM
 * project : CoreJava
 * Java ckass to define Blueprint of the student
 * 
*/
//instance class

import java.util.Scanner;

public class Student {

	// properties /state/attributes
	// private variable can be accessed only within the class
	
	private int rollNumber;
	private String name,course;
	private float m1,m2,m3, total;
	Scanner sc = new Scanner(System.in);
	//instance methods /behavior /functions
	//JVM will invoke default Constructor for initilizatation of object
	
	public void input() {
		System.out.println("Enter roll no , name , course");
		rollNumber = sc.nextInt();
		name = sc.next();
		course = sc.next();
		System.out.println("Enter marks of  3 Subjects");
		m1 = sc.nextFloat();
		m2 = sc.nextFloat();
		m3 = sc.nextFloat();
	}
	public float calculate() //method with return type float
	{
		total = m1+m2+m3;
		return total;
	}
	public void display() {
		System.out.println("******************* Student Details ************");
		System.out.println("Roll num    :"+ rollNumber);
		System.out.println("Name     :"+ name );
		System.out.println("Course     :"+ course );
		System.out.println("total marks     :"+ total );
		System.out.println("*****************************************************");
		
	}
}
