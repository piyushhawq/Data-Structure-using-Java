public class Solution 
{
    public static int getSum(BinaryTreeNode<Integer> root) 
    {
        if (root == null)
        { 
            return 0;
        }
        int smallSum = getSum(root.left) + getSum(root.right);
        return smallSum + root.data;
    }
}
