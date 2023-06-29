package string;

public class LeadingTrailingSpace {

	public static void main(String[] args) {
		
		String s = " abc def\t";
		s = s.strip();
		System.out.print(s);
		
	}
}
