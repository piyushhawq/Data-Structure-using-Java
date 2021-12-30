public class Solution 
{
	public static void printIthNode(LinkedListNode<Integer> head, int i)
  {
         for(int j=0;j<=i && head!= null;j++)
        {	
           if(j==i)
            System.out.println(head.data);
             head=head.next;
        }
	}
}
