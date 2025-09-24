package oopsDemo1;
/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 3, 2025
 * Time    : 12:46:48 PM
 * project : CoreJava
Java program to perform addition of 2 Times
 * t1 --> 12 : 45 :55 
 * t2 --> 10 : 30 :30
 *        23    16 :25
 * 
 * t1 + t2
 *   if sec> 60 .. mins should be incremented & sec -60,,
 *   if min> 60  ... hrs should be incremented & min -60
*/
public class Time {
	private int hrs,min,sec;

	public Time(int hrs, int min, int sec) {
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
	}
	Time add(Time t) {
		int totsec = this.sec+ t.sec;
		int totmin = this.min+t.min;
		int tothrs = this.hrs + t.hrs;
		
	
if(totsec>=60) {
	totsec = totsec-60;
	totmin++;
}
if(totmin>=60) {
	totmin = totmin-60;
	tothrs++;
}
return new Time (tothrs,totmin,totsec);


}
	void display() {
		System.out.println("hrs " +hrs +"min "+ min + "sec"+ sec );
	}

	
}
