package Two;

public class Divisible extends Addition{
	public static void main(String[] args) 
	{
		Divisible divi=new Divisible();
	    int a=10;
		int b=20;
	    int AdditionResult=divi.add(a,b);    
        System.out.println("Addition result= "+AdditionResult);
        boolean divisible=divi.div(a,b);
        System.out.println("Divisible result= "+divisible);
	}
	public boolean div(int a, int b)
	{ 
		int result=super.add(a,b); 
		return result % 10==0;
	}
	
	
	
}
