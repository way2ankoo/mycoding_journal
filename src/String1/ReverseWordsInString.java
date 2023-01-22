package String1;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		char[] str = s.toCharArray(); //convert string to char array
		reverseWords(str);
		//reverse(str, 0, str.length-1);
		System.out.println(str);
	}
	
	public static void reverse(char[] str, int low, int high) //reverse a word
	{
		while(low<=high)
		{
			char temp = str[low];
			str[low] = str[high];
			str[high] = temp;
			low++;
			high--;
		}
		
	}
	
	public static void reverseWords(char[] str) //reverse words in a string
	{
		int start =0;
		for(int end = 0; end < str.length; end++) // iterate through char array
		{
			if(str[end]==' ') //if space found
			{
				reverse(str, start, end-1); //reverse from start to space-1
				start = end+1; //set start to 1 ahead of space
			}
		}
		reverse(str, start, str.length-1); //reverse last word as it was not found be forloop b'coz space was not found in last.
		reverse(str, 0, str.length-1); //reverse whole character array
	}

}
