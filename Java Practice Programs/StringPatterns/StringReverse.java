package string;

public class StringReverse {

	public static void main(String[] args) {

		String str = "anilas";
		System.out.print(Reverse(str));

	}
	
	public static String Reverse(String str) {
		
		StringBuilder out = new StringBuilder();
		char arr[] = str.toCharArray();
		for(int i = arr.length - 1; i>=0; i--)
			out.append(arr[i]);
		return out.toString();
		
	}

}
