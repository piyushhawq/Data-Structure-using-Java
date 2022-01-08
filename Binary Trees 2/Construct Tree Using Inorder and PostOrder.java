public class Solution 
{
    public static BinaryTreeNode<Integer> buildTree(int[] post,  int[] in)
    {
        return createBinaryTree(post, in, 0, post.length -1, 0, in.length-1);

    }

    private static BinaryTreeNode<Integer> createBinaryTree(int[] post, int[] in, int postStart, int postEnd, int inStart, int inEnd)
    {

        if(postStart > postEnd || inStart > inEnd)
            return null;

        int data = post[postEnd];
        int mid = 0;
        for(int i=inStart; i<=inEnd; i++){
            if(in[i] == data){
                mid = i;
                break;
            }
        }

        int rightInStart = mid + 1;
        int rightInEnd = inEnd;

        int leftInStart = inStart;
        int leftInEnd = mid - 1;

        int leftPostStart = postStart;
        int leftPostEnd = postStart + mid - 1 -inStart;

        int rightPostStart = leftPostEnd + 1;
        int rightPostEnd = postEnd -1;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
        root.left = createBinaryTree(post, in, leftPostStart, leftPostEnd, leftInStart, leftInEnd);
        root.right = createBinaryTree(post, in, rightPostStart, rightPostEnd, rightInStart, rightInEnd);

        return root;
    }
}
