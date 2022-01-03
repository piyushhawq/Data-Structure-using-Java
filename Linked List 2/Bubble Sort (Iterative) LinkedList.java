public class Solution {

    public static int length(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        int count = 1;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
        if(head==null){
            return null;
        }
        int l = length(head);
        for(int i=0;i<l-1;i++)
        {
            LinkedListNode<Integer> temp = head;
            LinkedListNode<Integer> node = null;
            for(int j=0;j<l-i-1;j++)
            {
                if(temp.data<=temp.next.data)
                {
                    node = temp;
                    temp = temp.next;
                }
                else{
                    if(node==null)
                    {
                        LinkedListNode<Integer> curr = temp.next;
                        head = head.next;
                        temp.next = curr.next;
                        curr.next = temp;
                        node = curr;
                    }
                    else{
                        LinkedListNode<Integer> curr = temp.next;
                        node.next = curr;
                        temp.next = curr.next;
                        curr.next = temp;
                        node = curr;
                    }
                }
            }
        }
        return head;
    }
}
