public class Solution
{
	public static boolean checkMember(int n)
    {
		int a=0;
		int b=1;
		while(a<n) 
        {
			int c=a+b;
			a=b;
			b=c;
		}
		if(n==a)
        {
			return true;
		}
		return false;	
	}
}
