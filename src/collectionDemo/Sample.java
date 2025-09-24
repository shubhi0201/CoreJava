package collectionDemo;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 8, 2025
 * Time    : 3:59:40 PM
 * project : CoreJava

*/
public class Sample<T> { // Parametrize class / Gemeric class / Generic T -type
	private T data;	 // generic variable declaration

public Sample(T data) { //gerneric constructor
	this.data = data;
}

public T getData() { //getter with geniric return type
	return data;
}

public void setData(T data) { //setter with geniric return type
	this.data = data;
}
	

}
