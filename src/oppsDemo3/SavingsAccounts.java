package oppsDemo3;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 4, 2025
 * Time    : 4:15:04 PM
 * project : CoreJava

*/
public class SavingsAccounts extends Account {
	private double intrestRate;

	public SavingsAccounts(String name, double balance, double intrestRate) {
		super(name, balance);
		this.intrestRate = intrestRate;
	}
}


class CheckingAccount extends Account{
	private double overDraft; // pre- sanctioned Loan

	public CheckingAccount(String name, double balance, double overDraft) {
		super(name, balance);
		this.overDraft = overDraft;
	}

	@Override
	public void withdraw(double amt) {
		  System.out.println("Overdraft Amount: " + overDraft);
	        if (amt <= balance) {
	            balance -= amt;
	            System.out.println("Withdrawing: " + amt);
	        } else if ((amt > balance) && (amt > (balance + overDraft))) {
	            System.out.println("Sorry! You cannot withdraw");
	        } else {
	            double result = amt - balance;
	            overDraft -= result;
	            balance = 0;

	            System.out.println("Withdrawing: " + amt);
	            System.out.println("Current Overdraft Amount: "
	                    + overDraft);
	        }
		// TODO Auto-generated method stub
		
	}
	
	
}
