import java.util.*;
public class Solution {

    public static boolean isBalanced(String exp) {
        // Write your code here
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            if(!stack.isEmpty() && (ch == '}' || ch == ')' || ch == ']')){
                if(stack.isEmpty() || !isMatch(stack.pop(), ch))
                    return false;
            }
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatch(char c1, char c2){
        if(c1 == '(' && c2 == ')')
            return true;
        if(c1 == '{' && c2 == '}')
            return true;
        if(c1 == '[' && c2 == ']')
            return true;
        else 
            return false;
    }
}
