package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PermutationOfPalindrome {
	
	public static boolean permutation(String str) 
	{
		String s = str.replaceAll("\\s", "").toLowerCase();

		Map<Character,Integer> hmap = new HashMap<Character,Integer>();

		for (int i = 0; i < s.length(); i++) 
		{
			hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i), 0) + 1);		
		}
		
		int count = 0;
		for(char ch:hmap.keySet())
		{
			int val = hmap.get(ch);
			count += val % 2;
		}
		return count <=1;
	}

	public static boolean permutation1(String str) 
	{
		String s = str.replaceAll("\\s", "").toLowerCase();
		Map<Character,Integer> hmap = new HashMap<Character,Integer>();
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			int count = 1;
			if(hmap.containsKey(ch))
			{
				count++;
			}
			hmap.put(ch, count);
		}
		
		int count = 0;
		for(char ch:hmap.keySet())
		{
			int val = hmap.get(ch);
			count += val % 2;
		}

		return count <=1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "Tact Coa$$";
		//String word1 = "nivi12";
		boolean bool = permutation(word1);
		if(bool)
		{
			System.out.println("\""+word1+"\""+" is palindrome permutation");
		}
		else
		{
			System.out.println("\""+word1+"\""+" is not a palindrome permutation");
		}
		boolean bool1 = permutation1(word1);
		if(bool1)
		{
			System.out.println("\""+word1+"\""+" is palindrome permutation");
		}
		else
		{
			System.out.println("\""+word1+"\""+" is not a palindrome permutation");
		}
	}

}
