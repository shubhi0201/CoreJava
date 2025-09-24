package arraysDemo;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 2, 2025
 * Time    : 9:40:25 AM
 * project : CoreJava

*/
public class EnhancedforloopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = {"Ron","Harry","Peter","Harmaini", "Joe"};
		for(String x : array) {
			//enhanced for loop
			System.out.print(x+"\t");
		}
		System.out.println(" ");
		//for loop for same fuction 
		for(int i=0;i< array.length;i++) {
			System.out.print(array[i]+"\t");
		}

	}

}
