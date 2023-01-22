package Arrays1;

public class Insertionsort {

	
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i< arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5, 2, 3, 19, 3, 100, 56};
		printArray(arr);
		System.out.println();
		
		insertionSort(arr);
		printArray(arr);
	}

}
