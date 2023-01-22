package Arrays1;

public class leftRotateByOne {

	public static int[] leftRotateOne(int[] arr) {
		int temp = arr[0];
		for(int i=1; i<arr.length; i++)
			arr[i-1]=arr[i];
		arr[arr.length-1]=temp;
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10, 9, 8, 7, 6, 5, 4};
		printArray(arr);
		arr = leftRotateOne(arr);
		printArray(arr);	
	}

}
