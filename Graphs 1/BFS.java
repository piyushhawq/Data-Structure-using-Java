import java.util.LinkedList; 
import java.util.Queue;
import java.util.Scanner;
public class Solution
{
    public static void printBFSHelper(int edges[][], int sv, boolean visited[]) 
    {
        Queue<Integer> queue = new LinkedList<>(); 
        visited[sv] = true;
        queue.add(sv); 
        while(!queue.isEmpty()) 
        {
            int front = queue.remove(); 
            System.out.print(front + " "); 
            for(int i = 0; i < edges.length; i++)
            {
                if(edges[front][i] == 1 && !visited[i]) 
                {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
    public static void printBFS(int edges[][]) 
    {
        boolean visited[] = new boolean[edges.length];
        for(int i = 0; i < visited.length; i++)
        {
            if(!visited[i]) 
            {
                printBFSHelper(edges, i, visited); 
            }
        }
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
        printBFS(edges);
    }
}
