package question2;

public class Loan {

	public double calculateLoanAmount(Employee employeeObj) {
		
		
		if(employeeObj instanceof PermanentEmployee) {
			
		;
			
			double aplicable=(employeeObj.getSalary()*15)/100;
			return aplicable;
			
		}
		else if(employeeObj instanceof TemporaryEmployee) {
			
		
			
			double  aplicable2= (employeeObj.getSalary()*10)/100;
			return aplicable2;
		}
		else {
			return 0;
		}
		
		
		
		
	}
	
	private Loan() {
		
		//private constructor;
	}
	
	public static Loan staticMethod() {
		
		Loan loan = new Loan();
		
		return loan;
	}
}
