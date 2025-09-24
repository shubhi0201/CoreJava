package oppsDemo3;

import oppsDemo4.Trainee;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 5, 2025
 * Time    : 12:53:12 PM
 * project : CoreJava

*/
public class Marks extends Trainee {
	private double marks;

	public Marks(String name, String address, int number, double marks) {
		super(name, address, number);
		this.marks = marks;
	}

	@Override
	public double calculateMarks() {
		System.out.println("calculate Marks : ");
		// TODO Auto-generated method stub
		return marks*2;
	}
	

}
