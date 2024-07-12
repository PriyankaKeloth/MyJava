package exceptionpkg;

public class ExceptionEg {

	public static void main(String[] args) {
		System.out.println("Start");
		int b[]= {1,2,4};
		int d=0;
		try {
			b[4]=1/d;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);     //multiple catch block
		}

		System.out.println("End");

	}

}
