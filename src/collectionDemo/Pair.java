package collectionDemo;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 9, 2025
 * Time    : 9:25:33 AM
 * project : CoreJava

 */

// Generic class with 2 parameter --
//Maps - Stores data in form of keys & values pairs -- Hashmap , TreeMap
public class Pair<T , U> {
	private T first;
	private U second;

	//Default constructor

	public Pair() {
		this.first = null;
		this.second = null;


	}
	//Generic constructor

	public Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}
	// Generate Getters and setters
	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public U getSecond() {
		return second;
	}

	public void setSecond(U second) {
		this.second = second;
	}



}
