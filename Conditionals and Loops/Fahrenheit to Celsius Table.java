import java.util.Scanner;
public class Solution 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int   S=s.nextInt();
        int E=s.nextInt();
        int W=s.nextInt();
        int fah;
        while(S<=E)
        {
            fah=((5*(S-32))/9);
            System.out.println(S+" "+fah);
            S+=W;
        }
    }
}

