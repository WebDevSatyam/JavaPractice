package string;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println(CheckPalindrome("garag"));
	}
	
	static boolean CheckPalindrome(String str) {
		int length = str.length();
		
		for(int i=0;i<=length/2;i++) {
			if(str.charAt(i)!=str.charAt(length-i-1)) 
				return false;
		}
		return true;
	}

}
