package ListConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		
		///add
		ll.add("Test");
		ll.add("Hello");
		ll.add("Puru");
		ll.add("Testing");
		
		System.out.println("Contents of linkedlist: "+ ll);
		
		ll.addFirst("Tom");
		ll.addLast("Naveen");
		
		System.out.println("Contents of linkedlist: "+ ll);
		
		//get
		System.out.println(ll.get(1));
		
		ll.set(1, "Testing");
		System.out.println(ll.get(1));
		System.out.println(ll);
		ll.set(4, "Tom");
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		System.out.println("***************");
		
		
		//Print all
		// for loop
		System.out.println("Using For Loop ---");
		
		for (int i = 0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		// for loop
		System.out.println("Using Advace for Loop ---");
	
		for(String str : ll){
			System.out.println(str);
		}
		
		//iterator
		System.out.println("Using Iterator ---");
		
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//while loop
				System.out.println("Using while loop ---");
		
		int k= 0;
		while(ll.size()>k) {
			System.out.println(ll.get(k));
			k++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				
	
		
		
		
		
	}

}
