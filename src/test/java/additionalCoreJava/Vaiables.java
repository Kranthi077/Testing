package additionalCoreJava;

//instance variables
public class Vaiables {

	String studentName;
	int standard;
	String city;

	public Vaiables(String studentName, int standard, String city) {

		this.studentName = studentName;
		this.standard = standard;
		this.city = city;
		
	}
	
	
	public void getName() {
		
		System.out.println(studentName);
	}

	public static void main(String[] args) {
		//object is called as instance of class
		Vaiables stu1 = new Vaiables("Harish", 10, "Hyd");
		Vaiables stu2 = new Vaiables("Rohit", 8, "Hyd");
		Vaiables stu3 = new Vaiables("Rahul", 9, "Hyd");
		stu1.getName();
		stu2.getName();
		
	}

}
