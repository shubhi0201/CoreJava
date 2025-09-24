package controlflow;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 1, 2025
 * Time    : 12:51:12 PM
 * project : CoreJava
 *  Program to display Odd & Even Numbers between 1-10
 *
 * ODD  EVEN
 * ---  ----
 * 1    2
 * 3    4
 * 5    6
 * 7    8
 * 9    10
*/
public class OddEvenDisplay {

	public static void main(String[] args) {
		int i = 1;
		System.out.println("odd \t Even");
		System.out.println("--- \t ----");
		while(i<=10) {
			if(i%2 ==1) {
				System.out.print(i);
			}
				else {
					System.out.println("\t"+i);
				}
				
				
				
			
			
			i = i+1;
		}
		
		// TODO Auto-generated method stub

	}

}
