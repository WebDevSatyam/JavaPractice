package string;

public class RemoveOccurence {

	public static void main(String[] args) {

		String str1 = "abcdABCDabcdABCD";
		
		str1 = str1.replace("a", ""); 
		str1 = str1.replace("A", ""); 

		System.out.println(str1); // bcdABCDbcdABCD

	}

}
