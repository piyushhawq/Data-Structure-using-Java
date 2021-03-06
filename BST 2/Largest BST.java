public class Solution {

	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
		if(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            return height(root);
        
        else{
    		int lHeight = largestBSTSubtree(root.left);
            int rHeight = largestBSTSubtree(root.right);
            return Math.max(lHeight, rHeight);
        } 
	}
    
    private static boolean isBST(BinaryTreeNode<Integer> root, int min, int max){
        if(root == null)
            return true;
        
        if(root.data < min || root.data > max)
            return false;
        
        boolean isLeftBST = isBST(root.left, min, root.data - 1);
        boolean isRightBST = isBST(root.right, root.data, max);
        
        return isLeftBST && isRightBST;
    }
    
    private static int height(BinaryTreeNode<Integer> root)
    {
        if(root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
