package oppsDemo2;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 4, 2025
 * Time    : 9:55:38 AM
 * project : CoreJava
 * Multi Level Inheritance  
 *  Account  --- > SavingsBank ---> AccountDetails
 
 

*/ 
public class AccountDetails extends SavingBank{
	 
	 //child class of Savings Bank
	 
	 int withdrawl,deposit,finalBalance;
	 
	 




	 public AccountDetails(int accNo, String name, int min_bal, int balance,  int deposit,int withdrawl,
			int finalBalance) {
		super(accNo, name, min_bal, balance);
		this.withdrawl = withdrawl;
		this.deposit = deposit;
		this.finalBalance = finalBalance;
	 }
	 void display()
	    {
	            super.display(); // invokes savings bank display()method
	            System.out.println ("Deposit: "+deposit);
	            System.out.println ("Withdrawals: "+withdrawl);
	            finalBalance=(balance+deposit)-withdrawl;
	            System.out.println("Final Balance:" + finalBalance);
	    }

}
