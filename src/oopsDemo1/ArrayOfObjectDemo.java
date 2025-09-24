package oopsDemo1;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 3, 2025
 * Time    : 10:54:45 AM
 * project : CoreJava

*/
class Faculty
{
	int empId;
    String name;
    
    public void setData(int c,String d){
        this.empId=c;
       this.name=d;
     }
    
    public void showData(){
        System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
        System.out.println();
     }
}

public class ArrayOfObjectDemo {

	public static void main(String[] args) {
		//creating array of Faculty Object
		
		Faculty[] obj = new Faculty[5];
		
		// initilizing faculty object
		for(int i = 0; i <5;i++){
			obj[i]= new Faculty();
			
		}
		//assign data to faculty objects
		
		obj[0].setData(100, "James");
		obj[1].setData(101, "gavin");
		obj[2].setData(102, "Navin");
		obj[3].setData(103, "Mary");
		obj[4].setData(104, "Rod");
		
		// display Faculty Objecct data
		
		System.out.println("****************** faculty Details *********************");
		for(int i = 0;i<5;i++) {
			obj[i].showData();
			
		}
		System.out.println("***********************************************");
		// TODO Auto-generated method stub

	}

}
