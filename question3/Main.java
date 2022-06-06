package question3;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Demo demo = new Demo();
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the Month Name");
	String name= sc.nextLine();
	
	
	demo.showDetails(Month.valueOf(name));
	
	
}
}
