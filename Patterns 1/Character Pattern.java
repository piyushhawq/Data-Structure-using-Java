import java.util.Scanner;
public class Solution
{
    public static void main(String[] args) 
    {	
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++) 
        {
            char p=(char)('A'+i-1);
            for(int j=1;j<=i;j++)
            {
                System.out.print(p);
                p =(char)(p+1);
            }
            System.out.println();
        }
    }
}
