package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetHashing {

		public static void main(String[] args)
		{
			HashSet<String> h = new HashSet<String>();
			h.add("India");
			h.add("Australia");
			h.add("South Africa");
			h.add("India"); 

			System.out.println(h);
			System.out.println(h.contains("India"));
			
			h.remove("Australia");
			System.out.println(h);

			// Iterating over hash set items
			Iterator<String> i = h.iterator();
			while (i.hasNext())
				System.out.println(i.next());
		}
	}
