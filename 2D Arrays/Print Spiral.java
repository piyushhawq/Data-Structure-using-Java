public class Solution 
{
    public static void spiralPrint(int matrix[][])
    {
       
        int rows = matrix.length;
        int cols = 0;
        if(rows!=0)
        {
            cols = matrix[0].length;
        }

        int rs = 0;
        int cs = 0;
        int re = rows-1;
        int ce = cols-1;
        int count = 0;
        
        while(count<(rows * cols))
        {
            for(int i = cs; i<=ce; i++)
            {
                System.out.print(matrix[rs][i] + " ");
                count++;
            }
            rs++;
            for(int i = rs; i<=re; i++)
            {
                System.out.print(matrix[i][ce]+ " ");
                count++;
            }
            ce--;
            for(int i = ce; i>=cs; i--)
            {
                System.out.print(matrix[re][i] + " ");
                count++;
            }
            re--;
            for(int i = re; i>=rs; i--)
            {
                System.out.print(matrix[i][cs] + " ");
                count++;
            }
            cs++;
        }
    }
}
