package question2;

public abstract class Employee {
 
	protected int employeeId;
	protected String emoloyeeName;
	protected double salary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmoloyeeName() {
		return emoloyeeName;
	}
	public void setEmoloyeeName(String emoloyeeName) {
		this.emoloyeeName = emoloyeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int employeeId, String emoloyeeName) {
		super();
		this.employeeId = employeeId;
		this.emoloyeeName = emoloyeeName;
	}
	
	abstract void calculateSalary();
}
