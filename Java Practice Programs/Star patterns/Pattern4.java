package patterns;

public class Pattern4 {

	public static void main(String[] args) {

		int i, j, row=5;
		
		for( i=0; i<row; i++) {
			for( j=row-i; j>0 ; j--) {
				System.out.print(" ");
			}
			for(int k=i; k>=0 ; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
/*

    *
   **
  ***
 ****
*****

*/