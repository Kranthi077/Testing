package coreJava;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// Enhanced forloop - improved version of forloop

		String[] str = { "Good", "morning", "all" };

		System.out.println("Enhanced for loop");
		for (String s : str) {

			System.out.println(s);
		}

		// Integer array with Enhanced forloop
		int[] arr1 = { 2, 3, 8, 0, 5, 6, 10 };

		for (int a : arr1) {
			System.out.println(a);
		}

	}

}
