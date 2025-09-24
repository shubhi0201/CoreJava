package collectionDemo.listdemo;

import java.util.Collections;
import java.util.LinkedList;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 9, 2025
 * Time    : 12:00:44 PM
 * project : CoreJava
//Use linked list for more Insert & remove operations

*/
public class LikedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 LinkedList<Double> stockPrices=new LinkedList<>();

		        //Linked list containing stock prices of a company for last 6 days
		        stockPrices.add(45.00);
		        stockPrices.add(51.00);
		        stockPrices.add(62.50);
		        stockPrices.add(42.75);
		        stockPrices.add(36.80);
		        stockPrices.add(69.40);

		        System.out.println(stockPrices);

		        //Collections Utility Class functions
		        Collections.sort(stockPrices);
		        System.out.println("Stock Prices after Sorting : "+stockPrices);

		        Collections.reverse(stockPrices);
		        System.out.println("Stock Prices Reversed :"+stockPrices);

		        System.out.println("Maximum Stock Price :"+Collections.max(stockPrices));
		        System.out.println("Minimum Stock Price :"+Collections.min(stockPrices));
	}

}
