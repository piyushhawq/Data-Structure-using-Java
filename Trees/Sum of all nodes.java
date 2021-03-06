public class Solution 
{
    public static int sumOfAllNode(TreeNode<Integer> root)
    {
        if(root == null)
            return 0;

        int sum = 0;
        for(int i=0; i<root.children.size(); i++)
            sum += sumOfAllNode(root.children.get(i));
        return root.data + sum;
    }
}
