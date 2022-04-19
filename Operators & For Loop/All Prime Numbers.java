import java.util.Scanner;
public class Solution 
{

    public static void main(String[] args)
    {

        /* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int flag;
        for (int i = 2; i <= n; i++)
        {
            if (i == 1 || i == 0)
                continue;
            flag = 1;

            for (int j = 2; j <= i / 2; ++j) 
            {
                if (i % j == 0) 
                {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
}
-------------------------------------------------------------------------------
	import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=2 ;i<=n;i++)
        {
            int count=0;
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)

                    count++;
            }
            if(count==1)
                System.out.println(i);

        }
    }
}
