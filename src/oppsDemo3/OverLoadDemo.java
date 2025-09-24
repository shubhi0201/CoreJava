package oppsDemo3;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 4, 2025
 * Time    : 2:37:32 PM
 * project : CoreJava
 * Program to demonstrate Method Overloading. - Static Polymorphism
 *
 * Overload add() method with different type/no. of Arguments

*/
class Addition{
	public void add() {
		System.out.println("Method Overloading Demo");
	}
	public void add(int a,int b) {
		System.out.println("The Addition of two int Nos is" + (a+b));
	}
	public void add(float a , float b) {
		System.out.println("The Addition of two float Nos is" + (a+b));
	}
	public void add(int a , int b , int c) {
		System.out.println("The Addition of 3 Nos is" + (a+b));
	}
	public void add(String s1 , String s2) {
		System.out.println("The Addition of two strings  is" + (s1+s2));
	}
	
}

public class OverLoadDemo {

	public static void main(String[] args) {
		Addition a1 = new Addition();
		
		
		a1.add();
		a1.add(20, 30.5f);
		a1.add(34.4f, 530.6f);
		
		// TODO Auto-generated method stub

	}

}
