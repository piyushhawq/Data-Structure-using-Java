import java.util.*;
public class Solution 
{
    public static void printLevelWise(BinaryTreeNode<Integer> root)
    {
        if (root == null)
        {
            return;
        }
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);

        while (!pendingNodes.isEmpty())
        {
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            if (front != null)
            {
                System.out.print(front.data + ":");
                if (front.left == null)
                    System.out.print("L:-1");
                else
                    System.out.print("L:" + front.left.data);
                if (front.right == null)
                    System.out.print(",R:-1");
                else
                    System.out.print(",R:" + front.right.data);
                System.out.println();
                pendingNodes.add(front.left);
                pendingNodes.add(front.right);
            }
        }
    }
}
