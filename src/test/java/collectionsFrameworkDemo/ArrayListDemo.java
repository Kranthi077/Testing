package collectionsFrameworkDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List can accept duplicate values
		//ArrayList, LinkedList, Vector - implement interface List
		//Arrays size is fixed but arrayLists size is dynamic in nature
		//We can insert values in between arraylist
		//Lists are ordered lists
		
		
		// The datatype entered between arrowkeys<> are called as generics
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();
		
		a.add("Test");
		a.add("Automation");
		a.add("Selenium");
		a.add("and");
		a.add("and");
		a.add("Core Java");
		a.add("Core Java");
		System.out.println(a);
		System.out.println(a.get(0));
		System.out.println(a.get(3));
		a.remove(3);
		System.out.println(a);
		a.remove("Selenium");
		System.out.println(a);
		a.add(3, "and");
		System.out.println(a);
		boolean status = a.contains("and");
		System.out.println(status);
		status = a.contains("Testing");
		System.out.println(status);
		System.out.println(a.indexOf("and"));
		System.out.println(a.isEmpty());
		System.out.println(b.isEmpty());
		System.out.println(a.size());
		System.out.println("");
		for(int i=0; i<a.size();i++)
		{
			
			System.out.println(a.get(i));
		}
	

	}

}
