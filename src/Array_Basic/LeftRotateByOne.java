package Array_Basic;

public class LeftRotateByOne {

	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void leftRotateByOne(int[] arr) {
		//keep 1st element in temp variable, move other elements to left. copy temp variable to last.
		int temp = arr[0];
		for(int i=1; i<arr.length; i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		printArray(arr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 30, 20, 51, 36};
		printArray(arr);
		System.out.println();
		leftRotateByOne(arr);
	}

}
