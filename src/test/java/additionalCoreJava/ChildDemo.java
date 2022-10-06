package additionalCoreJava;

public class ChildDemo extends ParentDemo {
	String name = "Child String";

	public ChildDemo() {
		super(5);// super keyword should be written at first when used inside constructor
		System.out.println("I am in Child Constructor");
	}

	public void getStringName() {

		System.out.println(name);
		System.out.println(super.name);

	}

	public void getData() {

		super.getData();
		System.out.println("I am in Child class");
	}

	public static void main(String[] args) {

		ChildDemo obj = new ChildDemo();
		/*
		 * obj.getStringName(); obj.getData();
		 */
		

	}

}
