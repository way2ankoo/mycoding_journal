package Sorting;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i< n-1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5, 10, 20, 100, 12, 2, 3};
		printArray(arr);
		
		System.out.println();
		bubbleSort(arr);
		
		printArray(arr);
	}

}
