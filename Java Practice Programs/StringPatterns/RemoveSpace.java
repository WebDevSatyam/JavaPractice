package string;

public class RemoveSpace {

	public static void main(String[] args) {

		System.out.println(SpaceRemover(" g a r a g "));
	}
	
	static String SpaceRemover(String input) {

		StringBuilder output = new StringBuilder();
		char[] charArray = input.toCharArray();
		
		for(char c: charArray) {
			if(!Character.isWhitespace(c)) 
				output.append(c);
		}
		return output.toString();
	}

}
