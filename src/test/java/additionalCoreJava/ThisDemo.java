package additionalCoreJava;

public class ThisDemo {

	int a = 5;

	public void getNumber() {

		int a = 8;

		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this.a+a);
	}
	
	public void getData() {

		System.out.println(a);
		System.out.println(a+a);
	}

	public static void main(String[] args) {
		
		ThisDemo ob = new ThisDemo();
		ob.getNumber();
		ob.getData();

	}

}
