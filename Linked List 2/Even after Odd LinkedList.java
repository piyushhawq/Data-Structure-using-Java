 public class Solution 
 {
	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head)
    {
		if(head == null || head.next == null)
        {
            return head;
        }
        LinkedListNode<Integer> evenHead = new LinkedListNode<>(0);
        LinkedListNode<Integer> oddHead = new LinkedListNode<>(0);
        
        LinkedListNode<Integer> curEven = evenHead;
        LinkedListNode<Integer> curOdd = oddHead;
        
        while(head != null)
        {
            if(head.data % 2 == 0)
            {
                curEven.next = head;
                curEven = curEven.next;
            }
            else
            {
                curOdd.next = head;
                curOdd = curOdd.next;
            }
            head = head.next;
        }
        curEven.next = null;
        curOdd.next = evenHead.next;
        return oddHead.next;
	}
}
