package Arrays1;

public class leftRotateN {

	public static int[] leftRotateByD(int[] arr, int d) {
		
		arr = reverseArray(arr, 0, d-1);
		arr = reverseArray(arr, d, arr.length-1);
		arr = reverseArray(arr, 0, arr.length-1);
		return arr;
	}
	
	public static int[] reverseArray(int[] arr, int first, int last) {
		while(first < last) {
			int temp = arr[first];
			arr[first]=arr[last];
			arr[last]= temp;
			first++;
			last--;
		}
		
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 9, 8, 7, 6, 5, 4};
		printArray(arr);
		arr = leftRotateByD(arr, 3);
		printArray(arr);	
	}

}
