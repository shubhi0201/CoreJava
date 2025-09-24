package collectionDemo.listdemo;

import java.util.ArrayList;
import java.util.List;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 9, 2025
 * Time    : 11:39:50 AM
 * project : CoreJava
	//Program to store user defined Objects in collections

*/
public class UserDefinedObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Creating Books  object & initialized using Book Constructor
		        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		        
		        //create a List of Book
		        
		        List <Book> bList = new ArrayList<>();
		        
		        //add books to list
		        
		        bList.add(b1);
		        bList.add(b2);
		        bList.add(b3);
		        
		        // Traverse a List
		        
		        System.out.println("*************** Book List *****************");
		        for (Book i:bList) {
		        	System.out.println(i.getId()+ " "+ i.getName()+ " "+ i.getAuthor()+ " "+ i.getPublisher()+ " " + i.getAuthor());
		        }
		        System.out.println("Total number of books : " + bList.size());
		  
	}

}
