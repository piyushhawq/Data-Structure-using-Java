public class Solution 
{
	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) 
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        
       LinkedListNode<Integer> final_head= reverseLinkedListRec(head.next);
		   LinkedListNode<Integer> temp=final_head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
        head.next=null;
        
        return final_head;
	}
}
