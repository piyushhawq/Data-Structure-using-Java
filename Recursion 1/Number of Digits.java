public class Solution 
{	
	public static int count(int n) 
    {
		if(n==0) 
        {
			return 0;
		}
     int c= 1+count(n/10);
		return c;	
	}
}  
