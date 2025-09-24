package controlflow;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 1, 2025
 * Time    : 4:17:13 PM
 * project : CoreJava

*/
public class NestedLoopDemo2 {

	public static void main(String[] args) {
		int weeks =3,days=7, i=1;
		while(i<=weeks) {
			System.out.println("Week "+i);
			for(int j=1;j<=days;j++) {
				System.out.println("\t"+"Days : "+j);
			}
			i++;
		}
		
		// TODO Auto-generated method stub

	}

}
