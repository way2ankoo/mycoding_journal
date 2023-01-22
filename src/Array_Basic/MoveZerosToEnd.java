package Array_Basic;

public class MoveZerosToEnd {

	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void moveZerosToEnd(int[] arr) {
		int countNonZeros = 0; // keep track of last non-zero element
		for(int i=0; i< arr.length; i++) {
			if(arr[i]!= 0) { 
				//if a[i] is 0, no need to do anything, if a[i] is not equals to 0, then swap this with 1st 0 element. 
				//To know 1st zero element we keep track of count of non-zero element. First zero index is equals to count of non zero element.
				int temp = arr[i];
				arr[i]= arr[countNonZeros];
				arr[countNonZeros]=temp;
				countNonZeros++;
			}
		}
		printArray(arr);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 20, 0, 0, 30, 0, 0, 41};
		printArray(arr);
		System.out.println();
		moveZerosToEnd(arr);
	}

}
