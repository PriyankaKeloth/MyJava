package test;

public class Calculate {

	public double hra;
	public double pf;
	public void calculateHRA(double basicPay) {
		hra=0.05*basicPay;
	}
    public void calculatePF(double basicPay) {
		pf=0.2*basicPay;
	}
}
