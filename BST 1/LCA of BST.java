public class Solution {

    public static int getLCA(BinaryTreeNode<Integer> root , int a , int b)
    {
        if(root == null)
            return 0;

        if(a < root.data && b < root.data)
            return getLCA(root.left, a, b);
        else if(a > root.data && b > root.data)
            return getLCA(root.right, a, b);
        else
            return root.data;
    }
}
