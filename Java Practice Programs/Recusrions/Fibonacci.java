package recursion;

public class Fibonacci {

	public static void main(String[] args) {

		int num = 10;
		for(int i=0;i<num;i++) 
			System.out.print(Series(i) + ", ");

	}
	
	static int Series(int num) {
		if(num<=1) return num;
		return Series(num-1) + Series(num-2);
	}

}
