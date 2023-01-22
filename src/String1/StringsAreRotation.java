package String1;

import java.util.Scanner;

public class StringsAreRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		sc.close();
		//System.out.println(s1+.indexOf(s2));
		System.out.println("String s2 is rotation of string s1? " + checkStringsAreRotation(s1, s2));
	}
	
	public static boolean checkStringsAreRotation(String s1, String s2) {
		if(s1.length()!=s2.length())
			return false;
		return((s1+s1).indexOf(s2)>=0);
	}

}
