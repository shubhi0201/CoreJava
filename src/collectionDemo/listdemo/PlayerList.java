package collectionDemo.listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 9, 2025
 * Time    : 10:45:17 AM
 * project : CoreJava

 */
public class PlayerList {

	private ArrayList<String> playerArray;
	private List<String> subList;

	public PlayerList() {
		this.playerArray = new ArrayList<>(); //upcasting
		this.subList = new ArrayList<>();
	}

	void addPlayer() {
		playerArray.add("Martina");
		playerArray.add("Serena");
		playerArray.add("Venus");
		playerArray.add("Serena");
		playerArray.add("Sachin");
		playerArray.add("Dravid");
		playerArray.add("Ganguly");
		playerArray.add("Laxman");
		System.out.println();
	}

	void search() {
		System.out.println();
		System.out.println("************************************"
				+ "***********************");
		System.out.println("Search for an object and return "
				+ "the first and last position");
		System.out.println("*********************************"
				+ "***************************");
		System.out.println();
		System.out.println("First occurance of the String"
				+ " \"Serena\" is at position " + playerArray.indexOf("Serena"));
		System.out.println("Last occurance of the String"
				+ " \"Serena\" is at position  " + playerArray.lastIndexOf("Serena"));
		System.out.println();
	}

	void extract() {
		System.out.println("***************************"
				+ "*********************");
		System.out.println("Extract a sublist and "
				+ "then print the new List ");
		System.out.println("************************"
				+ "*************************");
		System.out.println();
		subList = playerArray.subList(4, playerArray.size());
		System.out.println("New Sub-List from index 4 to "
				+ playerArray.size() + " is : " + subList);
		System.out.println();
	}
	void Display() {
		System.out.println("*************** Diplay Players using Iterator");
		Iterator<String> itr = playerArray.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}