package encapsulation;

public class B {

	public static void main(String[] args) {
		Student stud=new Student();
		stud.setName("pinky");
		System.out.println(stud.getName());
		stud.setAge(29);
		System.out.println(stud.getAge());
}
}
