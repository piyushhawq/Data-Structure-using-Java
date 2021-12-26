public class Solution 
{	
	public static int sum(int[] arr)
    {
		return sum(arr,0,arr.length-1);
	}
    
	private static int sum(int[] arr,int start,int end) 
    {	
		if(start>end)
        {
			return 0;
		}
		return arr[start] + sum(arr, start+1, end);
	}
	
	public static void main(String[] args) 
    {	
		int[] arr= {1,2,3,4,5};
		System.out.println(sum(arr));
	}
}
