package question4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Username");
		String name=sc.nextLine();
		
		sc.nextLine();
		System.out.println("Enter the Password");
	   String pass=sc.nextLine();
		
	    sc.nextLine();
	    System.out.println("Enter the Mobile Number");
	    String mob=sc.nextLine();
	   
		sc.nextLine();
		System.out.println("Enter the Email");
		String email=sc.nextLine();
	    
		//validation part
		
	    boolean nameR= Pattern.matches("[a-zA-Z][3-8]", name);
		boolean passR= Pattern.matches("[a-zA-Z0-9][3-8]", pass);
		boolean mobR= Pattern.matches("[6789]{1}[0-9]{9}", mob);
		
		
		//condition part to print details
		if(nameR==true && passR==true && mobR==true) {
			Coustomer coustomer= new Coustomer();
			
			coustomer.setUsername(name);
			coustomer.setPassword(pass);
			coustomer.setMobileNumber(mob);
			coustomer.setEmail(email);
			
			
			System.out.println("                        ");
			System.out.println("--------------------------");
			
			System.out.println("Name :"+coustomer.getUsername());
			System.out.println("Password :"+coustomer.getPassword());
			System.out.println("MobileNumber :"+coustomer.getMobileNumber());
			System.out.println("Email :"+coustomer.getEmail());
		}
		
		
		// if condition not setisfied then 
		else if(nameR==false) {
			System.out.println("Please enter correct Name");
		}
		else if(passR==false) {
			System.out.println("Please enter correct Password");
		}
		else if (mobR==false) {
			System.out.println("Please enter correct MobileNumber");
		}
		
	}
	
	
}
