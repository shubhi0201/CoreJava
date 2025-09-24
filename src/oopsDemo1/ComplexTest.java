package oopsDemo1;

import java.util.Scanner;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 3, 2025
 * Time    : 12:35:34 PM
 * project : CoreJava

*/
public class ComplexTest {

	public static void main(String[] args) {
		Complex c1 = new Complex(10.3,67.4);
		Complex c2 = new Complex(0.7,3.6);
		Complex c3 = new Complex(1.0,1.0);
		c1.add(c2);
		System.out.println("The addition of 2 Complex number is ");
		c1.display();
		c1.add(c3);
		System.out.println("The addition of 2 Complex number is ");
		c1.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter real and imaginary part of complex number");
		double r = sc.nextDouble();
		double i = sc.nextDouble();
		
		Complex c4 = new Complex(r,i);
		c2.add(c4);
		System.out.println("The addition of 2 complex number is: ");
		c2.display();
		// TODO Auto-generated method stub

	}

}
