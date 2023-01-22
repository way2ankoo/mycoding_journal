package Arrays1;

public class isSortedOrNot {
	
	public static boolean isSorted(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1])
				return false;
		}
		return true;
		
	}
	
	public static void printArray(int[] arr) {
		for(int i =0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 20, 20, 20, 19};
		printArray(arr);
		System.out.println(isSorted(arr));
		

	}

}
