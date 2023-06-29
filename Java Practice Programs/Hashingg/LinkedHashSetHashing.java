package Hashing;
import java.util.LinkedHashSet;

public class LinkedHashSetHashing {
	
	public static void main(String[] args)
		{
			LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
			linkedset.add("A");
			linkedset.add("B");
			linkedset.add("C");
			linkedset.add("D");

			// This will not add new element as A already exists
			linkedset.add("A");
			linkedset.add("E");

			System.out.println(linkedset.size());
			System.out.println(linkedset);
			System.out.println(linkedset.remove("D"));
			System.out.println( linkedset.remove("Z"));
			System.out.println(linkedset.contains("A"));
			System.out.println(linkedset);
		}
	}
