package oppsDemo3;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 5, 2025
 * Time    : 9:48:06 AM
 * project : CoreJava

*/
public class UpcastinfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product;
		
		// product obj refers to book object
		product = new Book("Java programming", 450,"james"); //upcasting
		System.out.println("---------------- Book Details -----------------------");
		product.display();
		
		 //Switching from one implementation to another is easy
        product=new Laptop("IdeaPad",60000.00,"Lenova"); //Upcasting
        System.out.println("------------- Laptop Details --------------");
        product.display();//Dynamic Binding

        product =new Book("Python Made Easy",650,"Balaguruswamy"); //Upcasting
        System.out.println("------------- Book Details --------------");
        product.display(); //Dynamic Binding
        //Access default variable from Test class
        Test t1=new Test(100,200,45,600);
        
        Test2 t2=new Test2(100,200,45,600);
        System.out.println("Default variable form Test Class : "+t1.a);
        t2.print();
	}

}
