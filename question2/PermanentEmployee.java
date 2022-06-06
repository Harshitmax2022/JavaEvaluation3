package question2;

public class PermanentEmployee extends Employee {

	private double basicPay;
	
	public PermanentEmployee(int employeeId, String emoloyeeName,double basicPay) {
		super(employeeId, emoloyeeName);
		// TODO Auto-generated constructor stub
		
		this.basicPay=basicPay;
       calculateSalary();
	}

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		double PFAmount= basicPay*0.12;
		salary = basicPay-PFAmount;
	}


}
