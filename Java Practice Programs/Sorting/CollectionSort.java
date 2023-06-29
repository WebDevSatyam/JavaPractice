package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionSort {

		public static void main(String[] args)
		{
			ArrayList<String> list = new ArrayList<String>();

			list.add("India");
			list.add("Pakistan");
			list.add("Srilanka");
			list.add("USA");
			list.add("Australia");
			list.add("Japan");

			System.out.println("Before Sorting : " + list);

			Collections.sort(list);

			System.out.println("After Sorting : " + list);
//			
//			Collections.sort(list, Collections.reverseOrder());
//			Arrays.sort(list, Collections.reverseOrder());
		}
	}
