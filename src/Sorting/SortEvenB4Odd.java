package Sorting;

import java.util.Arrays;
import java.util.Comparator;

class MyCmp implements Comparator<Integer>{

	@Override
	public int compare(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a%2 - b%2;
	}
	
}

public class SortEvenB4Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {5, 10, 20, 13, 12, 2, 3};
		Arrays.sort(arr, new MyCmp());
		System.out.println(Arrays.toString(arr));

	}

}
