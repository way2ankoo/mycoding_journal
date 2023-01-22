package String1;

import java.util.Scanner;

public class NaivePatternSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine();
		String pat = sc.nextLine();
		sc.close();
		
		patSearching(txt, pat);
		patSearchingDist(txt, pat);

	}

	private static void patSearching(String txt, String pat) {
		// Naive Pattern Searching algorithm Time complexity : O((n-m+1) * m)
		int n = txt.length();
		int m = pat.length();
		for(int i=0;i<=n-m;i++) //Iterate over text
		{
			int j;
			for(j=0;j<m;j++) //Iterate over pattern
			{
				if(pat.charAt(j)!=txt.charAt(i+j)) //i+j so that 1st char check with first, second char checks with send, third with third and so on...
					break;
			}
			if(j==m) //if all characters match
				System.out.println(i);//if pattern iterator reaches end..so print i
		}	
	}
	
	private static void patSearchingDist(String txt, String pat) {
		// Improved naive Pattern Searching algorithm if pattern has distinct characters. Time complexity : O(n)..linear
		int n = txt.length();
		int m = pat.length();
		for(int i=0;i<=n-m;)
		{
			int j;
			for(j=0;j<m;j++)
			{
				if(pat.charAt(j)!=txt.charAt(i+j))
					break;
			}
			if(j==m) //if all characters match
				System.out.println(i);
			if(j==0) //if first character itself do not match..increment by 1
				i++; 
			else
				i=i+j; //else increment by j..
		}	
	}

}
