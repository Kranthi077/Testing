package coreJava.inheritance;

public class HierarchicalClass {

	public static void main(String[] args) {
		
		
		Child1 ob1 = new Child1();
		Child2 ob2 = new Child2();
		Child3 ob3 = new Child3();
		Grandchild ob4 = new Grandchild();
		
		ob1.Method();
		ob2.child2Method();
		ob3.child3Method();
		ob4.grandMethod();
	}

}
