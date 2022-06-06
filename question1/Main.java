package question1;

import java.util.Scanner;

public class Main {
   
	public static void main(String[] args) {
		
	try {
		
		 Scanner sc = new Scanner(System.in);
		   System.out.println("Enter The number of Elements in the Array");
		   int num= sc.nextInt();
		    
		     int[] arr= new int[num];
		     
		     System.out.println("Enter the Elements in the Array");
		     int i=0;
		     while(num>i) {
		    	 arr[i]=sc.nextInt();
		    	 i++;
		     }
		     
		     System.out.println("Enter the index of the array element you want to access");
		     int acc= sc.nextInt();
		     
		     System.out.println("The array element at index"+acc+"="+arr[acc]);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	catch (NumberFormatException e) {
		System.out.println(e);
	}
	     
	     
	   System.out.println("The array element successfully accessed");
		
	}
}
