package oppsDemo2;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 3, 2025
 * Time    : 4:30:23 PM
 * project : CoreJava
 * 

*/
public class SingleInhertanceDemo {

  
  
	public static void main(String[] args) {
		//create Objects of child class
		
		Developer d1 = new Developer(101,"James ","JDBC", "Santernder Bank");// invoke derived class constructor

		Developer d2 = new Developer(105,"doe ","JSpring", "virgin Atlantic");
		d1.display(); // child class object invokes parents method - inheritance
		d1.displayDeveloperDetails(); // child class object invoke child class method
		d2.display();
		d2.displayDeveloperDetails();
		
		Employee e1 =new Employee(106,"mike"); //Invokes parent class constructor
		e1.display();
		// TODO Auto-generated method stub

	}

}
