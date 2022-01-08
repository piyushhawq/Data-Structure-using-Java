public class Solution 
{
    public static BinaryTreeNode<Integer> buildTree(int[] pre, int[] in) 
    {
        return createBinaryTree(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }
    private static BinaryTreeNode<Integer> createBinaryTree(int[] pre, int[] in, int preStart, int preEnd, int inStart,int inEnd) 
    {
        if (inStart > inEnd || preStart > preEnd)
            return null;

        int data = pre[preStart];
        int mid = 0;
        for (int i = inStart; i <= inEnd; i++) 
        {
            if (in[i] == data)
            {
                mid = i;
                break;
            }
        }

        int leftPreStart = preStart + 1;
        int leftPreEnd = leftPreStart + mid - inStart - 1;
        int leftInStart = inStart;
        int leftInEnd = mid - 1;

        int rightPreStart = leftPreEnd + 1;
        int rightPreEnd = preEnd;
        int rightInStart = mid + 1;
        int rightInEnd = inEnd;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(pre[preStart]);
        root.left = createBinaryTree(pre, in, leftPreStart, leftPreEnd, leftInStart, leftInEnd);
        root.right = createBinaryTree(pre, in, rightPreStart, rightPreEnd, rightInStart, rightInEnd);
        return root;
    }

}
