package Arrays;

public class StringRotation {

	static boolean isSubString(String s1, String s2)
	{
		String s3 = s1 + s1;
		System.out.println("Combined string "+s3);
		return s3.contains(s2) ? true:false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] pairs = {{"waterbottle", "erbottlewat"}, {"carrot", "arrotc"}, {"hello", "lloeh"}};
		
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean bool = isSubString(word1,word2);
			if (bool)
				System.out.println("Yes it is a substring");
			else
				System.out.println("No it is not a substring");
		}		
	}
}
