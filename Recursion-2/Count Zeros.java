public class solution 
{
     private static int countZeros(int input, int c)
    {
        if(input < 10) {
            
        if(input==0) 
                return 1;
            else
                return 0;
        }
        
         int z=countZeros(input/10,c);
        
        if(input%10==0) {
            return z + 1;
        }
       
        
        return z;
    }

	public static int countZerosRec(int input)
    {	
        return countZeros(input, 0);
   }
}
