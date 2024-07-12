package test;
import java.util.Scanner;

public class Employee {
	public double basicPay;
	public double deductionAmt;
	public double bonusAmt;
	
	
	public void getdetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic pay: ");
		basicPay=sc.nextDouble();
		System.out.println("Enter the Deduction Amount: ");
		deductionAmt=sc.nextDouble();
		System.out.println("Enter the Bonus Amount: ");
		bonusAmt=sc.nextDouble();
	}
	

	

}
