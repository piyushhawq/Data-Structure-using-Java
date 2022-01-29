import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class Solution {
    public static void printhelper(int edges[][],int v1,int v2,boolean visited[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(v1);
        int n=edges.length;
        while(q.size()!=0)
        {
            int ele=q.remove();
            visited[ele]=true;
            if(ele==v2)
            {
                System.out.print("true");
                return;
            }
            for(int i=0;i<n;i++)
            {
                if(edges[ele][i]==1&&!visited[i])
                {
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
        System.out.print("false");
        return;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();
        int edges[][] = new int[V][V];
        for(int i =0; i< E; i++){
            int fv = s.nextInt();
            int sv = s.nextInt();
            edges[fv][sv] = 1;
            edges[sv][fv] =1;
        }
        int v1=s.nextInt();
        int v2=s.nextInt();
        boolean visited[]= new boolean[edges[0].length];
        printhelper(edges,v1,v2,visited);



    }
} 
