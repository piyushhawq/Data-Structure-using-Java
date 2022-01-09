import java.util.LinkedList;
import java.util.Queue;

public class Solution 
{
    public static void printLevelWise(BinaryTreeNode<Integer> root)
    {

        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(null);

        while(!pendingNodes.isEmpty())
        {
            BinaryTreeNode<Integer> frontNode = pendingNodes.poll();


            if (frontNode == null)
            {
                System.out.println();

                if (!pendingNodes.isEmpty()) 
                {
                    pendingNodes.add(null);
                }

            } 
            else
            {
                System.out.print(frontNode.data + " ");

                if (frontNode.left != null)
                {
                    pendingNodes.add(frontNode.left);
                } 

                if (frontNode.right != null) 
                {
                    pendingNodes.add(frontNode.right);
                } 
            }

        }

    }

}
