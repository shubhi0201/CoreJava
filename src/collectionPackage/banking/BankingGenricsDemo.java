package collectionPackage.banking;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 8, 2025
 * Time    : 4:39:25 PM
 * project : CoreJava

*/
public class BankingGenricsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount<Integer> savingsAcc = new BankAccount<Integer>("Alice", 12355);
		BankAccount< String> currentAcc  = new BankAccount<String>("Bob", "CURR - 3215");
		BankAccount<Long> loanAcc = new BankAccount<Long>("charlie",4521624L);
		
		 System.out.println("=== Account Details ===");
	        savingsAcc.displayAccountInfo();
	        currentAcc.displayAccountInfo();
	        loanAcc.displayAccountInfo();

	        System.out.println("\n=== Transactions ===");
	        // Using Generic Method for different transaction types
	        BankingUtil.printTransaction("Deposit of $5000");
	        BankingUtil.printTransaction(2500.75);  // double amount
	        BankingUtil.printTransaction(12345);    // transaction ID
	}

}
