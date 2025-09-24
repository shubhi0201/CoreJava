package controlflow;
import java.util.Scanner;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Aug 30, 2025
 * Time    : 9:34:10 AM
 * project : CoreJava
 * 
 * This program calculate the the sum and average of set of numbers using scanner input which is greater than 100

 */
public class SumAverage {
	public static void main(String[] args) {
		//variable decalration
		int number1, number2, number3, sum;
		float avg;
		Scanner sc = new Scanner(System.in);
		//taking input
		System.out.println("Enter 3 numbers");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		number3 = sc.nextInt();

		//process
		if((number1>100) && (number2>100) && (number3>100)) {
			sum = number1+number2+number3;
			avg = (float)sum/3;

			System.out.println("************************************");
			//display output
			System.out.println("sum of 3 number is : "+ sum);
			System.out.println("Average of 3 number is : "+ avg);
			System.out.println("The average of 3 number is :  " + String.format("%.2f", avg));

		}
		else {
			System.out.println("Please enter number greater than 100");
		}
		System.out.println("************************************");
		sc.close();
	}
}
