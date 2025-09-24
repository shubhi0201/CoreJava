package oppsDemo2;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 3, 2025
 * Time    : 4:21:42 PM
 * project : CoreJava
 * //child class - Inheritance -is a relationship


*/
public class Developer extends Employee {
	private String skillSet;
	private String projectName;
	
	//generate constructor using fields
	public Developer(int empId, String name, String skillSet, String projectName) {
		super(empId, name); //invoke parent class constructor by passing empId and name
		this.skillSet = skillSet;
		this.projectName = projectName;
	}

	//method to display developer details
	
	public void displayDeveloperDetails() {
		// call parent class method
		
		System.out.println("Skill Set: " + skillSet);
		System.out.println("Project Name: " + projectName);
	}
		// TODO Auto-generated constructor stub
	}

