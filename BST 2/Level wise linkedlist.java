import java.util.ArrayList;

public class Solution {

    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
        if(root==null)
        {
            return null;
        }
        if(root.left==null && root.right==null )
        {
            ArrayList<LinkedListNode<Integer>> ans=new ArrayList<LinkedListNode<Integer>>();
            ans.add(new LinkedListNode<Integer>(root.data));
            return ans;
        }

        QueueUsingLL<BinaryTreeNode<Integer>> Q=new QueueUsingLL<BinaryTreeNode<Integer>>();
        Q.enqueue(root);
        Q.enqueue(null);
        LinkedListNode<Integer> head=null,tail=null;
        ArrayList<LinkedListNode<Integer>> ans=new ArrayList<LinkedListNode<Integer>>();

        while(!Q.isEmpty())
        {
            BinaryTreeNode<Integer> curr;
            try{
                curr=Q.dequeue();
                if(curr==null)
                {
                    tail.next=null;
                    if(!Q.isEmpty())
                    {
                        Q.enqueue(null);
                    }
                    head=null;
                    tail=null;
                }
                else
                {
                    if(head==null && tail==null)
                    {
                        LinkedListNode<Integer> newNode=new LinkedListNode<Integer>(curr.data);
                        head=newNode;
                        ans.add(head);
                        tail=head;
                    }
                    else
                    {
                        LinkedListNode<Integer> newNode=new LinkedListNode<Integer>(curr.data);
                        tail.next=newNode;
                        tail=newNode;
                    }
                    if(curr.left!=null)
                    {
                        Q.enqueue(curr.left);
                    }
                    if(curr.right!=null)
                    {
                        Q.enqueue(curr.right);
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println(e);

            }
        }
        return ans;

    }

}//Level wise Linked List
