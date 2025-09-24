package oopsDemo1;

import java.util.Scanner;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 3, 2025
 * Time    : 2:26:10 PM
 * project : CoreJava

 */
public class PublicTest {

	public static void main(String[] args) {
		Person objPerson1 = new Person(); //invoke implicit function

		objPerson1.input();
		objPerson1.print();
		System.out.println("-------------------------------------------");
		Person objPerson2 = new Person("Mike",45);
		objPerson2.print();
		Person objPerson3 = new Person("Navin", "Chainnai",45);
		objPerson3.print();

		System.out.println("-------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name , Consistency & Age : ");
		
		String name = sc.next();
		String constituency = sc.next();
		int Age = sc.nextInt();
		Person objPErPerson4 = new Person(name, constituency, Age); // dynamic time value
		objPErPerson4.print();



		// TODO Auto-generated method stub

	}

}
