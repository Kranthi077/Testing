package coreJava;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Arrays {

	public static void main(String[] args) {

		int b = 15;

		int[] arr = new int[5];
		arr[0] = 2;
		arr[1] = 3;
		arr[2] = 8;
		arr[3] = 0;
		arr[4] = 5;

		System.out.println("Array values are printed below:");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		int[] arr1 = { 2, 3, 8, 0, 5, 6, 10 };
		System.out.println("Array arr1 size is printed below:");
		System.out.println(arr1.length);
		System.out.println("Array values are printed below:");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		System.out.println(arr1[5]);
		System.out.println(arr1[6]);

		// java.lang.ArrayIndexOutOfBoundsException: 7
		// System.out.println(arr1[7]);

		int a = 2;
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == a) {
				System.out.println(a + " is present at the index = " + i);
				count++;
			}
		}
		if (count <= 0)
			System.out.println("Element not present");
	}

}
