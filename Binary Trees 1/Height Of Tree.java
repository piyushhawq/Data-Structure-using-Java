public class Solution 
{
    public static int height(BinaryTreeNode<Integer> root)
    {   
        if (root == null)
        {
            return 0;
        }
        int heightOfTree = Math.max(height(root.left), height(root.right));
        return 1 + heightOfTree;
    }

}
