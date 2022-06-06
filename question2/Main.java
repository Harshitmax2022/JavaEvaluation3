package question2;

public class Main {

	public static void main(String[] args) {
		
		
		Loan loan= Loan.staticMethod();
		
		PermanentEmployee employee1= new PermanentEmployee(2414,"Rupesh",20000);
		     
		
   double result1=		loan.calculateLoanAmount(employee1);
		  System.out.println("ParmanentEmoloyee Laon amount :"+result1);
		
		TemporaryEmployee temporaryEmployee= new TemporaryEmployee(1221, "Harshit", 8, 2000);
	double result2=	loan.calculateLoanAmount(temporaryEmployee);
		   System.out.println("TemporaryEmployee Laon amount :"+result2);
		   
		
	 double result3 =loan.calculateLoanAmount(null);
	    System.out.println("IF other :"+result3);
	}
	
}
