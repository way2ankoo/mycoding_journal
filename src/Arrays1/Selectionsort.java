package Arrays1;

public class Selectionsort {
	
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i< n; i++) {
			int indexOfMin = i;
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[indexOfMin])
					indexOfMin =j;
			}
			int temp = arr[indexOfMin];
			arr[indexOfMin] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5, 2, 20, 13, 12, 2, 3};
		printArray(arr);
		
		System.out.println();
		selectionSort(arr);
		
		printArray(arr);
	}

}
