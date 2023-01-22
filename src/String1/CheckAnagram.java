package String1;

import java.util.Scanner;

public class CheckAnagram {
	
	public static boolean areAnagram(String str1, String str2) {
		int CHAR = 256;
		if(str1.length()!= str2.length())
			return false;
		int[] count = new int[CHAR]; //count array with characters as indexes
		for(int i=0; i<str1.length(); i++) { //traverse through strings
			count[str1.charAt(i)]++; // for character in string 1, increase array element count
			count[str2.charAt(i)]--; // for char in string 2, decrease count
		}
		for(int i=0; i<256; i++) {
			if(count[i]!=0) //if all element are 0 in Count array means its anagram
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// Anagram : 1 strings organized differently E.g. silent & listen
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		System.out.println("String 2 and string 1 are Anagram? "+ areAnagram(str1, str2));
	}

}
