package coreJava.inheritance;

//This example is single Inheritance

/*public class ParentClass {

	public void Method() {

		int i = 10;
		System.out.println(i);
	}
}*/

public class Child1 extends ParentClass {

	public void Method() {

		int i = 20;
		System.out.println(i);
	}

	public static void main(String[] args) {
		ParentClass obj = new Child1();
		obj.Method();
		
		ParentClass obj2 = new Child1();
		obj2.Method();
		
		ParentClass obj1 = new ParentClass();
		obj1.Method();

	}

}
