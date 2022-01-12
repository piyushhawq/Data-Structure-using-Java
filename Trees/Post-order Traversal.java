public class Solution 
{
	public static void printPostOrder(TreeNode<Integer> root)
    {
        if(root == null)
            return;
        
        for(TreeNode<Integer> child : root.children)
            printPostOrder(child);
        
        System.out.print(root.data+" ");
	}

}
