package com.motivity;


import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class CollectionPrograme {

	public static void main(String[] args) {
		
	//Creation of HashSet
		
	HashSet<Integer> basket = new HashSet<>();
	
	System.out.println("The value stored in HashSet is : ");
	
	//Storing values into HashSet using 'add'
	
	basket.add(100);
	basket.add(29);
	basket.add(90);
	System.out.println(basket);
	
	//Creation of another HashSet
	
	HashSet<Integer> store = new HashSet<>();
	
	System.out.println("The value stored in another HashSet is : ");
	
	store.add(5);
	store.add(28);
	store.add(97);
	store.add(2800);
	store.add(27889);
	store.add(12356);
	

	
	System.out.println(store);
	
	
	store.add(55);
	store.add(122);
	store.add(38);
	
	//By using 'addAll' we can combine the values of one HashSet into Another HashSet
	
	System.out.println("By combining both the Hashset the Set is : ");
	basket.addAll(store);
	
	Iterator<Integer> i = basket.iterator();
	
	while(i.hasNext()) {
	System.out.println(i.next());
	}
	//'contains' checks if the particular value is present in the HashSet or not.It returns boolean value
	
	System.out.println(basket.contains(5));
	System.out.println(basket.contains(1));
	System.out.println(basket.addAll(store));
	
	//Creating TreeSet of String type
	
	TreeSet<String> find = new TreeSet<>();
	
	find.add("Sukriti");
	find.add("Sukanya");
	find.add("Ramya");
	find.add("Divya");
	find.add("Joshna");
	find.add("Ramana");
	find.add("Venu");
	
	//'headSet' Returns a view of the portion of this set whose elements are strictly less than toElement.
	
	System.out.println(find.headSet("Sukanya"));
		
	//'tailset' Returns a view of the portion of this set whose elements are greater than or equal to fromElement
	
	System.out.println(find.tailSet("Ramana"));
	
	//'subSet' Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement,exclusive
	
	System.out.println(find.subSet("Divya", "Ramya"));
	
	//'pollFirst'Retrieves and removes the first (lowest) element,or returns null if this set is empty.
	
	System.out.println(find.pollFirst());
	
	//'pollLast' Retrieves and removes the last (highest) element,or returns null if this set is empty
	
	System.out.println(find.pollLast());
	
	
	//'higher' Returns the least element in this set strictly greater than the given element, or null if there is no such element.
	
	System.out.println(find.higher("Sukanya"));
	
	//'lower' Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
	
	System.out.println(find.lower("Ramana"));
	
	//'first' Returns the first (lowest) element currently in this set.	
	
	System.out.println(find.first());
	
	//'Last' Returns the last (highest) element currently in this set.
	
	System.out.println(find.last());
	
	//'floor' Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
	
	System.out.println(find.floor("Sukriti"));
	
	//'ceiling' Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
	
	System.out.println(find.ceiling("Ramana"));
	
	//'remove' Removes the specified element from this set if it is present. 
	
	System.out.println(find.remove("Joshna"));
	
	//'removeAll' Removes from this set all of its elements that are contained in the specified collection 
	
	System.out.println(find.removeAll(find));
	
	//'isEmpty' Returns true if this set contains no elements
	
	System.out.println(find.isEmpty());
	}
	

}
