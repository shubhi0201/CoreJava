package collectionDemo.listdemo;

import java.util.ArrayList;
import java.util.Collections;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 9, 2025
 * Time    : 10:20:40 AM
 * project : CoreJava
// Java prorgam to to Add element to Add element to ArrayList, Perform manupulation & display element
*/
public class ArrayListDemo1 {

	public static void main(String[] args) {
		// Create generic ArrayList of type String
		ArrayList<String> p1 = new ArrayList<>();
		// Add elemnt to ArrayList -- It mainatain oder of inserstion . Data Storesd information of object4
		p1.add("java");
		p1.add("Perl");
		p1.add("c++");
		p1.add("c#");
		p1.add("Rubby");
		p1.add("Python"); // Stores Duplicate Element 
		p1.add("javascript");
		//Display ArrayList Content as List
		System.out.println("Programming Langugae ArrayList : "+ p1);
		// Access element using get() method
		System.out.println("Element at index 1 is : "+p1.get(1));
		System.out.println("Does ArrayList Contain Java? "+ p1.contains("Java"));
	 // Add element at Specific index
		p1.add(2, "Oracle");
		System.out.println("Programming Langugage ArrayList: "+ p1);
		// Manipulations 
		System.out.println("Is ArrayList Empty ? :" + p1.isEmpty());
		System.out.println("The position of python : " + p1.indexOf("Python"));
		System.out.println("The size of ArrayList is: "+ p1.size() );
		
		//Create ArrayList to store Marks 
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(89);
		marks.add(45);
		marks.add(69);
		marks.add(98);
		marks.add(78);
		 // marks.add("Hello"); //Compiler Error - Type Safety

        System.out.println("The Marks ArrayList is :"+marks);
        System.out.println("The Size of Marks ArrayList is : "+marks.size());
        System.out.println("The Marks at 3rd index is : "+marks.get(3)); // AutoUnboxing - Convert Object to primitive type

        Collections.sort(marks);
        System.out.println("Marks ArrayList after Sorting :"+marks);
		// TODO Auto-generated method stub

	}

}
