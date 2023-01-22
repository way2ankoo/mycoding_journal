package Arrays1;

public class moveZeros {

	public static int[] moveZeroRight(int[] arr) {
		int count = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i]=arr[count];
				arr[count]= temp;
				count++;
			}
		}
		
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

		//int[] arr = new int[10];
		int[] arr = {10, 20, 20, 0, 30, 0, 40};
		printArray(arr);
		arr = moveZeroRight(arr);
		printArray(arr);	
	}
	
}
