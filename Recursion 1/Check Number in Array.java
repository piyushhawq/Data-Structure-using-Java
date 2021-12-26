public class Solution
{
	public static boolean checkNumber(int[] arr,int num)
    {
		return checkNumber(arr,0,arr.length-1,num);
	}

	private static boolean checkNumber(int[] arr, int start, int end,int num) 
    {
		if(start > end)
        {
			return false;
		}
		if(arr[start]==num) 
        {		
            return true;
		}
		return checkNumber(arr, start+1, end, num);
	}

	public static void main(String[] args)
    {	
		int[] arr= {1,2,3,4,5,6,7,8};
		System.out.println(checkNumber(arr, 1));
	}
}
