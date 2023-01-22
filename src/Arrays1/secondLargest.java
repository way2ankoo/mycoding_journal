package Arrays1;

public class secondLargest {
	
	public static int secondLargestE(int[] arr) {
		int sec = -1, largest =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[largest]) {
				sec = largest;
				largest = i;
			}else if(arr[i]!=arr[largest]) {
				if(sec == -1||arr[i]>arr[sec])
					sec = i;
			}
		}
		
		return sec;
	}
	
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 6, 8, 7, 6, 8, 10};
		printArray(arr);
		//int largest = largestE(arr);
		int secondL = secondLargestE(arr);
		System.out.println("Second largest element is : "+ arr[secondL]);
		//System.out.println("Largest Element is : " + arr[largest]);
	}

}
