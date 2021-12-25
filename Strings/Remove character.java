public class Solution 
{
	public static String removeAllOccurrencesOfChar(String str, char ch)
    {        
        int len = str.length();
        String x = "";
        for(int i = 0; i<len; i++)
        {
            if (str.charAt(i) != ch)
            {
                x = x+str.charAt(i);
            }
        }
        return x;
	}
}

