package controlflow;
import java.util.*;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Aug 30, 2025
 * Time    : 11:46:08 AM
 * project : CoreJava
 * 
 * Calculate the Simple intrest for given principal greater than 1 lakh.

 */
public class SimpleIntrest {
	public static void main (String[] args) {
		String customerName;
		double principal;
		float si;
		int term,rate;

		///Create scanner object for taking input at runtime
		Scanner scan = new Scanner(System.in);

		//Input
		System.out.println("*********** Soft Bank - Simple Interest Calculation *********");
		System.out.println("Enter Customer Name : ");
		customerName=scan.nextLine();//Multiple words input
		System.out.println("Enter Loan Amount   : ");
		principal=scan.nextDouble();
		System.out.println("Enter Loan Term     : ");
		term=scan.nextInt();
		System.out.println("Enter Rate of Interest :");
		rate=scan.nextInt();
if (principal>100000) {
	//Calculate Simple Interest
		si=(float) (principal*term*rate)/100;

		//Output
		System.out.println("************ Loan Details ************************");
		System.out.println("Customer Name           : "+customerName);
		System.out.println("Principal Amount        : "+principal);
		System.out.println("Term                    : "+term);
		System.out.println("Rate of Interest        : "+rate);
		System.out.println("--------------------------------------------------");
		System.out.println("Simple Interest         : "+si);
		System.out.println("--------------------------------------------------");

}
else {
	System.out.println("Not Eligible for Loan. Please avail above 1 Lakh");
}
		
		scan.close();
	}
}
