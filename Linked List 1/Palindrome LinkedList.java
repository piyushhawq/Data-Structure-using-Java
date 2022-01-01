public class Solution
{  	
    static LinkedListNode<Integer> left=null;
    public static boolean isPalindrome(LinkedListNode<Integer> head) 
    {	
        left=head;  
        return find(head);
    }

    public static boolean find(LinkedListNode<Integer> right)
    {
        if(right==null)
        {
            return true;
        }

        boolean val=find(right.next);
        if(val==true)
        {
            if(left.data==right.data)
            {
                left=left.next;
                return true;
            }
        }
        return false;
    } 	
}
