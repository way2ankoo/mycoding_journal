
public class StarPattern1 {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		
		int row = 6, i, j;
		for(i = 0; i <= row;i++) {
			for(j=0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==============");
		
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
		for(i=1; i<=row; i++) {
			for(j=1; j<= row-i; j++) {
				System.out.print(" ");
			}
			for(j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
