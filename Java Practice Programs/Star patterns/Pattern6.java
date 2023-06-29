package patterns;

public class Pattern6 {
	
	public static void main(String[] args) {
		
		int row = 6;
		
		for(int i=0; i<row ; i++) {
			for(int j=i; j>0 ; j--) {
				System.out.print(" ");			
		    }
			for(int k=row-i ; k>0; k--) {
				System.out.print("* ");
			}
		System.out.println();
	}
 }
}
/*

* * * * * * 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 

*/