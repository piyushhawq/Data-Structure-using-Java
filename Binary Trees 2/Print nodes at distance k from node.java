public class Solution {
	
	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
		// Write your code here
		printKDistanceNode(root, node, k);
        
	}
    
    private static void printKDistanceFromRoot(BinaryTreeNode<Integer> node, int k){
        if(node == null || k<0)
            return;
        
        if(k == 0){
            System.out.println(node.data);
            return;
        }   
        printKDistanceFromRoot(node.left, k-1);
        printKDistanceFromRoot(node.right, k-1);
    }
    
    private static int printKDistanceNode(BinaryTreeNode<Integer> root, int node, int k)
    {
        if(root == null)
            return -1;
        
        if(root.data == node){
            printKDistanceFromRoot(root, k);
            return 0;
        }
        int dl = printKDistanceNode(root.left, node, k);
        if(dl != -1){
            if(dl+1 == k)
                System.out.println(root.data);
            else
            	printKDistanceFromRoot(root.right, k-dl-2);
            return 1+dl;
        }
        
        int rd = printKDistanceNode(root.right, node, k);
        if(rd != -1){
            if(rd + 1 == k)
                System.out.println(root.data);
            else
                printKDistanceFromRoot(root.left, k-rd-2);
            return 1 + rd;
        }
        return -1;
    }
}
