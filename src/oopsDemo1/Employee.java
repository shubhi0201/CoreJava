package oopsDemo1;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 2, 2025
 * Time    : 4:35:41 PM
 * project : CoreJava
 * Java OOProgram to enter employee details ,calculate his 
 * Net Salary & display details
 
 

 */
//instance class

import java.util.Scanner;

public class Employee {
	//attributes
	// encapsulation & data abstraction
	
	private int empId;
	private String firstName,lastName,desig;
	private double basic ,hra,da,grossSal,netSal;
	private static final double TAX = 1000; //constant declation
	Scanner s = new Scanner(System.in);
	 public void inputEmployeeDetails() // method definition
		{
			System.out.println("Enter Employee ID, First Name, Last Name & Designation :");
			empId=s.nextInt();
			firstName=s.next();// input single word
			lastName=s.next();
			s.nextLine();
			desig=s.nextLine();// input multiple Words
			System.out.println("Enter Employee Basic Salary :");
			basic=s.nextDouble();
			
		}
		
		public void calculateNetSalary()
		{
			hra=basic*0.15;
			da=basic*0.10;
			grossSal=basic+hra+da;
			netSal=grossSal-TAX;
		}
		
		public void displayEmployeeDetails()
		{
			System.out.println("************* Employee Salary Details ***********");
			System.out.println("Employee Id   :  "+empId);
			System.out.println("Employee Name :  "+firstName+" "+lastName+" -"+desig);
			System.out.println("Basic Salary  :  "+basic);
			System.out.println("HRA           :  "+hra);
			System.out.println("DA 			  :  "+da);
			System.out.println("Gros Salary   :  "+grossSal);
			System.out.println("Tax           :  "+TAX);
			System.out.println("-------------------------------------------------");
			System.out.println("Net Salary    :  "+netSal);
			System.out.println("-------------------------------------------------");
		}
}
