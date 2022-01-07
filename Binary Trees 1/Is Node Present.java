public class Solution
{
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) 
    {
        if (root==null)
        {
            return false;
        }
        
        if (root.data==x)
        {
            return true;
        }
        else
        {
            return (isNodePresent(root.left,x)||isNodePresent(root.right,x));
        }
	}

}
