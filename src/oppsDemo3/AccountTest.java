package oppsDemo3;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 4, 2025
 * Time    : 4:23:05 PM
 * project : CoreJava
* program to demostrate method overriding
*/
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccounts sAccountObj = new SavingsAccounts("John", 500, 4);

        System.out.println("\nSavings Account Details");
        System.out.println("------------------------");
        System.out.println("" + sAccountObj.getName()
                + " has an initial Balance of: " + sAccountObj.getBalance());
        sAccountObj.deposit(200);
        sAccountObj.withdraw(300);// invokes base class methods
        System.out.println("" + sAccountObj.getName()
                + " at the end of transaction has a Balance of: "
                + sAccountObj.getBalance());

        System.out.println("\nChecking Account Details");
        System.out.println("------------------------");

        CheckingAccount cAccountObj = new CheckingAccount("Stephen", 500, 200);

        System.out.println("" + cAccountObj.getName()
                + " has an initial Balance of: " + cAccountObj.getBalance());
        cAccountObj.deposit(200);
        cAccountObj.withdraw(1000); // // invokes overridden method of derived class
        System.out.println("" + cAccountObj.getName()
                + " at the end of transaction has a Balance of: "
                + cAccountObj.getBalance());
	}

}
