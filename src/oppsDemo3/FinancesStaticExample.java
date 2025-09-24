package oppsDemo3;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 5, 2025
 * Time    : 11:51:57 AM
 * project : CoreJava

*/
public class FinancesStaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create Accounts
        BankAccount acc1 = new BankAccount("Alice", 5000);
        BankAccount acc2 = new BankAccount("Bob", 10000);

        // Show details (interestRate is common for both)
        acc1.showAccountDetails();
        System.out.println("-------------------");
        acc2.showAccountDetails();

        System.out.println("\n📌 Changing interest rate...");
        BankAccount.setInterestRate(7.5); // Static method call (class-level)

        // After updating interest rate
        acc1.showAccountDetails();
        System.out.println("-------------------");
        acc2.showAccountDetails();

        // Static method to calculate interest
        double si = BankAccount.calculateSimpleInterest(20000, 3);
        System.out.println("\n💰 Simple Interest on 20000 for 3 years = " + si);
	}

}
