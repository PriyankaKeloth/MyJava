package abstraction;

public class FullTimeEmployee extends Employee {
	static final int h = 8;
	private double paymentPerHrs;
	private int days;
	
	public FullTimeEmployee(double paymentPerHrs, int days) {
		this.paymentPerHrs=paymentPerHrs;
		this.days=days;
	}

	

	@Override
	public double calculateSalary() {
		double salary=paymentPerHrs*h*days;
		return salary;
		
	}
   /* public static void main(String[] args) {
    	FullTimeEmployee fulltimeemp=new FullTimeEmployee(500,28);	
    	System.out.println("Full time employee salary= "+fulltimeemp.calculateSalary());
	} */
}
