import java.util.*;
public class Solution 
{
    public static int countBracketReversals(String input)
    {	
        int len = input.length(); 

        if (len%2 != 0) 
            return -1; 

        Stack<Character> s=new Stack<>(); 

        for (int i=0; i<len; i++) 
        { 
            char c = input.charAt(i); 
            if (c =='}' && !s.empty()) 
            { 
                if (s.peek()=='{') 
                    s.pop(); 
                else
                    s.push(c); 
            } 
            else
                s.push(c); 
        } 

        // Length of the reduced expression 
        // red_len = (m+n) 
        int red_len = s.size(); 

        // count opening brackets at the end of 
        // stack 
        int n = 0; 
        while (!s.empty() && s.peek() == '{') 
        { 
            s.pop(); 
            n++; 
        } 

        // return ceil(m/2) + ceil(n/2) which is 
        // actually equal to (m+n)/2 + n%2 when 
        // m+n is even. 
        return (red_len/2 + n%2); 
    }
} 
