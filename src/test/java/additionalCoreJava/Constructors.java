package additionalCoreJava;

public class Constructors {

	int b;

	// Default constructor
	public Constructors() {
		b =5;
		System.out.println("I am a constructor");
	}

	// Parameterized its will take argument
	public Constructors(int a) {

	
		System.out.println("I am a constructor1");
		//System.out.println("I have a value : " + b);
	}

	public static void main(String[] args) {
		Constructors ob = new Constructors();
		System.out.println(ob.b);

	}

}
