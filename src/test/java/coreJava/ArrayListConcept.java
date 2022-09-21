package coreJava;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// Syntax of ArrayList

		/*
		 * Syntax to create object for a class
		 * 
		 * ClassName object1Name = new ClassName();
		 */

		ArrayList a = new ArrayList();
		a.add("Selenium");
		a.add("training");
		a.add(1);
		a.add(78);
		a.add('c');

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		a.remove(2);
		a.size();

		System.out.println("After removing 2nd element");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		// Generic
		/*
		 * ArrayList<String> a1 = new ArrayList<String>(); a1.add("Selenium");
		 * a1.add("training");
		 */

	}

}
