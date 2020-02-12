package Arrays;

import java.util.*; 

public class StringPermutation {
	
	//Method 1
	static String sortString(String word)
	{
		char[] arr = word.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
	
	public static boolean permutation1(String s, String t) {
		
		return sortString(s).equals(sortString(t));
	}
	
	//Method 2
	public static boolean permutation(String s, String t) 
	{
		
		Set testSet = new HashSet();
		Set testSet1 = new HashSet();

		for (int i = 0; i < s.length(); i++) 
		{
			testSet.add(s.charAt(i));
		}
		
		for (int i = 0; i < t.length(); i++) 
		{
			testSet1.add(t.charAt(i));
		}
		
		if(testSet.equals(testSet1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = permutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}
	 

}
