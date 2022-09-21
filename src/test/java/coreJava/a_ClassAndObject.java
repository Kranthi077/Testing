package coreJava;

public class a_ClassAndObject {

	public static void main(String[] args) {
		// ClassName object1Name = new ClassName();
		a_ClassAndObject obj = new a_ClassAndObject();
		obj.getData();
		String text = obj.getData1();
		System.out.println(text);
		int a = obj.getData2();
		System.out.println(a);
	}

	// Method should always be written outside the main block
	// Access modifiers - public, private, protected
	// AccessModifier
	// Return Type
	// Method Name

	public void getData() {
		System.out.println("This is getData method");
	}

	public String getData1() {
		return "This string is getting returned";
	}

	public int getData2() {
		return 5;

	}

}
