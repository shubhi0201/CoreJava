package oppsDemo3;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 5, 2025
 * Time    : 12:10:11 PM
 * project : CoreJava

*/
public class HomeLoanFinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//using RBI rules
		RBI rbi = new RBI();
		rbi.showRBIGuidelines();
		
		//creating custome home loans
		
	HomeLoan loan1 = new HomeLoan("Alice", 30000, 200000);
	HomeLoan loan2 = new HomeLoan("harry", 45621, 12354);
		
			loan1.showLoanDetails();
	System.out.println("------------------------------");
	loan2.showLoanDetails();
		
		
		
		
		 // ❌ ERROR if you try to modify final variable
        // RBI.MIN_HOME_LOAN_RATE = 7.0;  // Not allowed
        // loan1.PROCESSING_FEE = 20000;  // Not allowed
	}

}
