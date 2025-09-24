package controlflow;

import java.util.Scanner;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 1, 2025
 * Time    : 9:39:50 AM
 * project : CoreJava
 * 
 * program to  check the greatest of two numbers

*/
public class Greatest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  2 numbers");
		a = sc.nextInt();
		b= sc.nextInt();
		if(a>b) {
			System.out.println(a + " is Greatest");
		}
		else {
			System.out.println(b+ " is Greatest");
		}
		
		sc.close();

	}

}
