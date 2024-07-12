package testt;

public class Address {
	public String houseName;
	public String street;
	public String zipcode;
	public String city;
	
	public Address(String houseName,String street,String zipcode,String city) {
		this.houseName=houseName;
		this.street=street;
		this.zipcode=zipcode;
		this.city=city;
	}
	public String getDetails() {
		return houseName+" "+street+" "+zipcode+" "+city;
		
	}
	
	

	public static void main(String[] args) {
		Student stud=new Student("Priyanka", 123456);
		System.out.println(stud.getName());
		System.out.println(stud.getRollnum());
		Address address=new Address("Keloth house","Eachur","670591","Kannur");
		System.out.println(address.getDetails());
	}

}



//Class 2- Address
//Get the address of student
//Print Student name, roll number with address