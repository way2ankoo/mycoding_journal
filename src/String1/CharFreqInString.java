package String1;

public class CharFreqInString {

	public static void charFreqSorted(String str) {
		int[] count = new int[26];
		for(int i=0; i< str.length(); i++) {
			count[str.charAt(i)-'a']++;
		}
		
		for(int i=0;i<26;i++) {
			if(count[i]>0) {
				System.out.println((char)('a'+i)+" "+count[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println((int)'a');
//		System.out.println((int)'z');
//		System.out.println((int)'A');
//		System.out.println((int)'Z');
		String str = "geeksforgeeks";
		System.out.println(str);
		charFreqSorted(str);

	}

}
