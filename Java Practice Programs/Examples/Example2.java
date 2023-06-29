package GuessOutput;

public class Programm2 {

	public static void main(String[] args) {

		// The given print statement will throw a java.lang.NullPointerException 
		// because the OR logical operator evaluates both the literals before 
		// returning the result. Since str is null, the .equals() method 
		// will throw an exception. Its always advisable to use short-circuit logical
		// operators, such as || and &&, which evaluate the literal values from 
		// left to right. In this case, since the first literal would return true, 
				//it would skip the second literal evaluation.
				String str1 = null;
				String str2 ="abc";

				//System.out.println(str2.equals("abc") | str1.equals(null));
				System.out.println(str2.equals("abc") || str1.equals(null));
				System.out.println(str2.equals("abc") && str1.equals(null));

	}

}
