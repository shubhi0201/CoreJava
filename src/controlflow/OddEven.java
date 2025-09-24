package controlflow;

import java.util.Scanner;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 1, 2025
 * Time    : 10:04:45 AM
 * project : CoreJava
 * 
 * Program to check whether the entered number is odd or even

*/
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter number");
		
		num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num+ " is Even number");
		
		}
		else {
			System.out.println(num+ " is odd number");
		}
		sc.close();
	}

}
