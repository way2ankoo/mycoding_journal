package Array_Basic;

public class ReverseAnArray {

	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void reverseAnArray(int[] arr) {
		int low = 0;
		int high = arr.length-1;
		while(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		printArray(arr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr= {10, 5, 20, 8, 40, 20, 13, 41};
		printArray(arr);
		System.out.println(); 
		reverseAnArray(arr);
	}

}
