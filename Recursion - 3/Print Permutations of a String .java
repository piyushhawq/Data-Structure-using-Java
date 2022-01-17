public class solution {
    
    private static void permutation(String str, int i, int n) {
        if(i==n)
            System.out.println(str);
        else {
            for(int j=i;j<=n;j++)
            {
                str = swap(str,i,j);
                permutation(str,i+1,n);
                str = swap(str,i,j);
            }
        }
    }
    
    private static String swap(String str, int i, int j) {
    
        String input = "";
        for(int k=0;k<str.length();k++)
        {
            if(k==i)
                input+=str.charAt(j);
            else if(k==j)
                input+=str.charAt(i);
            else
                input+=str.charAt(k);
        }
        return input;
    }
    
	public static void permutations(String input){
        
        permutation(input,0,input.length()-1);
	}
}
