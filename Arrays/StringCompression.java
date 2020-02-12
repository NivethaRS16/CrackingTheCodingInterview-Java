package Arrays;

public class StringCompression {

	static String stringCompression(String str)
	{
		int len = str.length();
		int count = 0;
		String str1 = "";
		for(int i=0;i<len;i++)
		{
			//Method 1
			/*
			count = 1;
			while(i<len-1 && str.charAt(i)==str.charAt(i+1))
			{
				i++;
				count++;							
			}
			str1 += "" + str.charAt(i) + count;
			*/
			//Method 2
			count++;
			if(i+1>=len||str.charAt(i)!=str.charAt(i+1))
			{
				str1 += "" + str.charAt(i) + count;
				count=0;
				
			}
		}
		return str1.length() > str.length() ? str : str1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = stringCompression("aabbccddddeeeaa");
		System.out.println("Resultant is "+res);
	}

}
