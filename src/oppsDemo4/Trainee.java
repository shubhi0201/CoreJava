package oppsDemo4;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 5, 2025
 * Time    : 12:49:45 PM
 * project : CoreJava

*/
public abstract class Trainee {
	
	 public Trainee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}
	 private String name;
	   private String address;
	   private int number;
	   
	   
	   
	
	 //abstract method declaration - must be overridden in the derived class
	   public abstract double calculateMarks();
	     
	     
	     void show()
		{
			System.out.println("Display Marks for :" +this.name+ " "+this.address);
		}
		 @Override
		 public String toString() {
			return "Trainee [name=" + name + ", address=" + address + ", number=" + number + "]";
		 }
		
		
	   
}
