package string;

public class Vowel {

	public static void main(String[] args) {
	
		String str = "Hello";
		System.out.println(CheckVowel(str));

	}
	public static boolean CheckVowel(String str) {
		return str.toLowerCase().matches(".*[aeiou]*."); }
}
