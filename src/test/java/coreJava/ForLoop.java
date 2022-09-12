package coreJava;

public class ForLoop {

	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 8, 0, 5, 6, 10 };
		System.out.println("Array arr1 size is printed below:");
		System.out.println(arr1.length);
		System.out.println("Array values are printed below:");

		int length = arr1.length;

		for (int i = 0; i < length; ++i) {
			System.out.println(arr1[i]);
		}

	}

}
