package exceptionsdemo;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 8, 2025
 * Time    : 9:47:45 AM
 * project : CoreJava

*/
public class InSufficientFundsException extends Exception {
private double amount;

public InSufficientFundsException(double amount) {
	this.amount = amount;
}

public double getAmount() {
	return amount;
}

}
