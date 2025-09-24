package collectionPackage.banking;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 8, 2025
 * Time    : 4:37:42 PM
 * project : CoreJava

*/
//Utitilty class with generic menthod
public class BankingUtil {
	// Generic method to print any type of transaction
    public static <T> void printTransaction(T transaction) {
        System.out.println("Transaction: " + transaction);
    }


}

