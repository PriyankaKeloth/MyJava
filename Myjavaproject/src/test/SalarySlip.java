package test;

import java.util.Scanner;

public class SalarySlip {
	public double totalSal;

	public void totalSalary(Employee emp, Calculate cal) {
		totalSal=emp.basicPay+cal.hra-cal.pf-emp.deductionAmt+emp.bonusAmt;
		
	}
	
	public void getSalarySlip(Employee emp, Calculate cal) {
		System.out.println("Salary Slip:");
        System.out.println("Basic Pay: " + emp.basicPay);
        System.out.println("Deduction: " + emp.deductionAmt);
        System.out.println("HRA: " + cal.hra);
        System.out.println("PF: " + cal.pf);
        System.out.println("Bonus: " +emp.bonusAmt);
        System.out.println("Total Salary: " + totalSal);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("Enter the name: ");
		name=sc.next();
		Employee emp=new Employee();
		emp.getdetails();
		Calculate cal=new Calculate();
		cal.calculateHRA(emp.basicPay);
		cal.calculatePF(emp.basicPay);
		SalarySlip sal=new SalarySlip();
		sal.totalSalary(emp,cal);
		sal.getSalarySlip(emp,cal);
		

	}
}

//total salary (basicpay+hra-pf-deduction+bonus)
//salary slip Salary slip should contains :- basic pay, deduction, hra, pf, bonus and total salary by hand.s