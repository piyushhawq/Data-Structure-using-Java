import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n == 0 || n == 1)
        {
            System.out.println(n);
            System.exit(0);
        }
        int i = 1;
        int r = 1;
        while(r <= n)
        {
            i++;
            r = i*i;
        }
        System.out.println(i-1);
	}
}
