package coreJava;

public class IfElseConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		 * 
		 * for (int i = arr1.length - 1; i >= 0; i--) { // i-- is also i = i-1
		 * 
		 * System.out.println(arr1[i]);
		 * 
		 * }
		 */

		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// Prints even numbers
		System.out.println("Prints even numbers");
		for (int i = 0; i < arr2.length; ++i) {
			// 1 not equal to 0
			if (arr2[i] % 2 == 0) // to compare two numbers user two '=' symbols // '!=' not equals to (or
									// negation)
				System.out.println(arr2[i]);

		}
		// Prints odd numbers
		System.out.println("Prints Odd numbers");
		for (int i = 0; i < arr2.length; ++i) {
			// 1 not eau to 0
			if (arr2[i] % 2 != 0) // to compare two numbers user two '=' symbols // '!=' not equals to (or)	// negation)
				System.out.println(arr2[i]);

		}

		int a = 2, b = 4, quo, rem;

		quo = b / a;
		System.out.println("Quotient is = " + quo);

		rem = b % a;
		System.out.println("Reminder is = " + rem);
	}

}
