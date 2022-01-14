public class Solution {

    public static boolean ratInAMaze(int maze[][]) {
        int n = maze.length;
        int path[][] = new int[n][n];
        return solveMaze(maze, 0, 0, path);
    }

    private static boolean solveMaze(int[][] maze, int i, int j, int[][] path) {
        int n = maze.length;
        if (i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0 || path[i][j] == 1)
            return false;
        path[i][j] = 1;
        if (i == n - 1 && j == n - 1)
            return true;

        if (solveMaze(maze, i - 1, j, path))
            return true;
        if (solveMaze(maze, i, j + 1, path))
            return true;
        if (solveMaze(maze, i + 1, j, path))
            return true;
        if (solveMaze(maze, i, j - 1, path))
            return true;
        return false;
    }
}
