import java.util.*;
public class Solution
{
    public static ArrayList<Integer> getPathBFSHelper(int[][] edges,int start,int end,boolean[] visited) {

        if(start==end){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(start);
            return ans;
        }
        visited[start]=true;
        int n=edges.length;
        for(int j=0;j<n;j++){
            if(edges[start][j]==1&&!visited[j]){
                ArrayList<Integer> ans = getPathBFSHelper(edges,j,end,visited);
                if(ans!=null)
                {
                    ans.add(start);
                    return ans;
                }
            }
        }
        return null;
    }
    public static ArrayList<Integer> getPathBFS(int[][] edges, int sv, int ev)
    {
        boolean[] visited = new boolean[edges.length];
        return getPathBFSHelper(edges, sv, ev, visited);
    }
    public static void main(String[] args)
    {
        int n;
        int e;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        e = s.nextInt();
        int edges[][] = new int[n][n];
        for(int i = 0; i < e; i++)
        {
            int fv = s.nextInt();
            int sv = s.nextInt();
            edges[fv][sv] = 1;
            edges[sv][fv] = 1;
        }
        int sv = s.nextInt();
        int ev = s.nextInt();
        ArrayList<Integer> ans = getPathBFS(edges, sv, ev);
        if(ans != null)
        {
            for(int elem: ans)
            {
                System.out.print(elem + " ");
            }
        }
    }
}
