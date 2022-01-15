import java.io.*;
import java.util.*;

public class Solution{   
    
    static void ratInAMaze(int maze[][], int n)
    {
      
        // System.out.println(maze.length+" "+n) ;
		boolean[][] visited = new boolean[n][n] ;
        // System.out.println(visited.length) ;
        helper(maze,visited,0,0,n) ;
    }
    
    static void helper(int[][] maze , boolean[][] visited , int sr , int sc , int n){
        
        
        if(sr < 0 || sr == n || sc < 0 || sc == n || maze[sr][sc] == 0 || visited[sr][sc]){
            return ;
        }
        
        if(sr == n-1 && sc == n-1){
            visited[sr][sc] = true ;
            print(visited) ;
            visited[sr][sc] = false ;
            return ;
        }
        
        visited[sr][sc] = true ;
        
        //up
        helper(maze,visited,sr-1,sc,n) ;
        
        // down
        helper(maze,visited,sr+1,sc,n) ;
        
        //right
        helper(maze,visited,sr,sc+1,n) ;
        
        //left
        helper(maze,visited,sr,sc-1,n) ;
        
        visited[sr][sc] = false ;
    }
    
    public static void print(boolean[][] visited){
        
        for(int i = 0 ; i < visited.length ; i++){
            for(int j = 0 ; j < visited.length ; j++){
                    if(visited[i][j]){
                        System.out.print(1+" ") ;
                    }
                    else{
                        System.out.print(0+" ") ;
                    }
            	}
        }
        System.out.println() ;
        
    }

}
