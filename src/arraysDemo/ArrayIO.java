package arraysDemo;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 2, 2025
 * Time    : 10:04:10 AM
 * project : CoreJava
 * Program to enter array and display it

*/
public class ArrayIO {

	public static void main(String[] args) {
		int marks[] = {78,58,89,15,45,82,21,45,87,47,65,96};
		System.out.println("********************** Array of Marks ***************************");
		for(int i =0;i<marks.length;i++) {
			System.out.print(marks[i]+"\t");
		}
		System.out.println();
		System.out.println("The size of array is : "+ marks.length);
		System.out.println("First element of array is : "+ marks[0]);
		System.out.println("Last Element of array is ; "+marks[marks.length-1]);
		
		// Eneter the value of array at run time 
		
		System.out.println("**********************************************");
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter total number of students : ");
		int n = sc.nextInt();
		System.out.println("Enter marks2 Array Element : ");
		int marks2[]= new int[n]; // decalare array and allocate the memory of size n
		for(int i= 0;i<n;i++) {
			marks2[i]= sc.nextInt();
		}
		System.out.println("*********** marks 2 content ******************  ");
		for(int i=0;i< marks2.length;i++) {
			System.out.println(marks2[i]+ " ");
		}
		System.out.println();
		System.out.println("Display marks without loop");
		System.out.println(Arrays.toString(marks));
 		sc.close();

	}

}
