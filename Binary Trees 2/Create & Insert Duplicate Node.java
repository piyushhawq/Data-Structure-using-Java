public class Solution 
{
    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) 
    {

        if(root == null)
        {
            return;
        }
        insertDuplicateNode(root.left);
        insertDuplicateNode(root.right);
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(root.data);
        BinaryTreeNode<Integer> temp = root.left;
        root.left = node;
        node.left = temp;
    }
}
