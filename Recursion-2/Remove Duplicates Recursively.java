public class Solution
{	
	public static String removeConsecutiveDuplicates(String str)
    {
		
		if(str.length()==1)
        {
			return str;
		}
		String smallAns=removeConsecutiveDuplicates(str.substring(1));
		
		if(smallAns.charAt(0)==str.charAt(0))
        {
			return smallAns;
		}
		return str.charAt(0) + smallAns;
	}
	public static void main(String[] args) 
    {
		String str="aabbbaacccba";
		System.out.println(removeConsecutiveDuplicates(str));
	}
}
