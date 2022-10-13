package package2;

import package1.class1;

public class class3 extends class1 {

	public void test() {
		
		getData3(); // beacause this has access modifier protected.
	}

	
	
	public static void main(String[] args) {
		
		
		class1 obj = new class1();
		obj.getData();
		//obj.getData1(); // cannot access default methods
		//obj.getData2(); // this method is private
		//obj.getData3() // this is protected
		
		
		
	}

}
