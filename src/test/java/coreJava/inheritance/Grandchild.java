package coreJava.inheritance;

public class Grandchild extends Child1 {

	
	public void  grandMethod() {
		System.out.println("I am grandChild method");
	}
	
	
	public static void main(String[] args) {
		Grandchild obj = new Grandchild();
		obj.grandMethod();
		obj.Method();
		obj.Method();
		

	}

}
