package Hashing;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetHashing {

	public static void main(String[] args)
	{
		TreeSet<String> ts1 = new TreeSet<String>();
		ts1.add("A");
		ts1.add("B");
		ts1.add("C");
		// Duplicates will not get insert
		ts1.add("C");

		// Elements get stored in default natural Order(Ascending)
		System.out.println(ts1);
		System.out.println(ts1.contains("A"));

		ts1.remove("A");
		System.out.println(ts1);

		System.out.println("\nIterating over TreeSet:");
		Iterator<String> i = ts1.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}
}
