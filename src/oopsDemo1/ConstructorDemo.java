package oopsDemo1;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 3, 2025
 * Time    : 11:52:46 AM
 * project : CoreJava
 * Constructor is a special method with the same name of a class, 
 * which initializes an Object properties.
 * Same name as the class and no return type.
 * Special Method invoked whenever an instance/object of a given class is created.
 

*/
public class ConstructorDemo {

	 int id;
		String name;
		float salary;
		

	public ConstructorDemo() {
		System.out.println("Im implicit Consutroctor");
		id =101;
		name = "mike";
		salary =15000;
			// TODO Auto-generated constructor stub
		}

	  // generate Constructor with arguments
			// Source Menu -> Generate Constructor using Fields
			// --> Select All --> Generate Button
	public ConstructorDemo(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void display() {
		System.out.println(this.id + " "+ this.name+ " "+ this.salary);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorDemo cd1 = new ConstructorDemo(); //invokes implicit Constructor

ConstructorDemo cd2 = new ConstructorDemo(102,"John",6000.00f); // invoke parameteized constructor

ConstructorDemo cd3 = new ConstructorDemo(103,"Doe",8000.00f); // invoke parameteized constructor

ConstructorDemo cd4 = new ConstructorDemo();

ConstructorDemo cd5 = new ConstructorDemo();
cd1.display();
cd2.display();
cd3.display();
cd4.display();
cd5.display();
	}

}
