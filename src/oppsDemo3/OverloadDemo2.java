package oppsDemo3;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 4, 2025
 * Time    : 3:00:57 PM
 * project : CoreJava
 * java program for product storage &management in an outlet
 *  

*/
public class OverloadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outlet oulet=new Outlet();
	        System.out.println("---------------------------------------------");
	        //Add Product with only Name & price
	        oulet.addProduct("T-Shirt",20.50);
	         //oulet.addProduct("T-Shirt",20.50);
	        System.out.println("---------------------------------------------");
	        //Add Product with only Name ,price, quantity
	        oulet.addProduct("Jeans",45.50,100);
	        System.out.println("---------------------------------------------");
	        //Add Product with only Name , price, quantity, category
	        oulet.addProduct("Sneakers",75.50,30,"Footwear");
	        System.out.println("---------------------------------------------");
	}

}
