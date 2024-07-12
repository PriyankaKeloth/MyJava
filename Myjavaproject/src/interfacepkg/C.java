package interfacepkg;

public class C implements A,B {

	public static void main(String[] args) {
		C c=new C();
		c.print();
        c.display();
        c.hello();
	}
	@Override
	public void print()
	{
	  System.out.println("Hi");
	}
	@Override
	public void display()
	{
		System.out.println("Hey");
	}
	@Override
	public void hello()
	{
		System.out.println("Hello");
	}
}
