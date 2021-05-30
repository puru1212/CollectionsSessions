package ListConcepts;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept {

	public static void main(String[] args) {

		//HashMap is a class implements Map Interface
		//extends AbstractMap
		//contains only unique elements
		//stores value in key - value format
		//it may have one null key and multiple null values
		//it maintains no order
		//non synchronized --- not thread safe
		//concurrent modification exception --Fail fast condition
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		hm.put(4, "Admin");
		
		
		System.out.println(hm.get(1));
		
		for(Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + ". " + m.getValue());
			
		}
		
		System.out.println(hm);
		
		hm.remove(3);
		System.out.println(hm);
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee> ();
		
		Employee e1 = new Employee("Tom", 28 , "Admin");
		Employee e2 = new Employee("Puru", 31 , "Testing");
		Employee e3 = new Employee("Baveen", 28 , "Dev");
		Employee e4 = new Employee("Baba", 28 , "QTP");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		emp.put(4, e4);
		
		for(Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			
			System.out.println("Employee" +" " + key+ " Info :");
			System.out.println(e.name+" "+e.age+" "+e.dept);
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	}

}
