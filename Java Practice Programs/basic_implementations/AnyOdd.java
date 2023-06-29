package basic;

import java.util.ArrayList;
import java.util.List;

public class AnyOdd {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(12);

		System.out.println(onlyOddNumbers(list));
		System.out.println(onlyEvenNumbers(list));
	}
	public static boolean onlyOddNumbers(List<Integer> list) {
		for (int i : list) {
			if (i % 2 == 0)
				return false;
		}

		return true;
	}
	public static boolean onlyEvenNumbers(List<Integer> list) {
		return list
				.parallelStream() // parallel stream for faster processing
				.anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
	}

}
