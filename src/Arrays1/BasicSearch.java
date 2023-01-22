package Arrays1;

public class BasicSearch {

	public void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public int search(int[] arr, int x) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==x)
				return i;
		}
		return -1;
	}
	
	public void reverseNumber(int x) {
		int num = 0;
		while(x>0) {
			num = (num *10)+ (x%10);
			x=x/10;
		}
		System.out.println(num);
		
	}
	
	public void insert(int[] arr, int x, int pos){ 
		for(int i= arr.length-1; i>=pos-1; i--) {
			arr[i+1]=arr[i];
		}
		arr[pos-1]=x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];//{20, 30, 5, 100, 19}

		arr[0]= 20;
		arr[1]=30;
		arr[2]=5;
		arr[3]=100;
		arr[4]=19;
		
		BasicSearch sear = new BasicSearch();
		sear.printArr(arr);
		int pos = sear.search(arr, 35);
		System.out.println();
		System.out.println("Searched element is in : "+ pos + " position.");
		
		sear.reverseNumber(123);
		sear.insert(arr, 3, 1);
		sear.printArr(arr);
	}
	
}
