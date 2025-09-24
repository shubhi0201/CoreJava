package controlflow;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 1, 2025
 * Time    : 11:46:11 AM
 * project : CoreJava
 * 
  Ternary Operator : It is a conditional Operator used in place of If-Else for Simple condition.
 * It Takes 3 Operands
 * Syntax: variable = condition ? expr1 : expr2
 *
 * Program to find Max of 2 Numbers

 */
public class TernaryDemo {

	public static void main(String[] args) {
int a = 1110, b = 220, max;
		System.out.println("First number: "+ a );
		System.out.println("Second number: "+ b);
		String msg = (a>b)? "A is Graetest": "B is greatest";
		System.out.println(msg);
		max = (a>b)?a:b;
				System.out.println("Max of 2 number is : "+max);
		// TODO Auto-generated method stub

	}

}
