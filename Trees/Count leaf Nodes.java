public class Solution 
{
    public static int count = 0;
    public static int countLeafNodes(TreeNode<Integer> root)
    {
        if (root.children.size() == 0) 
        {
            count++;
        }
        for (int i = 0; i < root.children.size(); i++)
        {
            countLeafNodes(root.children.get(i));
        }
        return count;
    }

}
