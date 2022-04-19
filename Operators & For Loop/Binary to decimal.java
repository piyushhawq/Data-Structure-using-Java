import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
    {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int p=0;
		int res=0;
		while(n>0) 
        {
		  int a=n%10;
		  res=res+(a*(int)Math.pow(2, p++));
		  n=n/10;
		}
		System.out.println(res);
	}
}
---------------------------------------------------------------------------
	import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ans=0; 
        int pos=1;
        while(n!=0){
            
           
            int d=n%10;
            ans=ans+d*pos;
            n=n/10;
        	pos=pos*2;
        }
       
        System.out.println(ans);
    }
}
