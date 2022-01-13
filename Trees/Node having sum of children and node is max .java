public class Solution 
{
    public static TreeNode<Integer> ans;
    public static int maxSum = 0;

    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root)
    {
        if (root.children.size() == 0) 
        {
            return root;
        }
        int sum = root.data;
        for (int i = 0; i < root.children.size(); i++)
        {
            sum += root.children.get(i).data;
        }
        if (sum > maxSum)
        {
            maxSum = sum;
            ans = root;
        }

        for (int i = 0; i < root.children.size(); i++)
        {
            if (maxSumNode(root.children.get(i)).data > maxSum)
            {
                maxSum = maxSumNode(root.children.get(i)).data;
                ans = root.children.get(i);
            } 
        }
        return ans;
    }		
}
