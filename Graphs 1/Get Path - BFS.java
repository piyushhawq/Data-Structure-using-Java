import java.util.*;
public class Solution
{
    public static ArrayList<Integer> getPathBFSHelper(int[][] edges,int start,int end,boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        queue.add(start);
        visited[start] = true;
        while( !queue.isEmpty() && queue.peek()!=end) {
            int front = queue.poll();
            for(int i=0;i<edges.length;i++) {
                if(!visited[i] && edges[front][i] == 1) {
                    queue.add(i);
                    visited[i] = true;
                    map.put(i, front);
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(!map.containsKey(end)) {
            return null;
        }
        else {
            ans.add(end);
            int f = map.get(end);
            while(f!=start) {
                ans.add(f);
                f = map.get(f);
            }
            ans.add(start);
        }
        return ans;
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
        s.close();
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
