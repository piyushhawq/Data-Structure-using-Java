public class Solution 
{
    public static void findLargest(int input[][])
    {
        if(input.length==0){
            System.out.println("row 0 -2147483648");
            return;
        }
        int sum=0,largestRow=Integer.MIN_VALUE,rn=0;
    
        for(int i=0;i<input.length;i++)
        {   sum=0;
          for(int j=0;j<input[0].length;j++)
          {
             sum+=input[i][j];
          }
           if(sum>largestRow)
           {
             largestRow=sum;
             rn=i;}
            }

        int sum1=0,largestCol=Integer.MIN_VALUE,cn=0;
        for(int j=0;j<input[0].length;j++)
        {   sum1=0;
         for(int i=0;i<input.length;i++)
         {
             sum1+=input[i][j];
         }

         if(sum1>largestCol)
         {
             largestCol=sum1;
             cn=j;}
        }

       
        if(largestRow>=largestCol)
        {
            System.out.print("row "+rn+" "+largestRow);
      
        }
        else if(largestRow<largestCol)
        {
            System.out.print("column "+cn+" "+largestCol);  
        }
    }
}
