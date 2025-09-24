package oppsDemo4;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 5, 2025
 * Time    : 2:34:32 PM
 * project : CoreJava

*/
public class Manager extends Employee {
	private String department;

	public Manager(String name, double basic, String address, String department) {
		super(name, basic, address);
		this.department = department;
	}

	@Override
	double totalPay() {
		double totalAmount = 0;
        double houseRentAllowance = (basic * 0.08);
        double dearnessAllowance = (basic * 0.3);
        double medicalAllowance = 1500;
        totalAmount = basic + houseRentAllowance
        + dearnessAllowance + medicalAllowance;
        return totalAmount;
		// TODO Auto-generated method stub
		
	}
	
    
void show() {
      super.show();
      System.out.println("Department: \t\t" + department);
  }

}
