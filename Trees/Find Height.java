public class Solution 
{
    public static int getHeight(TreeNode<Integer> root)
    {
        if (root == null)
            return 0;

        int max = 1;
        for (TreeNode<Integer> child : root.children) 
        {
            int childHeight = 1 + getHeight(child);
            if (max < childHeight)
                max = childHeight;
        }
        return max;
    }
}
