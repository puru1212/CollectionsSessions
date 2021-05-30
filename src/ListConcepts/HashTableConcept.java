package ListConcepts;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {

		//it is synchronized
		// stores value on the basis of key-value
		//key-->Object--HashCode-->Value
		
		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Java");
		
		//create a cone copy/shallow copy;
		
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable) h1.clone();
		
		System.out.println(h1);
		System.out.println(h2);
		
		h1.clear();

		System.out.println(h1);
		System.out.println(h2);
		
		Hashtable h3 = new Hashtable();
		h3.put("A", "Navneen");
		h3.put("B", "Puru");
		h3.put("C", "Tom");
		
		if(h3.contains("Puru")) 
			System.out.println("Value is found");
		
		//print all the avles of hashtable  -- Enumeration -- elements()
		Enumeration e = h3.elements();
		System.out.println();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		// get all the values from hashtable using -- entrySet()-- set of hashtable values
		
		Set s = h3.entrySet();
		System.out.println(s);
		
		Hashtable h4 = new Hashtable();
		h4.put("A", "Navneen");
		h4.put("B", "Puru");
		h4.put("C", "Tom");
		h4.put("C", "Tom"); //it contains only unique values// duplicate values will not be printed//no null key and no null values//null pointer exception
		
		// to check both hastables are equal or not
		if(h3.equals(h4))
			System.out.println("both are equal");
		
		//to get the hascode of hashtable object
		System.out.println(h3.hashCode());
		
		//generics
		
		Hashtable<String, String> h5 = new Hashtable<String, String>();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
