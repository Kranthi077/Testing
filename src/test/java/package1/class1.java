package package1;

public class class1 {

	
	public void getData() {
		
		
		System.out.println("Public is my access Modifier");
	}
	
	
	void getData1() {

		System.out.println("Default is my access Modifier");
	}
	
	private void getData2() {

		System.out.println("Private is my access Modifier");
	}
	
	protected void getData3() {

		System.out.println("protected is my access Modifier");
	}
	
	public static void main(String[] args) {
		
		class1 obj = new class1();
		obj.getData();
		obj.getData1();
		obj.getData2();
		obj.getData3();
		

	}
}
