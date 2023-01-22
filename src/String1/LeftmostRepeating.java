package String1;

import java.util.Arrays;
import java.util.Scanner;

public class LeftmostRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		int lmrRL = leftmostRepeat(str);
		if( lmrRL == -1)
			System.out.println("No repeating character found");
		else
			System.out.println("leftmost repeating character by right to  traversal method in " + str + " is : " + str.charAt(lmrRL));
		
		int lmrLR = leftmostRepeatLRTraversal(str);
		if( lmrLR == -1)
			System.out.println("No repeating character found");
		else
			System.out.println("leftmost repeating character by left to right traversal method in " + str + " is : " + str.charAt(lmrLR));
	}

	private static int leftmostRepeat(String str) {
		// Traverse from right to left. used boolean array
		final int CHAR = 256;
		int result = -1;
		boolean[] visited = new boolean[CHAR]; //boolean array..create a visited array.. initialize visited to false .. in Java by-default false
		for(int i=str.length()-1; i>=0; i--) {
			if(visited[str.charAt(i)])
				result = i; // if already visited then update the result with current index
			else
				visited[str.charAt(i)] = true; // if not already visited, mark it as visited 
		}
		return result;
	}
	
	private static int leftmostRepeatLRTraversal(String str) {
		// keep track of minimum index we have seen so far
		final int CHAR = 256;
		int[] fIndex = new int[CHAR]; // characters as index in fIndex array
		Arrays.fill(fIndex, -1); // initialize full fIndex array as -1
		int result = Integer.MAX_VALUE;
		for(int i=0; i< str.length(); i++) {
			int fi = fIndex[str.charAt(i)];
			if(fi == -1) // If never seen before or not present already, set fIndex as current index.
				fIndex[str.charAt(i)]=i;
			else
				result = Math.min(result, fi); // if its already present/repeating character, is it leftmost character? So we keep track of minimum index we have seen so far
		}
		return (result==Integer.MAX_VALUE)?-1:result;
		
	}

}
