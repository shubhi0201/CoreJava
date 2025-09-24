package oppsDemo2;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 4, 2025
 * Time    : 9:52:14 AM
 * project : CoreJava
 * // Child class of Account

*/
public class SavingBank extends Account {
	private int min_bal; // can access only within the class
	protected int  balance;  // can access within the class & in the sub class
  
  
  
  
  public SavingBank(int accNo, String name, int min_bal, int balance) {
		super(accNo, name);
		this.min_bal = min_bal;
		this.balance = balance;
	}




  void display()
    {
            super.display(); // invoke super class method
            System.out.println ("Minimum Balance: "+min_bal);
            System.out.println ("Saving Balance: "+balance);
    }
}
