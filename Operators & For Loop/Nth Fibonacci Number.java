import java.util.Scanner;
public class Solution
{
    static int fib(int num)
    {
        int f[] = new int[num+2]; 
        int i;
        f[0] = 0;
        f[1] = 1;
        for (i = 2; i <= num; i++)
        {
            /* Add the previous 2 numbers in the series
	         and store it */
            f[i] = f[i-1] + f[i-2];
        }

        return f[num];
    }
    public static void main (String args[])
    {
        int num ;
        Scanner sc=new Scanner(System.in);	    	
        num=sc.nextInt();	
        System.out.println(fib(num));
    }
}


