public class Solution
{
    public static  LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head,int i,int j)
    {
        LinkedListNode<Integer> temp1=head;
        LinkedListNode<Integer> node1=head;
        LinkedListNode<Integer> node2=head;

        for(int a=0;a<i;a++)
        
            node1=node1.next;
            for(int b=0;b<j;b++)
            
                node2=node2.next;
                int temp=node1.data;
                node1.data=node2.data;
                node2.data=temp;
            

            return temp1;
        }
    }
