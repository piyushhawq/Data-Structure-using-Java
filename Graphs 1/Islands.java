public class Solution {

    public static int numConnected(int[][] edges, int n) {

        boolean visited[] = new boolean[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            if(visited[i] == false){
                count++;
                dfs(edges,i,visited,n);
            }

        }
        return count;

    }
    public static void dfs(int edges[][],int v,boolean visited[],int n){
        visited[v]=true;
        for(int i = 0; i < n; i++){
            if(visited[i] == false && edges[v][i] == 1){
                dfs(edges,i,visited,n);

            }
        }

    }


}
