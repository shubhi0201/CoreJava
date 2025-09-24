package controlflow;

import java.util.Scanner;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 1, 2025
 * Time    : 3:09:40 PM
 * project : CoreJava

*/
public class Multiplication {

	public static void main(String[] args) {
		int i , num,mul;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		for (i=1;i<=10;i++) {
		mul = num*i;
		 System.out.println(num +" * "+ i+ " = " +mul );
		 
		}
		// TODO Auto-generated method stub

	}

}
