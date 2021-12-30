public class Solution {

	public static int length(LinkedListNode<Integer> head)
  {
		int counter=0;
        while(head!=null)
        {head=head.next;
        counter++;}
        
        return counter;
	}
}
