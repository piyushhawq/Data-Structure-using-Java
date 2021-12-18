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
            int space =1;
            while(space<=n-i)
            {
                System.out.print(" ");

                space= space+1;				
            }
            int star =1;
            while(star<=i)
            {
                System.out.print("*");
                star=star+1;
            }
            int dec= i-1;
            while(dec>=1)
            {
                System.out.print("*");
                dec=dec-1;
            }
            System.out.println();
            i=i+1;
        }
    }
}
