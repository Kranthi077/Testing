package Polymorphism;

public class OverLoading {

	public void getData(int a) {
		System.out.println(a);
	}

	public void getData(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}

	public void getData(int a, String str) {
		System.out.println(a);
		System.out.println(str);
	}

	public void getData(String str, int a) {
		System.out.println(a);
		System.out.println(str);
	}

	public void getData(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {

		OverLoading obj = new OverLoading();
		obj.getData(5);
		obj.getData("string");
		obj.getData(5, 8);
		obj.getData(7, "string");
		obj.getData("string", 8);
	}

}
