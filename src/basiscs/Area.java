package basiscs;
/**
 * This program calculates the area of circle,
 *  Itt demostrate the use of variables, arthmatic operations,
 *  and console output in java 
 *  
 *  @version 1.0
 *  **/
public class Area {

	public static void main(String[] args) {
		double radius = 7.5;// radius of circle
		double area; // variable to store area
		final double PI = 3.14159; // constant value of pi
		//calculatre the area of circle
		area = PI*radius*radius;
		// print the area in consoles
		System.out.println("The area of circle whose radius is "+ radius+" : "+area);
		// TODO Auto-generated method stub

	}

}
