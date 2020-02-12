package Arrays;

public class OneAway {
	
    public static boolean oneEditAway(String str1, String str2) {
    	
    	if(str1.equals(str2))	return true;	//Both strings equal then return true
    	
    	if(Math.abs(str1.length() - str2.length()) > 1)		return false;	//If length of string is greater than 1 then return false
    	
    	int i = 0,j = 0;
    	int count = 0;
    	while (i<str1.length() && j<str2.length())
    	{
    		System.out.println("Char at index i "+i+" and index j "+j+" are "+str1.charAt(i)+" and "+str2.charAt(j));
    		if(str1.charAt(i) != str2.charAt(j))
    		{
    			if(count == 1)		
    				return false;
    			
    			if(str1.length() > str2.length())
    			{
    				i++;
    			}
    			else if(str2.length() > str1.length())
    			{
    				j++;
    			}
    			else
    			{
    				i++;
    				j++;
    			}
    			count++;
    			System.out.println("counter value "+count);
    		}
    		else
    		{
    			System.out.println("Char at index i "+i+" and index j "+j+" are "+str1.charAt(i)+" and "+str2.charAt(j)+" are same");
    			i++;
    			j++;
    		}
    	}
    	if (i<str1.length()||j<str2.length())
    	{
    		System.out.println("when one string is more");
   			count++;
   		}
   		System.out.println(count);   	
    	
        return count == 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "pale";
		String b = "bake";
		boolean isOneEdit1 = oneEditAway(a, b);
		System.out.println(a + ", " + b + ": " + isOneEdit1);
	}

}
