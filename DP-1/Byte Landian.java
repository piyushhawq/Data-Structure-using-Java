import java.util.HashMap;
public class Solution {

    public static long bytelandian(long n, HashMap<Long, Long> memo) {

        //Handle base case for n=0,1
        if (n<12)
        {
            memo.put(n,n);
            return n;
        }

        if (!memo.containsKey(n))
        {
            long ans1=bytelandian(n/2,memo);
            long ans2=bytelandian(n/3,memo);
            long ans3=bytelandian(n/4,memo);

            long currVal=ans1+ans2+ans3;
            if (currVal>n)
                memo.put(n,currVal);
            else
                memo.put(n,n);

        }

        return memo.get(n);

    }

}
