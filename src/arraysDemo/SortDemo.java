package arraysDemo;

import java.util.Arrays;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 2, 2025
 * Time    : 10:41:30 AM
 * project : CoreJava

*/
public class SortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] lanaguages ={"Java","Ruby","Python","C++","Scala","Oak","C"};
        String[] lanaguages1 ={"Java","Ruby","Python","C++","Scala","Oak","C"};

        System.out.println("Original Array : "+ Arrays.toString(lanaguages));
        Arrays.sort(lanaguages); //Inbuilt function of Arrays
        System.out.println("Sorted Array : "+ Arrays.toString(lanaguages));

        //Partial Sort
        Arrays.sort(lanaguages1,2,lanaguages1.length);
        System.out.println("Array after Partial Sorting :");
        for(String x:lanaguages1){
            System.out.print(x+"\t");
        }
	}

}
