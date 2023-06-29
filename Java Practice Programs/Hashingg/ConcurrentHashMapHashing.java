package Hashing;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapHashing {

		public static void main(String[] args)
		{
			ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<Integer, String>();
			m.put(100, "Hello");
			m.put(101, "Geeks");
			m.put(102, "Geeks");
			System.out.println("ConcurrentHashMap: " + m);

			// Adding Hello at 101 key
			// This is already present in ConcurrentHashMap object
			// Therefore its better to use putIfAbsent for such cases
			m.putIfAbsent(101, "Hello");
			System.out.println("\nConcurrentHashMap: " + m);
			m.remove(101, "Geeks");
			System.out.println(m);
			m.replace(100, "Hello", "For");
			System.out.println(m);
		}
	}
