package question2;

public class TemporaryEmployee  extends Employee{

	private int hoursWorked;
	private int hourlyWages;
	
	
	public TemporaryEmployee(int employeeId, String emoloyeeName,int hoursWorked, int hourlyWages) {
		super(employeeId, emoloyeeName);
		  
		this.hoursWorked=hoursWorked;
		this.hourlyWages=hourlyWages;
		calculateSalary();
	}

	@Override
	void calculateSalary() {
	
		salary= hourlyWages*hoursWorked;
		
	}

}
