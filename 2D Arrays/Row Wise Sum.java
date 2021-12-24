public class Solution
{
	public static void rowWiseSum(int[][] mat)
    {   
        int sum = 0;
        int N = mat.length;
        int M = 0;
        if(N!=0)
        {
            M = mat[0].length;
        }
        for(int i = 0; i<N; i++)
        {
            sum = 0;
            for(int j = 0; j<M; j++){
                sum+= mat[i][j];
                
            }
            System.out.print(sum+" ");
        }
	}
}
