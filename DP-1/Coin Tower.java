public class Solution 
{
	public static String findWinner(int n,int x,int y)
  {
		boolean dp[] = new boolean [n+1];
        
        dp[0] = false;
        dp[1] = true;
        
        for(int i=2;i<=n;i++){
            
            if (i - 1 >= 0 && dp[i - 1] == false) 
                dp[i] = true; 
            else if (i - x >= 0 && dp[i - x] == false) 
                dp[i] = true; 
            else if (i - y >= 0 && dp[i - y] == false) 
                dp[i] = true; 
        	
            else
                dp[i] = false;
        
        }
        
        if(dp[n]==true){
            return "Beerus";
        }
        return "Whis";
	}
	
}
