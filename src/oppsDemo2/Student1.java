package oppsDemo2;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 4, 2025
 * Time    : 12:00:08 PM
 * project : CoreJava

*/
public class Student1{
	int rollNo;
	String name;
	Address ad;
	



	public Student1(int rollNo, String name, Address ad) {
		this.rollNo = rollNo;
		this.name = name;
		this.ad = ad;
	}




	void display()
	{
		System.out.println("---------- Student Details ------------");
		System.out.println("Student Id   :"+rollNo );
		System.out.println("Student Name :"+name);
		
		System.out.println("Address: "+ad.city+" "+ad.state+" "+ad.country+" "+
		ad.pincode);
	}
}
