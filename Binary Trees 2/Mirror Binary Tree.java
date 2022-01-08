public class Solution 
{
    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root)
    {
        if (root == null)
        {
            return;
        }  
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
        BinaryTreeNode<Integer> tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
    }
}
