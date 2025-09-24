package oppsDemo3;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 5, 2025
 * Time    : 11:32:30 AM
 * project : CoreJava

*/
class Count{
	private static int cnt; //Static variable
	private int a ;//instance variable
	
	Count(){
		cnt++;
		a=100;
	}
	
	//static method - It can use only static variables 
	
	public static void display() {
		System.out.println("The Number of Object Created :" + cnt);
	}
	 public void print(){
	        System.out.println("Instance Method Variable : "+a);
	    }
}

public class StaticDemo {

	public static void main(String[] args) {
		
		Count c1 = new Count();

		Count c2 = new Count();

		Count c3 = new Count();

		Count c4 = new Count();
		c1.print();
		Count.display();
		// TODO Auto-generated method stub

	}

}
