public class Solution 
{
	public static int firstIndex(int input[], int x)
    {
		return firstIndex(input,x,0);
	}
    public static int firstIndex(int[] input,int x,int idx)
    {
        if(idx == input.length)
        {
            return -1;
        }
        if(input[idx] == x)
        {
            return idx;        
        }
        return firstIndex(input,x,idx+1);
    }	
}
