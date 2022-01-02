public class Solution {
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) 
    {
        if(head1 == null)
        { 
            return head2;
        }
        if(head2 == null)
        {
            return head1;
        }
        LinkedListNode<Integer> cur1 = head1;
        LinkedListNode<Integer> cur2 = head2;
        LinkedListNode<Integer> resultList = new LinkedListNode<>(0);
        LinkedListNode cur3 = resultList;
        while(cur1 != null && cur2 != null)
        {
            if(cur1.data < cur2.data)
            {
                cur3.next = cur1;
                cur1 = cur1.next;
            }
            else
            {
                cur3.next = cur2;
                cur2 = cur2.next;
            }
            cur3 = cur3.next;
        }
        if(cur1 != null)
        {
            cur3.next = cur1;
        }
        if(cur2 != null)
        { 
            cur3.next = cur2;
        }
        return resultList.next;
    }

}
