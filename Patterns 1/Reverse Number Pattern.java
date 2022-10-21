import java.util.Scanner;
public class Solution  
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner (System.in);
        int n= s.nextInt();
        int i=1;
        while(i<=n)
        {
            int p =i;
            int j =1;
            while(j<=i) 
            {
                System.out.print(p);
                p=p-1;
                j=j+1;

            }
            System.out.println();
            i=i+1;
        }
    }
}
///////////////using for loop

import java.util.Scanner;
public class Solution
{
    public static void main(String[] args)
    {
        int i,j,n;  
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();	 
        for(i=1;i<=n;i++)
        {
            int p =i;
           
            for(j=1;j<=i;j++)
            {
                System.out.print(p);
                 p=p-1;
            }
            System.out.println();
        }             
    }
}
