package oopsDemo1;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 2, 2025
 * Time    : 4:42:37 PM
 * project : CoreJava

 */
public class CoforgeEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// craete objects e1 , e2,e3 of employee class
		Employee developer = new Employee();
		Employee tester = new Employee();
		Employee sales = new Employee();
		System.out.println("*************** coforge Technologies *****************");
	
	// invoke menthod(method call)
		developer.inputEmployeeDetails();
		developer.calculateNetSalary();
		developer.displayEmployeeDetails();
		

		tester.inputEmployeeDetails();
		tester.calculateNetSalary();
		tester.displayEmployeeDetails();

		sales.inputEmployeeDetails();
		sales.calculateNetSalary();
		sales.displayEmployeeDetails();
	}

}
