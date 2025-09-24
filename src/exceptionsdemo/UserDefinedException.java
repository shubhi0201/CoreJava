package exceptionsdemo;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 8, 2025
 * Time    : 9:56:59 AM
 * project : CoreJava

*/
public class UserDefinedException {
	public static void main (String[] args) {
		
		CheckingAccount ck1 = new CheckingAccount(101);
		System.out.println("Depositing 25000$ ................");
		ck1.deposit(5000);
		try {
			System.out.println("Withdrawing 2000$ .............");
			ck1.withdraw(2000);
			System.out.println("Withdrawing 5000$ .............");
			ck1.withdraw(5000);
		} catch (InSufficientFundsException e) {
			System.err.println("Sorry Insufiecient Balance: "+ ck1.getBalance());
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
