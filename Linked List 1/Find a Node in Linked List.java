public class Solution
{
	public static int findNode(LinkedListNode<Integer> head, int n) 
  {
      LinkedListNode<Integer> temp=head;
      int len=0;
      while(temp!=null)
      {
        if(temp.data==n)
        {
          return len;
        }
        len++;
        temp=temp.next;
      }
      return -1;
	}
}
