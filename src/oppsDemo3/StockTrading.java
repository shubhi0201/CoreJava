package oppsDemo3;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 4, 2025
 * Time    : 4:38:38 PM
 * project : CoreJava

*/
public class StockTrading extends Trading {

	public StockTrading(double tradeAmount) {
		super(tradeAmount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tradeDetails() {
		// TODO Auto-generated method stub
		 System.out.println("Stock Trading: Investing in company shares.");
	        System.out.println("Amount invested = " + tradeAmount);
	        
	        
	}
	

}
