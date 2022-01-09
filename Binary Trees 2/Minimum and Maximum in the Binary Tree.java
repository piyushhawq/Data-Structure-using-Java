public class Solution 
{
    public  static int findMax(BinaryTreeNode<Integer>node) 
    { 
        if (node == null) 
        {
            return Integer.MIN_VALUE; 
        }
        int res = node.data; 
        int lres = findMax(node.left); 
        int rres = findMax(node.right); 

        if (lres > res) 
            res = lres; 
        if (rres > res) 
            res = rres; 
        return res; 
    } 

    public  static int findMin(BinaryTreeNode<Integer>node) 
    { 
        if (node == null) 
        {
            return Integer.MAX_VALUE; 
        }
        int res = node.data; 
        int lres = findMin(node.left); 
        int rres = findMin(node.right); 

        if (lres < res) 
            res = lres; 
        if (rres < res) 
            res = rres; 
        return res; 
    }

    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        //Your code goes here
        int max= findMax(root);
        int min= findMin(root);
        Pair<Integer, Integer> p=new Pair(min,max);
        return p;
    }

}
