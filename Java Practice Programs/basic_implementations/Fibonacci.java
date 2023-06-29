package basic;

public class Fibonacci {

	static void PrintFibonacciSeries(int n){
		int a = 0;
		int b = 1;
		int c = 1;
		for(int i=1; i<=n; i++) {
			System.out.print(a + ", ");
			a = b;
			b = c;
			c = a + b;
		}
	}
	public static void main(String[] args) {

		PrintFibonacciSeries(10);

	}

}
