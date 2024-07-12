package arraycollection;
import java.util.ArrayList;

public class Arraycollection {
	

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList();
		ar.add("Blue");
        ar.add("yellow");
        ar.add("Red");
        ar.add("Pink");
        System.out.println(ar); //Array list
         
        System.out.println(ar.get(2)); //get array list
        ar.remove(2);
        System.out.println(ar); //remove a particular element
      
        System.out.println(ar.contains("Pink")); //search element
	}  

}
