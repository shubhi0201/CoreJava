package basiscs;
import java.util.Scanner;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Aug 30, 2025
 * Time    : 9:34:10 AM
 * project : CoreJava
 * 
 * This program calculate the the sum and average of set of numbers using scanner input

*/
public class SumAverage {
	public static void main(String[] args) {
		//variable decalration
		int number1, number2, number3, sum;
		float avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter organization");
		String org = sc.nextLine();
		//taking input
		System.out.println("Enter 3 numbers");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		number3 = sc.nextInt();
		System.out.println("enter Your Name");
		sc.nextLine();
		String name= sc.nextLine();
		//process
		sum = number1+number2+number3;
	      avg = sum/3;

		System.out.println("************************************");
		//display output
      System.out.println("sum of 3 number is : "+ sum);
      System.out.println("Average of 3 number is : "+ avg);
      System.out.println("coded by "+ name+ " at " + org+ " coforge trianing");
      System.out.println("************************************");
      sc.close();
	}
}
