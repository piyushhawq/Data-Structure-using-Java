import java.util.HashMap;
public class Solution{
    public static int lengthOfLongestSubsetWithZeroSum(int arr[])
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        int len=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                if(len<i+1){
                    len=i+1;
                }
            }
            else if(map.containsKey(arr[i])){
                if(len<i-map.get(arr[i]))
                {
                    len=i-map.get(arr[i]);
                }
            }
            else{
                map.put(arr[i],i);
            }
        }
        return len;
    }
}
