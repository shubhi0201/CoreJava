package controlflow;

import java.util.Scanner;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 1, 2025
 * Time    : 10:11:48 AM
 * project : CoreJava

*/
public class SingleDigit {
	public static void main (String[] args) {
		
		int num ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		num = sc.nextInt();
		
		if(num > -10 && num< 10) {
			System.out.println(num + " is single digit");
		}
		else {
			System.out.println(num + " is not a Single Digit");
		}
	}

}
