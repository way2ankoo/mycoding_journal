package String1;

import java.util.Arrays;
import java.util.Scanner;

public class LeftmostNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int nonRepeat = leftmostNonRepeat(str);
		if( nonRepeat == -1)
			System.out.println("No non-repeating character found");
		else
			System.out.println("leftmost non-repeating character in string " + str + " is : " + str.charAt(nonRepeat));
	}
	
	
	public static int leftmostNonRepeat(String str) {
		final int CHAR = 256;
		int[] fi = new int[256]; //firstindex array with characters as index
		Arrays.fill(fi, -1); // initialize array as -1
		for(int i=0; i< str.length(); i++) // traverse through the string
		{
			if(fi[str.charAt(i)] == -1)
				fi[str.charAt(i)] = i; // if not visited fill index
			else
				fi[str.charAt(i)] = -2; // if already visited, fill -2
		}
		
		int result = Integer.MAX_VALUE;
		for(int i=0; i<CHAR; i++) // now traverse through fi array having characters as index
		{
			if(fi[i]>=0)
				result = Math.min(result, fi[i]); //if array element is notrepeating i.e., not -2, update result
		}
		return (result == Integer.MAX_VALUE)? -1 : result;
	}

}
