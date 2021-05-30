package ListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {

		int a[] = new int[3];   //static array--- size fixed
		
		//dynamic array -- Arraylist
		// 1. Can contain duplicate value
		// 2. maintains insertion order
		// 3. synchronized
		// 4. allows random access to fetch the element because it stores the values based on the indexes 
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add("Tom");
		ar.add(12.22);
		ar.add(200);
		ar.add(400);
		ar.add(500);
		
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(1));
		System.out.println("**********");
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(11);
		// Employee class Objects
		
		Employee e1 = new Employee("Puru", 31, "Testing");
		Employee e2 = new Employee("Tom", 30, "Admin");
		Employee e3 = new Employee("Peter", 29, "Dev");
		
		
		ArrayList<Employee> ar2 = new ArrayList<Employee>();
		ar2.add(e1);
		ar2.add(e2);
		ar2.add(e3);
		
		Iterator it = ar2.iterator();
		
		while(it.hasNext()) {
			Employee emp = (Employee) it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
			
			
		}
		
		
		
		
		
		
	}

}
