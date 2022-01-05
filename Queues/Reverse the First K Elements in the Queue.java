import java.util.*;
public class Solution{

    public static Queue<Integer> reverseKElements(Queue<Integer> input,int k){

        Stack<Integer> stack = new Stack<>();
        while(stack.size() < k)
            stack.push(input.poll());

        while(!stack.isEmpty())
            input.add(stack.pop());

        for(int i=0; i<input.size()-k; i++)
            input.add(input.poll());

        return input;
    }
}
