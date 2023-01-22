package String1;

import java.util.Scanner;

public class CheckSubsequence {
	
	public static boolean isSubSeq(String str1, String str2) {
		
		int m = str1.length();
		int n = str2.length();
		
		int j =0;
		
		for(int i = 0; i<m && j<n; i++) {
			if(str1.charAt(i) == str2.charAt(j))
				j++;
		}
		
		return (j==n);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		System.out.println("String 2 is subsequence of string 1? "+ isSubSeq(str1, str2));

	}

}
