package Array_Basic;

public class SecondLargestElement {

	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int largestElementInArray(int[] arr) {
		int largestElementIndex = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>arr[largestElementIndex])
				largestElementIndex = i;
		}
		return largestElementIndex;
	}
	
	public static int secondLargestElementInArrayNaive(int[] arr) {
		int largest = largestElementInArray(arr);
		int secondLargest = -1;
		for(int i=0; i< arr.length; i++) {
			if(arr[i]!=arr[largest]) {
				if(secondLargest == -1)
					secondLargest=i;
				else if(arr[i]>arr[secondLargest])
					secondLargest=i;
			}
		}
		return secondLargest;
	}
	
	public static int secondLargestElementInArraySingleTraversal(int[] arr) {
		int largest = 0;
		int secondLargest = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>arr[largest]) {
				secondLargest = largest;
				largest=i;
			}
			else if(arr[i]!=arr[largest]) {
				if(secondLargest == -1 || arr[i] > arr[secondLargest]) {
					secondLargest = i;
				}
			}
		}
		return secondLargest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 5, 20, 8, 40, 20, 13, 41};
		printArray(arr);
		System.out.println();
		//System.out.println("Largest element in array arr[] is : "+ arr[largestElementInArray(arr)]);
		//System.out.println("Second Largest element in array arr[] is : "+ arr[secondLargestElementInArrayNaive(arr)]);
		System.out.println("Second Largest element in array arr[] is : "+ arr[secondLargestElementInArraySingleTraversal(arr)]);
	}

}
