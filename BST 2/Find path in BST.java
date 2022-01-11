import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		
        if (root==null)
            return null;
        
        ArrayList<Integer> output;
        if (root.data==data)
        {
            output= new ArrayList<Integer>();
            output.add(root.data);
            return output;
        }
        
        if (data<root.data)
        {
            output = getPath(root.left,data);
            if (output != null)
            {
                output.add(root.data);
            }
            return output;
        }
        
        if (data>root.data)
        {
            output = getPath(root.right,data);
            if (output != null)
            {
                output.add(root.data);
            }
            return output;
        }
        return null;
	}
}
