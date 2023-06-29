package GuessOutput;

import java.util.HashSet;

public class Programm1 {

	public static void main(String[] args) {
		
		// higher precedence
		String s1 = "abc";
		String s2 = "abc";

		System.out.println("s1 == s2 is:" + s1 == s2);
		System.out.println(s1 == s2);
		
		// automatically type cast to int in substring method
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;

		System.out.println(s3.substring(start, end));
		
		// autoboxing feature
		HashSet shortSet = new HashSet();

		for (short i = 0; i < 100; i++) {
	    shortSet.add(i);
	    shortSet.remove(i - 1);
		}

		System.out.println(shortSet.size());
		
		// The x.concat(y) creates a new string but is not assigned to x, 
		// so the value of x is not changed.
		String x = "abc";
		String y = "abc";

		x.concat(y);
		String z = x.concat(y);

		System.out.println(x);
		System.out.println(z);
	
	}

}
