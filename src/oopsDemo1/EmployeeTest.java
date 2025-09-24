package oopsDemo1;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 2, 2025
 * Time    : 4:42:37 PM
 * project : CoreJava

 */
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// craete objects e1 , e2,e3 of employee class
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
	
	// invoke menthod(method call)
		e1.inputEmployeeDetails();
		e1.calculateNetSalary();
		e1.displayEmployeeDetails();
		

		e2.inputEmployeeDetails();
		e2.calculateNetSalary();
		e2.displayEmployeeDetails();

		e3.inputEmployeeDetails();
		e3.calculateNetSalary();
		e3.displayEmployeeDetails();
	}

}
