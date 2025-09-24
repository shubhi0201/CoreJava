package controlflow;

import java.util.Scanner;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 1, 2025
 * Time    : 2:22:12 PM
 * project : CoreJava

*/
public class DoWhileDemo2 {
	public static void main (String [] args) {
		int i =20;
	do{
		System.out.println(i+ "\t");
		i++;
	}while(i<=50);
	System.out.println("**************** Guesss the Number *****************");
	String guess;
	Scanner  sc = new Scanner(System.in);
	do {
		System.out.println("Guess the Name");
		guess = sc.next();
		
	}while(!"James".equals(guess));
	System.out.println(" Congratulations You Guessed correctly!!!" + guess);
	sc.close();
	
	
	
	}
	
	

}
