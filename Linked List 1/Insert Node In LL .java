public class Solution {

    public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data) {
        // Your code goes here
        /* Empty list */
        if (head == null)
            return head;

        /* entered position is 0, insert at head */
        if (pos == 0) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
            newNode.next = head;
            return newNode;
        }
        ;

        int count = 0;
        int length = 1;
        LinkedListNode cur = head;
        LinkedListNode<Integer> newNode = new LinkedListNode<>(data);

        /* calculating length + traversing to end of list */
        while (cur.next != null) {
            cur = cur.next;
            length++;
        }

        /* if entered position is greater than list length */
        if (pos > length)
            return head;

        /* if last position is entered */
        if (pos == length) {
            cur.next = newNode;
            return head;
        }

        /* traverse to the node where insertion is to take place */
        cur = head;
        while (pos > 1) {
            cur = cur.next;
            pos--;
        }
        /* insert the new node */
        newNode.next = cur.next;
        cur.next = newNode;
        return head;
    }
}
