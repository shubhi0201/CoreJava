package basiscs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Aug 30, 2025
 * Time    : 11:32:02 AM
 * project : CoreJava
 * 
 * Java Program to perform Arthmatic operation 

*/
public class Arthmatic {

	public static void main(String[] args) throws  IOException {
		int a, b, sum, sub ,mul;
		float div;
		String name;
		
		//BufferReader for input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Input Statement -- take input using bufferedReader
		System.out.println("Enter 2 number :");
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		
		System.out.println(" Enter your Name: ");
		name = br.readLine(); // accept multiple words directly
		
		//Process
		
		sum = a+b;
		sub=a-b;
		mul= a*b;
		div = (float)a/b;
		
		//Display output
		
		System.out.println("**********Arthmatic operation*************");
		System.out.println("Addition of 2 number is "+ sum);
		System.out.println("Subtraction of 2 number is "+ sub);
		System.out.println("Multiplication of 2 number is "+ mul);
		System.out.println("Division of 2 number is "+ div);
		System.out.println("Program created by :" + name);
		System.out.println("*************************************************");
		
		
		
		// TODO Auto-generated method stub

	}

}
