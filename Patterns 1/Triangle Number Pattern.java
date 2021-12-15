import java.util.Scanner;
public class Solution
{
    public static void main(String args[])   
    {   
        int i, j;	
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();	
        for(i=1; i<=n; i++)   
        {     
            for(j=1; j<=i; j++)   
            {     
                System.out.print(i);   
            }   
            System.out.println();   
        }   
    }   
} 
