package Sorting;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5, 30, 50, 20, 10};
		Arrays.sort(arr, 1, 4);
		System.out.println(Arrays.toString(arr));

		Point[] arrayOfPoints = {new Point(10, 20), new Point(3, 15), new Point(5, 7)};
		Arrays.sort(arrayOfPoints);
		for(int i = 0; i< arr.length-2; i++) {
			System.out.println(arrayOfPoints[i].x + " " + arrayOfPoints[i].y);
		}
	}

}
