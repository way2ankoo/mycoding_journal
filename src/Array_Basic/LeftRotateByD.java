package Array_Basic;

public class LeftRotateByD {

	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void leftRotateByD(int[] arr, int d) {
		int n = arr.length;
		int[] temp= new int[d];
		for(int i=0; i<d; i++) {
			temp[i]=arr[i];
		}
		
		for(int i=d; i<n; i++) {
			arr[i-d]=arr[i];
		}
		
		for(int i=0; i<d; i++) {
			arr[n-d+i]=temp[i];
		}
		printArray(arr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10, 30, 20, 51, 36};
		printArray(arr);
		System.out.println();
		leftRotateByD(arr, 4);
	}

}
