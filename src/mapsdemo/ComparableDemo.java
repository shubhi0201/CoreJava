package mapsdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 9, 2025
 * Time    : 4:19:45 PM
 * project : CoreJava

*/
public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student > al = new ArrayList<Student>();
		al.add(new Student(111, "mike", 29) );
		al.add(new Student(142, "john", 51) );
		al.add(new Student(123, "Rohan", 32) );
		
		Collections.sort(al);
		for (Student st : al) {
			System.out.println(st.getRollno()+ " "+ st.getName()+ " "+ st.getAge());
		}
		

	}

}
