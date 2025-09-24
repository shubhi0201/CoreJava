package oppsDemo4;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 5, 2025
 * Time    : 4:17:30 PM
 * project : CoreJava

*/
public abstract class HospitalStaff {
	//Abstract class representing a general Hospital Staff member


	private String name;
	    private String id;
	    private String department;
	    
	    
	    
	     public HospitalStaff(String name, String id, String department) {
			this.name = name;
			this.id = id;
			this.department = department;
		}

		 // Abstract method - must be implemented by subclasses
	    public abstract void performDuties();

	    // Concrete method - shared by all subclasses
	    public void attendMeeting() {
	        System.out.println(name + " is attending a hospital meeting.");
	    }

		public String getName() {
			return name;
		}

		public String getId() {
			return id;
		}

		public String getDepartment() {
			return department;
		}

}
