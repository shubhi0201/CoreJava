package mapsdemo;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 9, 2025
 * Time    : 3:26:47 PM
 * project : CoreJava

*/
public class Employee {
	// Employee class to represent an employee assigned to a manager

	private int id;
	    private String name;
	    private String department;
	    
	    
	    
	    
	    public Employee(int id, String name, String department) {
			this.id = id;
			this.name = name;
			this.department = department;
		}




		public void display() {
		        System.out.printf("      [Employee ID: %d | Name: %-10s | Department: %s]%n", id, name, department);
		    }
}
