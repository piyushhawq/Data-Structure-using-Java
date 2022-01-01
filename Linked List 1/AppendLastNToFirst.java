public class Solution 
{
    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n)
    {
        /* Empty list */
        if (head == null || n == 0)
            return head;

        LinkedListNode cur = head;
        int length = 1;
        while (cur.next != null) 
        {
            cur = cur.next;
            length++;
        }
        /* if entered position is greater than list length */
        if (n > length)
        {
            return head;
        }

        LinkedListNode temp = head;
        int count = 0;
        while (count < length - n - 1) 
        {
            temp = temp.next;
            count++;
        }
        LinkedListNode newHead = temp.next;
        temp.next = null;
        cur.next = head;
        return newHead;
    }
}
