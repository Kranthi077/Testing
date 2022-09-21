package coreJava;

import java.util.Iterator;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class StringsConcept {

	public static void main(String[] args) {
		// String is not a dataTypes or Primitive dataType. String is basically a class

		// 1st way of declaring by new operator
		String str = new String("Welcome to string");
		String str3 = new String("Welcome to string");
		System.out.println(str);
		System.out.println(str3);

		// 2nd way of doing is by not using new : By String Literals
		String str1 = "Welcome to String Literals";
		String str2 = "Welcome to String Literals";
		System.out.println(str1);
		System.out.println(str2);

		// breaking point is called as delimiter
		String[] splittedString = str1.split(" ");

		for (int i = 0; i < splittedString.length; i++) {
			System.out.println(splittedString[i]);
		}

		for (int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}

		String[] var = str1.split("to");

		System.out.println("size is " + var.length);
		System.out.println(var[0]);
		System.out.println(var[1]);
		System.out.println(var[0].trim());
		System.out.println(var[1].trim());
		
	}
}
