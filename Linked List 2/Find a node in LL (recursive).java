public class Solution 
{
    public static int findNodeRec(LinkedListNode<Integer> head, int n) 
    {
        return helperfun(head,n,0);
    }
    public static int helperfun(LinkedListNode<Integer> head, int n,int pos)
    {
        if(head==null)
        {
            return -1;
        }
        if(head.data==n)
        {
            return pos;
        }
        return helperfun(head.next,n,pos+1);
    }
}
