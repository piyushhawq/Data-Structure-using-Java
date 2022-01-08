public class Solution 
{
    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) 
    {
        if (root == null)
        {
            return 0;
        }
        int option1 = diameterOfBinaryTree(root.left);
        int option2 = diameterOfBinaryTree(root.right);
        int option3 = findMAxSubtreeHeight(root.left) + findMAxSubtreeHeight(root.right) + 1;
        return Math.max(option3, Math.max(option1, option2));
    }

    private static int findMAxSubtreeHeight(BinaryTreeNode<Integer> root) {
        if (root == null)
            return 0;
        int right = 1 + findMAxSubtreeHeight(root.right);
        int left = 1 + findMAxSubtreeHeight(root.left);
        return Math.max(right, left);
    }
}
