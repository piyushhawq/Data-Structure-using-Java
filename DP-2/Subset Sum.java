public class Solution{
    static boolean isSubsetPresent(int[] arr, int n, int sum) {

        
         boolean total[][] = new boolean[n+1][sum+1];
        
        // initialization
        for(int i=0; i<=n; i++)
        {
            total[i][0] = true;
        }
            
        
        for(int i=1; i<=sum; i++)
        {
             total[0][i] = false;
        }
           
            
        // logic -> similar with 01 knapsack
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=sum; j++)
            {
                if(arr[i-1] <= j)
                {
                    total[i][j] = total[i-1][j-arr[i-1]] || total[i-1][j];
                }   
                else
                {
                    total[i][j] = total[i-1][j];
                }
            }
        }
        
        return total[n][sum];

    }
}
