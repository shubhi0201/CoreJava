package oopsDemo1;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 3, 2025
 * Time    : 12:24:43 PM
 * project : CoreJava

*/
public class Complex {
	private double real;
	private double imaginary;
	
		// Generate Constructor using fields
    
	public Complex(double real, double imaginary) { // parame
		this.real = real;
		this.imaginary = imaginary;
	}
    
    public void add(Complex obj) {
    	this.real+=obj.real;
    	this.imaginary=obj.imaginary;
    }
    public void display()
	{
		System.out.println("r"+this.real+" + i"+this.imaginary);
	}

		
}
