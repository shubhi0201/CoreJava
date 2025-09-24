package oppsDemo3;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 4, 2025
 * Time    : 4:34:51 PM
 * project : CoreJava
Method overRiding example
*/
public class Trading {
	protected double tradeAmount;

	public Trading(double tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	
	// Method to be overridden
    public void tradeDetails() {
        System.out.println("General Trading: Amount invested = " + tradeAmount);
    }

    // Profit/Loss calculation (default)
    public double calculateProfitLoss() {
        return tradeAmount*0.10; // No calculation for general trading
    }
}
