package oppsDemo3;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 4, 2025
 * Time    : 3:17:14 PM
 * project : CoreJava

*/
 class Bank{
	 private String name;
	 
	 

	  public Bank(String name) {
		this.name = name;
	}
	  int getRateOfInterest(){
	        return 0;
	    }
	    void display(){
	        System.out.println("Welcome to "+name+" Bank");
	    }
 }
 
 class SBI extends Bank{

	public SBI(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 6;
	}

	
	 
 }
 class Axis extends Bank{

		public Axis(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}

		@Override
		int getRateOfInterest() {
			// TODO Auto-generated method stub
			return 7;
		}

		
		 
	 }
 class ICICI extends Bank{

		public ICICI(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}

		@Override
		int getRateOfInterest() {
			// TODO Auto-generated method stub
			return 6;
		}

		
		 
	 }
public class OverrideDemo {

	public static void main(String[] args) {
		
		SBI sbiBank = new SBI("SBI");
		Axis axis = new Axis("Axis");
		ICICI icici = new ICICI("ICICI");
	sbiBank.display();
	System.out.println("The intrest rate of sbi is : "+sbiBank.getRateOfInterest());
	icici.display();
	System.out.println("The intrest rate of sbi is : "+icici.getRateOfInterest());

	axis.display();
	System.out.println("The intrest rate of sbi is : "+axis.getRateOfInterest());


		// TODO Auto-generated method stub

	}

}
