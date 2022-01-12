public class Solution 
{
    public static int numNodeGreater(TreeNode<Integer> root,int x)
    {	
        if(root == null)
            return 0;

        int count = 0;
        if(root.data > x)
        {
            count++;
        }
        for(TreeNode<Integer> node : root.children)
            count += numNodeGreater(node, x);
        return count;
    }	
}
