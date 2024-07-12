package abstraction;

public class Contractor extends Employee {
	private double paymentPerHrs;
	private int workingHrs;
	
	public Contractor(double paymentPerHrs, int workingHrs) {
		this.paymentPerHrs=paymentPerHrs;
		this.workingHrs=workingHrs;	
	}
	
	@Override
	public double calculateSalary() {
		
		double salary=paymentPerHrs*workingHrs;
		return salary;
		
	}
	public static void main(String[] args) {
		Contractor cont=new Contractor(600,196);
		System.out.println("Contract employee salary= "+cont.calculateSalary());
		FullTimeEmployee fulltimeemp=new FullTimeEmployee(500,28);	
    	System.out.println("Full time employee salary= "+fulltimeemp.calculateSalary());
    }

}
