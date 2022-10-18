package collectionsFrameworkDemo;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		// HashSet Demo
		// sets are un-ordered list
		// it does not accept duplicate values

		HashSet<String> h = new HashSet<String>();
		h.add("Test");
		h.add("Automation");
		h.add("Selenium");
		h.add("and");
		h.add("testing");
		h.add("and");
		h.add("Core Java");
		h.add("Core Java");
		h.remove("and");
		h.isEmpty();
		System.out.println(h);
		System.out.println(h.isEmpty());
		System.out.println(h.size());

		Iterator<String> it = h.iterator();

		/*
		 * System.out.println(it.next()); System.out.println(it.next());
		 * System.out.println(it.next());
		 */
				//false
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
