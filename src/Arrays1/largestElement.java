package Arrays1;

public class largestElement {
	
	public static int largestE(int[] arr) {
		
		int largest = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>arr[largest])
				largest = i;
		}
		
		return largest;
	}
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 6, 8, 7, 6, 8, 4};
		printArray(arr);
		//arr = leftRotateByD(arr, 3);
		//printArray(arr);
		int largest = largestE(arr);
		System.out.println("Largest Element is : " + arr[largest]);
	}

}
