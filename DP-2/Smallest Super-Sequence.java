public class Solution {

	public static int smallestSuperSequence(String str1, String str2) {

        int m = str1.length();
        int n = str2.length();
        
        int l = lcs(str1, str2, m, n);
        
        return l;
        
}
    
    static int lcs(String str1, String str2, int m, int n) {
        int[][] L = new int[m + 1][n + 1];
        int i, j;
 
       
        for (i = 0; i <= m; i++) {
            for (j = 0; j <= n; j++) {
                if (i == 0 )
                    L[i][j] = j;
                
                else if (j == 0 )
                    L[i][j] = i;
 
                else if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    L[i][j] = L[i - 1][j - 1] + 1;
 
                else
                    L[i][j] = 1+Math.min(L[i - 1][j],
                                       L[i][j - 1]);
            }
        }
 
       
        return L[m][n];
    }
}
