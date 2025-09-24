package oopsDemo1;

import java.util.Scanner;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 3, 2025
 * Time    : 10:01:05 AM
 * project : CoreJava

 */
public class BookTest {

	public static void main(String[] args) {
		Book b1= new Book();
		//invoke setter method -input

		b1.setBookId(101);
		b1.setBookName("Programming in c");
		b1.setPrice(500);
		b1.setPublisher("Prime Books");

		//invoke getter menthod -output

		System.out.println("************** book details ***********************");
		b1.display();
		System.out.println(b1.getBookId()+ " "+ b1.getBookName()+ " " + b1.getPrice()+ " "+ b1.getPublisher());
		System.out.println("Discounted price of book : "+ b1.discountPrice());
		System.out.println(b1); // invokes toString() method of instance class
		// TODO Auto-generated method stub


		Book b2= new Book();
		Scanner sc = new Scanner(System.in);

		b2.setBookId(sc.nextInt());
		sc.nextLine();
		b2.setBookName(sc.nextLine());
		b2.setPrice(sc.nextFloat());
		sc.nextLine();
		b2.setPublisher(sc.nextLine());
		sc.close();
		System.out.println("************** book details *************************************");
		b2.display();
		System.out.println("************* Employee Salary Details ***********");
		System.out.println("Book Id   :  "+b2.getBookId());
		System.out.println("Book Name :  "+b2.getBookName());
		System.out.println("Book Price  :  "+b2.getPrice());
		System.out.println("Book Publisher           :  "+b2.getPublisher());
		System.out.println("Disconted price of book 			  :  "+b2.discountPrice());
		System.out.println("-------------------------------------------------");
		System.out.println(b2);



	}

}
