public class Solution
{	
    public static int pairSum(int arr[] , int x)
    {
        int n= arr.length;
        int count =0;
        for(int i=0;i<n-1;i++)
        {   
            for(int j=i+1;j<n;j++)
            {
                int sum =arr[i] +arr [j];
                if (sum==x)
                {
                    count ++;
                }
            }
        }
        return count;
    }
}
