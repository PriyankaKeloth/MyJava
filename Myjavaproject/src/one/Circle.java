package one;

public class Circle extends Shapes{
	

	public static void main(String[] args) {
		Circle circ=new Circle();
		Rectangle rect=new Rectangle();
		Sqare sqar=new Sqare();
		circ.findarea();
		rect.findarea();
		sqar.findarea();
	}
	@Override //Override annotation
   public void findarea() {
	   double A;
		int r=12;
	   A=3.14*r*r;
	   System.out.println("Area of circle is = "+ A);
   }
}
