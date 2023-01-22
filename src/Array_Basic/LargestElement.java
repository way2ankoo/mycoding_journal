package Array_Basic;

public class LargestElement {

	public void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public int largestElementInArray(int[] arr) {
		int largestElementIndex = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>arr[largestElementIndex])
				largestElementIndex = i;
		}
		return largestElementIndex;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {10, 5, 20, 8, 40};
		LargestElement le = new LargestElement();
		le.printArray(arr);
		System.out.println();
		System.out.println("Largest element in array arr[] is : "+ arr[le.largestElementInArray(arr)]);
		
	}

}
