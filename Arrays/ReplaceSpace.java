package Arrays;

//import CtCILibrary.AssortedMethods;

public class ReplaceSpace {
	
	static int findLastChar(char[] arr)
	{
		for(int i = arr.length - 1;i>=0;i--)
		{
			if(arr[i] != ' ')
			{
				return i;
			}
		}
		return -1;
	}
	
	static String replaceSpace(char[] arr, int truelength)
	{
		int spaceCount = 0;
		int index;
		for(int i = 0;i<truelength;i++)
		{
			if(arr[i] == ' ')
			{
				spaceCount++;
			}
		}
		index = truelength + spaceCount * 2;

		if (truelength < arr.length) 
		{
			arr[truelength] = '\0';
		}
		for (int i = truelength - 1; i >= 0; i--) {
			
			if (arr[i] == ' ') {
				System.out.println("val of arr in "+i+" index is "+"\""+arr[i]+"\""+" and is moved to new position "+index);
				arr[index - 1] = '0';
				arr[index - 2] = '2';
				arr[index - 3] = '%';
				index = index - 3;
			} else {
				System.out.println("val of arr in "+i+" index is "+"\""+arr[i]+"\""+" and is moved to new position "+index);
				arr[index - 1] = arr[i];
				index--;
			}
		}
	    return new String(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello W orld    ";
		//System.out.println(str.trim().replace(" ", "%20"));
		char[] ch = str.toCharArray();
		int trueLength = findLastChar(ch) + 1;
		System.out.println(replaceSpace(ch,trueLength));		
	}
}
