package oppsDemo4;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 5, 2025
 * Time    : 4:19:43 PM
 * project : CoreJava

*/
public class Nurse extends HospitalStaff {
	
	private int patientLoad;
	


	  
public Nurse(String name, String id, String department, int patientLoad) {
	super(name, id, department);
	this.patientLoad = patientLoad;
}


public void administerMedication() {
    System.out.println(getName() + " is administering medication to patients.");
}


@Override
public void performDuties() {
	// TODO Auto-generated method stub
	 System.out.println(getName() + " is caring for " + patientLoad + 
             " patients in the " + getDepartment() + " department.");

}

}
