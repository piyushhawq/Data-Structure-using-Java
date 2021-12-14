import java.util.Scanner;
public class Solution 
{
    public static void main(String[] args) 
    {
        int N, i;
        Scanner scanner;
        scanner = new Scanner(System.in);
        N = scanner.nextInt();
        for (i = 1; i <= N; i++) 
        {
            if (N % i == 0)
            {
                if(i != 1 && i != N)
                {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
