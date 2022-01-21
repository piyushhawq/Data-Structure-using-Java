public class Solution 
{
	public static int sum(int[] input) 
  {
		int sum=0;
		for(int i : input)
    {
			sum+=i;
		}
		return sum;
	}
  //driver code 
	public static void main(String[] args) 
  {
		int[] arr= {1,2,3,4,7,8};
		System.out.println(sum(arr));
	}
}

/////////
public class Solution
{
	public static int sum(int[] arr)
    {
		int sum=0;
         for(int i=0;i<arr.length;i++)
        {
          sum=sum+arr[i];
        }
        return sum;
	}
}
