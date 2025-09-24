package controlflow;

import java.util.Scanner;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 1, 2025
 * Time    : 10:22:00 AM
 * project : CoreJava

*/
public class Greatest3 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		a = sc.nextInt();
		b =sc.nextInt();
		c = sc.nextInt();
		if(a > b && a > c) {
			System.out.println( a + " is Greartest");
			
		}
		else if(b>c) {
			System.out.println( b + " is Greatest");
		}
		else if (a==b && b == c) {
			System.out.println("All Numbers are equal");
		}
		else {
			System.out.println(c + " is Greatest");
		}
		// TODO Auto-generated method stub

	}

}
