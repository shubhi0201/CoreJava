package oppsDemo2;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 4, 2025
 * Time    : 10:55:58 AM
 * project : CoreJava
 * GuestCustomer does not have id


*/
public class GuestCustomer extends Customer {

	 private String[] cart;
	    private int cartSize;
	    private static final int MAX_CART_SIZE=5;
		public GuestCustomer(String name, String email) {
			super(name, email);
			this.cart = new String[MAX_CART_SIZE];
			this.cartSize = 0;
		}
	    
	    
	     public void addToCart(String item) {
	        if (cartSize < MAX_CART_SIZE) {
	            cart[cartSize] = item;
	            cartSize++;
	            System.out.println(item + " added to cart.");
	        } else {
	            System.out.println("Cart is full. Cannot add more items.");
	        }
	    }

	    public void displayCart() {
	        System.out.println("Items in Cart:");
	        for (int i = 0; i < cartSize; i++) {
	            System.out.println(cart[i]);
	        }
	    }


}
