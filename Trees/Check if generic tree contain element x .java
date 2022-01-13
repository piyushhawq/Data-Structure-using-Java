public class Solution 
{
	public static boolean isPresent = false;

	public static boolean checkIfContainsX(TreeNode<Integer> root, int x)
    {
if (root == null) 
{
			isPresent = false;
		} 
        else if (root.data  == x) 
        {
			return true;
		}
		for (int i = 0; i < root.children.size(); i++) 
        {
			isPresent = checkIfContainsX(root.children.get(i), x);
		}
return isPresent;
	}
	
}
