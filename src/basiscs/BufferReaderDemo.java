package basiscs;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Aug 30, 2025
 * Time    : 10:35:30 AM
 * project : CoreJava

 */
public class BufferReaderDemo {

	public static void main(String[] args) throws Exception {

		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);

		System.out.println("Enter your name");	
		String name = br.readLine();
		System.out.println("Enter your age");
		int age = Integer.parseInt(br.readLine());
		System.out.println("enter your Salary");
		float salary = Float.parseFloat(br.readLine());

		System.out.println("Welcoome " + name + " your age is : "+ age + " and your salary is "+ salary);


	}

}
