package controlflow;

import java.util.Scanner;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 1, 2025
 * Time    : 2:42:43 PM
 * project : CoreJava
 * Program for login System

*/
public class LoginSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        String correctUsername = "admin";
	        String correctPassword = "12345";
	        
	        int attempts = 0;
	        boolean isLoggedIn = false;
	        
	        do {
	            System.out.print("Enter Username: ");
	            String username = scanner.nextLine();
	            
	            System.out.print("Enter Password: ");
	            String password = scanner.nextLine();
	            
	            if (username.equals(correctUsername) && password.equals(correctPassword)) {
	                System.out.println("✅ Login Successful! Welcome, " + username + "!");
	                isLoggedIn = true;
	                break; // exit loop if login is correct
	            } else {
	                System.out.println("❌ Invalid Username or Password. Try again.");
	                attempts++;
	            }
	            
	        } while (attempts < 3);
	        
	        if (!isLoggedIn) {
	            System.out.println("⛔ Account locked due to 3 failed login attempts.");
	        }
	        
	        scanner.close();
	}

}
