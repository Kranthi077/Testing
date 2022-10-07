package additionalCoreJava;

//instance variables
public class ClassVariables {

	String studentName; // instance variables
	int standard;// instance variables
	static String city; // class variables
	static int i;// class variables 
	
	//initialization
	static {
		city = "Hyd";
		i =1;
		
	}
	
	
	
	
//three duplicates/ memory spaces
	public ClassVariables(String studentName, int standard) {

		this.studentName = studentName;
		this.standard = standard;
		i++; // 2
		System.out.println(i);
	}

	public void getAddress() {

		System.out.println(studentName + "-" + standard + "-" + city);

	}
	
	//static method can only accept variables which are static
	public static void getCity() {
		System.out.println(city);
		System.out.println(i);
		//System.out.println(standard);// thid statement is not allowed
	}

	public static void main(String[] args) {
		// object is called as instance of class
		ClassVariables stu1 = new ClassVariables("Harish", 10);
		ClassVariables stu2 = new ClassVariables("Rohit", 8);
		ClassVariables stu3 = new ClassVariables("Rahul", 9);
		
		// stu1.getAddress();
		// stu2.getAddress();
		// stu3.getAddress();
		ClassVariables.getCity();
		//ClassVariables.i=4;
	}

}
