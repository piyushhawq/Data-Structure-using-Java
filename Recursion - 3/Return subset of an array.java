public class solution {
    

    public static int[][] sub(int input[],int index) {   
        int x = 0;
        if(index==input.length)
        {
            
            int[][] arr = new int[1][0];
            return arr;
        }
        
        int[][] smallarry = sub(input,index+1);
        int[][] output = new int[2*smallarry.length][];
        int k=0;
        for(int i=0;i<smallarry.length;i++,k++)
        {
            
            x = smallarry[i].length;
            output[k] = new int[x];
            for(int j=0;j<x;j++)
            {
                output[k][j] = smallarry[i][j];
            }
        }
        for(int i=0;i<smallarry.length;i++,k++)
        {
            x = smallarry[i].length;
            output[k] = new int[x+1];
            output[k][0]=input[index];
            for(int j=0;j<x;j++)
            {                
                output[k][j+1] = smallarry[i][j];
            }
        }
        return output;		
    }
	
	public static int[][] subsets(int input[]) {
       
        return sub(input,0);
        
    }
}
