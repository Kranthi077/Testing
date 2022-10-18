package collectionsFrameworkDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("Rahul", 80);
		h.put("Rohit", 60);
		h.put("Pravalika", 70);
		h.put("Pavan", 85);
		h.put("Pranay", 75);
		h.put("Pranay", 90);
		h.put("Harish", null);
		h.put(null, 99);
		h.remove("Pavan");
		h.get("Pavan");
		// System.out.println(h.get("Rohit"));

		Set set = h.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			// System.out.println(it.next());
			Entry map = (Map.Entry) it.next();
			System.out.println(map.getKey()+ "="+ map.getValue());

		}

	}

}
