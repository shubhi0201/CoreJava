package collectionDemo;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 8, 2025
 * Time    : 4:03:19 PM
 * project : CoreJava

*/
public class GenericClassDemo {

	public static void main(String[] args) {
	Sample <String> s1 = new Sample<String>("Java Generic");
	System.out.println("Display from Generic class by passing String Object: "+s1.getData());
	Sample<Integer> s2 = new Sample<Integer>(200);
	System.out.println("Display from Generic class by passing Integer Object: "+s2.getData());
	Sample<Double> s3 = new Sample<Double>(5550.41);
	System.out.println("Display from Generic class by passing Double Object: "+s3.getData());
	
	}

}
