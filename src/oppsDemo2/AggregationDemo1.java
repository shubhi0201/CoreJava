package oppsDemo2;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 4, 2025
 * Time    : 12:14:58 PM
 * project : CoreJava

*/
public class AggregationDemo1 {
private static void main (String[] args) {
	Author author = new Author("John", 42, "USA");
	
    Publisher publisher = new Publisher("Sun Publications","JDSR-III4", "LA");
    
    Book b = new Book("Java for Begginers", 800, author, publisher);
    
    b.display();
	// TODO Auto-generated method stub

}
}
                                                                                                                                                                             