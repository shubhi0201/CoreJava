package controlflow;

import java.util.Scanner;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 1, 2025
 * Time    : 11:53:25 AM
 * project : CoreJava
 * Program to Check whether entered alphabet using Ternary Operator
*/
public class TernaryDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  char myChar;
	        Scanner scanner=new Scanner(System.in);

	        System.out.println("Enter a Character :");
	        myChar=scanner.next().charAt(0); // Take Single character Input
	        // Ternary Operator
	        String output = (myChar >= 'a' && myChar <='z' ) || (myChar >= 'A' && myChar <='Z' )? myChar+"is an Alphabet": myChar+ " is not Alphabet";
	        System.out.println(output);
	}

}
