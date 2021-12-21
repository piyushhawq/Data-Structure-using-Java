public class Solution 
{    
    public static void arrange(int[] arr, int n) 
    {
        n=arr.length;
        int i = 0,j = n-1,c = 1;

        for(c = 1; c <= n ;c++)
        {
            if(c % 2 != 0) 
            {
                arr[i] = c;
                i++;
            }
            else 
            {
                arr[j] = c;
                j--;}
        } 
    }
}
