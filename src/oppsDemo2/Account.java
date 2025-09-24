package oppsDemo2;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 4, 2025
 * Time    : 9:49:39 AM
 * project : CoreJava
 * Multilevel inheritence
	 // base class for SavingsBank
*/

public class Account  {

int accNo;
	String name;
  
  
  
  public Account(int accNo, String name) {
		this.accNo = accNo;
		this.name = name;
	}



  void display()
	{
		System.out.println("************ Account Details ************");
		System.out.println("Account Number :"+accNo);
		System.out.println("Customer Name :"+name);
	}

}
