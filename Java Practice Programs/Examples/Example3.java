package GuessOutput;

public class Programm3 {

	public static void main(String[] args) {

		// This code results in an infinite loop if the flag is true 
		// and the program exists if the flag is false. 
		// The finally block will never be reached.
		boolean flag = true;
		try {
			if (flag) {
		  		while (true) {
		   		}
		   	} else {
		   		System.exit(1);
		   	}
		} finally {
		   	System.out.println("In Finally");
		}

	}

}
