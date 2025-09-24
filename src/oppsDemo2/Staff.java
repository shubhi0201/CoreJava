package oppsDemo2;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 4, 2025
 * Time    : 10:09:24 AM
 * project : CoreJava
 * Program to Demonstrate MultiLevel Inheritance


*/
public class Staff {

private int staffId;
    private String name;
    protected float basics,hra;     //protected variables can be accessed in Child class
    
    
    
    public Staff(int staffId, String name, float salary) {
		this.staffId = staffId;
		this.name = name;
		this.basics = basics;
		
	}
	void getHRA() {
        hra=(basics*60)/100;
        System.out.println("HRA :"+hra);
    }
    void display() {
        System.out.println(staffId+" "+name+" "+basics);
    }
    void printSal() {
        System.out.println("Total Salary : "+(basics+hra));
    }
    
    
}
// manger is a staff
class Manger extends Staff{
	protected float da;
	private float gross;
	public Manger(int staffId, String name, float basics) {
		super(staffId, name, basics);
		
	}

    void getDA() {
        da=(basics*60)/100;
        System.out.println("Dearness Allowance : "+da);
    }
    void print() {
        gross=basics+hra+da;
        System.out.println("Total Salary of Manager : "+gross);
    }
	
}
class Director extends Manger{
	//Staff -> Manager -> Director - Multilevel Inheritance


	private float ta,gross;



	public Director(int staffId, String name, float basics) {
		super(staffId, name,basics);
	}
	void getTA() {
	        ta=(basics*30)/100;
	        System.out.println("Travelling Allowance : "+ta);
	    }
	    void print() {
	        gross=basics+hra+da+ta;
	        System.out.println("Total Salary of Director : "+gross);
	    }
}