package Arrays1;

public class removeDuplicates {
	
	
	
	public static int removeDup(int[] arr) {
		
		int n = 1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]!=arr[n-1]) {
				arr[n]=arr[i];
				n++;
			}
		}
		return n;
		
	}
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10, 20, 20, 0, 30, 0, 40};
		printArray(a);
		System.out.println("********");
		
		int b = removeDup(a);
		System.out.println(b);
		System.out.println("********");
		
		

	}

}
