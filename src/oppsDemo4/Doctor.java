package oppsDemo4;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 5, 2025
 * Time    : 4:22:54 PM
 * project : CoreJava

*/
public class Doctor extends HospitalStaff{
	 private String specialization;
	 
	 public Doctor(String name, String id, String department, String specialization) {
	super(name, id, department);
	this.specialization = specialization;
}

	 public void performDuties() {
	  System.out.println(getName() + " is examining patients in the " + 
	                 getDepartment() + " department (" + specialization + ").");
	 
	 }
	                 
	  public void prescribeMedication() {
		        System.out.println(getName() + " is writing a prescription.");
		    

}
}