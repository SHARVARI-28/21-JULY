/* 
Write a program to store a group of employee names into a HashSet, 
retrieve the elements one by one using an Iterator.
 */

import java.util.HashSet;
import java.util.Iterator;

public class July21_12 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Harry");
		set.add("Mary");
		set.add("Jack");
		set.add("Olivia");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}