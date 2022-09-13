package coreJava;

public class StringArray {

	public static void main(String[] args) {
		// String array

		String[] str = { "Good", "morning", "all" };
		
		int StrLength = str.length;
		
		System.out.println("Length of the string array is  = " + StrLength    ); // Concatenation - '+'

		for (int i = 0; i < StrLength; ++i) {
			System.out.println(str[i]);
		}

	}

}
