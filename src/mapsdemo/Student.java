package mapsdemo;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 9, 2025
 * Time    : 4:12:32 PM
 * project : CoreJava
 // Java Comparable interface is used to order the object of user- defined class.
 // It provides single sorting squence only i.e. you can sort the elements on based on single data memeber only.
*/
public class Student implements Comparable<Student> {
private int rollno;
private String name;
private int age ;
public Student(int rollno, String name, int age) {
	this.rollno = rollno;
	this.name = name;
	this.age = age;
}

public int getRollno() {
	return rollno;
}

public String getName() {
	return name;
}

public int getAge() {
	return age;
}

@Override
public int compareTo( Student st ) {
	if(age == st.age)
		return 0;
	else if (age>st.age)
		return 1;
		else 
			return -1;
}




}
